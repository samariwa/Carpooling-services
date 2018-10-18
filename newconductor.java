/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
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
public class newconductor 
{
   //gui page for adding a new conductor into the system
   JFrame newconductor=new JFrame("New Conductor"); 
   JPanel a=new JPanel();
   JLabel details=new JLabel("Enter the details of the new conductor.");
   JLabel name=new JLabel("Name:");
   JLabel staffnumber=new JLabel("Staff Number:");
   JLabel mobilenumber=new JLabel("Moblie Number:");
   JLabel age=new JLabel("Age:");
   JLabel date=new JLabel("Date of employment:");
   JLabel salary=new JLabel("Salary:");
   JLabel vehicleserved=new JLabel("Vehicle Served:");
   JLabel gender=new JLabel("Gender:");
   JLabel male=new JLabel("Male");
   JLabel female=new JLabel("Female");
   JLabel stars=new JLabel("Stars");
   JLabel rating=new JLabel("Rating:");
   JTextField  nametext=new JTextField();
   JTextField staffnumbertext=new JTextField();
   JTextField mobilenumbertext=new JTextField();
   JTextField agetext=new JTextField();
   JTextField datetext=new JTextField();
   JTextField salarytext=new JTextField();
   JTextField vehicleservedtext=new JTextField();
   JRadioButton maleselect=new JRadioButton();
   JRadioButton femaleselect=new JRadioButton();
   JTextField starstext=new JTextField();
   JTextField ratingtext=new JTextField();
   JButton clear=new JButton("Clear");
   JButton save=new JButton("Save");
   JButton back=new JButton("<-Back");
   ButtonGroup bg=new ButtonGroup();
    public newconductor()
        {
            formGUI();
        }
        public void formGUI()
        {
             //setting the colour of the background for the page
        a.setBackground(Color.WHITE);
        //setting the font to be used 
        details.setFont(new Font("sanserif",Font.PLAIN,28));
        name.setFont(new Font("sanserif",Font.PLAIN,28));
        staffnumber.setFont(new Font("sanserif",Font.PLAIN,28));
        mobilenumber.setFont(new Font("sanserif",Font.PLAIN,28));
        age.setFont(new Font("sanserif",Font.PLAIN,28));
        gender.setFont(new Font("sanserif",Font.PLAIN,28));
        stars.setFont(new Font("sanserif",Font.PLAIN,28));
        rating.setFont(new Font("sanserif",Font.PLAIN,28));
        nametext.setFont(new Font("sanserif",Font.PLAIN,28));
        staffnumbertext.setFont(new Font("sanserif",Font.PLAIN,28));
        mobilenumbertext.setFont(new Font("sanserif",Font.PLAIN,28));
        agetext.setFont(new Font("sanserif",Font.PLAIN,28));
        male.setFont(new Font("sanserif",Font.PLAIN,28));
        female.setFont(new Font("sanserif",Font.PLAIN,28));
        date.setFont(new Font("sanserif",Font.PLAIN,28));
        salary.setFont(new Font("sanserif",Font.PLAIN,28));
        vehicleserved.setFont(new Font("sanserif",Font.PLAIN,28));
        datetext.setFont(new Font("sanserif",Font.PLAIN,28));
        salarytext.setFont(new Font("sanserif",Font.PLAIN,28));
        vehicleservedtext.setFont(new Font("sanserif",Font.PLAIN,28));
        maleselect.setFont(new Font("sanserif",Font.PLAIN,28));
        femaleselect.setFont(new Font("sanserif",Font.PLAIN,28));
        starstext.setFont(new Font("sanserif",Font.PLAIN,28));
        ratingtext.setFont(new Font("sanserif",Font.PLAIN,28));
        clear.setFont(new Font("sanserif",Font.PLAIN,28));
        save.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
        a.setLayout(null);
        //adding the JPanel components that have been imported
        a.add(details);
        a.add(name);
        a.add(staffnumber);
        a.add(mobilenumber);
        a.add(age);
        a.add(gender);
        a.add(male);
        a.add(female);
        a.add(date);
        a.add(salary);
        a.add(vehicleserved); 
        a.add(stars);
        a.add(rating);
        a.add(nametext);
        a.add(staffnumbertext);
        a.add(mobilenumbertext);
        a.add(datetext);
        a.add(salarytext);
        a.add(vehicleservedtext);
        a.add(agetext);
        a.add(maleselect);
        a.add(femaleselect);
        a.add(starstext);
        a.add(ratingtext);
        a.add(clear);
        a.add(save);
        a.add(back);
        bg.add(maleselect);
        bg.add(femaleselect);
        newconductor.add(a);
        //adding an actionlistener for the back button
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        //adding an actionlistener for the clear button
        clear.addActionListener((java.awt.event.ActionEvent clean)->{clearactionPerformed(clean);});
        //layout setup
        details.setBounds(700,60,700,40);
        name.setBounds(200,170,100,45);
        staffnumber.setBounds(200,260,200,45);
        mobilenumber.setBounds(200,350,200,45);
        age.setBounds(200,440,300,45);
        gender.setBounds(200,530,300,45);
        male.setBounds(400,530,700,45);
        female.setBounds(600,530,300,45);
        date.setBounds(850,530,350,45);
        salary.setBounds(850,620,200,45);
        vehicleserved.setBounds(850,710,200,45);
        stars.setBounds(200,620,300,45);
        rating.setBounds(200,710,300,45);
        nametext.setBounds(300,170,1300,45);
        staffnumbertext.setBounds(380,260,1220,45);
        mobilenumbertext.setBounds(400,350,1200,45);
        datetext.setBounds(1110,530,540,45);
        salarytext.setBounds(940,620,709,45);
        vehicleservedtext.setBounds(1050,710,593,45);
        agetext.setBounds(270,440,300,45);
        maleselect.setBounds(500,540,20,20);
        femaleselect.setBounds(750,540,20,20);
        starstext.setBounds(280,620,300,45);
        ratingtext.setBounds(300,710,500,110);
        clear.setBounds(600,900,250,45);
        save.setBounds(1100,900,250,45);
        back.setBounds(200,60,250,45);
        //setting the size of the JFrame
        newconductor.setSize(2000,1300);
        //setting how the gui will be closed by the user
        newconductor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newconductor.setVisible(true);
        }
         public void returnactionPerformed(ActionEvent goback)
        {
            conductorspage add=new conductorspage();
        }
            public void clearactionPerformed(ActionEvent clean)
        {
            nametext.setText(null);
            staffnumbertext.setText(null);
            mobilenumbertext.setText(null);
            agetext.setText(null);
            datetext.setText(null);
            salarytext.setText(null);
            vehicleservedtext.setText(null);
            maleselect.setText(null);
            femaleselect.setText(null);
            starstext.setText(null);
            ratingtext.setText(null);
       }  
        }
   
   

