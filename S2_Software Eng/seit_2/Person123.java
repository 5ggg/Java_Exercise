package seit_2;

import java.io.PrintStream;

import People.Date;


public class Person123 {
	private String name;
	private Date dob;

	public Person123(String n, Date d) {
		name = n;
		dob = d;
	}


	public Date getBirthDay() {
		return dob;
	}
	public void print(PrintStream p) {
		p.print(name + " ");
		dob.printDate(p);
	}

	public String getName() {
		return name;
	}

	public int getAge(Date current) {
		int age = 0;
		age = current.getYear() - this.dob.getYear();
		if (this.dob.getMonth()>current.getMonth()) {
			age = age - 1;
		} if (this.dob.getMonth() == current.getMonth() && this.dob.getDay() > current.getDay()) {
			age =  age - 1;
		}
		return age;
	}
}
