
package account;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author waykar
 */
public class ProgressBar extends JFrame{
    JProgressBar jpbar;

 
     JLabel jLabel1;
    int i=0;
    private LayoutManager FlowLayout;
    ProgressBar() {
       // initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage(FeeReport.class.getResource("/Account/icon.jpg")));
        Toolkit t =getToolkit();
        Dimension size=t.getScreenSize();
       setLocation(size.width/4- getWidth()/2,size.height/4- getHeight()/2);
    //  setLocationRelativeTo(null);
       setUndecorated(true);
        setResizable(false);
        setSize(645,350);
            JPanel panal =new JPanel();  
                panal.setLayout(null);
                panal.setSize(690,390);
                panal.setBackground(Color.BLACK);
              add(panal);
                
    jpbar =new JProgressBar(0,100);
    jpbar.setBounds(25,300,600,30);
    jpbar.setValue(0);
    jpbar.setForeground(Color.white);
    jpbar.setBackground(Color.BLACK);
    jpbar.setBorder(new RoundedBorder(4));
    jpbar.setStringPainted(true);
    panal.add(jpbar);
    
        
    jLabel1 = new JLabel();
    jLabel1.setIcon(new ImageIcon(getClass().getResource("/Account/b.jpg")));
    jLabel1.setBounds(10,10,690,330);
    //jLabel1.setBorder(new RoundedBorder(10));
   panal.add(jLabel1);
    
  panal.  setSize(660,390);
   panal. setLayout(FlowLayout);
   setDefaultCloseOperation(this.EXIT_ON_CLOSE);
   
   setVisible(true);
    }

   
    public void iteration(){
      if (i<100) {
        while(i<=100){
          
                jpbar.setValue(i);
            i=i+2;
            try {
             Thread.sleep(50);
             if (i==100){
             dispose();
             }
                } catch (Exception e) {
                     System.out.println(e);
                   }
           
            }
       
        } else {
            dispose();
            
    }   
    }
  
    public static void main (String  [] arg){
   
        ProgressBar jpbar=new ProgressBar();
    jpbar.iteration();


   
    }
    
}
