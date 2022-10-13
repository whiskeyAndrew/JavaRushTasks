package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        List<String> inputList = new ArrayList<>();
        Collections.addAll(inputList,"user","loser","coder","proger");


        //тут цикл по чтению ключей, пункт 1
        while(true)
        {
            key = reader.readLine();

            if(!inputList.contains(key)){
                break;
            }

            switch (key){
                case "user":
                    person = new Person.User();
                    break;

                case "loser":
                    person = new Person.Loser();
                    break;

                case "coder":
                    person = new Person.Coder();
                    break;
                case "proger":
                    person = new Person.Proger();
                break;

                default:
                    break;
            }

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if(person instanceof Person.User){
            ((Person.User) person).live();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        } else if(person instanceof Person.Coder){
            ((Person.Coder)person).writeCode();
        }else if(person instanceof  Person.Loser){
            ((Person.Loser)person).doNothing();
        }
    }
}
