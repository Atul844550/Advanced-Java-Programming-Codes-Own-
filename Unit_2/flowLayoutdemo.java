import javax.swing.*;
import java.awt.*;
import java.awt.Color;

class flowLayoutdemo
{
    JFrame jf;

    flowLayoutdemo()
    {
        jf= new JFrame("1");
        jf.setSize(500,500);
        jf.setLocationRelativeTo(null);
        jf.getContentPane().setBackground(new Color(10,200,145));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout(FlowLayout.RIGHT, 120, 150));

        JButton b1= new JButton("1");
        b1.setBounds(20,50,60,30);
        

        JButton b2= new JButton("2");
        b1.setBounds(25,50,60,30);
        

        JButton b3= new JButton("3");
        b1.setBounds(30,50,60,30);
        

        JButton b4= new JButton("4");
        b1.setBounds(35,50,60,30);
        

        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
    }

    public static void main(String args[])
    {
        new flowLayoutdemo();
    }


}