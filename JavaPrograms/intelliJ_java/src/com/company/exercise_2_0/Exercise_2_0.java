package com.company.exercise_2_0;

import java.util.Scanner;
import java.util.Vector;

public class Exercise_2_0 {
    private double x;
    private double y;
    private double z;

    public Exercise_2_0(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength(){
        return Math.sqrt((x * x + y * y + z * z));
    }

    public double scalarProduct(Exercise_2_0 exercise_2_0){
        return (x*exercise_2_0.x + y*exercise_2_0.y + z*exercise_2_0.z);
    }

    public static void randomArray(){
        System.out.println("write n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        makeRandomVectorsArrays(n);
    }

    /*public static void makeRandomVectorsArrays(int n){
        int j = 0;
        double[] arr = new double[3 * n];
        while (j < 3 * n){
            System.out.print(j/3  + 1 + " ");
            for(int i = 0; i < 3; i++){
                arr[j] = 100 * Math.random();
                System.out.print(arr[j] + " | ");
                j++;5
            }

            System.out.println();

        }
    }*/
    public static void makeRandomVectorsArrays(int n){
        Exercise_2_0[] vector = new Exercise_2_0[n];
        for (int i = 0; i < n; i++){
            vector[i] = new Exercise_2_0(Math.random(), Math.random(), Math.random());
            System.out.println(i+1 + " " + vector[i].x + " " + vector[i].y + " " + vector[i].z);
        }

    }
}
