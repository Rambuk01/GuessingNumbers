package com.rambuk;

public class NumberContainer {
    int number;

    public NumberContainer(int minValue, int maxValue) {
        this.number = (int) (Math.random()*(maxValue - minValue) + minValue);
    }

    public int getNumber() {
        return number;
    }
}
