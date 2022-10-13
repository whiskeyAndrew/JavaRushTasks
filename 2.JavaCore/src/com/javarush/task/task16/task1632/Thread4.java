package com.javarush.task.task16.task1632;

public class Thread4 extends  Thread implements Message{

    Boolean close = false;
    @Override
    public void showWarning() {
        close=true;
    }

    @Override
    public void run() {
        while(!close){

        }
    }
}
