/**
 * This class represent a game counter
 */

public class Counter {
	
	//only one attribute: a reference to the player object that it belongs to
	private Player player;
	
	public Counter(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public String toString() {
		return "Counter{player=" + player +
				'}';
	}
	
	public boolean equals(Object obj) {
		if (obj.equals(this)) {
			return true;
		}
		return false;
	}

}
