package com.company;
import java.util.Scanner;

public class BinaryString {

    public static void main(String[] args) {
        System.out.println("write 1 number");
        Scanner read = new Scanner(System.in);
        String x = read.nextLine();
        for(int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '1' || x.charAt(i) == '0') {
                System.out.println("if");
                continue;
            } else {
                System.out.println("write binary number");
                return;
            }
        }
        System.out.println("write 2 number");
        String y = read.nextLine();
        for(int i = 0; i < y.length(); i++) {
            if (y.charAt(i) == '1' || y.charAt(i) == '0') {
                System.out.println("if");
                continue;
            } else {
                System.out.println("write binary number");
                return;
            }
        }
        System.out.println(Integer.toBinaryString(Integer.parseInt(x, 2) * Integer.parseInt(y, 2)));

    }
}
