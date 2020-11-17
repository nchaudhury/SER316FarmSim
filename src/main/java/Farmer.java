package main.java;

/**
 * Farmer.java
 * 
 * Handles the Farmer Logic
 * 
 * @author Neil Chaudhury
 * @version 1
 */
public class Farmer {
    private double affinityMultiplier; // The value add this possible farmer can have.

    public double getAffinityMultiplier() {
        return affinityMultiplier;
    }

    public Farmer() {
        affinityMultiplier = Math.random() + 1;
    }
}
