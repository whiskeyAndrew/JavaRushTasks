package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length ==0) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = bufferedReader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        FileOutputStream fileOutputStream = new FileOutputStream(file1);


        if (!args[0].equals("-c")) {
            return;
        }

        String name;
        if (args[1].length() > 30) {
            name = args[1].substring(0, 30);
        } else {
            name = args[1];
            while(name.length()!=30){
                name = name.concat(" ");
            }
        }

        String price;
        if (args[2].length() > 8) {
            price = args[2].substring(0, 8);
        } else {
            price = args[2];
            while(price.length()!=8){
                price = price.concat(" ");
            }
        }

        String quantity;
        if (args[2].length() > 4) {
            quantity = args[3].substring(0, 4);
        } else {
            quantity = args[3];
            while(quantity.length()!=4){
                quantity = quantity.concat(" ");
            }
        }

        int maxId = 0;
        while(fileReader.ready()){
            String row = fileReader.readLine();
            row = row.substring(0,row.indexOf(" "));
            if(maxId<Integer.parseInt(row)){
                maxId = Integer.parseInt(row);
            }
        }
        String id = String.valueOf(maxId+1);

        while(id.length()!=8){
            id = id.concat(" ");
        }

        String output = String.valueOf(maxId+1) + name + price + quantity;
        fileOutputStream.write(("\n" + output).getBytes());


        bufferedReader.close();
        fileReader.close();
        fileOutputStream.close();
    }
}
