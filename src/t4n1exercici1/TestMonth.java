package t4n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestMonth {

	
	@Test
	public void sizeTest() {
		System.out.println("sizeTest() executing...");
		int size = Month.addMonths().size();
		assertEquals(12, size);
	}

	@Test
	public void emptyTest() {
		System.out.println("emptyTest() executing...");
		// also valid ? assertTrue(Month.addMonths().isEmpty() == false);
		assertNotNull(Month.addMonths());
	}

	@Test
	public void indexTest() {
		//String month = "Agost";
		//assertTrue(month.equalsIgnoreCase(Month.addMonths().get(7)));
		System.out.println("indexTest() executing...");
		assertEquals("Agost" , Month.addMonths().get(7));
	}

}
