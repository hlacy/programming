package com.company;

import java.util.Scanner;

public class distanceBetweenPoints {
    public static double calculing(double x1, double y1, double x2, double y2)
    {
        double r = 6371.01;
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        double d = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        return d;
    }

    public static void  main(String[] str)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("write 1 number");
        double x1 = read.nextDouble();
        System.out.println("write 2 number");
        double x2 = read.nextDouble();
        System.out.println("write 3 number");
        double y1 = read.nextDouble();
        System.out.println("write 4 number");
        double y2 = read.nextDouble();
        System.out.println(calculing(x1, y1, x2, y2));

    }

}
