import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class radiobutton_1 {
    public static void main(String hari[]) {
        JFrame f = new JFrame("JRadioButton");
        JRadioButton rb1 = new JRadioButton("married");
        rb1.setBounds(20, 30, 100, 30);
        JRadioButton rb2 = new JRadioButton("Un-married");
        rb2.setBounds(20, 60, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        JLabel l = new JLabel();
        l.setBounds(20, 100, 200, 40);
        l.setForeground(Color.BLUE);
        JButton b = new JButton("martial status");
        b.setBounds(100, 200, 120, 40);
        b.addActionListener(new ActionListener()
         {
        
            public void actionPerformed(ActionEvent e) {
                if (rb1.isSelected()) {
                    l.setText("martial status is married");
                }
                if (rb2.isSelected()) {
                    l.setText("martial status is Un-married");
                }
            }
        });
        f.add(rb1);
        f.add(rb2);
        f.add(b);
        f.add(l);
        f.setSize(400, 400);
        f.setResizable(false);
        f.getContentPane().setBackground(Color.green);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}