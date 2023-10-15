package org.java.staticKeyword;

public class TestStaticVariable {
    public static void main(String[] args) {
        Student s1= new Student(230, "Shravan");
        Student s2 = new Student(229, "Purrr");
        s1.display();

        //We can change College Name of all below objects with below line of code
//        Student.collegeName = "BVRIT Narsapur";
        Student.changeCollegeName(); //calling change method to change static variable
        s2.display();
        s1.display();
    }
}
