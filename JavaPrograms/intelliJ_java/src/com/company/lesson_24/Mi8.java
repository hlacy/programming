package com.company.lesson_24;

public class Mi8 extends Helicopter implements VerticalTakeOff{

    @Override
    public void fly() {
        System.out.println("Mi8 is flying");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Mi8 vertical");
    }
}
