package com.mycompany.app;

import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.exc.StreamWriteException;

class Json {
    public static void SaveToJson(){
        //  te
        //

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";
        try{
            for(int i = 0; i < days.days.size(); i++){
                mapper.writeValue((new File("workout.txt")), Days.days.get(i));
            }
        } catch(IOException e){
            System.err.println("Cannot save");
            e.printStackTrace();
        }

        try {
            FileWriter appWriter = new FileWriter("data/workout.txt");
            appWriter.write(jsonString);
            appWriter.close();
        } catch(IOException e){
            System.err.println("Cannot save");
            e.printStackTrace();
        }
    }

    public static void loadFromJson(){

    }
}
