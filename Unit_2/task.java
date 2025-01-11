// imlement a combo box  inside a frame such whenever we click on particular color in combo box then that particular color should be there on frame background.


import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class task
{
    JFrame jf;

    task()
    {
        jf= new JFrame("combobox created");

        String color[]= {"red", "blue", "magenta", "yellow", "cyan"};

        JComboBox cb= new JComboBox<String>(color);
        cb.setBounds(20,30, 100,30);
        jf.add(cb);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.cyan);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setResizable(true);
        jf.setVisible(true);

        cb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s= (String)cb.getSelectedItem();
                switch(s)
                {
                    case "yellow":
                        jf.getContentPane().setBackground(Color.yellow);
                        break;

                    case "red":
                        jf.getContentPane().setBackground(Color.red);
                        break;

                    case "magenta":
                        jf.getContentPane().setBackground(Color.magenta);
                        break;

                    case "blue":
                        jf.getContentPane().setBackground(Color.blue);
                        break;

                    case "cyan":
                        jf.getContentPane().setBackground(Color.cyan);
                        break;
                }
                
                
            }
        });
    }
    public static void main(String args[])
    {
        new task();

    }
}