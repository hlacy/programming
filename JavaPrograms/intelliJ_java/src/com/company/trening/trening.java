package com.company.trening;

import javax.swing.*;

public class trening {
    public static void  main(String[] str){
        System.out.println("write a number");
//        Scanner putInn = new Scanner(System.in);
//        int read=  putInn.nextInt();
//        Scanner read = new Scanner(System.in);
//        int x = read.nextInt();
        String txt =  JOptionPane.showInputDialog("");
        String txt2 = "hui";
        JOptionPane.showMessageDialog(null, txt);
        int bool1 =   JOptionPane.showConfirmDialog(null, txt2);
        int bool2 =   JOptionPane.showConfirmDialog(null, txt2);
        int bool3 =   JOptionPane.showConfirmDialog(null, txt2);
//        System.out.println(bool1 );
//        System.out.println(bool2 );
//        System.out.println( bool3 );
        if (bool1 == 1 || bool2 == 1 || bool3 == 1) {
            JOptionPane.showMessageDialog(null, "хуле нет");
            return;
        }

    }
}
