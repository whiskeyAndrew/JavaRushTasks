package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = null;
        String file2 = null;
        try{
            file1 = bufferedReader.readLine();
            file2 = bufferedReader.readLine();

            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));

            while(bufferedReader1.ready()) {
                allLines.add(bufferedReader1.readLine());
            }
            bufferedReader1.close();
            while(bufferedReader2.ready()){
                forRemoveLines.add(bufferedReader2.readLine());
            }
            bufferedReader2.close();

            new Solution().joinData();
        } catch (IOException e){

        }
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
