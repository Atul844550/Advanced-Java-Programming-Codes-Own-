import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

class canvasdemo extends Canvas
{
    public void paint(Graphics g)
    {
        Font font= new Font("DIALOG", Font.BOLD, 35);
        g.setFont(font);
        setForeground(Color.red);
        setBackground(Color.magenta);
         g.drawString("LPU STUDENTS", 20, 35);
         g.drawRect(20,50,150,100);
         g.drawArc(190,150,150,100,100,120);
         g.fillArc(190,250,150,100,100,120);
         g.fillRect(20,190,150,100);
         g.drawOval(20,320,150,100);
        g.fillOval(190,320,150,100);
       // repaint();                                  // it is used for blicking of the object.
    }

    public static void main(String args[])
    {
        JFrame f =new JFrame("canvas application of graphics");
        canvasdemo demo= new canvasdemo();
        f.add(demo);
        f.setSize(500,500);
       // f.getContentPane().setBackground(Color.magenta);
    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        f.setVisible(true);
        
    }
}