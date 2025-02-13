package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class Department extends JFrame implements ActionListener {
    
    JTable table;
    JButton back;
    
    Department() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Department");
        l1.setBounds(180, 10, 100, 20);
        add(l1);
        
        JLabel l2 = new JLabel("Budget");
        l2.setBounds(370, 10, 100, 20);
        add(l2);
        
        // Adjust the table size so it fits well within the window
        table = new JTable();
        JScrollPane sp = new JScrollPane(table);  // Use JScrollPane for the table
        sp.setBounds(20, 40, 660, 300);           // Adjust the size of the table and container
        add(sp);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from department");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Move the back button below the table and ensure it's not overlapped
        back = new JButton("Back");
        back.setBounds(250, 360, 120, 30);  // Adjusted position below the table
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setBounds(400, 200, 700, 500);  // Increased height of window to accommodate all components
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Reception();  // Assuming there's a Reception class to navigate to
    }
    
    public static void main(String[] args) {
        new Department();
    }
}
