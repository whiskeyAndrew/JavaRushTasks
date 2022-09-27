package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row = scanner.nextInt();
        multiArray = new int[row][];
        for(int i =0; i<multiArray.length;i++)
        {
            int column = scanner.nextInt();
            multiArray[i] = new int[column];
        }
        //напишите тут ваш код
    }
}
