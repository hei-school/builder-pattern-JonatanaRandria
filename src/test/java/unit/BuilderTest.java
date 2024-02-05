package unit;

import org.example.Class.Builder;
import org.example.Class.Engine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BuilderTest {

    @Test
    public void testBuilderReset() {
        Builder builder = new Builder();
        builder.setEngine(new Engine("v6"));
        assertNotNull(builder.getEngine());

        // Resetting all variables in Builder
        builder.reset();
        assertNull(builder.getEngine());
    }
    @Test
    public void testBuilderSetEngine() {
        Builder builder = new Builder();
        assertNull(builder.getEngine());

        Engine engine = new Engine("Diesel");
        builder.setEngine(engine);
        assertEquals(engine, builder.getEngine());
    }

    @Test
    public void testCarBuilderSetSeats() {
        Builder carBuilder = new Builder();
        assertEquals(0, carBuilder.getSeats());
        // Setting negative seats should be ignored
        carBuilder.setSeats(4);
        assertEquals(4, carBuilder.getSeats());
    }

    @Test
    public void testCarBuilderReset() {
        Builder carBuilder = new Builder(new Engine("Electric"),2,false,false);
        assertNotNull(carBuilder.getEngine());
        assertEquals(2, carBuilder.getSeats());
        assertFalse(carBuilder.isGPS());

        // Resetting all variables in CarBuilder
        carBuilder.reset();
        assertNull(carBuilder.getEngine());
        assertEquals(0, carBuilder.getSeats());
        assertFalse(carBuilder.isGPS());
    }


}
