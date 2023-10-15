package org.java.staticKeyword;

public class Student {
    int rollNo;  // instance variable
    String name;
    static String collegeName = "BVRIT";

    static void changeCollegeName(){
        collegeName = "SCJC";
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void display(){
        System.out.println(rollNo+"  "+name+"  "+collegeName );
    }

}
