package com.javarush.task.pro.task16.task1606.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        //напишите тут ваш код
        while(true) {
            Scanner scanner = new Scanner(System.in);
            Path path = Path.of(scanner.nextLine());
            if (Files.isDirectory(path)) {
                System.out.println(path + " - это директория");
            } else if (Files.isRegularFile(path)) {
                System.out.println(path + " - это файл");
            } else {
                break;
            }
        }
    }
}

