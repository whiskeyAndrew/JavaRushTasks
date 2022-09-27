package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int firstSlash = path.indexOf("jdk");
        int secondSlash = path.indexOf("/",firstSlash);
        String string1 = path.substring(0,firstSlash);
        String string2 = path.substring(secondSlash);
        return string1 + jdk + string2;
    }
}
