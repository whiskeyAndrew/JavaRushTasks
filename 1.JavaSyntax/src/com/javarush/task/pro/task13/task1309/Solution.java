package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Andrew",5.0);
        grades.put("Leha",4.0);
        grades.put("Ivan",2.2);
        grades.put("Dimon",3.5);
        grades.put("Alena",2.0);
    }
}
