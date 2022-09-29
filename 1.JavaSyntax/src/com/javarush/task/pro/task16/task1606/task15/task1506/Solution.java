package com.javarush.task.pro.task16.task1606.task15.task1506;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));

            for(int i =0;i<lines.size();i++){
                char[] chars = lines.get(i).toCharArray();
                for(char character: chars){
                    if (character != ' ' && character != '.' && character != ',') {
                        System.out.print(character);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

