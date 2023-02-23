/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        package account;
import JavafxPackage.OrderBook;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javafx.scene.control.ToggleGroup;
import javax.swing.*;
/**
 *
 * @author waykar
 */

public class Account {
public  Account(){
}
    public void conditions (){
    
         JFrame frame =new JFrame();
   
         frame.setSize(640,360);
		frame.setResizable(false);
               frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
               frame.setUndecorated(true);
               frame.setLayout(null);
    
        ToggleGroup g = new ToggleGroup();
        JPanel panal =new JPanel();  
                panal.setLayout(null);
                panal.setSize(690,390);
                panal.setBackground(Color.black);

                frame. add(panal);
        
        //normal buttion code
        JButton button=new JButton(" Continue...");
        button.setBounds(400,315,200,30);
        
button.setFont(new Font("Tahoma", Font.PLAIN, 15));
button.setBackground(Color.black);
button.setForeground(Color.WHITE);
        panal.add(button);
        
        
        frame.setLocationRelativeTo(null);
        button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FeeReport. main(new String[]{});
				frame.dispose();
			}
		});
        
        frame.setVisible(true);
    
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        
        //non editable text code 
         String val="\tSTUDENT REPORT SYSTEM   :\n\n"
                 + "The Student Report System Contains The Compleat Datbase About Student \n"
                 + "Hence, \nIt Contains Database About the  Student and The Accountant. \n"
                 + "It Also Provaides The Security At Heigh Level \n To Avoid Distrubunce & Hacking \n\n"
                 + "LICENCE : \n\n"
                 + "1.\tThis Is Leagal Agreement Between Licence And C-Dac .\n"
                 + "2.\tC-DAC is Reserves the Righte to Take Sutaible Action In Case Of Voilation. \n"
                 + "3.\tDo Not Use The Pacage If You Are Not Sure  The Terms And Condition. \n"
                 + "4.\tThe Licence Contains The Fully Responcibility About Selection Installetion And Use C-DAC Agrreement. \n"
                 + "5.\tCopy of That Program Is Manual It Only made for Backup Process.\n\n\n"
                 + "WORENTY :\n\n"
                 + "1. Product Are Compleately Wrented For Create Database Approve , Database And Add Database.\n"
                 + "2. The Licence Will Approve To Replacement Of Defective Media By Sending It To Devloper.\n"
                 + "3. Devloper's Contace Are Given In About Us In Program.\n "
                 + "\nWORNING :\t"
                 + "Real Program Does Not Contains Any Permissions."
                 + "\n\n\n I HAVE ACCEPT ALL AGREMENT AND CONTINUE .\n\n"
                 + "PRESS CONTINUE BUTTON TO CONTINUE EXPLORING STUDENT REPORT SYSTEM";
   
   
   
            TextArea text =new TextArea (val ,10,30);
            text.setBackground(Color.LIGHT_GRAY);
            text.setForeground(Color.black);
            text.setEditable(false);
            

            panal.add(text);
            text.setBounds(5,10,630,300);
    
    
    }
    public static void main(String[] args) {
       
         ProgressBar p=new ProgressBar();
                                        p.setVisible(true);
                                        p.iteration();
                                        p.dispose();
         Account A= new Account();
         A.conditions();
    }
    
}

