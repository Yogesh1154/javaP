import java.awt.*;
import javax.swing.*;
public class slip28_2 extends JFrame
{
   JTextField t1,t2;
   JLabel l1,l2;
   
   public slip28_2()
    {
       setTitle("Temp Converter");
       setVisible(true);
       setLayout(null);
       setSize(250,250);
       t1=new JTextField(20);
       t2=new JTextField(20);
       l1=new JLabel("celsious");
       l2=new JLabel("Farhnite");
       l1.setBounds(100,150,100,100);
       add(l1);
      t1.setBounds(180,150,125,60);
     add(t1);
     l2.setBounds(100,280,100,100);
    add(l2);
    t2.setBounds(180,280,125,60);
     add(t2);
}
public static void main(String args[])
  {
   slip28_2 ob=new slip28_2();
 }
   
   }
