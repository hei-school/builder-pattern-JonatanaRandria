package org.example.Class;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;

    }

    @Override
    public String toString() {
        return "" +
                "'" + type + '\'' +
                // Ajouter d'autres attributs dans la chaîne de toString() si nécessaire
                "";
    }

}
