package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    private static final SimpleDateFormat FORMATTER_FROM_INPUT = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static final SimpleDateFormat FORMATTER_TO_CONSOLE = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        try {
            switch (args[0]) {

                case "-c": {
                    synchronized (allPeople) {
                        Date date = new Date();

                        for (int i = 0; i < (args.length - 1) / 3; i++) {
                            try {
                                date = FORMATTER_FROM_INPUT.parse(args[3 + (i * 3)]);
                            } catch (Exception e) {
                                System.out.println("я ебанулся");
                                e.printStackTrace();
                            }

                            if (args[2 + (i * 3)].equals("м")) {
                                allPeople.add(Person.createMale(args[1 + (i * 3)], date));
                            } else allPeople.add(Person.createFemale(args[1 + (i * 3)], date));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }

                case "-u": {
                    synchronized (allPeople) {
                        Date date = new Date();
                        for (int i = 1; i < args.length; i += 4) {
                            try {
                                date = FORMATTER_FROM_INPUT.parse(args[i + 3]);
                            } catch (Exception e) {
                                System.out.println("я ебанулся");
                                e.printStackTrace();
                            }
                            Person people = allPeople.get(Integer.parseInt(args[i]));
                            people.setName(args[i + 1]);
                            people.setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                            people.setBirthDate(date);
                        }
                    }
                    break;
                }
                case "-d": {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person people = allPeople.get(Integer.parseInt(args[i]));
                            people.setBirthDate(null);
                            people.setSex(null);
                            people.setName(null);
                        }
                    }
                    break;
                }

                case "-i": {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person people = allPeople.get(Integer.parseInt(args[i]));
                            System.out.println(people.getName());
                            System.out.println(people.getSex().equals(Sex.MALE) ? "м" : "ж");
                            System.out.println(FORMATTER_TO_CONSOLE.format(people.getBirthDate()));
                        }
                    }
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("ПИЗДЕЦ В МЕНЯ ВЛЕЗЛИ");
        }
    }
}
