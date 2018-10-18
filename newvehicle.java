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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author samue
 */
public class newvehicle 
{
    //gui page for adding a new vehicle into the system
   JFrame newvehicle=new JFrame("New Vehicle"); 
   JPanel a=new JPanel();
   JLabel details=new JLabel("Enter the details of the new vehicle.");
   JLabel make=new JLabel("Make:");
   JLabel model=new JLabel("Model:");
   JLabel registration=new JLabel("Registration Number:");
   JLabel mnf=new JLabel("Year Of Manufacture:");
   JLabel purchasedate=new JLabel("Date Of Purchase:");
   JLabel fuel=new JLabel("Fuel:");
   JLabel fuelconsumption=new JLabel("Fuel Consumption:");
   JLabel passengers=new JLabel("Number Of Passengers:");
   JLabel route=new JLabel("Route:");
   JLabel trips=new JLabel("Number of trips per day:");
   JTextField  maketext=new JTextField();
   JTextField modeltext=new JTextField();
   JTextField registrationtext=new JTextField();
   JTextField mnftext=new JTextField();
   JTextField purchasedatetext=new JTextField();
   JTextField fueltext=new JTextField();
   JTextField fuelconsumptiontext=new JTextField();
   JTextField passengerstext=new JTextField();
   JTextField routetext=new JTextField();
   JTextField tripstext=new JTextField();
   JButton clear=new JButton("Clear");
   JButton next=new JButton("Next->");
   JButton back=new JButton("<-Back");
    public newvehicle()
        {
            formGUI();
        }
        public void formGUI()
        {
             //setting the colour of the background for the page
        a.setBackground(Color.WHITE);
        //setting the font to be used 
        details.setFont(new Font("sanserif",Font.PLAIN,28));
        make.setFont(new Font("sanserif",Font.PLAIN,28));
        model.setFont(new Font("sanserif",Font.PLAIN,28));
        registration.setFont(new Font("sanserif",Font.PLAIN,28));
        mnf.setFont(new Font("sanserif",Font.PLAIN,28));
        purchasedate.setFont(new Font("sanserif",Font.PLAIN,28));
        fuel.setFont(new Font("sanserif",Font.PLAIN,28));
        fuelconsumption.setFont(new Font("sanserif",Font.PLAIN,28));
        passengers.setFont(new Font("sanserif",Font.PLAIN,28));
        route.setFont(new Font("sanserif",Font.PLAIN,28));
        trips.setFont(new Font("sanserif",Font.PLAIN,28));
        maketext.setFont(new Font("sanserif",Font.PLAIN,28));
        modeltext.setFont(new Font("sanserif",Font.PLAIN,28));
        registrationtext.setFont(new Font("sanserif",Font.PLAIN,28));
        mnftext.setFont(new Font("sanserif",Font.PLAIN,28));
        purchasedatetext.setFont(new Font("sanserif",Font.PLAIN,28));
        fueltext.setFont(new Font("sanserif",Font.PLAIN,28));
        fuelconsumptiontext.setFont(new Font("sanserif",Font.PLAIN,28));
        passengerstext.setFont(new Font("sanserif",Font.PLAIN,28));
        routetext.setFont(new Font("sanserif",Font.PLAIN,28));
        tripstext.setFont(new Font("sanserif",Font.PLAIN,28));
        clear.setFont(new Font("sanserif",Font.PLAIN,28));
        next.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
        a.setLayout(null);
        //adding the JPanel components that have been imported
        a.add(details);
        a.add(make);
        a.add(model);
        a.add(registration);
        a.add(mnf);
        a.add(purchasedate);
        a.add(fuel);
        a.add(fuelconsumption);
        a.add(passengers);
        a.add(route);
        a.add(trips);
        a.add(maketext);
        a.add(modeltext);
        a.add(registrationtext);
        a.add(mnftext);
        a.add(purchasedatetext);
        a.add(fueltext);
        a.add(fuelconsumptiontext);
        a.add(passengerstext);
        a.add(routetext);
        a.add(tripstext);
        a.add(clear);
        a.add(next);
        a.add(back);
        newvehicle.add(a);
        //adding an actionlistener for the back button
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        //adding an actionlistener for the clear button
        clear.addActionListener((java.awt.event.ActionEvent clean)->{clearactionPerformed(clean);});
        //adding an actionlistener for the next button
        next.addActionListener((java.awt.event.ActionEvent nxt)->{goactionPerformed(nxt);});
        //layout setup
        details.setBounds(700,60,700,40);
        make.setBounds(200,140,100,45);
        model.setBounds(200,210,200,45);
        registration.setBounds(200,290,350,45);
        mnf.setBounds(200,360,300,45);
        purchasedate.setBounds(200,430,300,45);
        fuel.setBounds(200,500,700,45);
        fuelconsumption.setBounds(200,570,300,45);
        passengers.setBounds(200,640,300,45);
        route.setBounds(200,710,300,45);
        trips.setBounds(200,780,300,45);
        maketext.setBounds(295,140,800,45);
        modeltext.setBounds(295,210,800,45);
        registrationtext.setBounds(480,290,600,45);
        mnftext.setBounds(480,360,600,45);
        purchasedatetext.setBounds(450,430,650,45);
        fueltext.setBounds(285,500,800,45);
        fuelconsumptiontext.setBounds(445,570,650,45);
        passengerstext.setBounds(505,640,600,45);
        routetext.setBounds(290,710,850,45);
        tripstext.setBounds(505,780,640,45);
        clear.setBounds(600,900,250,45);
        next.setBounds(1100,900,250,45);
        back.setBounds(200,60,250,45);
        //setting the size of the JFrame
        newvehicle.setSize(2000,1300);
        //setting how the gui will be closed by the user
        newvehicle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newvehicle.setVisible(true);
        }
         public void returnactionPerformed(ActionEvent goback)
        {
            vehiclespage add=new vehiclespage();
        }
          public void goactionPerformed(ActionEvent nxt)
        {
            newvehiclenext add=new newvehiclenext();
        }
            public void clearactionPerformed(ActionEvent clean)
        {
            maketext.setText(null);
            modeltext.setText(null);
            registrationtext.setText(null);
            mnftext.setText(null);
            purchasedate.setText(null);
            fueltext.setText(null);
            fuelconsumptiontext.setText(null);
            passengerstext.setText(null);
            routetext.setText(null);
            tripstext.setText(null);
       }  
    
}
