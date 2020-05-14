
  
import javax.swing.JFrame;  
import javax.swing.UIManager;  
   
public class CalendarMainClass   
{   
    public static void main(String args[])   {
       
    	
    	/*
    	 * This is a throwable Exception
    	 * in detail_ to set the theme as what you need LookAndFell;
    	 * UnsupportedLookAndFeelException - if lnf.isSupportedLookAndFeel() is false
    	 */
    	try {  
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // Windows 
       }catch (Exception e) {  
        e.printStackTrace();  
       }  
       CalendarFrame frame = new CalendarFrame();   
//       frame.setSize(420,300);
//       frame.setLocation(100,100);
         frame.setBounds(100,100,420,300);   //setBound equals to setLocation(first) as well as setSize(second)
       frame.setTitle("Calendar mini program");  
       
// Set the Program window into the center of the Screen and the value of this instruction is higher than the setLocation.
// It means that if we used the below line of code, the setLocation instruction will be omitted by Eclipse.
       frame.setLocationRelativeTo(null); 
       frame.setVisible(true);   
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }   
} 