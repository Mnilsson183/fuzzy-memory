package com.mycompany.app;

import java.util.Vector;

public class Days{

    private static Vector<Day> days = new Vector<Day>();

    public static Vector<Day> getDays() {
        return days;
    }
    public static Day getDayByIndex(int index){
        return days.get(index);
    }
    public static void setNewDay(int year, int month, int day){
        Day tmpDay = new Day(year, month, day);
        days.add(tmpDay);
    }
    public static int daysSize(){
        return days.size();
    }
}