package unit.utils;

import org.example.Builder.CarBuilder;
import org.example.Builder.CarManualBuilder;
import org.example.Class.Builder;
import org.example.Class.Car;
import org.example.Class.Engine;
import org.example.Director.Director;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DirectorTest {
    @Test
    public void makeSuvTest() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);
        CarBuilder car = carBuilder.getResult();

        assertTrue(true);
        assertEquals(car.toString(), carBuilder.getResult().toString());
        assertEquals(4, car.getSeats());
        assertEquals(new Engine("V8"), car.getEngine());
        assertTrue(car.isTripComputer());
        assertTrue(car.isGPS());
    }

    @Test
    public void makeSportsCarsTest() {
        Director director = new Director();
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.makeSportsCar(carManualBuilder);
        CarManualBuilder manual = carManualBuilder.getResult();

        assertTrue(carManualBuilder instanceof Builder);
        assertEquals(manual.toString(), carManualBuilder.getResult().toString());
        assertEquals(2, manual.getSeats());
        assertEquals(new Engine("V12"), manual.getEngine());
        assertFalse(manual.isTripComputer());
        assertTrue(manual.isGPS());
    }
}
