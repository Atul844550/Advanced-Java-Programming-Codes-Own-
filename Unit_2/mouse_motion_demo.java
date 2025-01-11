import java.awt.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

class mouse_motion_demo extends Frame implements MouseMotionListener
{
    mouse_motion_demo()
    {
        addMouseMotionListener(this);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }

    public void mouseDragged(MouseEvent e)
    {
        Graphics g= getGraphics();
        g.setColor(new Color(150,155,120));
        g.drawRect(e.getX(), e.getY(), 20, 40);
    }

    public void mouseMoved(MouseEvent e)
    {

    }

    public static void main(String args[])
    {
       new mouse_motion_demo();
    }
}