/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatusystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
/**
 *
 * @author iamka
 */
public class vehiclespagereadonly {
    JFrame vehicles=new JFrame("Vehicles");
    JPanel a=new JPanel();
    //adding a Label that shows what is to be done by user
    JLabel instruction=new JLabel("Select one vehicle you would want to view.");
    String labels[] = { "KAJ 223V", "KBN 238A", "KBR 348D", "KAC 937H","KBC 457R", "KBA 348D", "KCN 572R", "KCA 484U","KBS 584P", "KAR 474C" };
    JList matatus=new JList(labels);
    JScrollPane list=new JScrollPane(matatus);
    JButton back=new JButton("<- Back");
     public vehiclespagereadonly()
        {
            formGUI();
        }
        public void formGUI()
        {
        //setting the colour of the background for the page
        a.setBackground(Color.WHITE);
        //setting the font to be used 
        instruction.setFont(new Font("sanserif",Font.PLAIN,28));
        list.setFont(new Font("sanserif",Font.PLAIN,28));
        matatus.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
         a.setLayout(null); 
        //adding the JPanel components that have been imported
        a.add(instruction);
        a.add(list);
        a.add(back);
        vehicles.add(a); 
        //adding an actionlistener for the back button
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        //layout setup
        instruction.setBounds(650,50,700,35);
        list.setBounds(70,150,1780,800);
        back.setBounds(1500,50,200,35);
         //setting the size of the JFrame
        vehicles.setSize(2000,1300);
        //setting how the gui will be closed by the user
        vehicles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vehicles.setVisible(true);
        }
         public void returnactionPerformed(ActionEvent goback)
        {
            homepagereadonly homepage=new homepagereadonly();
        }  
}
