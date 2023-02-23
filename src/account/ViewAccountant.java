package account;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewAccountant{
	
	public ViewAccountant() {
		//Code to view data in JTable
                JFrame frame =new JFrame();
                frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
  
JPanel panal =new JPanel();  
  panal.setLayout(null);
  panal.setSize(690,390);
  panal.setBackground(Color.white);
frame.add(panal);
  
		List<Accountant> list=AccountantDao.view();
		int size=list.size();
		
		String data[][]=new String[size][5];
		int row=0;
		for(Accountant a:list){
			data[row][0]=String.valueOf(a.getId());
			data[row][1]=a.getName();
			data[row][2]=a.getPassword();
			data[row][3]=a.getEmail();
			data[row][4]=a.getContactno();
			row++;
		}
		String columnNames[]={"Id","Name","Password","Email","Contact No"};
		
		JTable jt=new JTable(data,columnNames);
                jt.setBackground(Color.white);
		JScrollPane sp=new JScrollPane(jt);
                sp.setBackground(Color.white);
		sp.setBounds(0, 0, 800, 400);
                panal.add(sp);
	frame.setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 800, 400);
	frame.setVisible(true);
        }

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				ViewAccountant va = new ViewAccountant();
					
				} catch (Exception e) {
				        System.out.println(e);
				}
			}
		});
	}
}
