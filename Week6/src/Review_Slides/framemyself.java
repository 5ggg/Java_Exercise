package Review_Slides;

import javax.swing.*;

public class framemyself extends JFrame {
	
	public framemyself () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLocation(100,100);
		setTitle("Just a Frame try");
		
	}
	
	
	public static void main (String[] args) {
		framemyself a = new framemyself();
		a.setVisible(true);
	}

}