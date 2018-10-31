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
public class ConductorTableReadOnly {
    
    JFrame c= new JFrame("Conductor");
    JPanel k=new JPanel();
    JLabel title=new JLabel("Details");
    JButton back=new JButton("<- Back");
    
    
    
   String []columns = {"Details Names","Details"};
       String [][] data ={{"Conductor","Details"},
           {"Conductor ID","",},
           {"Name",""},
           {"Phone Number",""},
           {"Age",""},
           {"Gender",""},
           {"Email Address",""},
           {"Salary",""},
           {"Date of Employeement",""},
           {"Vehicle Number",""},
           {"Conductor Rating",""}
           };
       JTable cond = new JTable(data,columns);
       JScrollPane sp= new JScrollPane(cond);
    public ConductorTableReadOnly (){
        formGUI();
    }
    
    public void formGUI (){
      
        c.setBackground(Color.WHITE);
        c.setSize(2000,1000);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cond.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
        c.setLayout(null);
        c.add(cond);
        c.add(back);
        
        cond.add(sp);
        cond.setShowGrid(true);
        cond.setRowHeight(70);
        cond.setAutoCreateRowSorter(true);
        
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        title.setBounds(150,60,250,45);
        back.setBounds(1500,50,200,35);
        
        cond.setBounds(220,150,1200,1000);
        cond = new JTable(data,columns);
        cond.setPreferredScrollableViewportSize(new Dimension(2000,1000));
        cond.setFillsViewportHeight(true);
        cond.setSize(1000,1500);
}

    private void returnactionPerformed(ActionEvent goback) {
        conductorspagereadonly conductorspgrd = new conductorspagereadonly();
    }
}
