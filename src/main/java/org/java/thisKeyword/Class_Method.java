package org.java.thisKeyword;

public class Class_Method {
    void m(){
        System.out.println("Hello M");
    }

    void n(){
        System.out.println("This is N block");
        this.m();
        m();
    }
}
