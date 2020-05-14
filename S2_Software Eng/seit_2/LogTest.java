package seit_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import People.Date;
import People.Lop;
import People.Person;

class LopTest {
	
	Lop lop = new Lop(5);
	Date date = new Date (10, 1, 1996);
	Person p1 = new Person ("A", date);
	Person p2 = new Person ("B", date);
	Person p3 = new Person ("C", date);

	@Test
	void testAdd() {
		lop.add(p1);
		assertEquals(lop.getPerson(0), p1);
		
		lop.add(p2);
		assertEquals(lop.getPerson(1), p2);
	}

	@Test
	void testRemove() {
		lop.add(p1);
		lop.add(p2);
		lop.add(p3);
		lop.remove(p2);
		
		assertEquals(null, lop.getPerson(1));
		
	}

	@Test
	void testFind() {
		lop.add(p3);
		lop.add(p2);
		lop.add(p1);;
		
		assertEquals(p1, lop.find("A"));
		assertEquals(p2, lop.find("B"));
		assertEquals(null, lop.find("D"));
	}

	@Test
	void testPrint() {
		lop.add(p1);
		lop.add(p2);
		lop.add(p3);
		lop.print(System.out);
	}

}
