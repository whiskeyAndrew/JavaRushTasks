package com.javarush.task.task18.task1809;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String fileName1 = bufferedReader.readLine();
                String fileName2 = bufferedReader.readLine();
    try(
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2)
    ){
        List<Integer> bytes = new ArrayList<>();
        while(fileInputStream.available()>0){
            bytes.add(fileInputStream.read());
        }

        Collections.reverse(bytes);
        for(Integer b:bytes){
            fileOutputStream.write(b);
        }
    }catch (Exception e){

    }
    }
}
