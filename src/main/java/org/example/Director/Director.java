package org.example.Director;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.Builder.CarBuilder;
import org.example.Class.Builder;
import org.example.Class.Car;
import org.example.Class.Engine;


@EqualsAndHashCode

public class Director {

        public Builder makeSUV(Builder builder) {
            builder.reset();
            builder.setSeats(4);
            builder.setEngine(new Engine("V8"));
            builder.setTripComputer(true);
            builder.setGPS(true);
            return  builder;
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
