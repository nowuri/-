package TermProject;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Calendar;

public class ThreadClock extends JFrame implements Runnable{


 private Thread thread;
 private JLabel label;

 public ThreadClock(){
  super("������ �ð�");

  label = new JLabel();
  label.setFont(new Font("Serif",Font.PLAIN,20));

  if(thread == null){
   thread = new Thread(this); 
   thread.start();
  }

  add(label); 
  setBounds(100,100,400,100); 
  setVisible(true);
 }


 public void run(){

  while(true){
   Calendar cal = Calendar.getInstance();  
   
   StringBuffer now = new StringBuffer();
   now.append(cal.get(Calendar.YEAR));
   now.append("�� ");
   now.append((cal.get(Calendar.MONTH)+1));
   now.append("�� ");
   now.append(cal.get(Calendar.DATE));
   now.append("�� ");
   now.append(cal.get(Calendar.HOUR_OF_DAY));
   now.append("�� ");
   now.append(cal.get(Calendar.MINUTE));
   now.append("�� ");
   now.append( cal.get(Calendar.SECOND));
   now.append("�� ");
   
   label.setText(now.toString());

   
   try {
    Thread.sleep(1000);
   } catch(InterruptedException e) {
    e.printStackTrace();
   
   }
  
  }

 }

} 
