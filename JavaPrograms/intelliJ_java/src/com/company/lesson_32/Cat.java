package com.company.lesson_32;

import java.io.Serializable;
import java.util.Calendar;

public class Cat implements Serializable {
    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
