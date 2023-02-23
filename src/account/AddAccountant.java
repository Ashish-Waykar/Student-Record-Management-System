package account;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddAccountant extends AbstractClass {
    public static void main(String[] args) {
        AddAccountant a=new AddAccountant();
        a.ABClass();
    }
 public void ABClass (){
 
  JFrame frame =new JFrame();
 frame.setSize(690,390);
		//frame.setResizable(false);
              //  frame.setUndecorated(true);
frame.setVisible(true);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
  
JPanel panal =new JPanel();  
  panal.setLayout(null);
  panal.setSize(690,390);
  panal.setBackground(Color.BLACK);
  frame.add(panal);
  
  JLabel userName=new JLabel("User Name");
  userName .setBounds(190,93,100,30);
  userName.setBackground(Color.BLACK);
  userName.setForeground(Color.white);
  panal.add(userName);
  
  JTextField Usernametext=new JTextField();
  Usernametext.setBounds (280,93,230,30);
  panal.add(Usernametext);
  
   JLabel Email1=new JLabel("Email");
  Email1 .setBounds(190,150,100,30);
  Email1.setBackground(Color.BLACK);
   Email1.setForeground(Color.white);
  panal.add(Email1);
  
   JTextField Email=new JTextField();
  Email.setBounds (280,150,230,30);
  panal.add(Email);
  
    JLabel contact=new JLabel("Contact No.");
  contact .setBounds(190,207,100,30);
 contact.setBackground(Color.black);
  contact.setForeground(Color.white);
  panal.add(contact);
 
   JTextField contact1=new JTextField();
  contact1.setBounds (280,207,230,30);
  panal.add(contact1);
  
  JLabel password =new JLabel("Password");
  password.setBounds(190,264,100,30);
  password.setBackground(Color.black);
  password.setForeground(Color.white);
  panal.add(password);
  
  JPasswordField passwordfield=new JPasswordField();
  passwordfield.setBounds(280,264,230,30);
panal.add(passwordfield);

JButton Login=new JButton("Create Database ");
Login.setBackground(Color.black);
Login.setForeground(Color.WHITE);
Login.setBounds(430,310,150,30);
panal.add(Login);

Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=Usernametext.getText();
				char ch[]=passwordfield.getPassword();
				String password=String.valueOf(ch);
				String email=Email.getText();
				String contactno=contact1.getText();
				
				Accountant a=new Accountant(name,password,email,contactno);
				int status=AccountantDao.save(a);
				
				if(status > 0){
					
					Usernametext.setText("");
                                        Email.setText("");
                                        contact1.setText("");
					passwordfield.setText("");
                                  //      JOptionPane.showMessageDialog(AddAccountant.this,"Accountant added successfully!");
                                	  JOptionPane.showMessageDialog(null,"Accountant added successfully!","Added Sucessfully",JOptionPane.INFORMATION_MESSAGE);
              		}else{
						  JOptionPane.showMessageDialog(null,"Sorry, username or password error!","Login error!",JOptionPane.ERROR_MESSAGE);
              }
			}
		});
JButton Back=new JButton("Back");
Back.setBackground(Color.black);
Back.setForeground(Color.WHITE);
Back.setBounds(600,310,70,30);
panal.add(Back);
Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection.main(new String[]{});
				frame.dispose();
			}
		});

		
		
      JLabel lblAccountantSection = new JLabel("Add Accountant ");
			lblAccountantSection.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAccountantSection.setForeground(Color.white);
                lblAccountantSection.setBounds(250,0,400,40);
                panal.add(lblAccountantSection);

 
 }
}