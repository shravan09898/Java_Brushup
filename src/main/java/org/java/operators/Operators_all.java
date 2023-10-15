package org.java.operators;

public class Operators_all {
    public static void main(String[] args) {

        // ++, --
        int x = 10;
        System.out.println(x++);  // 10 -> (11)
        System.out.println(++x);  // 12
        System.out.println(x--);  // 12 -> (11)
        System.out.println(--x);  // 10

        // ++, --
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);  //10+12 = 22
        System.out.println(b++ + b++);  //10+11 = 21

        // ~, !
        int m = 10;
        int n = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~m);   // 11 -> minus of total positive values which starting from 0
        System.out.println(~n);   // 9 -> positive of total minus, positive starts from 0
        System.out.println(!c);   // false
        System.out.println(!d);   // true

        // Java Left shift operator
        System.out.println(10<<2);  // 10*(2^2) = 40
        System.out.println(10<<3);  // 10*(2^3) = 80
        System.out.println(15<<4);  // 15*(2^4) = 240

        // Java right shift operator
        System.out.println(10>>2);  // 10/(2^2) = 2
        System.out.println(10>>3);  // 10/(2^3) = 1
        System.out.println(15>>4);  // 15/(2^4) = 0

        // >> vs >>>

        //For positive numbers >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);

        // for negative number, >>> changes parity bit(MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);

        //Ternary operator
        int min = (a<b)?a:b;
        System.out.println(min);
    }
}
