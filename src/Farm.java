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

	public Farm() {
		farmersList = new ArrayList<>();
		animalList = new ArrayList<>();
		cropList = new ArrayList<>();
	}
}
