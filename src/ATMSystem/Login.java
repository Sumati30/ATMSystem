package ATMSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton signup,clear,login;
  
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
//          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
//          Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//          ImageIcon i3 = new ImageIcon(i2);
//          JLabel l11 = new JLabel(i3);
//          l11.setBounds(70, 10, 100, 100);
//          add(l11);
        
        URL url = ClassLoader.getSystemResource("/icons/logo.jpg");
        System.out.println("URL: " + url);

        if (url == null) {
            System.out.println("Resource not found!");
        }
        
        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200,40,450,40);
        add(l1);
        
        l2 = new JLabel("Card No:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(125,150,375,30);
        add(l2);
        
        tf1 = new JTextField(15);
        tf1.setBounds(300,150,230,30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);
        
        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setBounds(125,220,375,30);
        add(l3);
        
        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,220,230,30);
        add(pf2);
                
        signup = new JButton("SIGN IN");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        
        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        
        login = new JButton("SIGN UP");
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        
        setLayout(null);
        
        signup.setFont(new Font("Arial", Font.BOLD, 14));
        signup.setBounds(300,300,100,30);
        add(signup);
        
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBounds(430,300,100,30);
        add(clear);
        
        login.setFont(new Font("Arial", Font.BOLD, 14));
        login.setBounds(300,350,230,30);
        add(login);
        
        signup.addActionListener(this);
       clear.addActionListener(this);
        login.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        try{        
            if(ae.getSource() == signup){
                //Conn c1 = new Conn();
                String cardno  = tf1.getText();
                String pin  = pf2.getText();
                String q  = "select * from login where cardno = '"+cardno+"' and pin = '"+pin+"'";

                //ResultSet rs = c1.s.executeQuery(q);
//                if(rs.next()){
//                    setVisible(false);
//                    new Transactions(pin).setVisible(true);
//                }else{
//                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
//                }
            }else if(ae.getSource() == clear){
                tf1.setText("");
                pf2.setText("");
            }else if(ae.getSource()== login){
                setVisible(false);
               // new Signup().setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Login().setVisible(true);
    }

    
}
