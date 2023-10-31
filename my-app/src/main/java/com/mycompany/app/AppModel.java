package com.mycompany.app;

/*
 * 
 */

public class AppModel{
    int EXERCISE_SIZE = 5;
    // constants

    // need a struct to store the day data
    
    AppModel(){
        
    }

    public void submitExercise(String exerciseName, int exerciseReps, int exerciseWeight){
        Days.days.get(0).workouts.get(0).addExercise(exerciseName, exerciseReps, exerciseWeight);
    }

    public void save(){
        Json.SaveToJson();
    }
}

/*

entries{
    Day: {
        day:
        month:
        year:
        workout{
            exercise: 
            exercise:
            exercise:

        }
    }
}


*/