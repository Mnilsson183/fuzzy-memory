package com.mycompany.app;

public class AppModel{

    // need a struct to store the day data
    Days days = new Days();

    AppModel(){
        
    }

    public void submitExercise(String exerciseName, int exerciseReps, int exerciseWeight){
        days.days.get(0).workouts.get(0).addExercise(exerciseName, exerciseReps, exerciseWeight);
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