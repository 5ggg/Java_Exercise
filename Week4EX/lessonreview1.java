
public class lessonreview1 {
	public static void main (String[] args) {
		int[][] myfirstarray = new int[3][4];
//		for (int i=0; i<myfirstarray.length; i++) {
//			for (int j=0, j<myfisrtarray.length; j++) {
//				int[i][j] = i+j;
//			}
//		}
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
			    myfirstarray [i][j]=i+j;
			}
		}
			
		print1DIntArray(myfirstarray[2]);
	}
	public static void print1DIntArray (int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}

	


