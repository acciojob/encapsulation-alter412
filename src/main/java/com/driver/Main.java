package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        //java: name has private access in com.driver.RWOnly
//        rw.name = "Name";
//        System.out.println(rw.name);

        rw.setName("NewName");
        System.out.println(rw.getName());
    }
}