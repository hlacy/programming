package com.company.lesson_19;

public class Encapsulation {
//    private int a = 5, b = 7;
    private int a, b;
    public int showResult(){
        return a + b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a1) {
        this.a = a1;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
