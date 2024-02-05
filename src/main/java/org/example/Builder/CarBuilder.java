package org.example.Builder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.Class.Builder;
import org.example.Class.Car;
import org.example.Class.Engine;


@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class CarBuilder extends Builder {

    private Car car;

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

    @Override
    public void setEngine(Engine engine) {

        super.setEngine(engine);
    }

    @Override
    public void setSeats(int seats) {

        super.setSeats(seats);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {

        super.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean GPS) {

        super.setGPS(GPS);
    }

}
