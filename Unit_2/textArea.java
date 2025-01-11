import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;

class textArea{
public static void main(String args[])
{
JFrame f=new JFrame("My textarea application");
JLabel l=new JLabel();
l.setBounds(20,20,100,30);
l.setForeground(Color.red);

JLabel l1=new JLabel();
l1.setBounds(100,20,100,30);
l1.setForeground(Color.red);

JTextArea ta=new JTextArea();
ta.setBounds(60,20,100,100);

JButton b1=new JButton("count");
b1.setBounds(100,250,100,30);
b1.setForeground(Color.green);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String text=ta.getText();
String words[]=text.split("\\s");                    //   "//s" represent the space 
l.setText("words:- "+words.length);
l1.setText("Characters:- "+ text.length());
}
});
f.add(l,BorderLayout.CENTER);
f.add(l1);
f.add(ta);
f.add(b1,BorderLayout.SOUTH);
f.setSize(500,500);
f.setResizable(false);
f.setLocationRelativeTo(null);
f.getContentPane().setBackground(new Color(130,130,130));
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}
}