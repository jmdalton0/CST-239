package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoJsonFiles {

    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(2010, "Ford", "Mustang", 0, 1.5);
        cars[1] = new Car(2011, "Chevy", "Silverado", 1000, 1.5);
        cars[2] = new Car(2012, "Toyota", "Carolla", 2000, 1.5);
        cars[3] = new Car(2013, "GMC", "2500", 3000, 1.5);
        cars[4] = new Car(2014, "Honda", "Civic", 4000, 1.5);

        for (int i = 0; i < cars.length; i++) {
            saveToFile("out.json", cars[i], true);
        }

        ArrayList<Car> carsList = readFromFile("out.json");
        for (Car car : carsList) {
            String text = "";
            text += Integer.toString(car.getYear()) + ", ";
            text += car.getMake() + ", ";
            text += car.getModel() + ", ";
            text += Integer.toString(car.getOdometer()) + ", ";
            text += Double.toString(car.getEngineLiters());
            System.out.println(text);
        }
    }

    private static void saveToFile(String filename, Car car, boolean append) {
        try {
            File file = new File(filename);
            FileWriter fw = new FileWriter(file, append);
            PrintWriter pw = new PrintWriter(fw);
            ObjectMapper om = new ObjectMapper();
            String json = om.writeValueAsString(car);
            pw.println(json);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Car> readFromFile(String filename) {
        ArrayList<Car> cars = new ArrayList<Car>();
        try {
            File file = new File(filename);
            Scanner s = new Scanner(file);

            while(s.hasNext()) {
                String json = s.nextLine();
                ObjectMapper om = new ObjectMapper();
                Car car = om.readValue(json, Car.class);
                cars.add(car);
            }

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cars;
    }
    
}
