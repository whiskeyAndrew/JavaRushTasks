package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    AmigoOutputStream a;
    public QuestionFileOutputStream(AmigoOutputStream a){
        this.a = a;
    }
    @Override
    public void flush() throws IOException {
        a.flush();
    }

    @Override
    public void write(int b) throws IOException {
        a.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        a.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        a.write(b,off,len);
    }

    @Override
    public void close() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String answer = bufferedReader.readLine();
        if(answer.equals("Д")){
            a.close();
        }
    }
}

