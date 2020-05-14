import java.util.ArrayList;


/* Maybe because of I didn't add a lot of comment in the previous AssEx so I lose the mark.
 * Therefore, I try to add more comment in my homework.
 * So, I won't lose marks please please please  0。0
 * 
 */



// Two player plays random
public class ConnectFour {

    // The static method in which two players play randomly
	// until the board is full;
	public static void main(String[] args) {
        int rows = 6;
        int columns = 7;
        Board board = new Board(rows, columns);
        Player p1 = new Player("Clive", 'o');
        Player p2 = new Player("Sharon", 'x');
        Counter c1 = new Counter(p1);
        Counter c2 = new Counter(p2);
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                list.add(j);

        while (list.size()>0){
            int randIndex= (int) (Math.random()*list.size());
            board.add(c1,list.remove(randIndex));
            if (list.size()>0){
                randIndex= (int) (Math.random()*list.size());
                board.add(c2,list.remove(randIndex));
            }
        }
        System.out.println(board.toString());
    }

}
