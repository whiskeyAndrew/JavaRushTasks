package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        Set<Integer> set = new TreeSet<>();
        try(FileInputStream file = new FileInputStream(fileName)){
            while(file.available()>0){
                set.add(file.read());
            }
        }

        for(Integer i:set){
            System.out.print(i+" ");
        }
    }
}
