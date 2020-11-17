package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Farm;

public class TestingClass {
    Farm testFarm = new Farm();
    Farm testFarm2 = new Farm();
    Farm testFarm3 = new Farm();


    @Before
    public void setUp() throws Exception {
        testFarm.startHybridFarm(6);
        testFarm2.startCropFarm(3);
        testFarm3.startAnimalFarm(1);
        Farm testFarm4 = new Farm();
        testFarm4.startHybridFarm(5);
        int numOfTurns = 0;
        boolean cycle = true; // True is day and false is night
        while (numOfTurns <= 50) { // this will run 50 turns or 100 cycles

            if (cycle) { // day logic
                System.out.println("Day Cycle " + numOfTurns);

                testFarm4.runDayCycle(numOfTurns);
                cycle = false;
            } else { // night cycle logic
                System.out.println("Night Cycle " + numOfTurns);

                testFarm4.runNightCycle(numOfTurns);
                cycle = true;
            }
            numOfTurns++;
        }

    }

    @Test
    public void checkNumberOfAnimals() {
        int numOfAnimals = testFarm.getAnimalList().size();
        // int numOfAnimals2 = testFarm2.getAnimalList().size();
        int numOfAnimals3 = testFarm3.getAnimalList().size();
        assertEquals(10, numOfAnimals, 0.005);
        // assertEquals(null, numOfAnimals2, 0.005);
        assertEquals(10, numOfAnimals3, 0.005);


    }

    @Test
    public void checkNumberOfCrops() {
        int numOfCrop = testFarm.getCropList().size();
        int numOfCrop2 = testFarm2.getCropList().size();
        // int numOfCrop3 = testFarm3.getCropList().size();

        assertEquals(10, numOfCrop, 0.005);
        assertEquals(10, numOfCrop2, 0.005);
        // assertEquals(null, numOfCrop3, 0.005);

    }

    @Test
    public void checkNumberOfFarmer() {
        int numOfFarmers = testFarm.getFarmersList().size();
        int numOfFarmers2 = testFarm2.getFarmersList().size();
        int numOfFarmers3 = testFarm3.getFarmersList().size();

        assertEquals(6, numOfFarmers, 0.005);
        assertEquals(3, numOfFarmers2, 0.005);
        assertEquals(1, numOfFarmers3, 0.005);

    }

}
