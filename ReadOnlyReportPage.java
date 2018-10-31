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
 * @author iamka
 */
public class ReadOnlyReportPage {
    JFrame reports=new JFrame("Reports");
    JPanel a=new JPanel();
    //adding a Label that shows what is to be done by user
    JLabel instruction=new JLabel(" Report for the sacco.");
    JTextField newreport=new JTextField();
    JTextField reportdate=new JTextField();
     
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
        reportdate.setEditable(false);
        //setting the font to be used 
        instruction.setFont(new Font("sanserif",Font.PLAIN,28));
        newreport.setFont(new Font("sanserif",Font.PLAIN,28));
        reportdate.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
         a.setLayout(null); 
         //adding the JPanel components that have been imported
        a.add(instruction);
        a.add(newreport);
        a.add(reportdate);
        a.add(back);
        reports.add(a); 
        //adding an actionlistener for the back button
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        //layout setup
        instruction.setBounds(650,50,700,35);
        newreport.setBounds(70,150,1780,650);
        reportdate.setBounds(120,100,600,45);
        back.setBounds(1500,50,200,35);
         //setting the size of the JFrame
        reports.setSize(2000,1300);
        //setting how the gui will be closed by the user
        reports.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reports.setVisible(true);
        }
        public void returnactionPerformed(ActionEvent goback)
        {
            homepagereadonly homepage=new homepagereadonly();
        }
}
