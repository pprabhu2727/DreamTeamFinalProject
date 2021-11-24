package tests;
import parkingGarageApp.Permit; 
import static org.junit.Assert.*;

import org.junit.Test;

public class PermitTest {

	@Test
	public void checkPermitTest() {
		boolean b;
		String s = null;
		Permit p = new Permit(s);
		b = p.checkPermit();
		assertEquals(false, b);
	}

	@Test
	public void getPermitTest(){
		String s = "";
		Permit p = new Permit(s);
		assertEquals("", p.getPermit());
	}
}
