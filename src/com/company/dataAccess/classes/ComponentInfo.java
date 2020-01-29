package com.company.dataAccess.classes;



public class ComponentInfo {

    private Component component;
    private float weightGram;

    public ComponentInfo() {
    }

    public ComponentInfo(Component component, float weightGram) {
        this.component = component;
        this.weightGram = weightGram;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public float getWeightGram() {
        return weightGram;
    }

    public void setWeightGram(float weightGram) {
        this.weightGram = weightGram;
    }

    @Override
    public String toString() {
        return "ComponentInfo{" +
                "component=" + component +
                ", weightGram=" + weightGram +
                '}';
    }
}
