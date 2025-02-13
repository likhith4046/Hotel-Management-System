
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Reception extends JFrame implements ActionListener {
    
    JButton newCustomer,rooms,department,customer,allEmployee,managerInfo;
    Reception(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        rooms = new JButton("Rooms");
        rooms.setBounds(10,30,200,30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);
        
         newCustomer = new JButton("New customer form");
        newCustomer.setBounds(10,70,200,30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
         department = new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add(department);
        
         allEmployee = new JButton("All Employee");
        allEmployee.setBounds(10,150,200,30);
        allEmployee.setBackground(Color.BLACK);
        allEmployee.setForeground(Color.WHITE);
        allEmployee.addActionListener(this);
        add(allEmployee);
        
         customer = new JButton("Customer Info");
        customer.setBounds(10,190,200,30);
        customer.setBackground(Color.BLACK);
        customer.setForeground(Color.WHITE);
        customer.addActionListener(this);
        add(customer);
         managerInfo = new JButton("ManagerInfo");
        managerInfo.setBounds(10,230,200,30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        managerInfo.addActionListener(this);
        add(managerInfo);
        JButton checkout = new JButton("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        add(checkout);
        JButton update = new JButton("Update Status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        add(update);
        
        JButton roomStatus = new JButton("Update Room Status");
        roomStatus.setBounds(10,350,200,30);
        roomStatus.setBackground(Color.BLACK);
        roomStatus.setForeground(Color.WHITE);
        add(roomStatus);
        
        JButton searchRoom = new JButton("Search Room");
        searchRoom.setBounds(10,310,200,30);
        searchRoom.setBackground(Color.BLACK);
        searchRoom.setForeground(Color.WHITE);
        add(searchRoom);
        
        JButton logout = new JButton("Logout");
        logout.setBounds(10,310,200,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        add(logout);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250,30,500,470);
        add(image);
        
        
        
        
        
        setBounds(400,300,800,570);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==newCustomer){
            setVisible(false);
            new AddCustomer();
        }else if(ae.getSource()== rooms){
            setVisible(false);
            new Room();
        }else if (ae.getSource()==department){
            setVisible(false);
            new Department();
        }else if(ae.getSource()==allEmployee){
            setVisible(false);
            new EmployeeInfo();
        }else if(ae.getSource()==managerInfo){
            setVisible(false);
            new ManagerInfo();
        }else if(ae.getSource()==customer){
            setVisible(false);
            new CustomerInfo();
        }
    }
    
    public static void main(String[] args){
        new Reception();
    }
    
}
