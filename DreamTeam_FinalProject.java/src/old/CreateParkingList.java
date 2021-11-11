package old;

import java.util.ArrayList;

/*This class creates the initial list of all available parking slots. As of now, I am assuming all parking garages have the same number of floors and slots.*/

public class CreateParkingList {
	private Integer numberOfGarage;
	private Integer numberOfFloor;
	private Integer numberOfSlot;
	private ArrayList<ParkingSpaceInfo> listOfSpaces = new ArrayList<ParkingSpaceInfo>();

	//Constructor to initialize the values and call generateList()	
	public CreateParkingList(Integer numGarage, Integer numFloor, Integer numSlot) throws IllegalArgumentException {
		if ((numGarage == null || numGarage == 0) || (numFloor == null || numFloor == 0)
				|| (numSlot == null || numSlot == 0)) {
			throw new IllegalArgumentException("Cannot have '0' or null inputs");
		}

		this.numberOfGarage = numGarage;
		this.numberOfFloor = numFloor;
		this.numberOfSlot = numSlot;
		generateList();
	}

	// Creates the list. MUST NOT ALLOW ZERO OR NULL AS INPUT
	private void generateList() {
		for (Integer i = 1; i <= this.numberOfGarage; i++) {
			for (Integer j = 1; j <= this.numberOfFloor; j++) {
				for (Integer k = 1; k <= this.numberOfSlot; k++) {
					this.listOfSpaces.add(new ParkingSpaceInfo(i, j, k));
				}
			}
		}
	}

	// get method	
	public ArrayList<ParkingSpaceInfo> getList() {
		return this.listOfSpaces;
	}
}