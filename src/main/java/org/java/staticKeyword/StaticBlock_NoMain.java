package org.java.staticKeyword;

public class StaticBlock_NoMain {  // cannot run it as main method is not found in the class (after JDk 1.7, before it was possible)
    static{
        System.out.println("Static block invoked without a main method");
    }
}
