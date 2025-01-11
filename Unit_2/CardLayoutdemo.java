import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CardLayoutdemo
{
static JButton prev, next;
static CardLayout cl;
static JPanel p;
static JComboBox<String>jcb;
public static void main(String [] sj)
{
JFrame f = new JFrame("My Cards");
f.setSize(800, 700);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLocationRelativeTo(null);

p = new JPanel();
cl = new CardLayout();
p.setLayout(cl);
f.add(p);

JPanel p1 = new JPanel(); 
p1.setBackground(Color.RED);
p.add(p1, "Red");

JPanel p2 = new JPanel(); 
p2.setBackground(Color.GREEN);
p.add(p2, "Green");

JPanel p3 = new JPanel(); 
p3.setBackground(Color.cyan);
p.add(p3, "Cyan");

JPanel p4 = new JPanel(); 
p4.setBackground(Color.YELLOW);
p.add(p4, "Yellow");

JPanel p5 = new JPanel(); 
p5.setBackground(Color.MAGENTA);
p.add(p5, "Magenta");

JPanel buttons = new JPanel();
prev = new JButton("Previous");
next = new JButton("Next");
buttons.add(prev);
buttons.add(next);
f.add(buttons, BorderLayout.SOUTH);

String [] str = {"Yellow", "Green", "Red", "Magenta", "Cyan"};
jcb = new JComboBox<String>(str);     
buttons.add(jcb);

MyListener ml = new MyListener();                  // its a interface.
prev.addActionListener(ml);
next.addActionListener(ml);
jcb.addActionListener(ml);
f.setVisible(true);
}
}

class MyListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == CardLayoutdemo.prev)
{
CardLayoutdemo.cl.previous(CardLayoutdemo.p);
}
else if(e.getSource() == CardLayoutdemo.next)
{
CardLayoutdemo.cl.next(CardLayoutdemo.p);
}
else if(e.getSource() == CardLayoutdemo.jcb)
{
String selected = (String)CardLayoutdemo.jcb.getSelectedItem();
CardLayoutdemo.cl.show(CardLayoutdemo.p, selected);
}
}
}