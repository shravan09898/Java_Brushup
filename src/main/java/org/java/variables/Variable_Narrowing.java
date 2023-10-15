package org.java.variables;

public class Variable_Narrowing {    // Typecasting
    public static void main(String[] args) {
        float f = 10.5F;
        // int i = f;   // Compile Time Error

        int i = (int)f;   //typecasting or Narrowing

        System.out.println(f+"   "+i);
    }
}
