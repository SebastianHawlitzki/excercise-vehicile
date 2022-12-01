package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    void erhöhtDieGeschwindigkeitVomFahhradBis35kmh() {
        //Given
        Bike bike1 = new Bike();


        //When
        int actual = bike1.accelerate(20);

        //Then
        assertEquals(20, actual);
    }

}