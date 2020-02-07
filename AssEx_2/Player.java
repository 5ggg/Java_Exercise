/**
 * This class represent a game player 
 */

public class Player {
	
	// player's name
	
	private String name;
	
	// a attribute to store their counter symbol
	
	private char countSymbol;
	
	public Player(String name, char countSymbol) {
		this.name = name;
		this.countSymbol = countSymbol;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getCountSymbol() {
		return countSymbol;
	}
	
	public void setCountSymbol(char countSymbol) {
		this.countSymbol = countSymbol;
	}
	
	 public String toString() {
	        return "Player{" +
	                "name='" + name + '\'' +
	                ", countSymbol=" + countSymbol +
	                '}';
	}
	
	
	

}
