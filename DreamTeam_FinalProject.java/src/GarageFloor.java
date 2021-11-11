import java.util.ArrayList;

public class GarageFloor{
	private int floorLevel;
	private ArrayList<ParkingSlot> slots;
	
	public GarageFloor(int floorLevel, int numberOfSlotsOnEachFloor) {
		this.floorLevel=floorLevel;
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
	public ArrayList<ParkingSlot> getSlots(){
		return this.slots;
	}
	
}