package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String handlingString = url.substring(url.lastIndexOf("?")+1);
        String[] strings = handlingString.split("&");
        List<Double> doubleList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        for(String s:strings){
            String tempString;
            if(s.contains("=")) {
                tempString = s.substring(0, s.indexOf("="));
                if(tempString.equals("obj")){
                    System.out.println(tempString);
                    tempString = s.substring(s.indexOf("=")+1,s.length());
                    try{
                        doubleList.add(Double.valueOf(tempString));
                    }
                    catch (Exception e){
                        stringList.add(tempString);
                    }
                } else {
                    System.out.println(tempString);
                }
            } else {
                tempString = s;
                System.out.println(s);
                continue;
            }
        }
        for(Double d: doubleList){
            alert(d);
        }

        for(String s: stringList){
            alert(s);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
