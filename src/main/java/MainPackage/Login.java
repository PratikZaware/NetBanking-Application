/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author prati
 */
public class Login implements ActionListener
{
    LoginFrame ref;
    public Login(LoginFrame temp)
    {
        ref=temp;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Connection applicationConnection=DBConnection.getApplicationDBConnection();
        
        String query="select * from appcustomer where uname=? and pass=?;";
        
        try
        {
            PreparedStatement pst=applicationConnection.prepareStatement(query);
            pst.setString(1,ref.unameJTextFeild.getText());
            pst.setString(2,new String(ref.passJTextFeild.getPassword()));
            
            ResultSet rs=pst.executeQuery();
            
            if(rs.first())
            {
                System.out.println("Login Succesful");
                new Facilities(rs.getString("account_no"),rs.getString("uname")); 
                ref.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(ref,"Invalid Credentials");
                ref.unameJTextFeild.setText("");
                ref.passJTextFeild.setText("");
            }
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    } 
}

