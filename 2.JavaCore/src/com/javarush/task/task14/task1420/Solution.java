package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while(true) {
            if (a == 0 || b == 0) {
                System.out.println(a + b);
                break;
            } else {
                if (a >= b) {
                    a = a-b;
                }else if(a<b){
                    b = b-a;
                }
            }
        }
    }
}
