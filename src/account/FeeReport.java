package account;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class FeeReport extends AbstractClass {

    public static void main(String[] args) {
        FeeReport fr = new FeeReport();
        fr.ABClass();

    }

    public FeeReport() {

    }

    void ABClass() {

        JFrame frame = new JFrame("Student Report System");
        frame.getRootPane().setWindowDecorationStyle(8);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(690, 400);
        frame.setTitle("Student Report System");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
        frame.setUndecorated(true);
        frame.setResizable(false);

        // frame.setUndecorated(true);
        JPanel panal = new JPanel();
        panal.setLayout(null);
        panal.setSize(670, 390);
        panal.setBounds(300, 0, 690, 350);
        panal.setBackground(Color.black);
        frame.add(panal);

        JLabel lbl = new JLabel();
        lbl.setIcon(new ImageIcon(getClass().getResource("/Account/srs.jpg")));
        lbl.setBackground(Color.black);
        lbl.setBounds(0, 0, 300, 390);
        panal.add(lbl);

        JLabel lblAccountantSection = new JLabel("Student Report System");
        lblAccountantSection.setFont(new Font("Algerian", Font.PLAIN, 30));
        lblAccountantSection.setForeground(Color.white);
        lblAccountantSection.setBounds(290, 20, 400, 40);
        panal.add(lblAccountantSection);

        JButton AdminLogin = new JButton("Admin Login");
        AdminLogin.setBounds(330, 100, 300, 40);
        AdminLogin.setFocusPainted(false);
//AdminLogin.setIcon(new ImageIcon(getClass().getResource("/Account/b.jpg")));
        AdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
        AdminLogin.setBackground(Color.black);
//AdminLogin.setBorder(new RoundedBorder(50));

        AdminLogin.setForeground(Color.white);

        panal.add(AdminLogin);

        AdminLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminLoginClass.main(new String[]{});
                frame.dispose();
            }
        });
        JButton AccountantLogin = new JButton("Accountant Login");
        AccountantLogin.setFocusPainted(false);
        AccountantLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
        AccountantLogin.setForeground(Color.white);
        AccountantLogin.setBackground(Color.black);
//AccountantLogin.setBorder(new RoundedBorder(50));
        AccountantLogin.setBounds(330, 175, 300, 40);
        panal.add(AccountantLogin);
        AccountantLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AccountantLogin.setForeground(Color.black);
                AccountantLogin.setBackground(Color.white);
                AccountantLogin AL = new AccountantLogin();

                frame.dispose();
            }
        });

        JButton More = new JButton();
        More.setIcon(new ImageIcon(getClass().getResource("/Account/More.png")));
        More.setBackground(Color.black);
        More.setBounds(550, 300, 50, 50);
        panal.add(More);
        More.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MoreClass Mc = new MoreClass();
                Mc.main(new String[]{});
                frame.dispose();
            }
        });

        JButton close = new JButton();
        close.setIcon(new ImageIcon(getClass().getResource("/Account/close.png")));
        close.setBackground(Color.black);
        close.setBounds(620, 300, 50, 50);
        panal.add(close);

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
            }
        });

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        //frame.setResizable(true);
    }

}
