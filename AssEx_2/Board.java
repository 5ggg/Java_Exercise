
// "Create a class to represent a Board"
public class Board {
	
	private int rows;
	private int columns;
	Column[] columnArray;
	
	// take a number of rows and columns in its constructor
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		columnArray = new Column[columns];
		for (int i=0; i<columns; i++) {
			columnArray[i] = new Column(rows);
		}
	}
	
	// A boolean add method add method that takes a reference to a Counter object
	// and a column number as arguments(in that order)
	// and returns true if the board successfully adds the counter to that column,
	// and false otherwise.
	public boolean add(Counter counter, int columnNum) {
		Column col = columnArray[columnNum];
		return col.add(counter);
	}
	
	// toString method produces a String representation of the board as shown in Figure 2
	// if without toString, the figure will not shown in the output.
	public String toString() {
		String headLine = "";
		String cutLine = "";
		String contentLine[] = new String[rows];
		
		headLine +="|";
		for (int i=0; i<columns; i++) {
			headLine += i+"|";
			cutLine +="--";
			Column col =columnArray[i];
			
			for (int j=0; j<rows; j++) {
				String symbol = col.displayRow(j);
				if (contentLine[j] == null) {
					contentLine[j] = "|" + symbol;
				} else {
					contentLine[j] += "|" + symbol;
					
				}
			}
			
		}
		
		headLine +="\n";
		cutLine +="\n";
		String result = headLine + cutLine;
		for (int i = contentLine.length-1; i>=0; i--) {
			result += contentLine[i] +"|\n";
		}
		return result;
	}
	
	// a method to your Board class (isFull) that returns true 
	// if the board is full and false otherwise.
	public boolean isFull() {
        for (int i = 0; i < columnArray.length; i++) {
            if (!columnArray[i].isFull()) {
                return false;
            }
        }
        return true;
    }
	
	/*
	 * "Add a method to Board that checks if a player has won"
	 *   
	 * The method checks if from a particular position 
	 * a line (different direction) of 4 counters belonging to the same player exists;
	 
	 * By the way, actually check isWon or not can be set to check the whole figure, after every step.
     * but also, to optimize the algorithm to make it efficient, 
     * it could also only check the position near the latest symbol.
	 */
	

	public boolean isWon() {
	        int z = 4;
	        
	       
	        
	        //horizontal
	        for (int m = 0; m < rows; m++) {
	            for (int n = 0; n < columns - z; n++) {
	                String symbol = null;
	                int index = n;
	                while (index < columns) {
	                    String s = columnArray[index].displayRow(m);
	                    if (symbol == null ||(!s.equals(" ")&& s.equals(symbol))) {
	                        symbol = s;
	                        index++;
	                    } else {
	                        break;
	                    }
	                    if (index - n >= z) {
	                        return true;
	                    }
	                }
	            }
	        }
	        
	        //vertical
	        for (Column col : columnArray) {

	            for (int n = 0; n < rows; n++) {
	                String symbol = null;
	                int index = n;
	                while (index < rows) {
	                    String s = col.displayRow(index);
	                    if (symbol == null ||(!s.equals(" ")&& s.equals(symbol))) {
	                        symbol = s;
	                        index++;
	                    } else {
	                        break;
	                    }
	                    if (index - n >= z) {
	                        return true;
	                    }
	                }
	            }
	        }

	        //left diagonal
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                int indexCol = j;
	                int indexRow = i;
	                String symbol = null;
	                while (indexCol < columns && indexRow < rows) {
	                    String s = columnArray[indexCol].displayRow(indexRow);
	                    if (symbol == null ||(!s.equals(" ")&& s.equals(symbol))) {
	                        symbol = s;
	                        indexCol++;
	                        indexRow++;
	                    } else {
	                        break;
	                    }
	                    if (indexCol - j >= z && indexRow - i >= z) {
	                        return true;
	                    }
	                }
	            }
	        }

	        //right diagonal 
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                int indexCol = j;
	                int indexRow = i;
	                String symbol = null;
	                while (indexCol < columns && indexRow < rows && indexCol > 0 && indexRow > 0) {
	                    String s = columnArray[indexCol].displayRow(indexRow);
	                    if (symbol == null || s.equals(symbol)) {
	                        symbol = s;
	                        indexCol--;
	                        indexRow++;
	                    } else {
	                        break;
	                    }
	                    if (indexCol - j >= z && indexRow - i >= z) {
	                        return true;
	                    }
	                }
	            }
	        }
	        return false;
	 }

}