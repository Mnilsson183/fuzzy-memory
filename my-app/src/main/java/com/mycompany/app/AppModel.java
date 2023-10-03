package com.mycompany.app;

/*
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppModel{

    // constants

    // need a struct to store the day data
    
    AppModel(){

    }

    public void submitExercise(String exerciseName, int[] exercise){
        int EXERCISESIZE = 5;
        System.out.println(exerciseName);
        for (int i = 0; i < EXERCISESIZE; i++){
            System.out.println(exercise[i]);
        }


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