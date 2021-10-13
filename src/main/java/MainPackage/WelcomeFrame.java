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
public class WelcomeFrame extends JFrame
{
    JPanel mainJPanel;
    JButton btn1,btn2;
    Label welcomeLabel;
    
    public WelcomeFrame()
    {
        setTitle("WELCOME");
        setSize(500,500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    } 
    
    public void initComponents()
    {
        mainJPanel=new JPanel();
        mainJPanel.setLayout(null);
        mainJPanel.setBackground(new Color(69,73,70));
        mainJPanel.setBounds(0,0,500,500);
        
        welcomeLabel=new Label("Net Banking");
        welcomeLabel.setBounds(50, 100, 400, 100);
        welcomeLabel.setAlignment(Label.CENTER);
        welcomeLabel.setBackground(Color.WHITE);
        welcomeLabel.setFont(new Font("verdana",Font.BOLD,35));
        mainJPanel.add(welcomeLabel);
        
        btn1=new JButton("New User");
        btn1.setBounds(50,300,150,50);
        btn1.setFont(new Font("verdana",Font.BOLD,15));
        btn1.setBackground(Color.WHITE);
        btn1.addActionListener(new NewUser());
        mainJPanel.add(btn1);
        
        btn2=new JButton("Existing User");
        btn2.setBounds(300,300,150,50);
        btn2.setFont(new Font("verdana",Font.BOLD,15));
        btn2.setBackground(Color.WHITE);
        btn2.addActionListener(new ExistingUser());
        mainJPanel.add(btn2);
        
        add(mainJPanel);
    }
}

