package com.company.lesson_25;

public class DollySheet implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }
}
