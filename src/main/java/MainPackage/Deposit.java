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
public class Deposit extends JFrame
{
    String accountno;
    JPanel mainJPanel;
    Label passLabel,amountLabel,depositLabel;
    JTextField amountJTextField;
    JPasswordField passJTextField;
    JButton depositJButton;
    
    public Deposit(String account_no) 
    {
        accountno=account_no;
        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);
        initComponent();
        setVisible(true);
    }
    
    
    private void initComponent()
    {
        mainJPanel=new JPanel();
        mainJPanel.setLayout(null);
        mainJPanel.setBackground(new Color(69,73,70));
        mainJPanel.setBounds(0,0,500,500);
        
        depositLabel=new Label("DEPOSIT");
        depositLabel.setBounds(50,70,400,70);
        depositLabel.setAlignment(Label.CENTER);
        depositLabel.setBackground(Color.WHITE);
        depositLabel.setFont(new Font("verdana",Font.BOLD,35));
        mainJPanel.add(depositLabel);
        
        amountLabel=new Label("Amount : ");
        amountLabel.setBounds(50, 180, 100, 40);
        amountLabel.setAlignment(Label.CENTER);
        amountLabel.setForeground(Color.WHITE);
        amountLabel.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(amountLabel);
        
        amountJTextField=new JTextField();
        amountJTextField.setBounds(190,180,160,40);
        amountJTextField.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(amountJTextField);
        
        passLabel=new Label("Password : ");
        passLabel.setBounds(50, 260, 100, 40);
        passLabel.setAlignment(Label.CENTER);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(passLabel);
        
        passJTextField=new JPasswordField();
        passJTextField.setBounds(190,260,160,40);
        passJTextField.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(passJTextField);
        
        depositJButton=new JButton("Deposit");
        depositJButton.setBounds(150,350,200,50);
        depositJButton.addActionListener(new DepositMoneyListener(this,accountno));
        depositJButton.setBackground(Color.WHITE);
        depositJButton.setFont(new Font("verdana",Font.BOLD,20));
        mainJPanel.add(depositJButton);
        
        add(mainJPanel);
    }
}

