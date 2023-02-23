
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
import javax.swing.JPanel;

public class MoreClass {
       JFrame frame =new JFrame();
        JPanel panal =new JPanel();  
public void More (){  

    frame.setSize(650,350);
		//frame.setResizable(false);
                frame.setUndecorated(true);
    frame.setLayout(null);

    panal.setLayout(null);
    
    panal.setSize(690,390);
    
    panal.setBackground(Color.black);
    
    frame. add(panal);
        
    
    frame.setLocationRelativeTo(null);
  frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
    JButton AboutUs=new JButton(" About Us ");
    AboutUs.setBounds(30,90,200,40);
    AboutUs.setFont(new Font("Tahoma", Font.PLAIN, 25));
    AboutUs.setForeground(Color.WHITE);
    panal.add(AboutUs);
    AboutUs.setBackground(Color.black);
  AboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutusClass.main(new String[]{});
				frame.dispose();
			}
		});
          JButton Disclammer=new JButton(" Disclammer ");
        Disclammer.setBounds(30,200,200,40);
       Disclammer.setFont(new Font("Tahoma", Font.PLAIN, 25));
        Disclammer.setBackground(Color.black);
        Disclammer.setForeground(Color.WHITE);
        panal.add(Disclammer);
            Disclammer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disclamer.main(new String[]{});
				frame.dispose();
			}
		});

        JButton Back=new JButton();
        Back.setBounds(30,290,50,50);
Back.setIcon(new ImageIcon(getClass().getResource("/Account/Back.png")));
Back.setBackground(Color.black);

panal.add(Back);
        
Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeReport.main(new String[]{});
				frame.dispose();
			}
		});


     
  
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
                 + "Real Program Does Not Contains Any Permissions.\n\n\n" ;
   
   
   
         String A = val;
         
   
            TextArea text =new TextArea (val ,10,30);
             text.setBackground(Color.LIGHT_GRAY);
            text.setForeground(Color.black);
            
            text.setEditable(false);
            panal.add(text);
            text.setBounds(300,10,330,300);
    
     frame.setVisible(true);
    }
  
    public static void main(String[] args) {
       
         MoreClass MC =new MoreClass();
         MC.More();
    }
}
