
package account;

import java.awt.Color;
import java.awt.Dimension;
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

public class AboutusClass {
    public void AboutClass(){
       
   JFrame frame =new JFrame();
        JPanel panal =new JPanel();
       frame.setSize(650,350);
		//frame.setResizable(false);
                frame.setUndecorated(true);
                  frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
    frame.setLayout(null);

    panal.setLayout(null);
    
    panal.setSize(690,390);
    
    panal.setBackground(Color.black);
    
    frame. add(panal);
    
    frame.setLocationRelativeTo(null);
  String val="Devloper   : \n \n Ashish Anil Waykar\n\n"
          + "Contact    : \n\n ashishwaykar19@gmail.com\n\n"
          + "Decleration : \n \nStudenr Report System\n\n "
          + "\n\nSoftware Use Only For Students For Learning the Java\n \n"
          + "Software Requirements    : \n \nIntel i3 or Above AMD A3 processor \n\n";
   
 JLabel lblAccountantSection = new JLabel("Student Report System");
		lblAccountantSection.setFont(new Font("Algerian", Font.PLAIN, 23));
		lblAccountantSection.setForeground(Color.white);
                lblAccountantSection.setBounds(350,20,400,50);
                panal.add(lblAccountantSection);
               JButton Back=new JButton();
Back.setIcon(new ImageIcon(getClass().getResource("/Account/Back.png")));
Back.setBackground(Color.black);
Back.setBounds(570,280,50,40);
panal.add(Back);
Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoreClass.main(new String[]{});
				frame.dispose();
			}
		});
                JLabel two = new JLabel("By, ");
		two.setFont(new Font("Tahoma", Font.PLAIN, 19));
                
		two.setForeground(Color.white);
                two.setBounds(480,80,400,50);
                panal.add(two);
                            JLabel four = new JLabel("Direct Second Year Students ");
		four.setFont(new Font("Tahoma", Font.PLAIN, 19));
		four.setForeground(Color.white);
                four.setBounds(375,120,400,50);
                panal.add(four);
                            JLabel three = new JLabel(" MicroProject JAVA");
		three.setFont(new Font("Tahoma", Font.PLAIN, 19));
		three.setForeground(Color.white);
                three.setBounds(410,170,400,50);
                panal.add(three);
                
                
            TextArea text =new TextArea (val ,10,30);   
             text.setBackground(Color.LIGHT_GRAY);
            text.setForeground(Color.black);
            
            text.setEditable(false);
            panal.add(text);
            text.setBounds(10,50,330,280);
    
     frame.setVisible(true);
    
    
    }
    public static void main(String[] args) {
        AboutusClass ac=new AboutusClass();
        ac.AboutClass();
    }
}