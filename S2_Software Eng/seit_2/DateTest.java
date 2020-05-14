package seit_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import People.Date;

class DateTest {
	private Date date;
	private Date date2;
	private Date date3;
	private String printDate;
	
	
	public DateTest (){
		
		date = new Date (19, 6, 1996);
		date2 = new Date (31, 12, 2000);
		date3 = new Date (1, 1, 1999);
	}

	
	@Test
	void testGetDay() {
		assertEquals(10, date.getDay(), "Alert");
	}

	@Test
	void testGetMonth() {
		assertEquals(7, date.getMonth(), "Alert");
	}

	@Test
	void testGetYear() {
		assertEquals(1997, date.getYear(), "Alert");
	}

	@Test
	void testDiffInYears() {
		assertEquals(4, date.diffInYears(date2));
		assertNotEquals(3, date.diffInYears(date2));
		assertEquals(0, date.diffInYears(date3));
	}
	
	@Test
	void testPrintDate() {
		date.printDate(System.out);
		date2.printDate(System.out);
	}

}
