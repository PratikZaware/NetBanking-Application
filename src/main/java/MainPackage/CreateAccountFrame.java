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
public class CreateAccountFrame extends JFrame
{
    JPanel mainJPanel;
    Label accountLabel,unameLabel,passLabel,account_noLabel;
    JTextField unameJTextField,account_noJTextField;
    JPasswordField passJTextField;
    JButton createButton;
    
    public CreateAccountFrame()
    {
        setTitle("Create account");
        setSize(500,500);
        setLocationRelativeTo(null);
        setLayout(null);
        initComponents();
        setVisible(true);
    } 
    
    public void initComponents()
    {
        mainJPanel=new JPanel();
        mainJPanel.setLayout(null);
        mainJPanel.setBounds(0, 0, 500, 500);
        mainJPanel.setBackground(new Color(69,73,70));
        
        accountLabel=new Label("ACCOUNT");
        accountLabel.setBounds(50, 50, 400, 70);
        accountLabel.setAlignment(Label.CENTER);
        accountLabel.setBackground(Color.WHITE);
        accountLabel.setFont(new Font("verdana",Font.BOLD,35));
        mainJPanel.add(accountLabel);
        
        account_noLabel=new Label("Account no : ");
        account_noLabel.setBounds(50, 150, 100, 40);
        account_noLabel.setForeground(Color.WHITE);
        account_noLabel.setFont(new Font("verdana",Font.BOLD,15));
        account_noLabel.setAlignment(Label.CENTER);
        mainJPanel.add(account_noLabel);
        
        unameLabel=new Label("Username : ");
        unameLabel.setBounds(50, 230, 100, 40);
        unameLabel.setForeground(Color.WHITE);
        unameLabel.setFont(new Font("verdana",Font.BOLD,15));
        unameLabel.setAlignment(Label.CENTER);
        mainJPanel.add(unameLabel);
        
        passLabel=new Label("Password : ");
        passLabel.setBounds(50, 310, 100, 40);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("verdana",Font.BOLD,15));
        passLabel.setAlignment(Label.CENTER);
        mainJPanel.add(passLabel);
        
        account_noJTextField=new JTextField();
        account_noJTextField.setBounds(190, 150, 200, 40);
        account_noJTextField.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(account_noJTextField);
        
        unameJTextField=new JTextField();
        unameJTextField.setBounds(190, 230, 200, 40);
        unameJTextField.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(unameJTextField);
        
        passJTextField=new JPasswordField();
        passJTextField.setBounds(190, 310, 200, 40);
        passJTextField.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(passJTextField);
        
        createButton=new JButton("CREATE ACCOUNT");
        createButton.setBounds(150, 390, 200, 50);
        createButton.setBackground(Color.WHITE);
        createButton.setFont(new Font("verdana",Font.BOLD,15));
        createButton.addActionListener(new CreateAccount(this));
        mainJPanel.add(createButton);
        
        add(mainJPanel);
    }
}

