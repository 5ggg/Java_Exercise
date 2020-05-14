package Office;

import java.io.PrintStream;


import People.Date;
import People.Person;

public class Worker extends Person {
	Date dob;
	Boss boss;

	public Worker(String n, Date d, Boss b) {
		super(n, d);
		boss = b;
		
		b.add_worker(this);
	}
	
	public void new_boss(Boss b) {
		this.get_Boss().sub_worker(this);
		
		boss = b;
		b.add_worker(this);
		
		
	}
	
	public Boss get_Boss() {
		return boss;
	}
	
	public void print(PrintStream ps) {
		ps.print(this.getName() + "\t");
		this.getBirthDay().printDate(ps);
		ps.print( " Boss: " + this.get_Boss().getName());
		
	}
	
	

}
