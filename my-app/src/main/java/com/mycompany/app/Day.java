package com.mycompany.app;

import java.util.Calendar;
import java.util.Vector;

public class Day {

    Day(){

    }

    Calendar cal = Calendar.getInstance();

    public int month = cal.get(Calendar.MONTH);
    public int day = cal.get(Calendar.DAY_OF_MONTH);
    public int year = cal.get(Calendar.YEAR);

    public Vector<Workout> workouts = new Vector<Workout>();
    public Vector<Nutrition> nutrition = new Vector<Nutrition>();
}