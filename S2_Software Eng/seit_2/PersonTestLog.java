package seit_2;



class PersonTest {
	
	Date date = new Date (

	
//	Date date = new Date (10, 7, 1997);
//	Person person = new Person("Bob", date);
//	Date today = new Date (20, 1, 2020);
	
	public PersonTest() {
		
	}

	@Test
	void testPrint() {
		person.print(System.out);
	}

	@Test
	void testGetName() {
		String name = "Leon";
		String notName = "Nancy";
		assertSame(name, person.getName());
		assertNotSame(notName, person.getName());
	}

	@Test
	void testGetAge() {
		assertEquals(22, person.getAge(today), "ages must the same");
		assertNotEquals(18, person.getAge(today));
	}

}
