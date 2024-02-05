package org.example.Builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.Class.Builder;


@Getter
@Setter
@ToString
public class CarBuilder extends Builder {


    @Override
    public String toString() {
        return "CarBuilt={" +
                "engine=" + super.getEngine() +
                ", seats=" + super.getSeats() +
                ", tripComputer=" + super.isTripComputer() +
                ", GPS=" + super.isGPS()+
                '}';
    }

    public CarBuilder reset() {
        super.reset();  // Call resetAll from the parent class
        this.setSeats(0);  // Reset additional variables to default values
        this.setTripComputer(false);
        this.setGPS(false);
        return this;
    }

    public CarBuilder getResult(){
        return this;
    }
}
