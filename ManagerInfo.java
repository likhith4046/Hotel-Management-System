
package hotel.management.system;

/**
 *
 * @author royal
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class ManagerInfo extends JFrame implements ActionListener{
    
    
    JTable table;
    JButton back;
    ManagerInfo(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel l1=new JLabel("Name");
        l1.setBounds(20, 10, 100, 20);
        add(l1);
        JLabel l2=new JLabel("Age");
        l2.setBounds(140, 10, 100, 20);
        add(l2);
        JLabel l3=new JLabel("Gender");
        l3.setBounds(260, 10, 100, 20);
        add(l3);
        JLabel l4=new JLabel("Job");
        l4.setBounds(380, 10, 100, 20);
        add(l4);
        JLabel l5=new JLabel("Salary");
        l5.setBounds(500, 10, 100, 20);
        add(l5);
        JLabel l6=new JLabel("PH NUMBER");
        l6.setBounds(620, 10, 100, 20);
        add(l6);
        JLabel l7=new JLabel("Mail");
        l7.setBounds(740, 10, 100, 20);
        add(l7);
        
        
        
        
        table= new JTable();
        table.setBounds(20,40,800,400);
        add(table);
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee where job='Manager'");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
        back = new JButton("Back");
        back.setBounds(420,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setBounds(300,200,1000,600);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Reception();
    }
    
    public static void main(String[] args){
        new ManagerInfo();
    }
    
    
}
