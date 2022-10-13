package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file1 = new FileInputStream(args[1]);
        FileOutputStream file2 = new FileOutputStream(args[2]);

        switch (args[0]){
            case "-e":{
                while (file1.available()>0){
                    file2.write(file1.read()+30);
                }
            }

            case "-d":{
                while (file1.available()>0){
                    file2.write(file1.read()-30);
                }
                break;
            }
        }
        file1.close();
        file2.close();
    }

}
