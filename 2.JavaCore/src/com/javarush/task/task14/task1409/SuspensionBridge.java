package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge{
    final int carsCount = 5;
    @Override
    public int getCarsCount() {
        return carsCount;
    }
}
