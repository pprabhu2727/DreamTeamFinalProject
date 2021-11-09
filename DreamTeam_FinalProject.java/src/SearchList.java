import java.util.ArrayList;
import initialization.*;
import java.util.Iterator;

/*Uses an Iterator. This static class searches available slots and returns an ArrayList. A garage number MUST be inputed to search, but floor can be left empty. */
public class SearchList{
	private Integer garageNumber;
	private Integer floorNumber;
	private ArrayList<ParkingSpaceInfo> list;

	public SearchList(Integer garage, Integer floor, ArrayList<ParkingSpaceInfo> inputList) throws IllegalArgumentException {			
		if ((garage==null) ) {
			throw new IllegalArgumentException("Garage number cannot be null"); 
		}
		else if (garage==0 || floor==0) {
			throw new IllegalArgumentException("'0' is not a valid input");
		}
		
		this.garageNumber = garage;
		this.floorNumber = floor;	
		
		ArrayList<ParkingSpaceInfo> copyOfList = new ArrayList<ParkingSpaceInfo>();
		copyOfList.addAll(inputList);
		this.list= copyOfList;
	}
	//Helper class that uses an iterator to remove parking spaces that don't meet the search results. 
	public ArrayList<ParkingSpaceInfo> search() {
		Iterator<ParkingSpaceInfo> it = this.list.iterator();
		
		while (it.hasNext()) {
			ParkingSpaceInfo currentIterationItem = it.next();
			if (currentIterationItem.getGarage() != garageNumber) {
				it.remove();
			}			
			if (floorNumber!=null) {
				if (currentIterationItem.getFloor() != floorNumber) {
					//it.remove();
				}
			}
		}
		
		return this.list;	
	}
	


}