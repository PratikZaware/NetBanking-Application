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
public class ChangePassListener implements ActionListener
{
    ChangePassword ref;
    String accountno;
    String pass;
    
    public ChangePassListener(ChangePassword temp, String account_no)
    {
        ref = temp;
        accountno = account_no;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        pass=new String(ref.oldpassJTextField.getPassword());
        
        Connection con=DBConnection.getApplicationDBConnection();
        
        String query="select * from appcustomer where account_no=?;";
        
        try
        {
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,accountno);
            
            ResultSet rs=pst.executeQuery();
            if(rs.first())
            {
                if(rs.getString("pass").equals(pass) && !new String(ref.newpassJTextField.getPassword()).equals(""))
                {
                    System.out.println("Validation Successful");
                    
                    if(new String(ref.newpassJTextField.getPassword()).equals(new String(ref.confirmPassJTextField.getPassword())))
                    {
                        query="update appcustomer set pass=? where account_no=?;";
                        
                        pst=con.prepareStatement(query);
                        pst.setString(1, new String(ref.newpassJTextField.getPassword()));
                        pst.setString(2, accountno);
                        pst.executeUpdate();
                        
                        JOptionPane.showMessageDialog(ref, "Password updated successfully!");
                        Thread.sleep(5000);
                        ref.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(ref, "Passwords not matching");
                        ref.oldpassJTextField.setText("");
                        ref.newpassJTextField.setText("");
                        ref.confirmPassJTextField.setText("");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(ref, "Incorrect Password");
                    ref.oldpassJTextField.setText("");
                    ref.newpassJTextField.setText("");
                    ref.confirmPassJTextField.setText("");
                }
            }
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    
}