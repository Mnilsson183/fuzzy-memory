package com.mycompany.app;

import java.util.Vector;

public class Workout{

    public Vector<Exercise> workout = new Vector<Exercise>();

    public void addExercise(String exerciseName, int exerciseReps, int exerciseWeight){
        Exercise exercise = new Exercise(exerciseName, exerciseReps, exerciseWeight);

        workout.add(exercise);
    }
}