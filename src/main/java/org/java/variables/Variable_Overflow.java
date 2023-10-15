package org.java.variables;

public class Variable_Overflow {
    public static void main(String[] args) {
        //Overflow
        int a = 130;
        byte b = (byte)a;
        System.out.println(a+"   "+b);
    }
}
