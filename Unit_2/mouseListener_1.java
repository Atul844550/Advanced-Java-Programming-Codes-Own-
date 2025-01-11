import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

class mouseListener_1 extends Frame implements MouseListener
{
mouseListener_1()
{
addMouseListener(this);
setSize(400,400);
setLocationRelativeTo(null);
setVisible(true);
}
public void mouseClicked(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(Color.red);
g.fillOval(e.getX(),e.getY(),20,50);
}
public void mousePressed(MouseEvent e)
{ }
public void mouseReleased(MouseEvent e)
{ }
public void mouseEntered(MouseEvent e)
{ }
public void mouseExited(MouseEvent e)
{ }
public static void main(String args[])
{
new mouseListener_1();
}
}