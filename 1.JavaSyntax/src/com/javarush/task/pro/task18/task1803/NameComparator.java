package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor>{
    @Override
    public int compare(JavaRushMentor o1, JavaRushMentor o2) {
        int length1 = o1.getName().length();
        int length2 = o2.getName().length();
        if(length1<length2){
            return  length1-length2;
        }
        else if(length1>length2){
            return  length1-length2;
        }
        return 0;
    }
    //напишите тут ваш код
}
