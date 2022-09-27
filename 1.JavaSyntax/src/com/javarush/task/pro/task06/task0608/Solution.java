package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long numberA = 5;
        numberA = cube(numberA);
    }

    //напишите тут ваш код
    public static long cube(long number)
    {
        number = number*number*number;
        return  number;
    }
}
