package com.company.lesson_29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorExample {
    private Abc abc;

    public void foo()  {
        FileInputStream fileInputStream = null;
//        Throwable;
//                Object;
        try {
            fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            }   catch (IOException e){
                e.printStackTrace();
            }

        }

    }
}
