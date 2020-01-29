package com.company.view.interfaces;

import com.company.dataAccess.classes.Dish;

import java.awt.*;
import java.util.List;

public interface IShowDataDataBase {

    void showDishes(List<Dish> dishes);
    void showComponents(List<Component> components);

    void showEditDishesMenu(List<Dish> dishes);
    void showEditComponentsMenu(List<Component> components);

}
