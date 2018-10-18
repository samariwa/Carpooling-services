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
public class newvehiclenext
{
   //gui page for adding a new vehicle into the system
   JFrame newvehiclenext=new JFrame("New Vehicle"); 
   JPanel a=new JPanel();
   JLabel details=new JLabel("Enter the details of the new vehicle.");
   JLabel driver=new JLabel("Driver:");
   JLabel conductor=new JLabel("Conductor:");
   JLabel netamount=new JLabel("Net amount of money expected per day:");
   JLabel fuele=new JLabel("Amount of money spent on fuel per day:");
   JLabel linspection=new JLabel("Last inspection Date:");
   JLabel inspectionr=new JLabel("Inspection results:");
   JLabel ninspection=new JLabel("Next inspection date:");
   JLabel lservice=new JLabel("Last service date:");
   JLabel nservice=new JLabel("Next service date:");
   JLabel servicee=new JLabel("Amount of money spent on servicing:");
   JLabel insurance=new JLabel("Insurance policy:");
   JLabel insurancee=new JLabel("Amount spent on insurance cover:");
   JLabel insurances=new JLabel("Start date of insurance cover:");
   JLabel insurancex=new JLabel("Expiry date of insurance cover:");
   JTextField drivertext=new JTextField();
   JTextField conductortext=new JTextField();
   JTextField netamounttext=new JTextField();
   JTextField fueletext=new JTextField();
   JTextField linspectiontext=new JTextField();
   JTextField inspectionrtext=new JTextField();
   JTextField ninspectiontext=new JTextField();
   JTextField lservicetext=new JTextField();
   JTextField nservicetext=new JTextField();
   JTextField serviceetext=new JTextField();
   JTextField insurancetext=new JTextField();
   JTextField insuranceetext=new JTextField();
   JTextField insurancestext=new JTextField();
   JTextField insurancextext=new JTextField();
   JButton clear=new JButton("Clear");
   JButton save=new JButton("Save");
   JButton back=new JButton("<-Back");
    public newvehiclenext()
        {
            formGUI();
        }
        public void formGUI()
        {
             //setting the colour of the background for the page
        a.setBackground(Color.WHITE);
        //setting the font to be used 
        details.setFont(new Font("sanserif",Font.PLAIN,28));
        driver.setFont(new Font("sanserif",Font.PLAIN,28));
        conductor.setFont(new Font("sanserif",Font.PLAIN,28));
        netamount.setFont(new Font("sanserif",Font.PLAIN,28));
        fuele.setFont(new Font("sanserif",Font.PLAIN,28));
        linspection.setFont(new Font("sanserif",Font.PLAIN,28));
        inspectionr.setFont(new Font("sanserif",Font.PLAIN,28));
        ninspection.setFont(new Font("sanserif",Font.PLAIN,28));
        lservice.setFont(new Font("sanserif",Font.PLAIN,28));
        nservice.setFont(new Font("sanserif",Font.PLAIN,28));
        servicee.setFont(new Font("sanserif",Font.PLAIN,28));
        insurance.setFont(new Font("sanserif",Font.PLAIN,28));
        insurancee.setFont(new Font("sanserif",Font.PLAIN,28));
        insurances.setFont(new Font("sanserif",Font.PLAIN,28));
        insurancex.setFont(new Font("sanserif",Font.PLAIN,28));
        drivertext.setFont(new Font("sanserif",Font.PLAIN,28));
        conductortext.setFont(new Font("sanserif",Font.PLAIN,28));
        netamounttext.setFont(new Font("sanserif",Font.PLAIN,28));
        fueletext.setFont(new Font("sanserif",Font.PLAIN,28));
        linspectiontext.setFont(new Font("sanserif",Font.PLAIN,28));
        inspectionrtext.setFont(new Font("sanserif",Font.PLAIN,28));
        ninspectiontext.setFont(new Font("sanserif",Font.PLAIN,28));
        lservicetext.setFont(new Font("sanserif",Font.PLAIN,28));
        nservicetext.setFont(new Font("sanserif",Font.PLAIN,28));
        serviceetext.setFont(new Font("sanserif",Font.PLAIN,28));
        insurancetext.setFont(new Font("sanserif",Font.PLAIN,28));
        insuranceetext.setFont(new Font("sanserif",Font.PLAIN,28));
        insurancestext.setFont(new Font("sanserif",Font.PLAIN,28));
        insurancextext.setFont(new Font("sanserif",Font.PLAIN,28));
        clear.setFont(new Font("sanserif",Font.PLAIN,28));
        save.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
        a.setLayout(null);
        //adding the JPanel components that have been imported
        a.add(details);
        a.add(driver);
        a.add(conductor);
        a.add(netamount);
        a.add(fuele);
        a.add(linspection);
        a.add(inspectionr);
        a.add(ninspection);
        a.add(lservice);
        a.add(nservice);
        a.add(servicee);
        a.add(insurance);
        a.add(insurancee);
        a.add(insurances);
        a.add(insurancex);
        a.add(drivertext);
        a.add(conductortext);
        a.add(netamounttext);
        a.add(fueletext);
        a.add(linspectiontext);
        a.add(inspectionrtext);
        a.add(ninspectiontext);
        a.add(lservicetext);
        a.add(nservicetext);
        a.add(serviceetext);
        a.add(insurancetext);
        a.add(insuranceetext);
        a.add(insurancestext);
        a.add(insurancextext);
        a.add(clear);
        a.add(save);
        a.add(back);
        newvehiclenext.add(a);
        //adding an actionlistener for the back button
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        //adding an actionlistener for the clear button
        clear.addActionListener((java.awt.event.ActionEvent clean)->{clearactionPerformed(clean);});
        //layout setup
        details.setBounds(700,20,700,40);
        driver.setBounds(200,80,100,45);
        conductor.setBounds(200,140,200,45);
        netamount.setBounds(200,200,700,45);
        fuele.setBounds(200,260,700,45);
        linspection.setBounds(200,320,300,45);
        inspectionr.setBounds(200,380,700,45);
        ninspection.setBounds(200,440,300,45);
        lservice.setBounds(200,500,300,45);
        nservice.setBounds(200,560,300,45);
        servicee.setBounds(200,620,1300,45);
        insurance.setBounds(200,680,1220,45);
        insurancee.setBounds(200,740,1200,45);
        insurances.setBounds(200,800,400,45);
        insurancex.setBounds(200,860,400,45);
        drivertext.setBounds(295,80,600,45);
        conductortext.setBounds(350,140,600,45);
        netamounttext.setBounds(700,200,600,45);
        fueletext.setBounds(700,260,600,45);
        linspectiontext.setBounds(460,320,600,45);
        inspectionrtext.setBounds(440,380,600,45);
        ninspectiontext.setBounds(460,440,600,45);
        lservicetext.setBounds(420,500,600,45);
        nservicetext.setBounds(430,560,600,45);
        serviceetext.setBounds(680,620,600,45);
        insurancetext.setBounds(440,680,600,45);
        insuranceetext.setBounds(630,740,600,45);
        insurancestext.setBounds(590,800,600,45);
        insurancextext.setBounds(590,860,600,45);
        clear.setBounds(600,920,250,45);
        save.setBounds(1100,920,250,45);
        back.setBounds(200,20,250,45);
        //setting the size of the JFrame
        newvehiclenext.setSize(2000,1300);
        //setting how the gui will be closed by the user
        newvehiclenext.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newvehiclenext.setVisible(true);
        }
         public void returnactionPerformed(ActionEvent goback)
        {
            newvehicle add=new newvehicle();
        }
            public void clearactionPerformed(ActionEvent clean)
        {
            drivertext.setText(null);
            conductortext.setText(null);
            netamounttext.setText(null);
            fueletext.setText(null);
            linspectiontext.setText(null);
            inspectionrtext.setText(null);
            ninspectiontext.setText(null);
            lservicetext.setText(null);
            nservicetext.setText(null);
            serviceetext.setText(null);
            insurancetext.setText(null);
            insuranceetext.setText(null);
            insurancestext.setText(null);
            insurancextext.setText(null);
       }  
    
}
