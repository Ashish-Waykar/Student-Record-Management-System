
package account;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AdminSection {
  
          
public void More (){  
JFrame frame =new JFrame();
  
        JPanel panal =new JPanel(); 
     frame.setSize(690,400);
    
		//frame.setResizable(false);
                frame.setUndecorated(true);
        frame.setLayout(null);
        
frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));

                panal.setLayout(null);
                panal.setSize(800,400);
                panal.setBackground(Color.black);
             frame. add(panal);
             
                 	 JLabel lbl = new JLabel();
	        lbl.setIcon(new ImageIcon(getClass().getResource("/Account/ads.jpg")));
                lbl.setBackground(Color.black);
                lbl.setBounds(0,0,300,400);
               panal.add(lbl);

     
       // 
        frame.setLocationRelativeTo(null);
     //
        JButton btnAddAccountant = new JButton("Add Accountant");
       btnAddAccountant.setForeground(Color.WHITE);
       btnAddAccountant.setFocusPainted(false);
       btnAddAccountant.setBackground(Color.black);
       btnAddAccountant.setFont(new Font("Tahoma", Font.PLAIN, 20));
       btnAddAccountant.setBounds(330,100,300,40);
    
        panal.add(btnAddAccountant);
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAccountant.main(new String[]{});
				frame.dispose();
			}
		});
		
		JButton btnViewAccountant = new JButton("View Accountant");
                
       btnViewAccountant.setBackground(Color.black);
       btnViewAccountant.setForeground(Color.WHITE);
       btnViewAccountant.setFocusPainted(false);
       btnViewAccountant.setFont(new Font("Tahoma", Font.PLAIN, 20));
                  btnViewAccountant.setBounds(330,175,300,40);
   

        panal.add(btnViewAccountant);
		btnViewAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAccountant.main(new String[]{});
			}
		});
		
		JButton btnLogout = new JButton("Logout");
                 btnLogout.setBounds(330,250,300,40);
        panal.add(btnLogout);
       btnLogout .setBackground(Color.black);
       btnLogout.setFocusPainted(false);
       btnLogout.setForeground(Color.WHITE);
       btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeReport.main(new String[]{});
				frame.dispose();
			}
		});
           JLabel lblAccountantSection = new JLabel("Admin Section");
		lblAccountantSection.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAccountantSection.setForeground(Color.white);
                lblAccountantSection.setBounds(380,30,400,40);
                panal.add(lblAccountantSection);
    
     frame.setVisible(true);
    }
  
    public static void main(String[] args) {
       AdminSection as =new AdminSection();
       as.More ();
    
    }
}


