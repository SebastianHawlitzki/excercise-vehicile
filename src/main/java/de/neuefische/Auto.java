package de.neuefische;



public class Auto extends Vehicle {
    // Methode, benötigt wird: for Loop (geschwindigkeit vom Auto erhöhen / return Endgeschwindigkeit
    // int kmh = Endgeschwindigkeit



    @Override
    public int accelerate(int kmh) {
setVelocity(getVelocity() + kmh);
        System.out.println(getVelocity());
        return getVelocity();
    }




}






