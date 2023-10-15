package org.java.thisKeyword;

public class ArgumentInMethod {
    void m(ArgumentInMethod argumentInMethod){
        System.out.println("Method is invoked");
    }

    void p(){
        System.out.println("this is p block");
        m(this);
    }
}
