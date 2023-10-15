package org.java.thisKeyword;

public class ArgumentInConstructor {
    Main main;
    ArgumentInConstructor(Main main){
        this.main = main;
    }
    void display(){
        System.out.println(main.data);
    }
}
