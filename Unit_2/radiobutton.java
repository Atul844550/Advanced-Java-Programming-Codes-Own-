import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.*;


class radiobutton
{
    public static void main(String args[])
    {
    
    JFrame jf= new JFrame("creating radio button");
    jf.setSize(500,500);
    jf.getContentPane().setBackground(new Color(140, 250, 40));
    jf.setResizable(true);

    Image icon = Toolkit.getDefaultToolkit().getImage("th.jpg");           // add icon of the frame.
    jf.setIconImage(icon);                                                   //same above

    JRadioButton jrb = new JRadioButton("cse");
    jrb.setBounds(75,50,100,30);    
    jrb.setBackground(Color.CYAN);
    jrb.setForeground(Color.GREEN);
    
    JRadioButton jrb1 = new JRadioButton("ece");
    jrb1.setBounds(75,100,100,30); 

    ButtonGroup bg=new ButtonGroup();  
    bg.add(jrb);
    bg.add(jrb1);

    jf.add(jrb);
    jf.add(jrb1);

    JButton jb= new JButton("click");
    jb.setBounds(150,100, 100,30);
    jb.setBackground(Color.blue);
    jb.setForeground(Color.white);

    jf.add(jb);

    jb.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            if(jrb.isSelected())
            {
                System.out.println("you are cse department");
            }
            if(jrb1.isSelected())
            {
                System.out.println("you are from ece department");
            }
        }
    });




    jf.setLocationRelativeTo(null);
    jf.setLayout(null);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setDefaultLookAndFeelDecorated(true);
    jf.setVisible(true);




    }
    
}