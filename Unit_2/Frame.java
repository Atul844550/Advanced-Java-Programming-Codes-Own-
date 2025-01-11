import javax.swing.*;
import java.awt.Color;


class Frame
{
    public static void main(String args[])
    {
    
    JFrame jf= new JFrame("this is first Frame of out GUI");          // JFrame is class.
    jf.setSize(500, 500);                    // set the size of frame(width, height)
    jf.setResizable(false);                  // by our cursor if we want to make a frame short or long
    jf.setLocationRelativeTo(null);          // used to take the frame at centre.
    jf.getContentPane().setBackground(new Color(0, 160, 160));    // when we have to give the frame background color then always we had to getcontentpane().setbackground(new color(R, G, B)) RED green blue from no. 0 to 255.   // jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);    // while clicking on close(X) button on right top side then it could not be closed then we are using this method(constamt parameter).
   // jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);            // above same concept but while we close(X) the frame the frame will be closed but it should be running on backenend we can see in terminaldownside to come out from this press ctrl+ c.
    // jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)            // above same concept but frame will be closed completely.
   jf.setDefaultLookAndFeelDecorated(true);                  // it is used to show the decoration part in the GUI. 
    jf.setLayout(null);
    jf.setVisible(true);                              // used to see the frame, its always should be used in every frame.

    }
    
}