import java.util.ArrayList;
import initialization.*;
import java.util.Iterator;

/*Uses an Iterator. This static class searches available slots and returns an ArrayList. A garage number MUST be inputed to search, but floor can be left empty. */
public class SearchList {
	private Integer garageNumber;
	private Integer floorNumber;
	private ArrayList<ParkingSpaceInfo> list;

	// Constructor. Input the garage,floor, and list you want to search. Floor can
	// be null if you just want to search by garage
	public SearchList(Integer garage, Integer floor, ArrayList<ParkingSpaceInfo> inputList)
			throws IllegalArgumentException {
		if ((garage == null || garage == 0)) {
			throw new IllegalArgumentException("Garage number cannot be null");
		}

		this.garageNumber = garage;
		this.floorNumber = floor;
		// creates a copy of the input list so that it doesn't change the original
		ArrayList<ParkingSpaceInfo> copyOfList = new ArrayList<ParkingSpaceInfo>();
		copyOfList.addAll(inputList);
		this.list = copyOfList;
	}

	// Search class that uses an iterator to remove parking spaces that don't meet
	// the search results. Returns arraylist
	public ArrayList<ParkingSpaceInfo> search() {
		// Condition to check if the user inputed a null value for floor
		boolean hasFloor = true;
		if (floorNumber == null)
			hasFloor = false;

		Iterator<ParkingSpaceInfo> it = this.list.iterator();

		while (it.hasNext()) {
			ParkingSpaceInfo currentIterationItem = it.next();
			if (currentIterationItem.getGarage() != garageNumber) {
				it.remove();
			} else if (hasFloor && floorNumber != 0) {
				if (currentIterationItem.getFloor() != floorNumber) {
					it.remove();
				}
			}
		}
		return this.list;
	}

}