package com.mycompany.app;

import java.util.Calendar;
import java.util.Vector;

public class Day {

    Day(){

    }
    public static Vector<Day> days = new Vector<Day>();

    Calendar cal = Calendar.getInstance();

    public int month = cal.get(Calendar.MONTH);
    public int day = cal.get(Calendar.DAY_OF_MONTH);
    public int year = cal.get(Calendar.YEAR);

    public Vector<Workouts> workouts = new Vector<Workouts>();
    public Vector<Nutrition> nutrition = new Vector<Nutrition>();


    class Workouts{

        public Vector<Exercise> workouts = new Vector<Exercise>();

        class Exercise{

            public String name;
            public int reps;
            public int weight;

            Exercise(String exerciseName, int exerciseReps, int exerciseWeight){
                name = exerciseName;
                reps = exerciseReps;
                weight = exerciseWeight;
            }
        }

        public void addWorkout(String exerciseName, int exerciseReps, int exerciseWeight){
            Exercise tmpExercise = new Exercise(exerciseName, exerciseReps, exerciseWeight);
            workouts.add(tmpExercise);
        }
        
    }

    class Nutrition{

    }
}
