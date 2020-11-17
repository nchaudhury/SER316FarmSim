package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Farm;

public class TestingClass {
    Farm testFarm = new Farm();

    @Before
    public void setUp() throws Exception {
        testFarm.startHybridFarm(6);
    }

    @Test
    public void checkNumberOfAnimals() {
        int numOfAnimals = testFarm.getAnimalList().size();
        assertEquals(10, numOfAnimals, 0.005);
    }

    @Test
    public void checkNumberOfCrops() {
        int numOfCrop = testFarm.getCropList().size();
        assertEquals(10, numOfCrop, 0.005);
    }

    @Test
    public void checkNumberOfFarmer() {
        int numOfFarmers = testFarm.getFarmersList().size();
        assertEquals(6, numOfFarmers, 0.005);
    }

}
