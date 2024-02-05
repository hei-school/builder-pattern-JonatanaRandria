package org.example.Director;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Class.Builder;
import org.example.Class.Engine;


public class Director {

        public Builder makeSUV(Builder builder) {
            builder.reset();
            builder.setSeats(4);
            builder.setEngine(new Engine("V8"));
            builder.setTripComputer(true);
            builder.setGPS(true);
            return builder;
        }

        public Builder makeSportsCar(Builder builder) {
            builder.reset();
            builder.setSeats(2);
            builder.setEngine(new Engine("V12"));
            builder.setTripComputer(false);
            builder.setGPS(true);
            return builder;
        }
}
