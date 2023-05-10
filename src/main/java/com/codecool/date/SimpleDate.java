package com.codecool.date;

public class SimpleDate implements DateService {
    private int day;
    private int month;

    public SimpleDate(int day, int month) {
        this.day = day;
        this.month = month;
    }


    @Override
    public int[] getDateValuesArray() {

        return new int[] {day, month};
    }
}
