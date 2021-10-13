/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author prati
 */
public class ChangePassword extends JFrame
{
    String accountno;
    JPanel mainJPanel;
    Label oldpassLabel,newpassLabel,confirmpassLabel,changepassLabel;
    JPasswordField oldpassJTextField,newpassJTextField,confirmPassJTextField;
    // JTextField oldpassJTextField,newpassJTextField,confirmPassJTextField;
    JButton changepassJButton;
    
    public ChangePassword(String account_no)
    {
        accountno=account_no;
        
        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);
        initComponent();
        setVisible(true);
    }
    
    public void initComponent()
    {
        mainJPanel=new JPanel();
        mainJPanel.setLayout(null);
        mainJPanel.setBackground(new Color(69,73,70));
        mainJPanel.setBounds(0, 0, 500, 500);
        
        changepassLabel=new Label("Change Password");
        changepassLabel.setBounds(50,50,400,70);
        changepassLabel.setAlignment(Label.CENTER);
        changepassLabel.setBackground(Color.WHITE);
        changepassLabel.setFont(new Font("verdana",Font.BOLD,35));
        mainJPanel.add(changepassLabel);
        
        oldpassLabel=new Label("Old Password : ");
        oldpassLabel.setBounds(90,160,120,40);
        oldpassLabel.setAlignment(Label.CENTER);
        oldpassLabel.setForeground(Color.WHITE);
        oldpassLabel.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(oldpassLabel);
        
        newpassLabel=new Label("New Password : ");
        newpassLabel.setBounds(90,240,120,40);
        newpassLabel.setAlignment(Label.CENTER);
        newpassLabel.setForeground(Color.WHITE);
        newpassLabel.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(newpassLabel);
        
        confirmpassLabel=new Label("Old Password : ");
        confirmpassLabel.setBounds(90,320,120,40);
        confirmpassLabel.setAlignment(Label.CENTER);
        confirmpassLabel.setForeground(Color.WHITE);
        confirmpassLabel.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(confirmpassLabel);
        
        oldpassJTextField=new JPasswordField();
        oldpassJTextField.setBounds(230,160,150,40);
        oldpassJTextField.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(oldpassJTextField);
        
        newpassJTextField=new JPasswordField();
        newpassJTextField.setBounds(230,240,150,40);
        newpassJTextField.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(newpassJTextField);
        
        confirmPassJTextField=new JPasswordField();
        confirmPassJTextField.setBounds(230,320,150,40);
        confirmPassJTextField.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(confirmPassJTextField);
        
        changepassJButton=new JButton("Change Password");
        changepassJButton.setBounds(120, 400, 260, 40);
        changepassJButton.addActionListener(new ChangePassListener(this,accountno));
        changepassJButton.setBackground(Color.WHITE);
        changepassJButton.setFont(new Font("verdana",Font.BOLD,20));
        mainJPanel.add(changepassJButton);
        
        
        add(mainJPanel);
    }
    
}


