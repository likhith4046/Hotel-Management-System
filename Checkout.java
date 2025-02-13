
package hotel.management.system;

/**
 *
 * @author royal
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Checkout extends JFrame {
    Choice ccustomer;
    Checkout(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Checkout");
        text.setBounds(100,20,100,30);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);
        
        JLabel lbid = new JLabel("CUS ID");
        lbid.setBounds(30,80,100,30);
        add(lbid);
        
        ccustomer=new Choice();
        ccustomer.setBounds(150,80,150,25);
        add(ccustomer);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next()){
                ccustomer.add(rs.getString("number"));
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/tick.png"));
        Image i2=i1.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300,80,20,20);
        add(image);
        
        setBounds(300,200,800,400);
        setVisible(true);
        
       
    }
    
    public static void main(String[] args){
        new Checkout();
    }  
    
}
