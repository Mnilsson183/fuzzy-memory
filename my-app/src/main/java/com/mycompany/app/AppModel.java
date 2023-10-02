package com.mycompany.app;

/*
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppModel{

    AppModel(){

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
    }
}