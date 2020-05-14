package People;

import java.io.PrintStream;
import java.math.*;

public class Date {

	public int day;
	public int month;Thh
	public int year;

	public Date (int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	public void printDate(PrintStream pp) {
		pp.print(day + "/" + month + "/" + year + "");
	}


	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public int diffInYears (Date d) {
		int difference;

		difference = Math.abs(this.year - d.getYear());

		return difference;

		//		int difference = (int)2020 - d.getYear();	

		//		if(d.getYear() > this.year) {
		//			difference = d.getYear() - this.getYear();
		//			return difference;
		//		}
		//		
		//		else difference = this.year - d.getYear();
		//		return difference;
	}
	
	protected Date Clone() throws CloneNotSupportedException {
		return (Date) super.clone();
		
	}
	
	proteced Date 

//	protected Date Clone() {
//		try {
//			return (Date) super.clone();
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}


}
