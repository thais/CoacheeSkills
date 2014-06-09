package com.springapp.mvc.model;

public class Pillar {
    private int number;

    public Pillar(int number) {
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException("Pillar can just be 1, 2, 3");
        }
        this.number = number;
    }

    public int getPillar() {
        return number;
    }
}
