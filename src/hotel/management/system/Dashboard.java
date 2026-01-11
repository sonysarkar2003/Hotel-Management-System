
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    Dashboard(){
        setBounds(0,0,1550,1000);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);
             
        JLabel text =new JLabel ("The Sony Group Welcomes you");
        text.setBounds(400,80,1000,50);
        text.setFont (new Font("tahoma",Font.PLAIN,46));
        text.setForeground(Color.WHITE);
        image.add(text);
        setVisible(true);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        
        JMenu hotel =new JMenu("Hotel Management");
        hotel.setForeground(Color.RED);
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("Reception");
        reception.addActionListener(this);
        hotel.add(reception);
        
        
        
        JMenu admin =new JMenu("ADMIN");
        hotel.setForeground(Color.RED);
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        addemployee.addActionListener(this);
        admin.add(addemployee);
        
        JMenuItem addrooms = new JMenuItem("ADD ROOMS");
        addrooms.addActionListener(this);
        admin.add(addrooms);
        JMenuItem adddrivers = new JMenuItem("ADD DRIVERS");
        adddrivers.addActionListener(this);
        admin.add(adddrivers);
        
    }
    public void  actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("ADD EMPLOYEE")){
        new AddEmployee();
    } else if(ae.getActionCommand().equals("ADD ROOMS")){
        new AddRooms();
        } else if(ae.getActionCommand().equals("ADD DRIVERS")){
        new AddDriver();
    }else if(ae.getActionCommand().equals("Reception")){
     new Reception();
    }
    }
    public static void main(String[] args){
        new Dashboard();
        
    }
    
}

