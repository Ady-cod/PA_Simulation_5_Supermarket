package com.codecool.date;

public class FullDate implements DateService{
    private int day;
    private int month;

    private int year;

    public FullDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    @Override
    public int[] getDateValuesArray() {
        return new int[] {day,month,year};
    }
}
