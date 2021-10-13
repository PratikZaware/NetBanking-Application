/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author prati
 */
public class ChangePass implements ActionListener
{
    String accountno;
    public ChangePass(String account_no)
    {
        accountno=account_no;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        new ChangePassword(accountno);
    }
    
}