package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    @Test
    void speedOfAutoGetsRaised() {
        //Given

        Auto auto1 = new Auto();
        auto1.accelerate(20);

        //When
        int actual = auto1.getVelocity();

        //Then
        assertEquals(20 ,actual);
    }

    @Test
    void speedOfAutpGetsRaisedWhileMoving(){
        //Given

        Auto auto1 = new Auto();
        auto1.setVelocity(20);

        //When
        int actual = auto1.accelerate(30);

        //Then
        assertEquals(50 ,actual);
    }
}