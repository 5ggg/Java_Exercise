
public class Review {
	public static int addingMethod(int a, int b) {
		int result = a + b;
		return result;
	}
	public static void main (String[] args ) {
		int a = addingMethod (3,4);
		System.out.println(a);
		
		System.out.println(addingMethod (3,4));
		
		System.out.print(addingMethod (3,5));
		System.out.print(addingMethod (3,5));
	}
	
}
