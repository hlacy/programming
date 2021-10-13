package com.company.lesson_30;

import com.sun.jdi.PrimitiveValue;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws PerimetrExeption {
        if (side <= 0){
            throw new PerimetrExeption("Side is incorrect");
        }
        this.side = side;
    }
}
