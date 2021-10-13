package com.company.lesson_32;

import javax.swing.plaf.synth.ColorType;
import java.io.*;
import java.util.Calendar;

public class Serilizator {
    public boolean serialization(Cat cat){
        boolean flag = false;
        File file = new File("d:/Cat.txt");

        ObjectOutputStream objectOutputStream = null;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (fileOutputStream != null) {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(cat);
                flag = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
            return flag;
    }

    public Cat deserialization() throws InvalidObjectException {
        File file = new File("d:/Cat.txt");
        ObjectInputStream objectInputStream = null;
        FileInputStream fileInputStream = null;
        try {
             fileInputStream = new FileInputStream(file);
            if (fileInputStream != null){
                objectInputStream = new ObjectInputStream(fileInputStream);
                Cat cat = (Cat) objectInputStream.readObject(); //when we use readObject() we have to
                    //transform this object's instance to our class, in this case to class Cat
                return cat;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Object file");
    }
}
