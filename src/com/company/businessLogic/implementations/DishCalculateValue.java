package com.company.businessLogic.implementations;

import com.company.businessLogic.interfaces.IDishCalculateValue;
import com.company.dataAccess.classes.Component;
import com.company.dataAccess.classes.ComponentInfo;
import com.company.dataAccess.classes.Dish;
import com.company.dataAccess.interfaces.IDataBase;
import com.company.view.interfaces.IShowDataDataBase;

import java.util.List;
import java.util.Optional;

public class DishCalculateValue implements IDishCalculateValue {

    private IDataBase dataBase;
    private IShowDataDataBase showDataDataBase;
    private IDishCalculateValue dishCalculateValue;

    public DishCalculateValue(IDataBase dataBase, IShowDataDataBase showDataDataBase,
                              IDishCalculateValue dishCalculateValue) {
        this.dataBase = dataBase;
        this.showDataDataBase = showDataDataBase;
        this.dishCalculateValue = dishCalculateValue;
    }

    @Override
    public float calculateDishPrice(String dishName) {

        Optional<Dish> infoFromDB = getInfoFromDB(dishName);
        if (infoFromDB.isPresent()) {
            List<ComponentInfo> componentInfos = infoFromDB.get().getComponentInfos();
            float dishPrice = 0;

            for (ComponentInfo componentInfo : componentInfos) {
                dishName += countBaseDishPrice(componentInfo);
            }
            return dishPrice;
        }
        return 0;
    }

    @Override
    public float calculateCustomDishPrice(String dishName, String componentName, float weight) {

        Optional<Dish> infoFromDB = getInfoFromDB(dishName);
        if (infoFromDB.isPresent()) {
            List<ComponentInfo> componentInfos = infoFromDB
                    .get()
                    .getComponentInfos();

            float dishPrice = 0;

            for (ComponentInfo componentInfo : componentInfos) {

                if (!componentInfo.getComponent().getComponentName().equals(componentName)) {
                    dishName += countBaseDishPrice(componentInfo);
                } else {
                    dishName += countCustomDishProce(componentInfo, weight);
                }
            }
            return dishPrice;
        }
        return 0;
    }

    private float countBaseDishPrice(ComponentInfo componentInfo) {
            float grammAmmount = componentInfo.getWeightGram();
            float priseForGramm = componentInfo.getComponent().getValueOfGramm();

            return grammAmmount * priseForGramm;
    }

    private float countCustomDishProce(ComponentInfo componentInfo, float weight) {
        float grammAmmount = componentInfo.getWeightGram();
        return grammAmmount * weight;
    }

    private Optional<Dish> getInfoFromDB(String dishName) {
        List<Dish> dishes = dataBase.getDishes();
        Optional<Dish> optionalDishNameFromDB = dishes.stream()
                .filter(dish -> dish.getDishName()
                        .equals(dishName))
                .findAny();

        return optionalDishNameFromDB;
    }
}
