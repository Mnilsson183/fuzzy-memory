package com.mycompany.app;

/*
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppModel{

    // constants
    
    AppModel(){

    }

    public void submitExercise(String exerciseName, int[] exercise){

    }
    public void submitExercise(String exercise){

    }

    public void submitReps(String reps){

    }

    public void SubmitWeight(String weight){

    }

    public void toJSON(){

    }

    public void fromJSON(String json){

    }

    public String readSaveData(String filePath){
        File file = new File(filePath);
        String json = "";
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(inputFile.hasNext()){
            json = json + inputFile.nextLine();
        }
        return json;
    }

    public void initSaveData(){
        String json = readSaveData("data/workout.txt");
        fromJSON(json);
    }
}

/*
entries{
    entryNumber: {
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