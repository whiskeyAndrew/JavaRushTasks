package com.javarush.task.pro.ZadanieLehi2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    static HashMap<String,String> map = new HashMap<>();
    static  HashMap<Integer,Integer> intMap = new HashMap<>();
    static String strochka = "Hehe";
    static  String strockaPovtor = "What";
    public static void main(String[] args) {
        map.put("Hello","Hehe");
        map.put("What","What");
        map.put("Blyad","Clown");
        map.put("Yaaaaa","DSAFADSFG");
        map.put("GET THE FUCK OUT OF MY PALACE","STRIIIIIING");

        Long longNumber = 110L;
        Integer intNumber = 15;
        System.out.println(Long.compare(longNumber,intNumber.longValue()));
        for(int i =0;i<100;i++){
            intMap.put(i,0);
        }

        String returnable = peredaeshStroku(strochka);
        System.out.println(returnable);
        System.out.println(verniEntry(strockaPovtor));
        System.out.println(IncrementValue(10));
    }

    public static String peredaeshStroku(String stroka){
        return map.entrySet()
                .stream()
                .filter(e1->e1.getValue().equals(stroka))
                .findAny().get().getKey();

    }

    public static Map<String,String> verniEntry(String stroka){
       return map.entrySet()
                .stream()
               .filter(e1->e1.getKey().equals(e1.getValue()))
               .collect(Collectors.toMap((Map.Entry::getKey),(Map.Entry::getValue)));

    }

    public static Map<Integer,Integer> IncrementValue(Integer key){
            intMap.compute(key,(k,value)->value+=1);
        return  intMap;
    }

}
