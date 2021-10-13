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
public class Withdraw extends JFrame
{
    String accountno;
    JPanel mainJPanel;
    Label passLabel,amountLabel,withdrawLabel;
    JTextField amountJTextField;
    JPasswordField passJTextField;
    JButton withdrawJButton;
    
    public Withdraw(String account_no) 
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
        
        withdrawLabel=new Label("WITHDRAW");
        withdrawLabel.setBounds(50,70,400,70);
        withdrawLabel.setAlignment(Label.CENTER);
        withdrawLabel.setBackground(Color.WHITE);
        withdrawLabel.setFont(new Font("verdana",Font.BOLD,35));
        mainJPanel.add(withdrawLabel);
        
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
        passLabel.setBounds(50, 250, 100, 40);
        passLabel.setAlignment(Label.CENTER);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(passLabel);
        
        passJTextField=new JPasswordField();
        passJTextField.setBounds(190,250,160,40);
        passJTextField.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(passJTextField);
        
        withdrawJButton=new JButton("Withdraw");
        withdrawJButton.setBounds(150,340,200,50);
        withdrawJButton.addActionListener(new WithDrawMoneyListener(this,accountno));
        withdrawJButton.setBackground(Color.WHITE);
        withdrawJButton.setFont(new Font("verdana",Font.BOLD,20));
        mainJPanel.add(withdrawJButton);
        
        add(mainJPanel);
    }
}

