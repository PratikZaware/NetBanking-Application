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
public class ShowBalance extends JFrame
{
    String accountno;
    JPanel mainJPanel;
    Label passLabel,displayLabel,balanceLabel;
    JPasswordField passJTextField;
    JButton showbalanceJButton;

    public ShowBalance(String account_no)
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
        mainJPanel.setBounds(0,0,500,500);
        
        balanceLabel=new Label("BALANCE");
        balanceLabel.setBounds(50,70,400,70);
        balanceLabel.setAlignment(Label.CENTER);
        balanceLabel.setBackground(Color.WHITE);
        balanceLabel.setFont(new Font("verdana",Font.BOLD,35));
        mainJPanel.add(balanceLabel);
        
        passLabel=new Label("Password : ");
        passLabel.setBounds(80,200,150,50);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("verdana",Font.BOLD,25));
        mainJPanel.add(passLabel);
        
        passJTextField=new JPasswordField();
        passJTextField.setBounds(240,200,160,50);
        passJTextField.setFont(new Font("verdana",Font.BOLD,15));
//        passJTextField.setText("DEBUGGING");
        mainJPanel.add(passJTextField);
        
        showbalanceJButton=new JButton("Show Balance");
        showbalanceJButton.setBounds(150,310,200,70);
        showbalanceJButton.addActionListener(new ShowMoney(this,accountno));
        showbalanceJButton.setBackground(Color.WHITE);
        showbalanceJButton.setFont(new Font("verdana",Font.BOLD,20));
        mainJPanel.add(showbalanceJButton);
        
        displayLabel=new Label();
        displayLabel.setBounds(150,410,200,30);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setFont(new Font("verdana",Font.BOLD,15));
        mainJPanel.add(displayLabel);
        
        add(mainJPanel);
    }
}


