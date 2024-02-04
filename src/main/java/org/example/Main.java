package org.example;

import org.example.Builder.CarBuilder;
import org.example.Builder.CarManualBuilder;
import org.example.Class.Builder;
import org.example.Class.Engine;
import org.example.Director.Director;

public class Main {
    public static void main(String[] args) {

         CarManualBuilder builder = new CarManualBuilder();
         builder.setGPS(true);
         builder.setSeats(4);
         builder.setTripComputer(false);
         builder.setEngine(new Engine("test"));
         System.out.println(builder.getResult());
    }
}