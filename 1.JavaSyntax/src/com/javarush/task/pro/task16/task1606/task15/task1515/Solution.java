package com.javarush.task.pro.task16.task1606.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишите тут ваш код
        if(!Path.of(str).isAbsolute()){
            str = Path.of(str).toAbsolutePath().toString();
        }
        System.out.println(str);
    }
}

