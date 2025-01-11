import javax.swing.*;
import java.awt.Color;

class ComboBox
{
    JFrame jf;

    ComboBox()
    {
        jf= new JFrame("combobox created");

        String color[]= {"red", "blue", "magneta", "yellow", "cyan"};

        JComboBox cb= new JComboBox<String>(color);
        cb.setBounds(20,30, 100,30);
       // cb.setBackground(Color.GRAY);
        jf.add(cb);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.cyan);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setResizable(true);
        jf.setVisible(true);
    }
    public static void main(String args[])
    {
        new ComboBox();

    }
}