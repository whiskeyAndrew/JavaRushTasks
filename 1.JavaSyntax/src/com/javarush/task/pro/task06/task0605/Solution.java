package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {;
            if (i != array.length / 2 && i != array.length / 2 + 1) {
                int temp = array[i];
                int temp2 = array[array.length -1- i];
                array[i] = temp2;
                array[array.length -1- i] = temp;

            } else {
                break;
            }

        }
    }


    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
