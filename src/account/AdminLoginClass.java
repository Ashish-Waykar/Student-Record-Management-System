/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
 import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener ;
import javax.swing.*;
/**
 *
 * @author waykar
 */
public class AdminLoginClass {
   

  String checkUser ,checkPassword ;

  String  userName1="ashish";
  String Password1= "ashish123";
    public static void main(String[] args) {
            
         new AdminLoginClass();
         
            
            
            
    }
  public AdminLoginClass (){
         JFrame frame =new JFrame();
         
    frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
  frame.setSize(690,400);
		//frame.setResizable(false);
                frame.setUndecorated(true);

JPanel panal =new JPanel();  
  panal.setLayout(null);
  panal.setSize(690,390);
  panal.setBackground(Color.black);
  frame.add(panal);
  
  JLabel lbl = new JLabel();
	        lbl.setIcon(new ImageIcon(getClass().getResource("/Account/AD.jpg")));
                lbl.setBackground(Color.black);
                lbl.setBounds(0,0,300,400);
               panal.add(lbl);
  
  JLabel userName=new JLabel("User Name");
  userName.setFont(new Font("Tahoma", Font.PLAIN, 20));
  userName.setForeground(Color.white);
 userName .setBounds(300,150,100,30);
  panal.add(userName);
  
  JTextField Usernametext=new JTextField();
  
   Usernametext.setBounds (400,150,230,30);
  panal.add(Usernametext);
  
  JLabel password =new JLabel("Password");
  password.setFont(new Font("Tahoma", Font.PLAIN, 20));
    password.setForeground(Color.white);
 password.setBounds(300,200,100,30);
 panal.add(password);
  
  JPasswordField passwordfield=new JPasswordField();
  passwordfield.setBounds(400,200,230,30);
panal.add(passwordfield);

JButton Login=new JButton("Login");
Login.setFont(new Font("Tahoma", Font.PLAIN, 20));
Login.setBackground(Color.black);
Login.setForeground(Color.white);
Login.setBounds(470,300,90,30);
panal.add(Login);

Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  checkUser =Usernametext.getText().toString();
         checkPassword=passwordfield.getText().toString();
         if (checkUser.equals(userName1)&& checkPassword.equals(Password1))
         {
         String s[]={};
         AdminSection.main(s);
         frame.dispose();
         }else{
             
         JOptionPane.showMessageDialog(null,"Sorry, username or password error!","Login error!",JOptionPane.ERROR_MESSAGE);
        
         }    
			}
		});
JButton Back=new JButton("Back");
Back.setFont(new Font("Tahoma", Font.PLAIN, 20));
Back.setBackground(Color.black);
Back.setForeground(Color.white);
Back.setBounds(570,300,90,30);
panal.add(Back);
Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeReport.main(new String[]{});
				frame.dispose();
			}
		});

		
		
      JLabel lblAccountantSection = new JLabel("Admin Login");
		lblAccountantSection.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAccountantSection.setForeground(Color.white);
                lblAccountantSection.setBounds(420,30,400,40);
                panal.add(lblAccountantSection);
frame.setVisible(true);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
  }  

        }


