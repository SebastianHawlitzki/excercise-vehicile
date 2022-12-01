package de.neuefische;


import lombok.Data;

@Data

public abstract class Vehicle implements Accelerateable {
   //Attribute
   private String id;

   private String name;

   private int velocity;

   //Constructor empty
   public Vehicle() {
   }

   //Constructor

   public Vehicle(String id, String name, int velocity) {
      this.id = id;
      this.name = name;
      this.velocity = velocity;
   }
}

