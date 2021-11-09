
import initialization.*;

//Use this class to test your code for now.

public class Main{
	
	public static void main (String[] args) {
		
		//You can comment out the stuff below to test your own things
		CreateParkingList x = new CreateParkingList(2,2,1);
		x.getList();
		
		SearchList y = new SearchList(1,1,x.getList());
		y.search();
		
		System.out.println("Test");
	}
}