package org.java.thisKeyword;

public class Class_Instance_Variable {
    int rollNum;
    String name;
    float fees;

    public Class_Instance_Variable(int rollNum, String name, float fees) {
        this.rollNum = rollNum; // if there is no 'this' there would be ambiguity for the same in assigning
        this.name = name;
        this.fees = fees;
    }

    void display(){
        System.out.println(name+"  "+rollNum+"  "+fees);
    }
}

