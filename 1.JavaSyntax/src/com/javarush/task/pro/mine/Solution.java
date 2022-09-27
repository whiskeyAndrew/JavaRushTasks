package com.javarush.task.pro.mine;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = "Я со/бака ты со/бака я с/обака ты соба/ка";

        String result = path.replace('/', '\\');

        System.out.println(result);
    }
}
