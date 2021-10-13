package main_progs;

import com.company.lesson_27.*;
import com.company.lesson_29.ErrorExample;
import com.company.lesson_30.PerimetrExeption;
import com.company.lesson_30.PerimetrSquare;
import com.company.lesson_32.Cat;
import com.company.lesson_32.Serilizator;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CommonMain {
    public static void main(String[] arg){

        Serilizator serilizator = new Serilizator();
        try {
            Cat cat = serilizator.deserialization();
            System.out.println(cat.getName());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
