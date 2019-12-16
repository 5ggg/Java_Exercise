import java.util.ArrayList;


//represent a column
public class Column {
	private int numRows;
	private Counter[] numRowsArray;
	private int size = 0;
	
	public Column(int numRows) {
		this.numRows = numRows;
		numRowsArray = new Counter[numRows];
	}
	
	//return true if the column is full
	public boolean isFull() {
		if(size>=numRows) {
			return true;
		}
		return false;
	}
	
	// Your class should have an add method that takes as its arguments 
	// a Counter object and returns a boolean (true or false)
	public boolean add(Counter counter) {
		if (isFull()) {
			return false;
		}
		numRowsArray[size] = counter;
		size ++;
		return true;
	}
	
	// A method called displayRow that takes a row number as an argument.
	// Assume that the row number is always within an acceptable range.
	// The method should return a String consisting of the counter's character
	// if there is a counter at that position 
	//and a String including a space character if there is no counter in that position.
	public String displayRow(int row) {
		String symbol;
		try {
			symbol = String.valueOf(numRowsArray[row].getPlayer().getCountSymbol());
		} catch (NullPointerException e) {
			symbol=" ";
			
		}
		return symbol;
	}
	
	// A display method that display each row on a separate line, 
	// using the displayRow method
	public void display() {
		for (int i = size-1; i>=0; i--) {
			System.out.println(displayRow(i));
			
		}
	}

}
