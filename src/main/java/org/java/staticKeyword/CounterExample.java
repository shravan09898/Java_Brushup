package org.java.staticKeyword;

public class CounterExample {
    static int count = 0;  // will get memory only once and retain it's value
    int count1 = 0;

    public CounterExample() {
        count++;   // incrementing the value of static variable
        System.out.println(count);
    }

//    public void CounterExample1() {
//        count1++;   // incrementing the value of static variable
//        System.out.println(count1);
//    }

    static public void main(String args[]){
        CounterExample c = new CounterExample();
        CounterExample c1 = new CounterExample();
        CounterExample c2 = new CounterExample();

//        c.CounterExample1();
//        c1.CounterExample1();
//        c2.CounterExample1();
    }
}
