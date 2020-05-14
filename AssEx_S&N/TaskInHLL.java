public class TaskInHLL {
	
	public static void main(String[] args) {
		int[] x = {3,-6,27,101,50,0,-20,-21,19,6,4,-10};
		
		int possum = 0;
		int negcount = 0;
		int oddcount = 0;
		
		for(int i=0; i<x.length; i++) {
			if(x[i]>=0) {
				possum += x[i];
			}
			
			if(x[i]<0) {
				negcount += 1;
			}
			
			if(x[i]>0 && x[i] % 2 == 1) {
				oddcount += 1;
			}
		}
		
		System.out.println(possum);
		System.out.println(negcount);
		System.out.println(oddcount);
	}
}
	
	
	
	
//public class TaskInHLL {

//public static void main (String[] args) {
//	int[] x = {3,-6,27,101,50,0,-20,-21,19,6,4,-10};
//	
//    System.out.println(postiveSum(x));
//	System.out.println(negativeCount(x));
//	System.out.println(task3(x));
//	
//}
//	public static int postiveSum (int[] x) {
//		int possum = 0;
//		for(int i=0; i<x.length; i++) {
//			if(x[i]>=0) {
//				possum += x[i];
//			}
//		}
//		return possum;
//	}
//	
//	public static int negativeCount (int[] x) {
//		int negcount = 0;
//		for(int i=0; i<x.length; i++) {
//			if(x[i]<0) {
//				negcount += 1;
//			}
//		}
//		return negcount;
//	}
//	
//	public static int task3 (int[] x) {
//		int oddcount = 0;
//		for(int i=0; i<x.length; i++) {
//			if(x[i]>0 && x[i] % 2 == 1) {
//				oddcount += 1;
//			}
//		}
//		return oddcount;
//	}
//	
//	
//
//}
