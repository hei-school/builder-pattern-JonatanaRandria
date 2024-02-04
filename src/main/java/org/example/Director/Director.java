package org.example.Director;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Class.Builder;
import org.example.Class.Engine;


public class Director {
    public Builder makeSUV(Builder builder){
        return builder;
    }

    public Builder makeSportsCar(Builder builder){
        return  builder;
    }
}
