import java.util.ArrayList;

public class ParkingGarage{
	private int garageNumber;
	private ArrayList<GarageFloor> floors;
	
	public ParkingGarage(int garageNumber, int numberOfFloors, int numberOfSlotsOnEachFloor) {
		this.garageNumber= garageNumber;
		createFloors(numberOfFloors, numberOfSlotsOnEachFloor);
	}
	
	private void createFloors(int numberOfFloors, int numberOfSlotsOnEachFloor ) {
		
		ArrayList<GarageFloor> floorList= new ArrayList<GarageFloor>();
		for(int i=1; i<=numberOfFloors; i++) {
			floorList.add(new GarageFloor(i,numberOfSlotsOnEachFloor));
		}
		this.floors=floorList;
	}
	
	public int getGarageNumber() {
		return this.garageNumber;
	}
	public ArrayList<GarageFloor> getFloorList(){
		return this.floors;
	}
}