package com.company;

import java.util.*;
import java.lang.*;

import java.util.Properties;
public class get_Property {

    public static void main(String[] args) {
        System.out.println("start");
        System.out.println("version " + System.getProperty("java.version") );
        System.out.println("runtime " + System.getProperty("java.runtime.version"));
        System.out.println("home " + System.getProperty("java.home"));
        System.out.println("vendor " + System.getProperty("java.vendor")   );
        System.out.println("vendor url " + System.getProperty("java.vendor.url"));
        System.out.println("class path " + System.getProperty("java.class.path"));

    }
}