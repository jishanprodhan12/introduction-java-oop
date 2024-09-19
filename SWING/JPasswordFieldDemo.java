
package com.mycompany.swing;

import javax.swing.*;
import java.awt.*;
public class JPasswordFieldDemo extends JFrame{
    private Container c;
    private Font f;
    private JPasswordField pf1;
    private JLabel l1,l2;
    private JTextField t1;
    private JButton login,clear;
    JPasswordFieldDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,400,500);
        this.setTitle("JPasswordField demo");
        this.setLayout(null);
        f=new Font("Arial",Font.BOLD,14);
        c = this.getContentPane();
        c.setBackground(Color.ORANGE);
        
        setCompontent();
    }
    public void setCompontent(){
        l1=new JLabel();
        l1.setText("Enter username: ");
        l1.setBounds(30,30,130,50);
        l1.setFont(f);
        c.add(l1);
        //set second jLabel
        l2=new JLabel();
        l2.setText("Enter Password : ");
        l2.setBounds(30,90,130,50);
        l2.setFont(f);
        c.add(l2);
        //add 1st textField
        t1=new JTextField();
        t1.setBackground(Color.white);
        t1.setForeground(Color.RED);
        t1.setFont(f);
        t1.setBounds(170,30,200,50);
        t1.setHorizontalAlignment(JTextField.CENTER);
        c.add(t1);
        //add JPasswordField
        Font pf=new Font("Arital",Font.BOLD,20);
        pf1=new JPasswordField();
        pf1.setBackground(Color.white);
        pf1.setForeground(Color.GREEN);
        pf1.setFont(pf);
        pf1.setBounds(170,90,200,50);
        pf1.setHorizontalAlignment(JTextField.CENTER);
        pf1.setEchoChar('*');
        c.add(pf1);
        //set JButton
        login=new JButton();
        login.setText("Log In");
        login.setFont(f);
        login.setBackground(Color.PINK);
        login.setBounds(100,180,80,50);
        c.add(login);
        //setClear
         clear=new JButton();
        clear.setText("Clear");
        clear.setFont(f);
        clear.setBackground(Color.PINK);
        clear.setBounds(210,180,80,50);
        c.add(clear);
        
    }
    public static void main(String[] args) {
        JPasswordFieldDemo jf=new JPasswordFieldDemo();
        jf.setVisible(true);
        
    }
}
