/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author samue
 */
public class ReadOnlyReportPage
{
      // adding a GUI frame with a title 'Reports' on it
    JFrame reports=new JFrame("Reports");
    JPanel a=new JPanel();
    //adding a Label that shows what is to be done by user
    JLabel instruction=new JLabel("Key in a report for the sacco.");
    JTextField newreport=new JTextField();
    JButton clear=new JButton("Clear");
    JButton save=new JButton("Save");
    JButton back=new JButton("<- Back");
     public ReadOnlyReportPage()
        {
            formGUI();
        }
        public void formGUI()
        {
        //setting the colour of the background for the page
        a.setBackground(Color.WHITE);
        //setting the page to be a read only page
        newreport.setEditable(false);
        //setting the font to be used 
        instruction.setFont(new Font("sanserif",Font.PLAIN,28));
        clear.setFont(new Font("sanserif",Font.PLAIN,28));
        newreport.setFont(new Font("sanserif",Font.PLAIN,28));
        save.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
         a.setLayout(null); 
         //adding the JPanel components that have been imported
        a.add(instruction);
        a.add(newreport);
        a.add(clear);
        a.add(save);
        a.add(back);
        reports.add(a); 
        //adding an actionlistener for the back button
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        //layout setup
        instruction.setBounds(650,50,700,35);
        newreport.setBounds(70,150,1780,650);
        clear.setBounds(500,870,150,50);
        save.setBounds(1200,870,150,50);
        back.setBounds(1500,50,200,35);
         //setting the size of the JFrame
        reports.setSize(2000,1300);
        //setting how the gui will be closed by the user
        reports.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reports.setVisible(true);
        }
        public void returnactionPerformed(ActionEvent goback)
        {
            homepage homepage=new homepage();
        }
    
}
