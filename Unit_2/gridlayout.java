import javax.swing.*;
import java.awt.Color;
import java.awt.*;

class gridlayout
{
    JFrame f;

    gridlayout()
    {
        f= new JFrame("grid layout application");

        JButton b1= new JButton("1");
        b1.setBounds(15,20,80,30);

         JButton b2= new JButton("2");
        b2.setBounds(30,20,80,30);

        JButton b3= new JButton("3");
        b3.setBounds(15,20,80,30);

         JButton b4= new JButton("4");
        b4.setBounds(15,20,80,30);

         JButton b5= new JButton("5");
        b5.setBounds(15,20,80,30);
         JButton b6= new JButton("6");
        b6.setBounds(15,20,80,30);
         
         JButton b7= new JButton("7");
        b7.setBounds(15,20,80,30);

         JButton b8= new JButton("8");
        b8.setBounds(15,20,80,30);

         JButton b9= new JButton("9");
        b9.setBounds(15,20,80,30);

         JButton b10= new JButton("10");
        b10.setBounds(15,20,80,30);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);




        f.setSize(500, 500);
        f.getContentPane().setBackground(new Color(140,50,80));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(true);
        f.setLayout(new GridLayout(2, 2, 30, 50));         //gridlayout
        f.setVisible(true);

        

    }

    public static void main(String args[])
    {
            new gridlayout();
    }
}