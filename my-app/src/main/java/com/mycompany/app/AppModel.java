package com.mycompany.app;

/*
 * 
 */

public class AppModel{
    int EXERCISE_SIZE = 5;
    // constants

    // need a struct to store the day data
    
    AppModel(){
        Json.toJson();
    }

    public void submitExercise(String exerciseName, int[] exercise, Day day){
        System.out.println(exerciseName);
        for (int i = 0; i < EXERCISE_SIZE; i++){
            System.out.println(exercise[i]);
        }
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