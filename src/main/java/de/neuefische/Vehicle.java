package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Vehicle {
   //Attribute
   private String id;

   private String name;

   private String velocity;
}
