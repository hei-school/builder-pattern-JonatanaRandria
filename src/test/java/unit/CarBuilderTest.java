package unit;


import org.example.Builder.CarManualBuilder;
import org.example.Class.Builder;
import org.example.Class.Engine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarBuilderTest {
    @Test
    public void testCarBuilderReset() {
        CarManualBuilder carBuilder = new CarManualBuilder();
        carBuilder.setGPS(true);
        carBuilder.setEngine(new Engine("V8"));
        carBuilder.setSeats(5);
        assertNotNull(carBuilder.getEngine());
        assertEquals(5, carBuilder.getSeats());
        assertTrue(carBuilder.isGPS());

        // Resetting all variables in CarBuilder
        carBuilder.reset();
        assertNull(carBuilder.getEngine());
        assertEquals(0, carBuilder.getSeats());
        assertFalse(carBuilder.isGPS());
    }
}
