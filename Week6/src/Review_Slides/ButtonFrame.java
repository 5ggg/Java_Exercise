package Review_Slides;

import java.awt.FlowLayout;

import javax.swing.*;


public class ButtonFrame extends JFrame {
	
	// 这些用来定义变量
	private JButton button1, button2;
	private JTextField textField1;
	private JLabel label1;
	
	
	//设置一个新的constructor 来确定具体窗口的内容
	public ButtonFrame() {
		
		
		//给不同的功能区赋值、命名
		button1 = new JButton ("ok");
		button2 = new JButton ("Cancel");
		
		textField1 = new JTextField ("Default TextField", 15); 
		
		label1 = new JLabel ("click the button");
		
		
		// 用下面的这些，来让他们排版，让这些功能（包括按钮、标签）显示出来
		this.setLayout(new FlowLayout());
		this.add (button1);
		this.add (button2);
		this.add (textField1);
		this.add (label1);
		
	}
	
	//用主函数，来让程序得以运行 （同时为了方便在这里进行窗口大小等基础设置）
	public static void main (String[] args) {
		ButtonFrame a = new ButtonFrame();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    a.setSize(300,100);
	    a.setLocation(100,100);
	    a.setTitle("Just a JFrame");
	    a.setVisible(true);
	}
	
	

}
