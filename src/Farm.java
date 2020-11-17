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

	public void upgrade()
	{
		double newUpgradePrice = upgradePrice * 1.2;
		currentPrice = upgradePrice;
		upgradePrice = newUpgradePrice;
	}

	public void runNightCycle(int numOfTurns) {
		// TODO Auto-generated method stub
		
	}

	public void runDayCycle(int numOfTurns) {
		// TODO Auto-generated method stub
		
	}
}
