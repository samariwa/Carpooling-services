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
public class homepagereadonly 
{
    // setting 'Homepage' as the title for the JFrame
        JFrame homepagereadonly=new JFrame("Homepage");
        JPanel a=new JPanel();
        //adding a label with instruction on what user is to do in the page
        JLabel instruction=new JLabel("Choose a category you would want to view.");
        //declaration of the buttons to be added to the homepage
        JButton vehicles=new JButton("Vehicles");
        JButton drivers=new JButton("Drivers");
        JButton conductors=new JButton("Conductors");
        JButton farerate=new JButton("Fare Rates Charts");
        JButton reports=new JButton("Reports");
        JButton logout=new JButton("Logout");
         //setting a dashboard image
        ImageIcon dashboard=new ImageIcon("C:/Users/samue/Pictures/22842-colorful-high-resolution-background.jpg");
        JLabel z=new JLabel(dashboard);
         public homepagereadonly()
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
        farerate.setFont(new Font("sanserif",Font.PLAIN,28));
        a.setLayout(null);
        //adding the JPanel components that have been imported
        a.add(vehicles);
        a.add(drivers);
        a.add(conductors);
        a.add(reports);
        a.add(farerate);
        a.add(logout);
        a.add(instruction);
        a.add(z);
        homepagereadonly.add(a);
         //adding an actionlistener for the vehicles button
        vehicles.addActionListener((java.awt.event.ActionEvent showvehicles)->{newvehiclesactionPerformed(showvehicles);});
        //adding an actionlistener for the drivers button
        drivers.addActionListener((java.awt.event.ActionEvent showdrivers)->{newdriversactionPerformed(showdrivers);});
         //adding an actionlistener for the reports button
        reports.addActionListener((java.awt.event.ActionEvent showreports)->{newreportactionPerformed(showreports);});
        //adding an actionlistener for the farerates chart button
        farerate.addActionListener((java.awt.event.ActionEvent showrates)->{newratesactionPerformed(showrates);});
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
        farerate.setBounds(750,675,300,45);
        logout.setBounds(750,900,300,45);
        z.setBounds(0,0,1900,450);
        //setting the size of the JFrame
        homepagereadonly.setSize(2000,1300);
        //setting how the gui will be closed by the user
        homepagereadonly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homepagereadonly.setVisible(true);
        }
         public void newvehiclesactionPerformed(ActionEvent showvehicles)
        {
            vehiclespagereadonly vehicles=new vehiclespagereadonly();
        }
          public void newdriversactionPerformed(ActionEvent showdrivers)
        {
            driverspagereadonly drivers=new driverspagereadonly();
        }
           public void newreportactionPerformed(ActionEvent showreports)
        {
            ReportsListReadOnly reports=new ReportsListReadOnly();
        }
            public void newratesactionPerformed(ActionEvent showrates)
        {
            farerateschartreadonly a=new  farerateschartreadonly();
        }
            public void newconductorsactionPerformed(ActionEvent showconductors)
        {
            conductorspagereadonly conductors=new conductorspagereadonly();
        }
              public void gooutactionPerformed(ActionEvent out)
        {
              Loginpage login =new Loginpage();
        }
        
    
    
}
