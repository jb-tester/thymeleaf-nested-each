package com.mytests.thymeleaf.thymeleafnestedeach.model;

import java.util.List;

/**
 * *
 * <p>Created by irina on 3/31/2023.</p>
 * <p>Project: thymeleaf-nested-each</p>
 * *
 */
public class MyData {

    String id;
    List<MyElement> elements;

    public MyData(String id, List<MyElement> elements) {
        this.id = id;
        this.elements = elements;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<MyElement> getElements() {
        return elements;
    }

    public void setElements(List<MyElement> elements) {
        this.elements = elements;
    }
}
