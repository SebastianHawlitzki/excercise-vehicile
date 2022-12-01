package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Accelerateable {
    //Attribute
    private int kmh;

    // Methode
    public int accelerate (int kmh){

        return kmh;
    }
}
