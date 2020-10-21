package com.design.pattern;

public class Shape implements Cloneable {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
