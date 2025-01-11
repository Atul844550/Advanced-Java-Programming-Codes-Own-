import java.sql.*;

class insertvalues_query
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/atul", "root", "8445501402");
            Statement stmt= con.createStatement();
             String query= "create table student6(name varchar(20), studentid int)";

            stmt.executeUpdate(query);

             System.out.println("student5 table created");

            

           stmt.executeUpdate("insert into student6 values('A' 25)");
           int result = stmt.executeUpdate("update student6 set name= 'B' where id= 21");
         //  int result1= stmt.executeUpdate("delete from student5 where id= 21");
           System.out.println(result+ " record affected" );

           // stmt.executeUpdate();
            con.close();
            stmt.close();

            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}