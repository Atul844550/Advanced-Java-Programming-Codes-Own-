import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class jlabel
{
    public static void main(String args[])
    {
        JFrame jf= new JFrame("Jlabel application");
        JButton jb= new JButton("CLICK");
        jb.setBounds(20,20,100,40);
        jb.setForeground(Color.blue);

        JLabel jl= new JLabel("enter ");
        jl.setBounds(60,60,190,40);
        jl.setForeground(Color.red);
        jb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jl.setText("advanced java programming");
            }
        });
        jf.add(jb);
        jf.add(jl);

        jf.setSize(400,400);
        jf.setLocationRelativeTo(null);
        jf.getContentPane().setBackground(new Color(130,100,105));
        jf.setResizable(false);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }
    
}