
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



public class Disclamer {
    public void Disclammer(){
    
    JFrame frame =new JFrame();
        JPanel panal =new JPanel();
        frame.setSize(650,350);
		//frame.setResizable(false);
                frame.setUndecorated(true);
    frame.setLayout(null);
  frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
    panal.setLayout(null);
    
    panal.setSize(690,390);
    
    panal.setBackground(Color.black);
    
    frame. add(panal);
    
    frame.setLocationRelativeTo(null);
      frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
 JLabel lblAccountantSection = new JLabel("Student Report System");
		lblAccountantSection.setFont(new Font("Algerian", Font.PLAIN, 30));
		lblAccountantSection.setForeground(Color.white);
                lblAccountantSection.setBounds(200,20,400,50);
                panal.add(lblAccountantSection);
               
 JButton Back=new JButton();

Back.setIcon(new ImageIcon(getClass().getResource("/Account/Back.png")));
Back.setBackground(Color.black);
Back.setBounds(10,280,50,50);
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
                two.setBounds(130,80,100,50);
                panal.add(two);
                            JLabel four = new JLabel("Direct Second Year Students ");
		four.setFont(new Font("Tahoma", Font.PLAIN, 19));
		four.setForeground(Color.white);
                four.setBounds(40,120,250,50);
                panal.add(four);
                            JLabel three = new JLabel(" MicroProject JAVA");
		three.setFont(new Font("Tahoma", Font.PLAIN, 19));
		three.setForeground(Color.white);
                three.setBounds(60,170,230,50);
                panal.add(three);
                
                  String val="\n          Request From Devloper\n\n"
                          + "         If you Find Any Bug In \n\n"
                          + "        Student Reporting System Program\n \n "
                          + "        please Informe Me ...\n\n"
                          + "        Also ,\n       Any kind of improvement in program.\n       contact with me.\n\n \n"
                          + "   By,  Devloper...\n\n";
         String A = val;
         
   
            TextArea text =new TextArea (val ,10,30);  
             text.setBackground(Color.LIGHT_GRAY);
            text.setForeground(Color.black);
            
            text.setEditable(false);
            panal.add(text);
            text.setBounds(300,100,330,200);
    
                
          
   
    
    
    }
    public static void main(String[] args) {
        Disclamer Disc =new Disclamer();
    Disc.Disclammer();
    
    }
    
}
