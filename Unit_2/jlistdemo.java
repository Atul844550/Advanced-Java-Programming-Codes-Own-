import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class jlistdemo
{
    JFrame f;
    jlistdemo()
    {
        f= new JFrame("jlist application");
        f.setSize(500, 500);

        DefaultListModel<String> data = new DefaultListModel<>();
        data.addElement("INDIA");
        data.addElement("CHINA");
        data.addElement("BANGLADESH");
        data.addElement("PAKISTAN");
        data.addElement("AUSTRALIA");
        data.addElement("NEW ZEALAND");
        data.addElement("RUSSIA");



        JList<String> ls= new JList<>(data);
        ls.setBounds(40,40,100,160);

        JLabel  l= new JLabel();
        l.setBounds(120,140,210,30);
        l.setForeground(Color.blue);

        JButton b= new JButton("Country");
        b.setBounds(180,50,100,30);

        f.add(b);
        f.add(l);
        f.add(ls);

        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String data= "";
                if(ls.getSelectedIndex()!= -1)
                {
                    data= "selected country is: " + ls.getSelectedValue();
                }
                l.setText(data);
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setResizable(true);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.cyan);
    }

       

    public static void main(String args[])
    {
        new jlistdemo();
    }
}