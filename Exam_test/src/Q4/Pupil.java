package Q4;

import java.util.Scanner;

public class Pupil {
	public Pupil(String secondName, String firstName, int numberOfPoints) {
		
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss[] = s.split(" ");
        for (String x : ss) {
            System.out.println(x);
	}

}

	
	try {
        BufferedReader in = new BufferedReader(new FileReader("test.log"));
        String str;
        while ((str = in.readLine()) != null) {
            System.out.println(str);
        }
        System.out.println(str);
    } catch (IOException e) {