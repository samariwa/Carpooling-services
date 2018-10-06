/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author samue
 */
public class homepage
{
     // setting 'Homepage' as the title for the JFrame
        JFrame homePage=new JFrame("Homepage");
        JPanel a=new JPanel();
        //adding a label with instruction on what user is to do in the page
        JLabel instruction=new JLabel("Choose a category you would want to view.");
        //declaration of the buttons to be added to the homepage
        JButton vehicles=new JButton("Vehicles");
        JButton drivers=new JButton("Drivers");
        JButton conductors=new JButton("Conductors");
        JButton reports=new JButton("Reports");
        JButton logout=new JButton("Logout");
        //setting a dashboard image
        ImageIcon dashboard=new ImageIcon("22842-colorful-high-resolution-background.jpg");
         public homepage()
        {
            formGUI();
        }
        public void formGUI()
        {
        //setting the colour of the background for the page
        a.setBackground(Color.WHITE);
        //setting the font to be used 
        vehicles.setFont(new Font("sanserif",Font.PLAIN,28));
        drivers.setFont(new Font("sanserif",Font.PLAIN,28));
        conductors.setFont(new Font("sanserif",Font.PLAIN,28));
        reports.setFont(new Font("sanserif",Font.PLAIN,28));
        logout.setFont(new Font("sanserif",Font.PLAIN,28));
        instruction.setFont(new Font("sanserif",Font.PLAIN,28));
        a.setLayout(null);
        //adding the JPanel components that have been imported
        a.add(vehicles);
        a.add(drivers);
        a.add(conductors);
        a.add(reports);
        a.add(logout);
        a.add(instruction);
        homePage.add(a);
         //adding an actionlistener for the vehicles button
        vehicles.addActionListener((java.awt.event.ActionEvent showvehicles)->{newvehiclesactionPerformed(showvehicles);});
        //adding an actionlistener for the drivers button
        drivers.addActionListener((java.awt.event.ActionEvent showdrivers)->{newdriversactionPerformed(showdrivers);});
         //adding an actionlistener for the reports button
        reports.addActionListener((java.awt.event.ActionEvent showreports)->{newreportactionPerformed(showreports);});
        //adding an actionlistener for the conductors button
        conductors.addActionListener((java.awt.event.ActionEvent showconductors)->{newconductorsactionPerformed(showconductors);});
         //adding an actionlistener for the logout button
        logout.addActionListener((java.awt.event.ActionEvent out)->{gooutactionPerformed(out);});
        //layout setup
        instruction.setBounds(650,460,700,35);
        vehicles.setBounds(250,590,300,45);
        drivers.setBounds(250,750,300,45);
        conductors.setBounds(1300,590,300,45);
        reports.setBounds(1300,750,300,45);
        logout.setBounds(750,900,300,45);
        //setting the size of the JFrame
        homePage.setSize(2000,1300);
        //setting how the gui will be closed by the user
        homePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homePage.setVisible(true);
        }
         public void newvehiclesactionPerformed(ActionEvent showvehicles)
        {
            vehiclespage vehicles=new vehiclespage();
        }
          public void newdriversactionPerformed(ActionEvent showdrivers)
        {
            driverspage drivers=new driverspage();
        }
           public void newreportactionPerformed(ActionEvent showreports)
        {
            reportspage reports=new reportspage();
        }
            public void newconductorsactionPerformed(ActionEvent showconductors)
        {
            conductorspage conductors=new conductorspage();
        }
              public void gooutactionPerformed(ActionEvent out)
        {
              Loginpage login =new Loginpage();
        }
        
    
    
}
