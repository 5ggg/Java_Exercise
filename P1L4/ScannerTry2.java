import java.util.Scanner;

public class ScannerTry2 {
	public static void main(String[] arg) {
		System.out.println("PLZ put your number here:");

		Scanner hhh = new Scanner(System.in);
		
		int age = hhh.nextInt();
	
		boolean licenseornot = age >=18;
		
		if (licenseornot) {
			System.out.println("ok to drive");
		}
			else {
				System.out.println("Too young, too simple!\t Naive!");
			}
		}
		 
	}


