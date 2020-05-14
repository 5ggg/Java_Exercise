package Review_Slides;

import javax.swing.*;
/*
 * 这个还是PPT上面的例子
 */

public class JustShowFrame extends JFrame
{  
   public JustShowFrame() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300,300);
      setLocation(100,100);
      setTitle("Just a JFrame");
   }

   
   public static void main(String [] args)
   {
      JustShowFrame frame = new JustShowFrame ();
      frame.setVisible(true);
   }
}

