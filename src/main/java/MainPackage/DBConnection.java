/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author prati
 */
public class DBConnection
{   
    static Connection getApplicationDBConnection()
    {
        Connection con=null;
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/applicationdatabase", "root", "Pass@123");
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
