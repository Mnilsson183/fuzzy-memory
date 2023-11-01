package com.mycompany.app;

import java.util.Calendar;
import java.util.Vector;

public class Day {

    private static int month;
    private static int day;
    private static int year;

    Day(int yearIn, int monthIn, int dayIn){
        year = yearIn;
        month = monthIn;
        day = dayIn;
    }

    Calendar cal = Calendar.getInstance();

    public Vector<Workout> workouts = new Vector<Workout>();
    public Vector<Nutrition> nutrition = new Vector<Nutrition>();

    public static int getYear(){
        return year;
    }
    public static int getMonth(){
        return month;
    }
    public static int getDay(){
        return day;
    }

    public static void setToWorkout(int index){

    }
}