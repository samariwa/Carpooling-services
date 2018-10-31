/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
public class ReportsList {
      // adding a GUI frame with a title 'Vehicles' on it
    JFrame vehicles=new JFrame("Reports List");
    JPanel a=new JPanel();
    //adding a Label that shows what is to be done by user
    JLabel instruction=new JLabel("Select one report you would want to view.");
    String labels[] = { "28th September 2016", "27th February 2017", "13th August 2017"};
    JList repos=new JList(labels);
    JScrollPane list=new JScrollPane(repos);
    MouseListener mouseListener = new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            if(e.getClickCount() == 2){
                reportspage reportspg = new reportspage();
            }
        }
    };
    JButton back=new JButton("<- Back");
    JButton addreport=new JButton("Add Report");
     public ReportsList()
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
        repos.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
        addreport.setFont(new Font("sanserif",Font.PLAIN,28));
         a.setLayout(null); 
        //adding the JPanel components that have been imported
        a.add(instruction);
        a.add(list);
        a.add(back);
        a.add(addreport);
        vehicles.add(a);
        repos.addMouseListener(mouseListener);
        //adding an actionlistener for the back button
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        //adding an actionlistener for the add report button
        addreport.addActionListener((java.awt.event.ActionEvent goadd)->{goaddactionPerformed(goadd);});
        //layout setup
        instruction.setBounds(650,50,700,35);
        list.setBounds(70,150,1780,800);
        back.setBounds(1500,50,200,35);
        addreport.setBounds(90,50,250,35);
         //setting the size of the JFrame
        vehicles.setSize(2000,1300);
        //setting how the gui will be closed by the user
        vehicles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vehicles.setVisible(true);
        }
         public void returnactionPerformed(ActionEvent goback)
        {
            homepage homepage=new homepage();
        }
          public void goaddactionPerformed(ActionEvent goadd)
        {
            reportspage reports=new reportspage();
        }   
}
