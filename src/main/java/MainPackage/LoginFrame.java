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
public class LoginFrame extends JFrame
{
    JPanel mainJPanel;
    Label unameLabel,passLabel,loginLabel;
    JTextField unameJTextFeild;
    JPasswordField passJTextFeild;
    
    JButton loginJButton;
    
    public LoginFrame()
    {
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
        mainJPanel.setBounds(0, 0, 500, 500);
        mainJPanel.setBackground(new Color(69,73,70));
        
        loginLabel=new Label("Login");
        loginLabel.setBounds(50, 50, 400, 70);
        loginLabel.setAlignment(Label.CENTER);
        loginLabel.setBackground(Color.WHITE);
        loginLabel.setFont(new Font("verdana",Font.BOLD,35));
        mainJPanel.add(loginLabel);
        
        unameLabel=new Label("Username : ");
        unameLabel.setBounds(50,170,100,40);
        unameLabel.setForeground(Color.WHITE);
        unameLabel.setFont(new Font("verdana",Font.BOLD,15));
        unameLabel.setAlignment(Label.CENTER);
        mainJPanel.add(unameLabel);
        
        passLabel=new Label("Password : ");
        passLabel.setBounds(50,250,100,40);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("verdana",Font.BOLD,15));
        passLabel.setAlignment(Label.CENTER);
        mainJPanel.add(passLabel);
        
        unameJTextFeild=new JTextField();
        unameJTextFeild.setBounds(200,170,200,40);
        unameJTextFeild.setBackground(Color.WHITE);
        unameJTextFeild.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(unameJTextFeild);
        
        passJTextFeild=new JPasswordField();
        passJTextFeild.setBounds(200,250,200,40);
        passJTextFeild.setBackground(Color.WHITE);
        passJTextFeild.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(passJTextFeild);
        
        loginJButton=new JButton("LOGIN");
        loginJButton.setBounds(150,350, 200, 50);
        loginJButton.setBackground(Color.WHITE);
        loginJButton.setFont(new Font("verdana",Font.BOLD,15));
        loginJButton.addActionListener(new Login(this));
        mainJPanel.add(loginJButton);
        
        add(mainJPanel);
    }
}

