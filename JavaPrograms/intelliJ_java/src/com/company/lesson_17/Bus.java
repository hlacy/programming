package com.company.lesson_17;

public class Bus {
    public String model, color;
    public Engin engine;
    public Trasmission trasmission;
    public final String SERIAL_NUMBER = "E228RX";
    public final int SERIAL_NUMBER_2 = 228;

    public void go(){
        System.out.println("go");
    }
    public Engin showKm(){
        Engin engin = new Engin();
        return engin ;
    }
}
