/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;
/**
 *
 * @author samue
 */
public class Loginpage
{
    // adding a GUI frame with a title 'login' on it
        JFrame loginpage=new JFrame("Login");
        JPanel a=new JPanel();
        //adding a Label that shows what is to be indicated in the textfield
        JLabel name=new JLabel("Username:");
        JLabel password=new JLabel("Password:");
        JTextField nametext=new JTextField();
        JPasswordField passwordtext=new JPasswordField();
        public Loginpage()
        {
            formGUI();
        }
        public void formGUI()
        {
        nametext.setColumns(20);
        passwordtext.setColumns(20);
        //adding buttons that enable the user clear information input or to login with what is set 
        JButton clear=new JButton("Clear");
        JButton login=new JButton("Login");
        a.setBackground(Color.WHITE);
        name.setFont(new Font("sanserif",Font.PLAIN,28));
        nametext.setFont(new Font("sanserif",Font.PLAIN,25));
        password.setFont(new Font("sanserif",Font.PLAIN,28));
        passwordtext.setFont(new Font("sanserif",Font.PLAIN,25));
        clear.setFont(new Font("sanserif",Font.PLAIN,28));
        login.setFont(new Font("sanserif",Font.PLAIN,28));      
        a.setLayout(null);
        //adding the JPanel components that have been imported
        a.add(name);
        a.add(nametext);
        a.add(password);
        a.add(passwordtext);
        a.add(clear);
        a.add(login);
        loginpage.add(a);
        //adding an actionlistener for the login button
        login.addActionListener((java.awt.event.ActionEvent editorgothrough)->{goactionPerformed(editorgothrough);});
        //adding an actionlistener for the clear button
        clear.addActionListener((java.awt.event.ActionEvent clean)->{clearactionPerformed(clean);});
        //layout setup
        name.setBounds(700,250,150,25);
        nametext.setBounds(850,250,400,40);
        password.setBounds(700,400,150,25);
        passwordtext.setBounds(850,400,400,40);
        clear.setBounds(750,800,150,50);
        login.setBounds(1100,800,150,50);
        //setting the size of the JFrame
        loginpage.setSize(2000,1300);
        //setting how the gui will be closed by the user
        loginpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginpage.setVisible(true);      
        }
        public void clearactionPerformed(ActionEvent clean)
     {
        nametext.setText("");
        passwordtext.setText("");    
    }  
        public void goactionPerformed(ActionEvent editorgothrough)
        {
         char[] p = passwordtext.getPassword();
         String u = nametext.getText();
         String secret = "editsecret1"; 
         char sc[]= secret.toCharArray();
         char []q=passwordtext.getPassword();
         String v=nametext.getText();
         String secret1="readsecret";
         char xy[]=secret1.toCharArray();
         char []r=passwordtext.getPassword();
         String w=nametext.getText();
         String secret2="editsecret2";
         char yz[]=secret2.toCharArray();
         char []s=passwordtext.getPassword();
         String x=nametext.getText();
         String secret3="editsecret3";
         char za[]=secret3.toCharArray();
         if(Arrays.equals(sc,p) && u.equals("editor1") )
         {
             homepage home=new homepage();
         }
         else if(Arrays.equals(xy,q)&&v.equals("reader"))
         {
             homepagereadonly read=new homepagereadonly();
         }
         else if(Arrays.equals(yz,s)&&v.equals("editor2"))
         {
             homepage read=new homepage();
         }
         else if(Arrays.equals(za,s)&&v.equals("editor3"))
         {
             homepage read=new homepage();
         }
         else
             JOptionPane.showMessageDialog(null,"Invalid Passord or Username","Alert",JOptionPane.WARNING_MESSAGE);
        }
}
