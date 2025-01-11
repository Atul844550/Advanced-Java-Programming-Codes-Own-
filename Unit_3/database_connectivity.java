import java.sql.*;

class database_connectivity
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/atul", "root", "8445501402");
            Statement stmt= con.createStatement();              // this method is used to communicate with database. 
            ResultSet rs= stmt.executeQuery("Select * from emp");      // Resultset is a interface that is used to store the result in a iterative format, whereas executequery() method is primarily used for executing SELECT queries.
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+ " "+ rs.getString(3));
            }
             con.close();
             stmt.close();
             rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}