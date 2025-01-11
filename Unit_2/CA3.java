import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.sql.*;

class CA3 {

    public static void main(String args[]) {
        JFrame frame = new JFrame("Student Application");

        JTextField tf1 = new JTextField("Student ID");
        tf1.setBounds(40, 50, 120, 30);
        tf1.setForeground(Color.blue);

        JTextField tf2 = new JTextField("Name");
        tf2.setBounds(40, 100, 120, 30);
        tf2.setForeground(Color.blue);

        JTextField tf3 = new JTextField("Section");
        tf3.setBounds(40, 150, 120, 30);
        tf3.setForeground(Color.blue);

        JTextField tf4 = new JTextField("Placement Status");
        tf4.setBounds(40, 200, 120, 30);
        tf4.setForeground(Color.blue);

        JTextField tf5 = new JTextField("Company");
        tf5.setBounds(40, 250, 120, 30);
        tf5.setForeground(Color.blue);

        JButton insert = new JButton("Insert");
        insert.setBounds(40, 350, 100, 30);
        insert.setForeground(Color.green);

        JButton update = new JButton("Update");
        update.setBounds(150, 350, 100, 30);
        update.setForeground(Color.green);

        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(tf4);
        frame.add(tf5);
        frame.add(insert);
        frame.add(update);

        frame.setSize(500, 500);
        frame.getContentPane().setBackground(new Color(100, 210, 100));
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atul", "root", "8445501402");
            Statement stmt = con.createStatement();

            insert.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String id = tf1.getText();
                        String name = tf2.getText();
                        String section = tf3.getText();
                        String status = tf4.getText();
                        String company = tf5.getText();

                        String query = "INSERT INTO student1 VALUES ('" + id + "', '" + name + "', '" + section + "', '" + status + "', '" + company + "')";
                        stmt.executeUpdate(query);

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });

            update.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String status = tf4.getText();
                        String company = tf5.getText();

                        if (status.equals("yes")) {
                            stmt.executeUpdate("UPDATE student1 SET company = 'samsung' WHERE status = 'yes'");
                        } else if (status.equals("no")) {
                            stmt.executeUpdate("UPDATE student1 SET company = NULL WHERE status = 'no'");
                        } 
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
