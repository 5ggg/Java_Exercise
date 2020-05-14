
// This class is just for Test
public class Test {

    public static void main(String[] args) {
        System.out.println("=========test1==============");
        test1();
        System.out.println("\n=========test2==============");
        test2();
        System.out.println("\n=========test3==============");
        test3();

    }

    private static void test1(){
        
    	//test1
        Player p1=new Player("Clive",'x');
        Counter c=new Counter(p1);
        System.out.println(c.getPlayer().toString()+","+c.toString());
        Column col=new Column(4);
        for (int i=0;i<5;i++){
            Boolean result=col.add(new Counter(p1));
            System.out.println(result);
        }
    }
    
    //test2
    private static void test2(){
                Column col = new Column(6);
        Player p1 = new Player("Clive", 'o');
        Player p2 = new Player("Sharon", 'x');
        for (int i = 0; i < 3; i++) {
            col.add(new Counter(p1));
            col.add(new Counter(p2));
        }
        col.display();
    }

    //test3
    // 
    // For Task 3.d:
    //       "You can test your Board class using the following code 
    //       that should give the output shown in the Figure 2 above"
    //       XXXXXXXXXXXXXXXXXX
    //       XXXXXXXXXXXXXXXXXX
    //       XXXXXXXXXXXXXXXXXX
    //       XXXXXXXXXXXXXXXXXX
    //       XXXXXXXXXXXXXXXXXX
    private static void test3(){

        Board board = new Board(6, 7);
        Player p1 = new Player("Clive", 'o');
        Player p2 = new Player("Sharon", 'x');
        board.add(new Counter(p2), 6);
        board.add(new Counter(p1), 3);
        board.add(new Counter(p2), 4);
        board.add(new Counter(p1), 4);
        board.add(new Counter(p2), 5);
        board.add(new Counter(p1), 5);
        board.add(new Counter(p2), 6);
        board.add(new Counter(p1), 5);
        board.add(new Counter(p2), 6);
        board.add(new Counter(p1), 6);

        System.out.println(board.toString()); // Without this line, the figure will not show.
        System.out.println(board.isWon());  // Test the 'iswon' method works or not. ('isWon' method is in class Board)
    }
}
