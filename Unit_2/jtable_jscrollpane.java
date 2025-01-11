import java.util.*;
import javax.swing.*;
import java.awt.Color;

class ke092
{
    JFrame jf;

    ke092()
    {
        jf= new JFrame("jtable and jscrollpane application");
        jf.setSize(500, 500);

        String data[][]= {{"102", "A", "50000"}, {"103", "B", "60000"}, {"104", "C", "70000" }, {"105", "D", "80000"}, {"106", "E", "90000"}};
        String col[]= {"empid", "empname", "empsal"};

        JTable jt= new JTable(data, col);
        JScrollPane sp= new JScrollPane(jt);
      //   jt.setBounds(30,30,200,80);
        sp.setBounds(30,30,200,80);

         jf.add(sp);
     //  jf.add(jt);
        jf.getContentPane().setBackground(new Color(200,150,170));
        jf.setResizable(true);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}

class jtable_jscrollpane
{
    public static void main(String args[])
    {
        new ke092();
    }
}