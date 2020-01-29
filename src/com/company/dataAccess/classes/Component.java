package com.company.dataAccess.classes;

public class Component {

    private float valueOfGramm;
    private String componentName;

    public Component() {
    }

    public Component(float valueOfGramm, String componentName) {
        this.valueOfGramm = valueOfGramm;
        this.componentName = componentName;
    }

    public float getValueOfGramm() {
        return valueOfGramm;
    }

    public void setValueOfGramm(float valueOfGramm) {
        this.valueOfGramm = valueOfGramm;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }
}
