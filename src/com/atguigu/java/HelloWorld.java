package com.atguigu.java;

/**
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("helloworld!");
        System.out.println("helloworld!");

        System.out.println("helloworld!");
        ArrayList list = new ArrayList();
        new Date();
        list.add();

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}