package main.java;

import java.util.ArrayList;

/**
 * Farm.java
 * 
 * Handles the Farm Logic
 * 
 * @author Neil Chaudhury
 * @version 1
 */
public class Farm {
    private ArrayList<Farmer> farmersList;
    private ArrayList<Animal> animalList;
    private ArrayList<Crop> cropList;
    private int defaultNumber = 10;
    private double currency = 0.0;
    private double defaultPrice = 1000;
    private double currentPrice; // Farm Current Cost
    private double upgradePrice = defaultPrice * 1.2;

    public Farm() {
        currentPrice = defaultPrice;
    }

    public void startAnimalFarm(int numOfFarmers) {
        currentPrice = defaultPrice;
        farmersList = new ArrayList<>();
        animalList = new ArrayList<>();
        for (int i = 0; i < numOfFarmers; i++) {
            farmersList.add(new Farmer());
        }
        for (int i = 0; i < defaultNumber; i++) {
            animalList.add(new Animal());
        }
        cropList = null;

    }

    public void startCropFarm(int numOfFarmers) {
        currentPrice = defaultPrice;
        farmersList = new ArrayList<>();
        cropList = new ArrayList<>();
        animalList = null;
        for (int i = 0; i < numOfFarmers; i++) {
            farmersList.add(new Farmer());
        }
        for (int i = 0; i < defaultNumber; i++) {
            cropList.add(new Crop());
        }

    }

    public void startHybridFarm(int numOfFarmers) {
        currentPrice = defaultPrice;
        farmersList = new ArrayList<>();
        cropList = new ArrayList<>();
        animalList = new ArrayList<>();
        for (int i = 0; i < numOfFarmers; i++) {
            farmersList.add(new Farmer());
        }
        for (int i = 0; i < defaultNumber; i++) {
            cropList.add(new Crop());
            animalList.add(new Animal());
        }

    }

    public void upgrade() {
        double newUpgradePrice = upgradePrice * 1.2;
        currentPrice = upgradePrice;
        upgradePrice = newUpgradePrice;
    }

    public void runNightCycle(int numOfTurns) {
        double moneyLost = 0.0;
        double chance = Math.random();
        if (chance < .25) {
            moneyLost += animalList.get((int) chance * animalList.size()).getCostTonight();
            animalList.remove((int) chance * animalList.size());

        } else if (chance < .5) {
            moneyLost += cropList.get((int) chance * cropList.size()).getCostTonight();
            cropList.remove((int) chance * cropList.size());
        } else {
            System.out.println("No money lost tonight");
        }
        currency -= moneyLost;
        System.out.println("tonight you lost $" + String.format("%.2f", moneyLost));
        System.out.println("You currently have $" + String.format("%.2f", currency));

    }

    public void runDayCycle(int numOfTurns) {
        double cashMade = 0.0;
        if (!(cropList == null))
            for (int i = 0; i < cropList.size(); i++) {
                cashMade += cropList.get(i).getCostToday(numOfTurns);
            }
        if (!(animalList == null))
            for (int i = 0; i < animalList.size(); i++) {
                cashMade += animalList.get(i).getCostToday(numOfTurns);
            }

        for (int i = 0; i < farmersList.size(); i++) {
            cashMade = cashMade * farmersList.get(i).getAffinityMultiplier();
        }
        currency += cashMade;
        System.out.println("You made $" + String.format("%.2f", cashMade));
        System.out.println("You currently have $" + String.format("%.2f", currency));
    }
}
