package Review_Slides;

import javax.swing.*;
import java.awt.FlowLayout;

public class FlowLayoutDemo extends JFrame {
	private JButton button1, button2;
	private JTextField textField1;
	private JLabel label1;
	
	public FlowLayoutDemo() {
		
		button1 = new JButton ("ok");
		button2 = new JButton ("Cancel");
		
		textField1 = new JTextField ("Default TextField", 15);
		
		label1 = new JLabel ("click the button");
		
		this.setLayout(new FlowLayout());
		this.add (button1);
		this.add (button2);
		this.add (textField1);
		this.add (label1);
		
	}

}
