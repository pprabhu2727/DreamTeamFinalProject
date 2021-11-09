package initialization;

/*  This class combines Garage number, Floor number, and numbers of parking spaces per floor. 
  This is used to help create a list of available parking spaces */

public class ParkingSpaceInfo {
	private Integer garageNumber;
	private Integer floorNumber;
	private Integer slotNumber; // refers to the parking slot within each floor

	//Constructor to initialize values	
	public ParkingSpaceInfo(Integer garageNumber, Integer floorNumber, Integer slotNumber)
			throws IllegalArgumentException {
		if (garageNumber == null || floorNumber == null || slotNumber == null) {
			throw new IllegalArgumentException("Cannot have null inputs");
		}

		this.garageNumber = garageNumber;
		this.floorNumber = floorNumber;
		this.slotNumber = slotNumber;
	}

	// Get and Set Methods
	public Integer getGarage() {
		return this.garageNumber;
	}

	public Integer getFloor() {
		return this.floorNumber;
	}

	public Integer getSlot() {
		return this.slotNumber;
	}

	public void setGarage(Integer newNumber) {
		this.garageNumber = newNumber;
	}

	public void setFloor(Integer newNumber) {
		this.floorNumber = newNumber;
	}

	public void setSlot(Integer newNumber) {
		this.slotNumber = newNumber;
	}

}