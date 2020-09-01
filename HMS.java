
package hms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HMS extends JFrame implements ActionListener{
    HMS()
        { setBounds(50,100,1200,500);
        
            
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("HMS/icons/FIRST.jpg"));
    JLabel l1= new JLabel(i1);
    l1.setBounds(0,0,1200,500);
     add(l1);
     JLabel l2= new JLabel("HOSTEL MANAGEMENT SYSTEM");
     l2.setBounds(25,50,1200,90);
     l2.setForeground(Color.RED);
     l2.setFont(new Font("serif",Font.BOLD,70));
     l1.add(l2);
     
     JButton b1= new JButton("EXIT");
     b1.setBounds(300,300,200,30);
     b1.setForeground(Color.WHITE);
     b1.setBackground(Color.RED);
     b1.setFont(new Font("serif",Font.BOLD,20));
     l1.add(b1);
     b1.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent ae){
         System.exit(0);
         }
         });
     
      JButton b2= new JButton("PROCEED");
     b2.setBounds(800,300,200,30);
     b2.setForeground(Color.WHITE);
     b2.setBackground(Color.RED);
     b2.setFont(new Font("serif",Font.BOLD,20));
     l1.add(b2);
     
     setLayout(null);
     setUndecorated(true);
     setVisible(true);
     while(true){
         
         l2.setVisible(false);
         try{
             Thread.sleep(500);
     }
         catch(Exception e){}
         l2.setVisible(true);
           try{
             Thread.sleep(500);
    }
         catch(Exception e){}
         
    }        
        
        }
    
    
    public void actionPerformed(ActionEvent ae){}

    
    public static void main(String[] args) {
        new HMS();
       
    }
    
}
