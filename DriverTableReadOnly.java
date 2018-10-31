/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatusystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DriverTableReadOnly {
    
    JFrame d= new JFrame("Driver");
    JPanel k=new JPanel();
    JLabel title=new JLabel("Details.");
    JButton back=new JButton("<- Back");
    
    
    
   String []columns = {"Details Names","Details"};
       String [][] data ={{"Driver","Details"},
           {"Driver ID","",},
           {"Name",""},
           {"Phone Number",""},
           {"Age",""},
           {"Gender",""},
           {"Email Address",""},
           {"Linense Number",""},
           {"Salary",""},
           {"Date of Employeement",""},
           {"Vehicle Number",""},
           {"Number of Accident",""},
           {"Driver Rating",""}
           };
       JTable driver = new JTable(data,columns);
       JScrollPane sp= new JScrollPane(driver);
    public DriverTableReadOnly (){
        formGUI();
    }
    
    public void formGUI (){
      
        d.setBackground(Color.WHITE);
        d.setSize(2000,1000);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        driver.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
        d.setLayout(null);
        d.add(driver);
        d.add(back);
        
        driver.add(sp);
        driver.setShowGrid(true);
        driver.setRowHeight(60);
        driver.setAutoCreateRowSorter(true);
        
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        title.setBounds(150,60,250,45);
        back.setBounds(1500,50,200,35);
        
        driver.setBounds(220,150,1500,1500);
        driver = new JTable(data,columns);
        driver.setPreferredScrollableViewportSize(new Dimension(2000,1000));
        driver.setFillsViewportHeight(true);
        driver.setSize(1000,2000);
}

    private void returnactionPerformed(ActionEvent goback) {
        driverspagereadonly driverpgrd = new driverspagereadonly();
    }
}

