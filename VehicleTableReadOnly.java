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

/**
 *
 * @author iamka
 */
public class VehicleTableReadOnly {
     JFrame v= new JFrame("Vehicle");
    JPanel k=new JPanel();
    JLabel title=new JLabel("Details.");
    JButton back=new JButton("<- Back");
    
    
    
   String []columns = {"Details Names","Details"};
       String [][] data ={{"","Details"},
           {"Vehicle Number","",},
           {"Vehicle Make",""},
           {"Veicle Model",""},
           {"Vehicle Manufacture Year",""},
           {"Vehicle Date of Purchase",""},
           {"Vehicle Fuel Type",""},
           {"Vehicle Fuel Amount Daily",""},
           {"Vehicle Passangers",""},
           {"Vehicle Routes",""},
           {"Vehicle Daily Net",""},
           {"Vehicle Last Service Date",""},
           {"Vehicle Insuarance Date",""},
           {"Vehicle Insuarance Expire Date",""},
           };
       JTable Vehicle = new JTable(data,columns);
       JScrollPane sp= new JScrollPane(Vehicle);
    public VehicleTableReadOnly (){
        formGUI();
    }
    
    public void formGUI (){
      
        v.setBackground(Color.WHITE);
        v.setSize(2000,1000);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Vehicle.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
        v.setLayout(null);
        v.add(Vehicle);
        v.add(back);
        
        Vehicle.add(sp);
        Vehicle.setShowGrid(true);
        Vehicle.setRowHeight(50);
        Vehicle.setAutoCreateRowSorter(true);
        
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        title.setBounds(150,60,250,45);
        back.setBounds(1500,50,200,35);
        
        Vehicle.setBounds(220,150,1500,2000);
        Vehicle = new JTable(data,columns);
        Vehicle.setPreferredScrollableViewportSize(new Dimension(2000,1000));
        Vehicle.setFillsViewportHeight(true);
        Vehicle.setSize(1000,2000);
}

    private void returnactionPerformed(ActionEvent goback) {
        vehiclespage vehiclespg = new vehiclespage();
    } 
}
