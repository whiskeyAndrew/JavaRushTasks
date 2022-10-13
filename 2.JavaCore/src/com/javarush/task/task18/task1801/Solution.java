package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int max = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        try(FileInputStream file = new FileInputStream(file1)){

            int data;
            while(file.available()>0){
                data = file.read();
                if(data>max)
                    max = data;
            }
        }catch (IOException e){

        }
        System.out.println(max);
    }
}
