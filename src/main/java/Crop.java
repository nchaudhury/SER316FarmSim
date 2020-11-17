package main.java;

/**
 * Crop.java
 * 
 * Handles the Crop Logic
 * 
 * @author Neil Chaudhury
 * @version 1
 */
public class Crop {
    private double baseCost; // Base cost of the crop
    private double affinityMultiplier; // The value add this possible crop can have.
    private double productCost; // The amount the farm makes for selling crop item every 3 CYCLES
    private int age; // Age of crop
    private boolean isDiseased; // if crop is diseased
    private boolean isAlive; // if crop is alive

    public Crop() {
        baseCost = 10;
        affinityMultiplier = Math.random() + .5;
        productCost = 1;
        age = 0;
        isDiseased = false;
        isAlive = true;
    }

    public Crop(int ageIn) {
        baseCost = 10;
        affinityMultiplier = Math.random() + .5;
        productCost = 1;
        age = ageIn;
        isDiseased = false;
        isAlive = true;
    }

    public double getCostToday(int numOfTurns) {
        double todayCost;
        if (numOfTurns % 3 == 0) {
            todayCost = baseCost * affinityMultiplier;
            return todayCost;
        }
        return 0.0;

    }

    public double getCostTonight() {
        return baseCost;
    }

}
