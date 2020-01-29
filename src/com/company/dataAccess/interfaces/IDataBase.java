package com.company.dataAccess.interfaces;

import com.company.dataAccess.classes.Component;
import com.company.dataAccess.classes.Dish;

import java.util.List;

public interface IDataBase {

    List<Dish> getDishes();
    List<Component> getComponents();

    void setDish(Dish newDish);
    void setComponent(java.awt.Component newComponent);

    void updateDish(String dishName, Dish dish);
    void updateComponents(String componentName, java.awt.Component component);

}
