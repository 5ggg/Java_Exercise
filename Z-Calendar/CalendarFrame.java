
  
import java.awt.*;   
import java.awt.event.*;   
import javax.swing.*;  
 
public class CalendarFrame extends JFrame implements ActionListener, MouseListener  
{   
    JLabel labelDay[]=new JLabel[42];   
    JTextField text=new JTextField(10);  
    JButton titleName[]=new JButton[7];   
    JButton button = new JButton();  
    String name[]={"Sun","Mon","Tue","Wen", "Thu","Fri","Sat"};   
    JButton nextMonth,previousMonth;   
    int year=1996,month=6; //设置程序启动时的默认日期（以生日来定义）  
    CalendarBean calendar;   
    JLabel showMessage=new JLabel("",JLabel.CENTER);   
    JLabel lbl1 = new JLabel("请输入年份：");  
    JLabel lbl2=new JLabel("   ");  
   
//    JLable labelDay[] = new JLabel[42]
    public CalendarFrame()   
    { 
    setBackground(new Color(0, 128, 128));   // 也许这个就是Cyan色 Cyan 探机 china starcraft2 players
      JPanel pCenter=new JPanel();   
      pCenter.setBackground(new Color(0, 139, 139)); 
         
     //将pCenter的布局设置为7行7列的GridLayout 布局。   
      pCenter.setLayout(new GridLayout(7,7));   
         
     //pCenter添加组件titleName[i]  
      for(int i=0;i<7;i++)   
      {   
        titleName[i]=new JButton(name[i]);   
        pCenter.add(titleName[i]);   
      }   
   
     //pCenter添加组件labelDay[i]  
      for(int i=0;i<42;i++)   
      {   
        labelDay[i]=new JLabel("",JLabel.CENTER);   
        pCenter.add(labelDay[i]);  
      }   
         
      text.addActionListener(this);  
      calendar=new CalendarBean();   
      calendar.setYear(year);   
      calendar.setMonth(month);   
      String day[]=calendar.getCalendar();   
   
      for(int i=0;i<42;i++)   
      {   
        labelDay[i].setText(day[i]);   
      }   
   
      nextMonth=new JButton("Next Month");   
      previousMonth=new JButton("Last Month");   
      button=new JButton("Enter");  
         
      // Register the monitor.
      nextMonth.addActionListener(this);   
      previousMonth.addActionListener(this);   
      button.addActionListener(this);  
      
      // Set the center layout.
      JPanel pNorth=new JPanel(),  
      pSouth=new JPanel();   
      
      
      pNorth.add(showMessage);   
      pNorth.add(lbl2);   
      pNorth.add(previousMonth);   
      pNorth.add(nextMonth);   
      pSouth.add(lbl1);      
      pSouth.add(text);  
      pSouth.add(button);  
      showMessage.setText("Calendar:"+calendar.getYear()+"年" + calendar.getMonth() +"月" );  
      ScrollPane scrollPane=new ScrollPane();   
      scrollPane.add(pCenter);   
      getContentPane().add(scrollPane,BorderLayout.CENTER);// 窗口添加scrollPane在中心区域   
      getContentPane().add(pNorth,BorderLayout.NORTH);// 窗口添加pNorth 在北面区域   
      getContentPane().add(pSouth,BorderLayout.SOUTH);// 窗口添加pSouth 在南区域。  
   
    }   
      
    public void actionPerformed(ActionEvent e)   
    {   
      if(e.getSource()==nextMonth)   
      {   
        month=month+1;   
        if(month>12)   
        month=1;   
        calendar.setMonth(month);   
        String day[]=calendar.getCalendar();   
   
        for(int i=0;i<42;i++)   
        {  
          labelDay[i].setText(day[i]);   
        }   
       }   
      else if(e.getSource()==previousMonth)   
      {   
        month=month-1;         
        if(month<1)   
        month=12;   
        calendar.setMonth(month);   
        String day[]=calendar.getCalendar();   
   
        for(int i=0;i<42;i++)   
        {   
          labelDay[i].setText(day[i]);   
        }   
       }   
      else if(e.getSource()==button)  
      {  
        month=month+1;         
        if(month>12)          
           month=1;         
        calendar.setYear(Integer.parseInt(text.getText()));         
        String day[]=calendar.getCalendar();          
        for(int i=0;i<42;i++)  //6*7=42
        {  
          labelDay[i].setText(day[i]);  
        }  
      }  
      showMessage.setText("Calendar:"+calendar.getYear()+"年" + calendar.getMonth() +"月" );  
    }   
} 