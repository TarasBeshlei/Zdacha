package com.company.dataAccess.classes;

import java.awt.*;
import java.util.List;

public class Dish {

    private String dishName;
    private List<ComponentInfo> componentInfos;

    public Dish(String dishName, List<ComponentInfo> componentInfos) {
        this.dishName = dishName;
        this.componentInfos = componentInfos;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public List<ComponentInfo> getComponentInfos() {
        return componentInfos;
    }

    public void setComponentInfos(List<ComponentInfo> componentInfos) {
        this.componentInfos = componentInfos;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", componentInfos=" + componentInfos +
                '}';
    }
}
