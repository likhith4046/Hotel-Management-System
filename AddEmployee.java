
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddEmployee extends JFrame implements ActionListener {
    
    JTextField tfname,tfage,tfsalary,tfmail,tfphone;
    JRadioButton rbmale,rbfemale;
    JButton submit;
    JComboBox cbjob;
    
    AddEmployee(){
        setLayout(null);
        
        
        
        JLabel lblname = new JLabel("NAME   :");
        lblname.setBounds(60,30,120,30);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 30, 150, 30);
        add(tfname);
        
        JLabel lblage = new JLabel("AGE   :");
        lblage.setBounds(60,80,120,30);
        lblage.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblage);
        
        tfage = new JTextField();
        tfage.setBounds(200, 80, 150, 30);
        add(tfage);
        
        JLabel lblgender = new JLabel("GENDER   :");
        lblgender.setBounds(60,130,120,30);
        lblgender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblgender);
        
    
        rbmale = new JRadioButton("MALE    :");
        rbmale.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rbmale.setBackground(Color.WHITE);
        rbmale.setBounds(200,130,70,30);
        add(rbmale);
        
        rbfemale = new JRadioButton("FEMALE    :");
        rbfemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rbfemale.setBackground(Color.WHITE);
        rbfemale.setBounds(280,130,70,30);
        add(rbfemale);
        
        
        
        
        JLabel lbljob = new JLabel("JOB   :");
        lbljob.setBounds(60,180,120,30);
        lbljob.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lbljob);
        
        String str[]={"Chef", "Manager","Devops","farmer", "Cloud", "AWS","Software"};
        cbjob = new JComboBox(str);
        cbjob.setBounds(200,180,150,30);
        cbjob.setBackground(Color.WHITE);
        add(cbjob);
        
        JLabel lblsalary = new JLabel("SALARY   :");
        lblsalary.setBounds(60,230,120,30);
        lblsalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(200, 230, 150, 30);
        add(tfsalary);
        
        JLabel lblphone = new JLabel("PHONE   :");
        lblphone.setBounds(60,280,120,30);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200, 280, 150, 30);
        add(tfphone);
        
        JLabel lblmail = new JLabel("MAIL   :");
        lblmail.setBounds(60,330,120,30);
        lblmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(lblmail);
        
        tfmail = new JTextField();
        tfmail.setBounds(200, 330, 150, 30);
        add(tfmail);
        
        
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.DARK_GRAY);
        submit.setForeground(Color.WHITE);
        submit.setBounds(200,430,150,30);
        submit.addActionListener(this);
        add(submit);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        Image i2=i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image=new JLabel(i3);
        image.setBounds(380,60,450,370);
        
        add(image);
        
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(350,200,850,540);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
         String name = tfname.getText();
         String age = tfage.getText();
         String salary = tfsalary.getText();
          String phone = tfphone.getText();          
           String email = tfmail.getText();    
           
           ButtonGroup bg = new ButtonGroup();
           bg.add(rbmale);
           bg.add(rbfemale);
           
           
           String gender = null;
                    
                    if(rbmale.isSelected()){
                        gender = "Male";
                    
                    }else if(rbfemale.isSelected()){
                        gender = "Female";
                    }
                    
            String job = (String) cbjob.getSelectedItem();
            try {
                        Conn c = new Conn();
                        String str = "INSERT INTO employee values( '"+name+"','"+age+"', '"+gender+"','"+job+"', '"+salary+"', '"+phone+"', '"+email+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Employee Added Successfully");
                        setVisible(false);
                    
                    } catch (Exception e) {
                        e.printStackTrace();
        
                    }
                   }
    
     public  static void main(String[] args){
        new AddEmployee();
    }
    
}
