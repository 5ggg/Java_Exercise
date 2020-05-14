package seit_2;

import Office.Boss;
import Office.Worker;
import People.Date;
import People.Lop;
import People.Person;

public class MainClass {
	public static void main (String [] args) {
		Date d1 = new Date (7, 3, 2001);
		Date d2 = new Date (10, 7, 1997);
		Date current = new Date (25, 1, 2020);
		
		Person A = new Person ("5ggg", d2);
		Person B = new Person ("Leon", d1);
		
		Boss C = new Boss ("bossA", d1);
		Boss D = new Boss ("bossB", d2);
		
		Worker E = new Worker ("WorkerA", d1, C);
		Worker F = new Worker ("WorkerB", d2, D);
		
		Lop people = new Lop(10);
		
		people.add(A);
		people.add(B);
		people.add(C);
		people.add(D);
		people.add(E);
		people.add(F);
		people.print(System.out);
		
		
		
		
		
		
		
	}

}
