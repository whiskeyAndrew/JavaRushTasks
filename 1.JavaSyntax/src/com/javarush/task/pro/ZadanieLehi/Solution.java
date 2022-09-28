package com.javarush.task.pro.ZadanieLehi;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static String fileName;
    private static String wordToChange;
    private static String[] stringArray;
    private static StringBuilder stringOutput = new StringBuilder();
    static boolean wordFound;

    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            fileName = "D:\\javaRush\\JavaRushTasks\\1.JavaSyntax\\src\\com\\javarush\\task\\pro\\ZadanieLehi\\test.txt";
            wordToChange = "меня";
        }

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        ) {
            String line;
            while (bufferedReader.ready()) {
                line = bufferedReader.readLine();
                System.out.println(line);
                stringArray = line.split(" ");

                if (!wordFound) {
                    for (int i = 0; i < stringArray.length; i++) {
                        if (stringArray[i].equals(wordToChange)) {
                            wordFound = true;
                            break;
                        }
                    }
                }

                if (wordFound) {
                    for (int i = 0; i < stringArray.length; i++) {
                        if (i + 1 != stringArray.length) {
                            String tempString = stringArray[i + 1];
                            stringArray[i + 1] = stringArray[i];
                            stringArray[i] = tempString;
                            i++;
                        } else
                            break;
                    }
                }
                stringOutput.append(String.join(" ", stringArray)).append("\n");
            }

            if (!wordFound) {
                throw new IllegalArgumentException();
            }

        } catch (IOException e) {
            System.out.println("ы");
            throw new RuntimeException(e);
        } catch (IllegalArgumentException ie){
            System.out.println("НЕ НАШЕЛ НЕ НАШЕЛ ЫАЫАЫАЫАЫА");
        }

        if(wordFound) {
            System.out.println(stringOutput);

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
                bufferedWriter.write(stringOutput.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
