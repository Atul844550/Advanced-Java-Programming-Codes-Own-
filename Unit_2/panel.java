import javax.swing.*;
import java.awt.Color;
class panel
{
public static void main(String args[])
{
JFrame f=new JFrame("This is Panel application");
JPanel p=new JPanel();                                            // Jpanel is a class.
p.setBounds(15,15,120,150);
p.setBackground(Color.cyan);
JButton b=new JButton("Push Button");
b.setBounds(20,20,50,50);
b.setBackground(Color.black);
b.setForeground(Color.white);
p.add(b);

JPanel p1=new JPanel();
p1.setBounds(140,140,120,150);
p1.setBackground(Color.green);

JTextField tf=new JTextField(10);                      // Jtextfield is a class for writing a text. 10 represent the no.of column passed.
tf.setBounds(20,20,50,50);
tf.setBackground(Color.blue);
tf.setForeground(Color.red);
p1.add(tf);

f.add(p);
f.add(p1);
f.setSize(400,400);
f.setResizable(false); 
f.setLocationRelativeTo(null);
f.getContentPane().setBackground(new Color(50,160,160));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
f.setVisible(true);
}
}