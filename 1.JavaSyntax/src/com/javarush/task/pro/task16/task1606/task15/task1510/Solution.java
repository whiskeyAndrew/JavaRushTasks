package com.javarush.task.pro.task16.task1606.task15.task1510;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем байты в файл
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        Scanner scanner = new Scanner(System.in);
        Files.write(Path.of(scanner.nextLine()), bytes);
    }
}

