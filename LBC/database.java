package LBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class database {
    public static void main(String[] args) 
    {
        try
        {  
            Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/lbc","root","Baragon$2973");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from auteur");  

            stmt.executeUpdate("INSERT INTO auteur (nom, prenom) VALUES ('Touquet', 'Gael')");

            rs=stmt.executeQuery("select * from auteur");  
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2) + " " + rs.getString(3));
            con.close();  
        }
        catch(Exception e)
        { 
            System.out .println(e);
        }  
    }

}

