package People;


import People.Date;

import java.io.PrintStream;

/** The person class store relevant information (name and date of birth) about an individual Person.
 * 
 * @author 5ggg - JiaLiang Song
 *
 */


public class Person {
	

	// initial the variable;
	private String name;
	private Date dob;

	
	// maybe need try here?
	public Person(String n, Date d) {
		name = n;
		dob = d;
	}

	public Date getBirthDay() {
		return dob;
	}
	public void printPerson(PrintStream ps) {
		ps.print(name + " ");
		dob.printDate(ps);
	}

	public String getName() {
		return name;
	}

	public int getAge(Date currentdate) {
		
		int age = 0;
		age = currentdate.getYear() - this.dob.getYear();
		age = Math.abs(age);
		
		if (this.dob.getMonth()>currentdate.getMonth()) 
		{
			age = age - 1;
		} else if (this.dob.getMonth() == currentdate.getMonth() && this.dob.getDay() > currentdate.getDay()) 
		{
			age =  age - 1;
		}
		return age;
	}

}
		
		
//	}
//
//
//    
////	public int dob_day, dob_month, dob_year, age;
//	public String name;
//	private Date dob;
//	
//	
//	public Person (String n, Date dd) {
////		Person p1 = new Person();   just comment, no need
//// 好好记住这里---
//		
////		this.name = n;
////		this.dob_day = dd.getDay();
////		this.dob_month = dd.getMonth();
////		this.dob_year = dd.getYear();
//		
//		name = n;
//		dob = dd;
//	}
//	
//	public Date getBirthDay() {
//		return dob;
//	}
//	public void printPerson (PrintStream p) {
//		p.print(name + ""+"\n");
//		dob.printDate(p);
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public int getAge(int currentdate) {
//		int age = 0;
//		age = currentdate.getYear() - this.dob_day.getYear();
//		
//		if (this.dob_day.getMonth()>currentdate.getMonth()) {
//			age = age-1;
//		}
//		
//		else if (this.dob_day.getMonth() == currentdate.getMonth() && this.dob_day.getDay() > currentdate.getDay(){
//			age = age - 1;
//		}
//		return age;
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		Person p1 = new Person("5ggg",new Date(19,6,1996));  // 如果在参数里面也用了构造器，那记得也要创建new.
//		System.out.println(p1.getAge(2020) + "\n" + p1.getName());
//		p1.printPerson(System.err);
//	}


