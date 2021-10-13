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
public class DepositMoneyListener implements ActionListener
{
    Deposit ref;
    String accountno;
    String pass;
    
    public DepositMoneyListener(Deposit temp,String account_no)
    {
        ref=temp;
        accountno=account_no;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        pass=new String(ref.passJTextField.getPassword());
        
        Connection con=DBConnection.getApplicationDBConnection();
        
        String query="select * from appcustomer where account_no=?;";
        try
        {
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, accountno);
            
            ResultSet rs=pst.executeQuery();
            
            if(rs.first() && rs.getString("pass").equals(pass))
            {
                System.out.println("validation Successfull");
                
                int amountToDeposit=Integer.parseInt(ref.amountJTextField.getText());
                
                query="update bankcustomer set balance=balance+? where account_no=?;";
                pst=con.prepareStatement(query);
                pst.setInt(1,amountToDeposit);
                pst.setString(2,accountno);
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(ref,"Amount deposited successfully!");
                Thread.sleep(5000);
                ref.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(ref,"Incorrect Password");
                ref.passJTextField.setText("");
                ref.amountJTextField.setText("");
            }
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        
        
    }
    
}
