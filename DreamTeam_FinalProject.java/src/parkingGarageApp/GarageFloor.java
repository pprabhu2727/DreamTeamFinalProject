package parkingGarageApp;
import java.util.ArrayList;

public class GarageFloor{
	private int floorLevel;
	private int numOfSlots;
	private ArrayList<ParkingSlot> slots;
	
	public GarageFloor(int floorLevel, int numberOfSlotsOnEachFloor) {
		this.floorLevel=floorLevel;
		this.numOfSlots=numberOfSlotsOnEachFloor;
		createSlots(numberOfSlotsOnEachFloor);
	}
	
	private void createSlots(int numberOfSlotsOnEachFloor){
		ArrayList<ParkingSlot> slotList= new ArrayList<ParkingSlot>();
		for(int i=1; i<=numberOfSlotsOnEachFloor; i++) {
			slotList.add(new ParkingSlot(i));
		}
		this.slots=slotList;
	}
	
	public int getFloor() {
		return this.floorLevel;
	}
	public int getNumberOfSlots() {
		return this.numOfSlots;
	}
	public ArrayList<ParkingSlot> getSlots(){
		return this.slots;
	}
	
}