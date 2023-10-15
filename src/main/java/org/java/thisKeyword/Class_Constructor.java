package org.java.thisKeyword;

public class Class_Constructor {
    Class_Constructor(){
        System.out.println("Hello Constructor");
    }
    Class_Constructor(int a){
        this();
        System.out.println(a);
    }
}
