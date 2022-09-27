package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        this.capacity = (int)(this.capacity*1.5);
        String[] stringArray = new String[capacity];

        for(int i =0;i<this.size;i++){
            stringArray[i] = this.elements[i];
        }
        this.elements = stringArray;

    }

}
