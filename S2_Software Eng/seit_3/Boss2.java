import java.io.PrintStream;

public class Lop {
	Person[] list;

	public Lop(int i) {
		list = new Person[i];
	}

	public Person[] getList() {
		return list;
	}

	// method to get the person object from an index
	public Person getPerson(int i) {
		return list[i];
	}

	// method to add a person to the array
	public void add(Person p) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) {
				list[i] = p;
				break;
			}
		}
	}

	// method to remove a person from the array
	public void remove(Person p) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == p) {
				list[i] = null;
				break;
			}
		}
	}

	// method to find a person from an array
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
	}

	// method to print out the info of all the people in the list
	public void print(PrintStream p) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				list[i].print(p);
				System.out.println("");
			}
		}
	}
}
