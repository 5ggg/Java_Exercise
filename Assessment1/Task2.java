
public class Task2 {
	
	public static void main(String[] args) {
		int m = 7;
        int max = 100;
        multiples(m,max);
		
	}
	
	
	
	public static void multiples(int m, int max) {
		for (int t=1; t<=max; t++) {
			if (t%m == 0) {
				System.out.println(t);
			}
		}
	}

}
