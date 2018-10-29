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

/**
 *
 * @author samue
 */
public class LangataRoute 
{
    // adding a GUI frame with a title 'Langata Route' on it
        JFrame langata=new JFrame("Langata Route");
        JPanel a=new JPanel();
         //adding a Label that shows what the table shows
        JLabel title=new JLabel("Fare rates for the Langata route.");
        //adding a button that takes to the fare charts page
        JButton back=new JButton("<-Back");
          public LangataRoute()
        {
            formGUI();
        }
        public void formGUI()
        {
             a.setBackground(Color.WHITE);
             title.setFont(new Font("sanserif",Font.PLAIN,28));
             back.setFont(new Font("sanserif",Font.PLAIN,28));
             a.setLayout(null);
             //adding the JPanel components that have been imported
            a.add(title);
            a.add(back);
            langata.add(a);
            //layout setup
            title.setBounds(650,60,500,45);
            back.setBounds(100,60,250,45);
            //adding an actionlistener for the back button
            back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
            //setting the size of the JFrame
            langata.setSize(2000,1300);
            //setting how the gui will be closed by the user
            langata.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            langata.setVisible(true); 
        }
         public void returnactionPerformed(ActionEvent goback)
        {
            farerateschart rates=new farerateschart();
        }
}
