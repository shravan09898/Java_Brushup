package org.java.variables;

public class Variable_adding_LowerType {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        //byte c = a+b;  //gives compile time error as a+b=20 will be int
        byte c = (byte)(a+b);
    }
}
