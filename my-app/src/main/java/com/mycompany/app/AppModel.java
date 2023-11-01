package com.mycompany.app;

public class AppModel{

    // need a struct to store the day data
    Days days = new Days();

    AppModel(){
        
    }

    public void submitExercise(String exerciseName, int exerciseReps, int exerciseWeight){
        Days.setNewDay(exerciseWeight, exerciseReps, exerciseWeight);
        Days.getDayByIndex(Days.daysSize());
        
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