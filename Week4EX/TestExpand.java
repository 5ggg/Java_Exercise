
public class TestExpand {
	public static void main(String[] args) {
		lessonreview3 ea = new lessonreview3();
		for (int i=0; i<10; i++) {
			ea.add(i);
		}
		System.out.print(ea);
		System.out.println(ea.getLength());
		ea.add(10);
		System.out.print(ea);
		System.out.println(ea.getLength());
		
		
	}

}
