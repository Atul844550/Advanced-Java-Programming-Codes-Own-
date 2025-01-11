import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


class keyevent implements KeyListener
{

    JFrame f;
    JTextArea ta;
    JLabel l;

    keyevent()
    {
        f= new JFrame("key event application");

        l= new JLabel();
        l.setBounds(40, 100, 180, 230);
        l.setForeground(Color.red);

        ta= new JTextArea();
        ta.setBounds(30, 70, 250, 100);
        ta.addKeyListener(this);

        f.add(ta);
        f.add(l);

        f.setSize(700, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(120,150,140));
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

        public void keyPressed(KeyEvent e)      // used while clicking on arror key from keyboard.
        {
            l.setText("key got pressed");
        }

        public void keyReleased(KeyEvent e)
        {
            l.setText("key got releases");
        }

        public void keyTyped(KeyEvent e)
        {
            l.setText("key got typed");
        }
    

    public static void main(String args[])
    {
        new keyevent();
    }
}