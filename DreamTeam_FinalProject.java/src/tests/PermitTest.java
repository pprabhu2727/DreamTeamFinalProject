package tests;
import parkingGarageApp.Permit; 
import static org.junit.Assert.*;

import org.junit.Test;

public class PermitTest {

	@Test
	public void test() {
		boolean b;
		String s = null;
		
		Permit p = new Permit(s);
		
		b = p.checkPermit();
		
		assertEquals(false, b);
	}

}
