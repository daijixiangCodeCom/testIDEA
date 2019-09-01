package com.atguigu.bean;

import com.atguigu.java.Customer;

import java.util.ArrayList;

public class hello {
    
    /**
    *客户id
    */
    private int id;

    /**
    *客户生日
    */
    private int birthday;

    /**
     * 客户名字
     */
    private String name;





    
    private static final Person PERSON=new Person();
    private static final Customer CUSTOMER=new Customer();

    public static final int NUM=1;
    public static final String  NATION="HAH";

    public static void main(String[] args) {
        System.out.println("helloworld!!!!");
        //ArrayList list=new ArrayList();





        forMethod();
    }

    public static void forMethod(){
        System.out.println("hello.method");
        String[] arr = new String[]{"tom","hereryu","haha"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


    }

    public static void listMethod() {

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {

        }

        ArrayList alist = new ArrayList();
        alist.add(123);
        alist.add(456);
        alist.add(789);

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = 0; i < alist.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }

    public static void ifnMethod() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        if (list == null) {

        }


        if (list != null) {
            
        }

        if (list != null) {

        }

        if (list == null) {

        }









    }


    public void testhaha(){

    }
    public static void test6() {


    }

}
