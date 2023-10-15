package org.java.thisKeyword;


public class Main {
    public static void main(String[] args) {
        Class_Instance_Variable classInstanceVariable = new Class_Instance_Variable(30, "Shravan", 100F);
        classInstanceVariable.display();

        Class_Method classMethod = new Class_Method();
        classMethod.n();

        Class_Constructor classConstructor = new Class_Constructor(10);

        ArgumentInMethod argumentInMethod = new ArgumentInMethod();
        argumentInMethod.p();

        Main main = new Main();

        new Return_Current_Class().getReturnCurrentClass().display();
    }

    int data  = 123;
    Main() {
        ArgumentInConstructor argumentInConstructor = new ArgumentInConstructor(this);
        argumentInConstructor.display();
    }
}
