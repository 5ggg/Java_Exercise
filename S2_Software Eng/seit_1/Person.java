package seit_1;

import java.io.PrintStream;

public class Person {
	public Person(String n, int d, int m, int y, int t) //笔记：构造器很多时候是用来生成对象的。
	{
	name = n;
	dob_d = d;
	dob_m = m;
	dob_y = y;
	type = t;
	
	if (type == 1)
	  {
		Person.worker = new Person[10];
	  }
	}
	
   public void print(PrintStream ps)
	{
	ps.print(String.format("%s: born on %02d/%02d/%4d", name, dob_d, dob_m, dob_y));
	
	if (type == 1)
	       {
		   ps.print(" bosses: ");
	       for (int i = 0; i < nworkers; i++)
	       ps.print(worker[i].name+" " );
	       
	       System.err.print("\n");
	}
	else ps.print(" is bossed by "+boss.name + "\n");
	}
   
	public String name;
	public int dob_d, dob_m, dob_y; // date of birth
	public int type; // 1 = Boss, 2 = Worker
	public Person boss = null;
	public static Person[] worker = null;
	public int nworkers = 0;

	
	
	
	public void settype (int a) {
		type = a;
	}
	
	
	public void setBoss(Person p, Person q) {
		p.boss = q; 
		Person.worker[q.nworkers++] = p;
	}
	       
}
