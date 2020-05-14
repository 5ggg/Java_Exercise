package Review_Slides;
import javax.swing.JFrame;

public class Plotter1 extends JFrame {
	
	
	public Plotter1 () {
		
//其实也只是一个窗口
//		this.setBounds(300, 300, 500, 500);
		
		
		
		this.setSize(500,500);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Just a Frame");
		
	}
	
	public static void main (String[] args) {
		Plotter1 a = new Plotter1();
	}

}
