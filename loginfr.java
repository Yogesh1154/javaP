import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class loginfr extends Frame implements ActionListener
{
  TextField t1, t2, t3;
  Label l1, l2, l3;
  Button b1, b2;
Frame f1;
   public loginfr()
  {
  f1=new Frame();
f1.setVisible(true);
f1.setSize(300,250);
f1.setTitle("login frame");
f1.setLayout(null);
   t1=new TextField(30);
   t2=new TextField(30);
   t3=new TextField(30);
//  t2.setEchoChar('*');
   l1=new Label("Login");
  l2=new Label("Password");
   l3=new Label("Output"); 
     b1=new Button("ok"); 
    b2=new Button("Reset");
b1.addActionListener(this);
b2.addActionListener(this);
 l1.setBounds(280,180,70,70);
  f1.add(l1);
t1.setBounds(350,180,150,60);
f1.add(t1);
l2.setBounds(280,280,70,70);
f1.add(l2);
t2.setBounds(350,280,150,60);
f1.add(t2);
l3.setBounds(280,380,70,70);
f1.add(l3);
t3.setBounds(350,380,150,60);
f1.add(t3);
b1.setBounds(280,480,100,50);
f1.add(b1);
b2.setBounds(480,480,100,50);
f1.add(b2);
}
public void actionPerformed(ActionEvent e) 
  {
  String S1=t1.getText();
  String S2=t2.getText();
     if(e.getSource()==b1) 
     {
     if(S1.equals("ty") && S2.equals("BCS"))
     { 
     t3.setText("Successfull");
     }
 else
       {
        t3.setText("Please try again");
       }
    }
  else if(e.getSource()==b2)
   {
    t1.setText("");
 t2.setText("");
 t3.setText("");
   }
  }
public static void main(String args[])
 {
    loginfr k=new loginfr();
 }
}

