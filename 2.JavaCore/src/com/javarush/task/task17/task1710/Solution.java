package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c": {
                Sex sexx;
                Date date = new Date();

                try{
                    date = formatter.parse(args[3]);
                } catch (Exception e){
                    System.out.println("я ебанулся");
                    e.printStackTrace();
                }

                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], date));
                } else allPeople.add(Person.createFemale(args[1], date));
                System.out.println(allPeople.size()-1);
                break;

            }
            case "-r": {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                formatter = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
                if(person.getSex().equals(Sex.MALE)) {
                    System.out.println(person.getName() + " " + "м" + " " + formatter.format(person.getBirthDate()));
                } else                 if(person.getSex().equals(Sex.FEMALE)) {
                    System.out.println(person.getName() + " " + "ф" + " " + formatter.format(person.getBirthDate()));
                }
                break;

            }
            case "-u": {

                SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Date date = new Date();
                try{
                    date = formatter2.parse(args[4]);
                } catch (Exception e){
                    System.out.println("я ебанулся");
                    e.printStackTrace();
                }
                Person people = allPeople.get(Integer.parseInt(args[1]));

                people.setName(args[2]);
                people.setSex( args[3].equals("м")? Sex.MALE:Sex.FEMALE);
                people.setBirthDate(date);

                break;
            }
            case "-d": {
                Person people = allPeople.get(Integer.parseInt(args[1]));
                people.setBirthDate(null);
                people.setSex(null);
                people.setName(null);

                break;
            }
        }
    }
}
