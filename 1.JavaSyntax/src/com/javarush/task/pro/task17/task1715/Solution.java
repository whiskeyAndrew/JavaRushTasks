package com.javarush.task.pro.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Вилларибо и Виллабаджо.
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        //напишите тут ваш код
        orchestra.add(new Organ());
        for(int i =0;i<3;i++){
            orchestra.add(new Piano());
        }
    }

    public static void createStringedOrchestra() {
        //напишите тут ваш код
        for(int i =0;i<2;i++){
            orchestra.add(new Violin());
        }
        orchestra.add(new Guitar());
    }

    public static void playOrchestra() {
        //напишите тут ваш код
        for(int i =0;i<orchestra.size();i++){
            {
                orchestra.get(i).play();
            }
        }
    }
}
