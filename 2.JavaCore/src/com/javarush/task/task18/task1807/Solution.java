package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {

        int counter = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine())){
            while(fileInputStream.available()>0){
                byte[] bytes = new byte[fileInputStream.available()];
                fileInputStream.read(bytes);
                for(byte b: bytes){
                    if(b==44){
                        counter++;
                    }
                }
            }
        }catch (Exception e){

        }
        System.out.println(counter);
    }
}
