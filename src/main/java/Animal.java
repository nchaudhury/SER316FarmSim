package main.java;

/**
 * Animal.java
 * 
 * Handles the Animal Logic
 * 
 * @author Neil Chaudhury
 * @version 1
 */
public class Animal {
    private double baseCost; // Base cost of the animal
    private double affinityMultiplier; // The value add this possible animal can have.
    private double productCost; // The amount the farm makes for selling animal item every 2 days
    private int age; // Age of animal
    private boolean isBaby; // if animal is <3 days old
    private boolean isAlive = true;
    private boolean isDieseased = false;

    public Animal() {
        baseCost = 10;
        affinityMultiplier = Math.random() + 1;
        productCost = 1;
        age = 0;
        isBaby = false;
    }

    public Animal(int ageIn) {
        baseCost = 10;
        affinityMultiplier = Math.random() + 1;
        productCost = 1;
        age = ageIn;
        if (age > 3)
            isBaby = false;
    }

    public double getCostToday() {
        double todayCost = baseCost * affinityMultiplier;
        return todayCost;
    }

}
