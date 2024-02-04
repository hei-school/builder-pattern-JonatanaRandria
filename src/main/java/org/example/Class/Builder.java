package org.example.Class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Builder {

    private Engine engine;

    public Builder reset() {
        engine = null;  // Reset all variables to default values
        return this;
    }

    private int seats;
    private boolean tripComputer;
     private boolean GPS;
}
