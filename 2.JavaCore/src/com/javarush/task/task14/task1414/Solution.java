package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        MovieFactory movieFactory = new MovieFactory();
        Scanner scanner = new Scanner(System.in);
        List<Movie> list = new ArrayList<>();
        while(true){
            list.add(MovieFactory.getMovie(scanner.nextLine().toString()));
            if(list.get(list.size()-1)==null){
                list.remove(list.size()-1);
                break;
            }
        }
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i).getClass().getSimpleName());
        }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if("cartoon".equals(key)){
                movie = new Cartoon();
            } else if("thriller".equals(key)){
                movie = new Thriller();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Thriller extends Movie{

    }

    static class Cartoon extends Movie{

    }
    //Напишите тут ваши классы, пункт 3
}
