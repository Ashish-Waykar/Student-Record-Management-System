/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import JavafxPackage.OrderBook;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AccountantSection {
    
    
      public static void main(String[] args) {
     
          // create frme 
          JFrame frame=new JFrame();

          // set size to frame 
    frame.setSize(690,400);
		//frame.setResizable(false);
                frame.setUndecorated(true);
    
          //frame layout
        frame.setLayout(null);
           
      // to set frame center on the screen 
      frame.setLocationRelativeTo(null);
      
      // create object of j button 
      JButton A =new JButton("Add Student");
      A.setFont(new Font("Tahoma", Font.PLAIN, 20));
      A.setBackground(Color.black);
      A.setForeground(Color.white);
      A.setBounds(60,50,200,50);
      A.addActionListener(new ActionListener() {
	
          public void actionPerformed(ActionEvent e) {
			AddStudent.main(new String[]{});
				frame.dispose();
			}
		});
      
      JButton B =new JButton("View Student");
      B.setFont(new Font("Tahoma", Font.PLAIN, 20));
      B.setBackground(Color.black);
      B.setForeground(Color.white);
      B.setBounds(400,50,200,50);
      B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStudent.main(new String[]{});
			}
		});
      
      JButton C =new JButton("Edit Student");
      C.setFont(new Font("Tahoma", Font.PLAIN, 20));
      C.setBackground(Color.black);
      C.setForeground(Color.white);
      C.setBounds(60,150,200,50);
      C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditStudent.main(new String[]{});
				frame.dispose();
			}
		});
      
       JButton D =new JButton("Due Fee");
       D.setFont(new Font("Tahoma", Font.PLAIN, 20));
       D.setBackground(Color.black);
       D.setForeground(Color.white);
      D.setBounds(400,150,200,50);
      D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DueFee.main(new String[]{});
			}
		});
		
       JButton E =new JButton("Order Book");
       E.setFont(new Font("Tahoma", Font.PLAIN, 20));
       E.setBackground(Color.black);
       E.setForeground(Color.white);
      E.setBounds(60,250,200,50);
      E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				OrderBook.main(new String[]{});
                                frame.dispose();
			}
		});
       JButton F =new JButton("Logout");
       F.setFont(new Font("Tahoma", Font.PLAIN, 20));
       F.setBackground(Color.black);
       F.setForeground(Color.white);
       F.setBounds(400,250,200,50);
      F.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FeeReport.main(new String[]{});
				frame.dispose();
			}
		});
      
       
		
      JLabel lblAccountantSection = new JLabel("Accountant Section");
		lblAccountantSection.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAccountantSection.setForeground(Color.white);
                lblAccountantSection.setBounds(220,0,240,40);
      
      JPanel panal =new JPanel();  
                panal.setLayout(null);
                panal.setSize(900,400);
                panal.setBackground(Color.black);
                frame.add(panal);
		
      panal.add(A);
        panal.add(B);
          panal.add(C);
            panal.add(D);
              panal.add(E);
                panal.add(F);
                panal.add(lblAccountantSection);
                 frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
 
 JLabel lbl = new JLabel();
	    //    lbl.setIconImageTo(new ImageIcon(getClass().getResource("/Account/ads.jpg")));
                lbl.setBackground(Color.black);
                lbl.setBounds(650,0,300,400);
                  
             panal.add(lbl);
      frame.setVisible(true);
      
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      }



}
