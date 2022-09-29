package com.javarush.task.pro.task16.task1606.task15.task1502;

import java.util.Scanner;

/* 
Возврат к истокам
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());

        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            scanner.close();
        }
    }
}
