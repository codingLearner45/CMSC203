

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany mgm;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		mgm = new ManagementCompany("name", "taxID", 5);
		
		//student add three properties, with plots, to mgmt co
		mgm.addProperty("Shrek Inc.", "Manhattan", 5455.00, "Bradley Smith",2,2,1,1);
		mgm.addProperty("Marvel Studios", "New Orleans", 3814, "Benson Benedicts",3,3,1,1);
		mgm.addProperty("Tony Towers", "Seattle", 4420, "Stewie Griffin",4,4,1,1);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null 
		mgm = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot (0,0,1,1)
		assertEquals(mgm.addProperty("place4", "Las Vegas", 3255.00, "Luigi"), 3, 0);
		//student should add property with 8 args
		assertEquals(mgm.addProperty("place5", "Austin", 1445.00, "Bowser",1,1,1,1), 4, 0);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		assertEquals(mgm.addProperty("place6", "Chicago", 1445.00, "Kirby",1,1,2,2), -1, 0);
	}
 
	@Test
	public void testMaxRentProp() {
		//fail("STUDENT test not implemented yet");
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(mgm.maxRentProp(), 5455, 0);
	}

	@Test
	public void testTotalRent() {
		//fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
		assertEquals(mgm.totalRent(), 13689, 0);
	}

 }
