package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int min = Integer.MAX_VALUE;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        try (FileInputStream file = new FileInputStream(file1)) {

            int data;
            while (file.available() > 0) {
                data = file.read();
                if (data < min)
                    min = data;
            }
        } catch (IOException e) {

        }
        System.out.println(min);
    }
}

