package com.company;

public class Parent {
    static{
        System.out.println("Parent Static block");
    }

    {
        System.out.println("Parent intilization block");
    }

    Parent() {
        System.out.println("Parent constructor");
    }

}
