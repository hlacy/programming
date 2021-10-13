package com.company.lesson_15;

import com.company.lesson_15.Flower;

public class Constructor {
    public void action(){
        Flower flower = new Flower();
        flower.name = "chamomile";
        flower.color = "white";

        Flower flower2 = new Flower("rose", "red");
        Flower flower3 = new Flower("orange", "tulip", 3);
        System.out.printf("flower %s %s\n", flower.name, flower.color);
        System.out.printf("flower2 %s %s\n", flower2.name, flower2.color);
        System.out.printf("flower3 %s %s %d", flower3.name, flower3.color, 3);
    }
}
