package com.javarush.task.pro.task09.task0908;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    static final String[][] HEXMAP =
            {{"0","0000"},{"1","0001"},{"2","0010"}, {"3","0011"},{"4","0100"},
                    {"5","0101"},{"6","0110"},{"7","0111"},{"8","1000"},{"9","1001"},{"a","1010"},
                    {"b","1011"},{"c","1100"},{"d","1101"},{"e","1110"},{"f","1111"}};

    public static void main(String[] args) {


        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "cd0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
        String hexNumber = "";
        if(binaryNumber==null || binaryNumber.isEmpty())
        {
            return hexNumber;
        }

        for(int i =0;i<binaryNumber.length();i++)
        {
            if(binaryNumber.charAt(i)!='0' && binaryNumber.charAt(i)!='1')
            {
                return "";
            }
        }

        int elementPointer = 0;

        while(binaryNumber.length()%4!=0) {
            binaryNumber = "0"+binaryNumber;
        }

        int binaryNumberLength = binaryNumber.length();
        for(int i =0;i<binaryNumberLength/4;i++) {
            String fourBits = "";

            for(int j = elementPointer;j<elementPointer+4;j++) {
                fourBits += (binaryNumber.charAt(j));

                if(fourBits.length()==4) {
                    elementPointer = j+1;
                    break;
                }
            }

            for(int j = 0; j< HEXMAP.length; j++)
            {
                if(HEXMAP[j][1].equals(fourBits))
                {
                    hexNumber+= HEXMAP[j][0];
                    fourBits = "";
                    break;
                }
            }
        }

        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        String binaryNumber = "";
        String hexElement = "";
        if(hexNumber==null || hexNumber.isEmpty())
        {
            return binaryNumber;
        }

        for(int i =0;i<hexNumber.length();i++){
            for(int j = 0; j<HEXMAP.length;j++){
                if(hexNumber.charAt(i)!=HEXMAP[j][0].charAt(0)){
                    if(j == HEXMAP.length-1)
                    {
                        return "";
                    }
                    continue;
                }
                break;

            }
        }

        for(int i = 0;i<hexNumber.length();i++)
        {
            hexElement = Character.toString(hexNumber.charAt(i));

            for(int j =0;j<HEXMAP.length;j++)
            {
                if(hexElement.equals(HEXMAP[j][0]))
                {
                    binaryNumber+=HEXMAP[j][1];
                }
            }
        }

        return binaryNumber;
    }
}
