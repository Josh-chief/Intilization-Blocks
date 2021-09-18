package com.company;

public class Child extends Parent{
    static {
        System.out.println("Child Static block");
    }

    {
        System.out.println("Child intilization block");
    }

    Child() {
        System.out.println("Child constructor");
    }

}


