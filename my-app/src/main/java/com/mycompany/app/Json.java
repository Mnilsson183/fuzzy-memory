package com.mycompany.app;

import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;

class Json {
    public static void toJson(){
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";
        try{
            for(int i = 0; i < Day.days.size(); i++){
                jsonString += mapper.writeValueAsString(Day.days.get(i));

            }
        } catch(IOException e){
            System.err.println("Cannot save");
            e.printStackTrace();
        }

        try {
            FileWriter appWriter = new FileWriter("./data/workout.txt");
            appWriter.write(jsonString);
            appWriter.close();
        } catch(IOException e){
            System.err.println("Cannot save");
            e.printStackTrace();
        }
    }

    public static void fromJson(){

    }
}
