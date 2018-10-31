/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;

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

public class Kitengela {
    JFrame fare= new JFrame("Fare");
    JPanel k=new JPanel();
    JLabel title=new JLabel("Fare rates for the KItengela route.");
    JButton back=new JButton("<- Back");
    
    
    
   String []columns = {"Route","On Peek","Off Peek"};
       String [][] data ={{"Route","On Peek","Off Peek"},
           {"Town to Nyayo","30","20"},
           {"Town to Syokimau","70","50"},
           {"Town to Kitengela","100","70"},
           {"Nyayo to Syokimau","40","50"},
           {"Nyayo to Kitengela","70","50"},
           {"Syokimau to KItengela","30","40"}};
       JTable Fare = new JTable(data,columns);
       JScrollPane sp= new JScrollPane(Fare);
    public Kitengela (){
        formGUI();
    }
    
    public void formGUI (){
      
        fare.setBackground(Color.WHITE);
        fare.setSize(2000,1000);
        fare.setVisible(true);
        fare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Fare.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
        fare.setLayout(null);
        fare.add(Fare);
        fare.add(back);
        
        Fare.add(sp);
        Fare.setShowGrid(true);
         Fare.setRowHeight(100);
        Fare.setAutoCreateRowSorter(true);
        
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        back.setBounds(1500,50,200,35);
        title.setBounds(650,60,250,45);
        Fare.setBounds(220,100,1400,800);
        Fare = new JTable(data,columns);
        Fare.setPreferredScrollableViewportSize(new Dimension(2000,1000));
        Fare.setFillsViewportHeight(true);
        Fare.setSize(1000,900);
       
    }


    public void returnactionPerformed(ActionEvent goback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
