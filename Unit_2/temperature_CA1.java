import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;


class temperature_CA1
{
    public static void main(String args[])
    {
        JFrame f= new JFrame("temperature converter application");
        f.setSize(500, 500);

        JLabel l = new  JLabel();
        l.setBounds(40,180,200,80);
        l.setForeground(Color.cyan);

        JButton b = new JButton("convert");
        b.setBounds(40,150,100,30);
        b.setBackground(Color.green);
        b.setForeground(Color.white);

        JTextField tf= new JTextField("enter the temperature in centegrade");
        tf.setBounds(40,50,200,30);
        tf.setBackground(Color.red);
        tf.setForeground(Color.white);

        JTextField tf1= new JTextField();
        tf1.setBounds(40,100,100,30);
        tf1.setBackground(Color.cyan);
        tf1.setForeground(Color.blue);

        f.add(l);
        f.add(b);
        f.add(tf);
        f.add(tf1);

        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String a= tf.getText();
                int b1= Integer.parseInt(a);
                int fah= ( 9/5 * b1 + 32);

                String result= String.valueOf(fah);
                tf1.setText(result);

                if(e.getSource()== b)
                {
                    l.setText("your temperature is converted");
                }
            }
        });

        f.getContentPane().setBackground(new Color(200,150,170));
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(true);
        f.setVisible(true);


        



    }
}