package unit;

import org.example.Class.Builder;
import org.example.Class.Engine;
import org.junit.jupiter.api.Test;

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
}
