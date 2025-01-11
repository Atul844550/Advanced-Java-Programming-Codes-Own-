import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class calculator{
public static void main(String args[])
{
JFrame f=new JFrame("My claculator");
JLabel l=new JLabel("My claculator application");
l.setBounds(20,20,120,30);
l.setForeground(Color.red);

JTextField tf1=new JTextField();
tf1.setBounds(40,50,100,30);
tf1.setForeground(Color.blue);

JTextField tf2=new JTextField();
tf2.setBounds(40,100,100,30);
tf2.setForeground(Color.blue);

JTextField tf3=new JTextField();
tf3.setBounds(40,150,100,30);
tf3.setForeground(Color.blue);
tf3.setEditable(false);

JButton b1=new JButton("+ ");
b1.setBounds(40,200,100,30);
b1.setForeground(Color.green);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String s1=tf1.getText();
String s2=tf2.getText();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=0;
if(e.getSource()==b1)
{
c=a+b;
}
String result=String.valueOf(c);
tf3.setText(result);
}
});
f.add(l);
f.add(tf1);
f.add(tf2);
f.add(tf3);
f.add(b1);
f.setSize(500,500);
f.setResizable(false);
f.setLocationRelativeTo(null);
f.getContentPane().setBackground(new Color(130,130,130));
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}
}