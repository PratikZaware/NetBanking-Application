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
public class CreateAccount implements ActionListener
{

    CreateAccountFrame ref;
    public CreateAccount(CreateAccountFrame temp)
    {
        ref=temp;
    }

    
    public void actionPerformed(ActionEvent e)
    {
        Connection applicationConnection=DBConnection.getApplicationDBConnection();
        
        String query="select * from bankcustomer where account_no=?;";
        
        
        try
        {
            PreparedStatement pst=applicationConnection.prepareStatement(query);
            pst.setString(1,ref.account_noJTextField.getText());
            
            ResultSet rs=pst.executeQuery();
            
            if(rs.first())
            {
                JOptionPane.showMessageDialog(ref,"Account Created Successfully");
                
                query="insert into appcustomer values(?,?,?);";
                pst=applicationConnection.prepareStatement(query);
                
                pst.setString(1,ref.unameJTextField.getText());
                pst.setString(2,new String(ref.passJTextField.getPassword()));
                pst.setString(3,ref.account_noJTextField.getText());
                
                pst.executeUpdate();
               
                ref.dispose();
            }
            
            else
            {
                JOptionPane.showMessageDialog(ref,"No matching with given account no");
                ref.account_noJTextField.setText("");
                ref.unameJTextField.setText("");
                ref.passJTextField.setText("");
            }
        } 
        catch(Exception ex)
        {
            System.out.println(ex);
        } 
    }  
}
