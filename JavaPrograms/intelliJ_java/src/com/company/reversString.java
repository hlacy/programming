package com.company;

import java.util.Scanner;

public class reversString {
    public static void main(String[] str)
    {
        System.out.println("write the phrase");
        String x = new Scanner(System.in).nextLine();
        System.out.println("revers sting");
        for (int i = 0; i < x.length(); i++)
        {
            System.out.print(x.charAt(x.length() - 1 - i));
        }
    }

}
