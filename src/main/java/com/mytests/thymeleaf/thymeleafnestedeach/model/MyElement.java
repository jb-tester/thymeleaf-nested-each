package com.mytests.thymeleaf.thymeleafnestedeach.model;

import java.util.List;

/**
 * *
 * <p>Created by irina on 3/31/2023.</p>
 * <p>Project: thymeleaf-nested-each</p>
 * *
 */
public class MyElement {

    String name;
    List<MyProperty> properties;

    public MyElement(String name, List<MyProperty> properties) {
        this.name = name;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MyProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<MyProperty> properties) {
        this.properties = properties;
    }
}
