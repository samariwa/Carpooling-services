/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatusystem;
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
public class driverspagereadonly {
   JFrame drivers=new JFrame("Drivers");
    JPanel a=new JPanel();
    //adding a Label that shows what is to be done by user
    JLabel instruction=new JLabel("Select one driver you would want to view.");
    String names[] = { "James Mutegi-001", "Shawn Musili-002", "Joseph Karanja-003", "Reuben Nyaga-004","Brian Wekesa-005", "John Odhiambo-006", "Jacob Mutindu-007", "Isaac Waweru-008","Rose Wangechi-009", "Jack Mutembei-010" };
    JList employees=new JList(names);
    JScrollPane list=new JScrollPane(employees);
     MouseListener mouseListener = new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            if(e.getClickCount() == 2){
                DriverTableReadOnly driverTablereadonly = new DriverTableReadOnly();
            }
        }
    };
    JButton back=new JButton("<- Back");
     public driverspagereadonly()
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
        employees.setFont(new Font("sanserif",Font.PLAIN,28));
        back.setFont(new Font("sanserif",Font.PLAIN,28));
         a.setLayout(null); 
        //adding the JPanel components that have been imported
        a.add(instruction);
        a.add(list);
        a.add(back);
        drivers.add(a); 
        employees.addMouseListener(mouseListener);
        //adding an actionlistener for the back button
        back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
        //layout setup
        instruction.setBounds(650,50,700,35);
        list.setBounds(70,150,1780,800);
        back.setBounds(1500,50,200,35);
         //setting the size of the JFrame
        drivers.setSize(2000,1300);
        //setting how the gui will be closed by the user
        drivers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drivers.setVisible(true);
        }
         public void returnactionPerformed(ActionEvent goback)
        {
            homepagereadonly homepage=new homepagereadonly();
        } 
}
