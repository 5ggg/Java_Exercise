package other;
import java.util.Scanner;


/*
 * 这是一次斐波那契数列的尝试，
 * 基于之前已知的代码。
 * 本程序可以手动选择需要的数值范围（以结束的数值为准）
 * 因为一些不清楚的原因，导致在大于42以上的时的运算速度比较慢。
 * 
 */
public class FibonacciTry {

	public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
        
        
        }
        public static void main(String[] args) {
            System.out.println("Please tell me the number that you need?");
            		Scanner s = new Scanner(System.in);
            	    int targetnumber = s.nextInt();
            		
            		for (int counter = 0; counter <= targetnumber; counter++){
            System.out.printf("Fibonacci of %d is: %d\n",
            counter, fibonacci(counter));
        }
            		System.out.println("That's all!");
            		
            		
    }
    public static void addingmethod(int firstnumber, int secondnumber) {
    	int result = firstnumber + secondnumber;
    	System.out.println(result);
    	

    }

}
