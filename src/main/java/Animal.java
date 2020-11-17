package main.java;

/**
 * Animal.java
 * 
 * <p>Handles the Animal Logic.
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
    // private boolean isAlive = true;
    // private boolean isDieseased = false;

    /**
     * Base Animal Constructor.
     */
    public Animal() {
        baseCost = 10;
        affinityMultiplier = Math.random() + .5;
        productCost = 1;
        age = 0;
        isBaby = false;
    }

    // public Animal(int ageIn) {
    // baseCost = 10;
    // affinityMultiplier = Math.random() + .5;
    // productCost = 1;
    // age = ageIn;
    // if (age > 3)
    // isBaby = false;
    // }
    /**
     * Gets the amount of profit this animal bring with its affinity.
     * 
     * @param numOfTurns is the number of turns elapsed since payouts do not happen
     *                   daily.
     */
    public double getCostToday(int numOfTurns) {
        double todayCost;
        if (numOfTurns % 2 == 0) {
            todayCost = productCost * affinityMultiplier;
            return todayCost;
        }
        return 0.0;

    }

    /**
     * Returns the cost if called on in the night.
     */
    public double getCostTonight() {
        return baseCost;
    }

}
