import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;

class checkbox
{
    public static void main(String args[])
    {
        JFrame jf= new JFrame("check box application");
        JLabel jl= new JLabel("ready to eat");
        jl.setBounds(20,20,100,30);
        jl.setForeground(Color.red);

        JCheckBox c1= new JCheckBox("pizze.... rs 100");
        c1.setBounds(50,50,100,30);
        c1.setBackground(Color.red);


        JCheckBox c2= new JCheckBox("burger.... rs 200");
        c2.setBounds(90,80,100,30);

        JCheckBox c3= new JCheckBox("french fries.... rs 500");
        c3.setBounds(120,100,100,30);

        JButton b= new JButton("your order");
        b.setBounds(100,250,100,30);
        b.setForeground(Color.green);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                float amount=0;
                String msg = " ";

                if(c1.isSelected())
                {
                    amount+= 100;
                }
                if(c2.isSelected())
                {
                    amount+= 200;
                }
                if(c3.isSelected())
                {
                    amount+= 500;
                }
                msg= "total amount is :"+ amount;
                System.out.print(msg);

            }
        });

        jf.add(c1);
        jf.add(c2);
        jf.add(c3);
        jf.add(jl);
        jf.add(b);

        jf.setSize(500,500);
        jf.getContentPane().setBackground(new Color(150,100,170));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setResizable(true);
        jf.setVisible(true);

        }
}