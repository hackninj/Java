package edu.tomerbu;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s = "https://raw.githubusercontent.com/LearnWebCode/json-example/master/pets-data.json";

        try {
            String json = IO.readHTTP(s);
            ArrayList<Pet> pets = new ArrayList<>();

            JSONParser parser = new JSONParser();

            JSONObject petsObject = (JSONObject) parser.parse(json);

            JSONArray petsArray = (JSONArray) petsObject.get("pets");

            for (int i = 0; i < petsArray.size(); i++) {
                JSONObject petObject = (JSONObject) petsArray.get(i);

                String name = (String) petObject.get("name");
                String photo = (String) petObject.get("photo");
                Long birthYear = (Long) petObject.get("birthYear");
                String species = (String) petObject.get("species");


                JSONArray favFoods = (JSONArray) petObject.get("favFoods");
                String[] foodArray = {};
                if (favFoods != null) {
                    foodArray = new String[favFoods.size()];
                    for (int j = 0; j < favFoods.size(); j++) {
                        String food = (String) favFoods.get(j);
                        foodArray[j] = food;
                    }
                }

                pets.add(new Pet(name, species, foodArray, birthYear.intValue(), photo));

            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


//        //InputStream f= new FileInputStream("1.txt");
//
//        try {
//           String json = IO.readHTTP(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
