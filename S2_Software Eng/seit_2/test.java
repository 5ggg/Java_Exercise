package seit_2;

import Office.Boss;
import Office.Worker;
import People.Date;
import People.Lop;
import People.Person;

public class test {
	public static void main(String[] args) {
		
		Date d1 = new Date (7, 3, 2001);
		Date d2 = new Date (10, 7, 1997);
		Date current = new Date (25, 1, 2020);
		
		Person J = new Person ("Julia", d2);
		Person E = new Person ("Emmi", d1);
		
		Boss H = new Boss ("Harriet", d1);
		Boss F = new Boss ("Fran", d2);
		
		Worker R = new Worker ("Richard", d1, H);
		Worker G = new Worker ("Gerard", d2, F);
		
		Lop people = new Lop(10);
		people.add(H);
		people.add(F);
		people.add(J);
		people.add(E);
		people.add(R);
		people.add(G);
		people.print(System.out);
		
		
		
		
//		Lop lop = new Lop(5);
//		
//		Date d2 = new Date (19,6,1996);
//		Date currentDate = new Date (10,2,2020);
//		
//		Person p1 = new Person ("5ggg", d1);
//		Person p2 = new Person ("Leon", d2);
//		Person w1 = new Person("aaa", new Date(1, 2, 1991));
//	    Person w2 = new Person("bbb", new Date(3, 4, 1993));
//	    Person w3 = new Person("ccc", new Date(5, 6, 1995));
//	    Person b1 = new Person("ddd", new Date(7, 8, 1997));
//	    Person b2 = new Person("eee", new Date(9,10, 1999));
//	    
//	   
//	    
//	    p1.printPerson(System.err);
//	    w1.printPerson(System.err);
//	    w2.printPerson(System.err);
//	    w3.printPerson(System.err);
//	    b1.printPerson(System.err);
//	    b2.printPerson(System.err);
	   
		
		
	    

	    
	    
	    
	    
	     
	    
	    
	    
	}

}
