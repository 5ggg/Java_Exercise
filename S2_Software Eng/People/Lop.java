package People;

import java.io.PrintStream;

import People.Person;

public class Lop {
	Person[] list;

	public Lop(int i) {
		list = new Person[i];
	}

	public Person[] getList() {
		return list;
	}

	public Person getPerson(int i) {
		return list[i];
	}
// add the Person to the list
	public void add(Person p) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) {
				list[i] = p;
				break;
			}
		}
	}
//remove the Person from the list
	public void remove(Person p) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == p) {
				list[i] = null;
				break;
			}
		}
	}

//find the Person from the list
	public Person find(String name) {
		try {
			for (int i = 0; i < list.length; i++) {
				if (list[i].getName().equals(name)) {
					return list[i];
				}
			}
		} catch (NullPointerException e) {
			System.out.println(name + " is not in this list");

		}
		return null;
		
//		for (int i = 0; i < list.length; i++) {
//		if (list[i].getName().equals(name)) {
//			return list[i];		
//			else {
//				system.out.println("can not find that Person");
//			}
//				return null;
//			}
		
	}

	public void print(PrintStream p) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				list[i].printPerson(p);
				System.out.println("");
			}
		}
	}
}
