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
public class ExistingUser implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        new LoginFrame();
    } 
}
