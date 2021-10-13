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
public class ShowMoney implements ActionListener
{
    ShowBalance ref;
    String pass;
    String accountno;
    
    public ShowMoney(ShowBalance temp,String account_no)
    {
        ref = temp;
        accountno=account_no;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        pass=new String(ref.passJTextField.getPassword());
//        System.out.println("Account No in listener6 = "+accountno);
//        System.out.println("Password in listener6 = "+pass);

        Connection con=DBConnection.getApplicationDBConnection();
        
        
        
        try
        {
            String query="select * from appcustomer where account_no=?;";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,accountno);
            
            ResultSet rs=pst.executeQuery();
            if(rs.first())
            {
//                System.out.println(rs.getString("pass"));
                if(rs.getString("pass").equals(pass))
                {
                    System.out.println("Validation done  pass matched");
                    
                    query="select * from bankcustomer where account_no=?;";
                    pst=con.prepareStatement(query);
                    pst.setString(1,accountno);
                    
                    rs=pst.executeQuery();
                    // System.out.println("Exception below 110");
                    if(rs.first())
                    {
                        // System.out.println(rs.getString("fname")+" "+rs.getString("lname"));
                        int acc_balance=rs.getInt("balance");
                        System.out.println(acc_balance);
                        ref.displayLabel.setText("Balance : "+acc_balance);
                        Thread.sleep(5000);
                        ref.dispose();
                    }
              
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(ref,"Incorect Password");
                    ref.passJTextField.setText("");
                }
            }
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    
}