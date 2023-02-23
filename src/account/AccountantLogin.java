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

public class AccountantLogin {
    public static void main(String[] args) {
            
         new AccountantLogin();
         
            
            
            
    }
  public AccountantLogin (){
         JFrame frame =new JFrame();
  frame.setSize(690,400);
		//frame.setResizable(false);
             //   frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/al.jpg")));
                frame.setUndecorated(true);
            
JPanel panal =new JPanel();  
  panal.setLayout(null);
  panal.setSize(690,390);
  panal.setBackground(Color.black);
  frame.add(panal);
    frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
  	 JLabel lbl = new JLabel();
	        lbl.setIcon(new ImageIcon(getClass().getResource("/Account/AL.jpg")));
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
			String name=Usernametext.getText();
			String password=String.valueOf(passwordfield.getPassword());
			boolean status=AccountantDao.validate(name, password);
			if(status){
				AccountantSection.main(new String[]{});
				frame.dispose();
			}else{
		  JOptionPane.showMessageDialog(null,"Sorry, username or password error!","Login error!",JOptionPane.ERROR_MESSAGE);
                            System.out.println("wrong detail");
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

		
		
      JLabel lblAccountantSection = new JLabel("Accountant Login");
		lblAccountantSection.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAccountantSection.setForeground(Color.white);
                lblAccountantSection.setBounds(380,30,400,40);
                panal.add(lblAccountantSection);
frame.setVisible(true);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
  }  

        }
