import javax.swing.*;
import java.awt.Color;

class button
{
    public static void main(String args[])
    {
        JFrame j= new JFrame("the GUI");        
        JButton jb= new JButton("click on me");                // Jbutton is class.
        jb.setBounds(140, 200, 70,17);                          // give the size og the botton(x, y, width, height).
        jb.setBackground(Color.green);                         // set the backgroundcolor of the button.
        jb.setForeground(Color.blue);                         // set the foregroundcolor of the button.
        j.add(jb);                                             // used to add the button in frame.
        j.setSize(500, 500);
        j.setResizable(false);
        j.setLocationRelativeTo(null);                         // it is used to take the frame at centre while running the program.
        j.getContentPane().setBackground(new Color(50, 160, 160));
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(null);
        j.setVisible(true);

    }
    
}