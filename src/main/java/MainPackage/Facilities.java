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

/**
 *
 * @author prati
 */
public class Facilities extends JFrame
{
    String accountno;
    String user;
    
    JPanel mainJPanel;
    Label welcomeLabel,facilityLabel;
    JButton balanceJButton,depositJButton,withdrawJButton,changepassJButton;

    public Facilities(String temp,String username) 
    {
        accountno=temp;
        user=username;
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
        
        facilityLabel=new Label("Facilities : ");
        facilityLabel.setBounds(40, 250, 180, 50);
        facilityLabel.setAlignment(Label.CENTER);
        facilityLabel.setFont(new Font("verdana",Font.BOLD,30));
        facilityLabel.setForeground(Color.WHITE);
        mainJPanel.add(facilityLabel);
        
        welcomeLabel=new Label("WELCOME "+user);
        welcomeLabel.setBounds(50, 70, 400, 50);
        welcomeLabel.setAlignment(Label.CENTER);
        welcomeLabel.setFont(new Font("verdana",Font.BOLD,30));
        welcomeLabel.setBackground(Color.WHITE);
        mainJPanel.add(welcomeLabel);
        
        balanceJButton=new JButton("Balance Enquiry");
        balanceJButton.setBounds(250, 150, 200, 40);
        balanceJButton.addActionListener(new Balance(accountno));
        balanceJButton.setBackground(Color.WHITE);
        balanceJButton.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(balanceJButton);
        
        withdrawJButton=new JButton("Withdraw");
        withdrawJButton.setBounds(250, 230, 200, 40);
        withdrawJButton.addActionListener(new WithdrawMoney(accountno));
        withdrawJButton.setBackground(Color.WHITE);
        withdrawJButton.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(withdrawJButton);
        
        depositJButton=new JButton("Deposit");
        depositJButton.setBounds(250, 310, 200, 40);
        depositJButton.addActionListener(new DepositMoney(accountno));
        depositJButton.setBackground(Color.WHITE);
        depositJButton.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(depositJButton);
        
        changepassJButton=new JButton("Change Password");
        changepassJButton.setBounds(250, 390, 200, 40);
        changepassJButton.addActionListener(new ChangePass(accountno));
        changepassJButton.setBackground(Color.WHITE);
        changepassJButton.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(changepassJButton);
        
        add(mainJPanel);
    }
     
}






