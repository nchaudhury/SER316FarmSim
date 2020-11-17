import java.util.*;

/**
 * World.java
 * 
 * Handles the World Logic and in game timer
 * 
 * @author Neil Chaudhury
 * @version 1
 */

public class World {

	public static void main(String[] args) {
		// World will need an array of Farms - when a farm has 10 farmers, a new farm will be set up from default with 3 farmers taken from the previous farm. 
		// The farm will have fewer farmers. TODO
		System.out.println("Welcome to Farm Simulator");
		System.out.println("This simulator only supports 1 Farm... We will now set it up");
		System.out.println("How many farmers? Enter 1-6");
		Scanner scan = new Scanner(System.in);
		int numOfFarmers = scan.nextInt();
		while (numOfFarmers < 1 || numOfFarmers > 6) {
			System.out.println("How many farmers? Enter 1-6");
			numOfFarmers = scan.nextInt();
		}
		System.out.println("Starting with " + numOfFarmers + " farmers");
		System.out.println("What kind of farm would you like to start?");
		System.out.println("Animal/Crop/Hybrid");
		String typeOfFarm = scan.next();
		System.out.println("Starting " + typeOfFarm + " farm");

		int numOfTurns = 0;
		boolean cycle = true; // True is day and false is night
		Farm testFarm = new Farm();
		boolean nameBad = true;
		while (nameBad) {
			if (typeOfFarm.equalsIgnoreCase("animal")) {
				testFarm.startAnimalFarm(numOfFarmers);

				nameBad = false;

			} else if (typeOfFarm.equalsIgnoreCase("crop")) {
				testFarm.startCropFarm(numOfFarmers);
				nameBad = false;
			} else if (typeOfFarm.equalsIgnoreCase("hybrid")) {
				testFarm.startHybridFarm(numOfFarmers);
				nameBad = false;
			} else {
				System.out.println("What kind of farm would you like to start?");
				System.out.println("Animal/Crop/Hybrid");
				typeOfFarm = scan.next();

			}
		}
		while (numOfTurns <= 50) // this will run 50 turns or 100 cycles
		{

			if (cycle) // day logic
			{
				System.out.println("Day Cycle " + numOfTurns);

				testFarm.runDayCycle(numOfTurns);
				cycle = false;
			} else // night cycle
			{
				System.out.println("Night Cycle " + numOfTurns);

				testFarm.runNightCycle(numOfTurns);
				cycle = true;
			}
			numOfTurns++;
		}
	}

}
