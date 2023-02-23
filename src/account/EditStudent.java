package account;


import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.*;
public class EditStudent extends AbstractClass  { JFrame frame =new JFrame ();
	   public static void main(String[] args) {
        EditStudent ES=new EditStudent();
    }
           EditStudent(){
           ABClass();
           Toolkit toolkit=frame.getToolkit();
               Dimension size=toolkit.getScreenSize();
              frame. setLocation(size.width/2-frame.getWidth()/2,size.height/2-frame.getHeight()/2);
           }
    public void ABClass(){
   
       
  frame.setSize(650,350);
	//	frame.setResizable(false);
                frame.setUndecorated(true);
frame.setVisible(true);
frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
  
JPanel panal =new JPanel();  
  panal.setLayout(null);
  panal.setSize(690,390);
  panal.setBackground(Color.black);
  frame.add(panal);
  
	JTextField jf=new JTextField();
        
              JTextField  textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(100,50,180,25);
                panal.add(textField); 
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100,90,180,25);
                panal.add(textField_1); 
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100,130,180,25);
                panal.add(textField_2); 
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100,170,180,25);
                panal.add(textField_3); 
		JTextField textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(100,210,180,25);
                panal.add(textField_4);
		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(100,250,180,25);
                panal.add(textField_5);
                JTextArea textArea = new JTextArea();
		textArea.setRows(3);
		textArea.setColumns(20);
		textArea.setBounds(100,290,180,35);
                panal.add(textArea);
		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(450,50,180,25);
                panal.add(textField_6);
		JTextField textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(450,90,180,25);
                panal.add(textField_7);
		JTextField textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(450,130,180,25);
                panal.add(textField_8);
		JTextField textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(450,170,180,25);
                panal.add(textField_9);
		JTextField textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(360,310,70,25);
                panal.add(textField_10);
        
                JLabel lblName = new JLabel("Name:");
                lblName.setBackground(Color.BLACK);
                lblName.setForeground(Color.white);
		lblName.setBounds(30,50,50,30);
                panal.add(lblName);
		JLabel lblEmail = new JLabel("Email:");
                lblEmail.setBackground(Color.BLACK);
                lblEmail.setForeground(Color.white);
		lblEmail.setBounds(30,90,50,30);
                panal.add(lblEmail);
		JLabel lblCourse = new JLabel("Course:");
		lblCourse.setBackground(Color.BLACK);
                lblCourse.setForeground(Color.white);
                lblCourse.setBounds(30,130,50,30);
                panal.add(lblCourse);
		JLabel lblFee = new JLabel("Fee:");
		lblFee.setBackground(Color.BLACK);
                lblFee.setForeground(Color.white);
                lblFee.setBounds(30,170,50,30);
                panal.add(lblFee);
		JLabel lblPaid = new JLabel("Paid:");
			lblPaid.setBackground(Color.BLACK);
                lblPaid.setForeground(Color.white);
                lblPaid.setBounds(30,210,50,30);
                panal.add(lblPaid);
		JLabel lblDue = new JLabel("Due:");
		lblDue.setBackground(Color.BLACK);
                lblDue.setForeground(Color.white);
                lblDue.setBounds(30,250,50,30);
                panal.add(lblDue);
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBackground(Color.BLACK);
                lblAddress.setForeground(Color.white);
                lblAddress.setBounds(30,290,80,30);
                panal.add(lblAddress);
		JLabel lblCity = new JLabel("City:");
		lblCity.setBackground(Color.BLACK);
                lblCity.setForeground(Color.white);
                lblCity.setBounds(370,50,80,30);
                panal.add(lblCity);
                JLabel lblState = new JLabel("State:");
		lblState.setBackground(Color.BLACK);
                lblState.setForeground(Color.white);
                lblState.setBounds(370,90,80,30);
                panal.add(lblState);
                JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBackground(Color.BLACK);
                lblCountry.setForeground(Color.white);
                lblCountry.setBounds(370,130,80,30);
                panal.add(lblCountry);
                JLabel lblContactNo = new JLabel("Contact No:");
		lblContactNo.setBackground(Color.BLACK);
                lblContactNo.setForeground(Color.white);
                lblContactNo.setBounds(370,170,80,30);
                panal.add(lblContactNo);		
    
                
		JButton btnLoadRecord = new JButton("Load Record");
               btnLoadRecord.setBackground(Color.BLACK);
                btnLoadRecord.setForeground(Color.white);
                
                btnLoadRecord . setBounds(440,310,200,30);
                panal.add(btnLoadRecord);
		btnLoadRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
                                    String srollno=textField_10.getText();
				if(srollno==null||srollno.trim().equals("")){
					JOptionPane.showMessageDialog(null,"Please Put RollNo First !","For Load Data !",JOptionPane.INFORMATION_MESSAGE);
                                       }else{
				int rollno=Integer.parseInt(srollno);
				Student s=StudentDao.getStudentByRollno(rollno);
				textField.setText(s.getName());
				textField_1.setText(s.getEmail());
				textField_2.setText(s.getCourse());
				textField_3.setText(String.valueOf(s.getFee()));
				textField_4.setText(String.valueOf(s.getPaid()));
				textField_5.setText(String.valueOf(s.getDue()));
				textArea.setText(s.getAddress());
				textField_6.setText(s.getCity());
				textField_7.setText(s.getState());
				textField_8.setText(s.getCountry());
				textField_9.setText(s.getContactno());
                                }
                                }catch(Exception e)
                                        {
                                            System.out.println(" Exception at "+e);
                                            JOptionPane.showMessageDialog(null,"Please Put Valid RollNo First !","For Load Data !",JOptionPane.ERROR_MESSAGE);
                                          }
                                
			}
		});
                
		JButton btnAddAccountant = new JButton("Update Student");
               btnAddAccountant.setBackground(Color.BLACK);
                btnAddAccountant.setForeground(Color.white);
                btnAddAccountant . setBounds(360,210,270,45);
                panal.add(btnAddAccountant);
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String email=textField_1.getText();
				String course=textField_2.getText();
				int fee=Integer.parseInt(textField_3.getText());
				int paid=Integer.parseInt(textField_4.getText());
				int due=Integer.parseInt(textField_5.getText());
				String address=textArea.getText();
				String city=textField_6.getText();
				String state=textField_7.getText();
				String country=textField_8.getText();
				String contactno=textField_9.getText();
				int rollno=Integer.parseInt(textField_10.getText());
				
				Student s=new Student(rollno,name,email,course,fee,paid,due,address,city,state,country,contactno);
				int status=StudentDao.update(s);
				
				if(status>0){
					JOptionPane.showMessageDialog(null,"Student added successfully!","Added Sucessfully",JOptionPane.INFORMATION_MESSAGE);
                                        AccountantSection.main(new String[]{});
					frame.dispose();
				    }else{
						  JOptionPane.showMessageDialog(null,"Sorry, Somthing Wents To Wrong With DataBase error!","DataBase error!",JOptionPane.ERROR_MESSAGE);
                                }
			}
		});
		
                
                JButton btnBack = new JButton("Back");
                btnBack.setBackground(Color.BLACK);
               btnBack.setForeground(Color.white);
                btnBack.setBounds(360,260,270,40);
                panal.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantSection.main(new String[]{});
				frame.dispose();
			}
		});
                
      JLabel lblAccountantSection = new JLabel("Edit Student");
      lblAccountantSection.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAccountantSection.setForeground(Color.white);
                
                lblAccountantSection.setBounds(250,0,240,40);
                panal.add(lblAccountantSection);
                
                panal.add(lblAccountantSection);
    }
}
