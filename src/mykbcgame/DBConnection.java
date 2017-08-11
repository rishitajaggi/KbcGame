package mykbcgame;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection
{
    
    public static Connection connect()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql:///kbc","root","root");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
