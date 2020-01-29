package com.company.businessLogic.interfaces;

public interface IDishCalculateValue {

    float calculateDishPrice(String dishName);
    float calculateCustomDishPrice(String name, String componentName, float weight);

}
