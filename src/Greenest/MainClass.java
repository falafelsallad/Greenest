package Greenest;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


public class MainClass {

    public static void main(String[] args) {

       Map<String, Plant> plants = new HashMap<>();
       plants.put("IGGE", new Cactus(0.2));
       plants.put("LAURA", new Palm(5));
       plants.put("MEATLOAF", new InsectPlant(0.7));
       plants.put("OLOF", new Palm(1));

       while (true) {
           String plantKey = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
           if (plantKey == null || plantKey.trim().equalsIgnoreCase("exit")) break;

           plantKey = plantKey.trim().toUpperCase();

           Plant plant = plants.get(plantKey); // getting the plant from the map using the key (PlantName input)

           if (plant != null) { // if the plant exists in the map
               JOptionPane.showMessageDialog(null, plant.getWaterDose() + "L " + plant.getWaterType().getWaterTypeString());
           } else {
               JOptionPane.showMessageDialog(null, "Växten finns inte i databasen.");
           }
       }
    }
}


