/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

/**
 *
 * @author samue
 */
public class farerateschart 
{
     // adding a GUI frame with a title 'Fare charts' on it
     JFrame chartpage=new JFrame("Fare Charts");
     JPanel a=new JPanel();
     JLabel title=new JLabel("Select a route you would like to it's fare rates");
     JButton donholm=new JButton("Donholm");
     JButton kitengela=new JButton("Kitenegla");
     JButton langata=new JButton("Langata");
     JButton westlands=new JButton("Westlands");
     JButton back=new JButton("<-Back");
     //setting a dashboard image
     ImageIcon dashboard=new ImageIcon("C:/Users/samue/Pictures/22842-colorful-high-resolution-background.jpg");
     JLabel z=new JLabel(dashboard);
     public farerateschart()
        {
            formGUI();
        }
        public void formGUI()
        {
            a.setBackground(Color.WHITE);
            title.setFont(new Font("sanserif",Font.PLAIN,28));
            donholm.setFont(new Font("sanserif",Font.PLAIN,28));
            kitengela.setFont(new Font("sanserif",Font.PLAIN,28));
            langata.setFont(new Font("sanserif",Font.PLAIN,28));
            westlands.setFont(new Font("sanserif",Font.PLAIN,28));
            back.setFont(new Font("sanserif",Font.PLAIN,28));
            a.setLayout(null);
            a.add(title);
            a.add(donholm);
            a.add(kitengela);
            a.add(langata);
            a.add(westlands);
            a.add(back);
            a.add(z);
            //adding an actionlistener for the back button
            back.addActionListener((java.awt.event.ActionEvent goback)->{returnactionPerformed(goback);});
            //adding an actionlistener for the Donholm button
            donholm.addActionListener((java.awt.event.ActionEvent godonholm)->{go1actionPerformed(godonholm);});
            //adding an actionlistener for the Kitengela button
            kitengela.addActionListener((java.awt.event.ActionEvent gokitengela)->{go2actionPerformed(gokitengela);});
            //adding an actionlistener for the Langata button
            langata.addActionListener((java.awt.event.ActionEvent golangata)->{go3actionPerformed(golangata);});
            //adding an actionlistener for the Westlands button
            westlands.addActionListener((java.awt.event.ActionEvent gowestlands)->{go4actionPerformed(gowestlands);});
            chartpage.add(a);
            //layout setup
            title.setBounds(650,460,700,35);
            langata.setBounds(250,590,300,45);
            donholm.setBounds(250,750,300,45);
            kitengela.setBounds(1300,590,300,45);
            back.setBounds(250,460,300,45);
            westlands.setBounds(1300,750,300,45);
            z.setBounds(0,0,1900,450);
             //setting the size of the JFrame
            chartpage.setSize(2000,1300);
            //setting how the gui will be closed by the user
            chartpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            chartpage.setVisible(true); 
        }
         public void returnactionPerformed(ActionEvent goback)
        {
            homepage home=new homepage();
        }
          public void go1actionPerformed(ActionEvent godonholm)
        {
            DonholmRoute donholm=new DonholmRoute();
        }
           public void go2actionPerformed(ActionEvent gokitengela)
        {
            KitengelaRoute kitengela=new KitengelaRoute();
        }
            public void go3actionPerformed(ActionEvent golangata)
        {
            LangataRoute langata=new LangataRoute();
        }
             public void go4actionPerformed(ActionEvent gowestlands)
        {
            WestlandsRoute westlands=new WestlandsRoute();
        }
}
