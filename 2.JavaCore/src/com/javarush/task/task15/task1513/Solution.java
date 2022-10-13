package com.javarush.task.task15.task1513;

/* 
Максимально простой код-3
*/

public class Solution {
    public static Integer a = new Integer(5);
    public static Integer b  = new Integer(getSum());
    public static Integer c = new Integer(getSum());

    public static int getSum()
    {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(getSum());
    }

    public interface Runnable {

    }

    public class Machine implements Runnable {
    }

    public class Car extends Machine {
    }
}
