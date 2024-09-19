
package com.mycompany.swing;

import java.awt.*;
import javax.swing.*;

public class JLabelDemo extends JFrame {
    private Container c;
    private JLabel l1,l2;
    private Font f;
    JLabelDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(80,50,400,350);
        setTitle("JLabelDemo");
        c=this.getContentPane();
        c.setBackground(Color.ORANGE);
        this.setLayout(null);
        f=new Font("Arial",Font.BOLD,16);
        setComponent();
    }
    public void setComponent(){
        l1=new JLabel();
        l2=new JLabel("Enter password: ");
        l1.setText("Enter your username: ");
        l1.setBounds(30,50,200,50);
        l1.setFont(f);
        c.add(l1);
        l2.setBounds(30,100,200,50);
        l2.setFont(f);
        c.add(l2);
        l1.setOpaque(true);
        l2.setOpaque(true);
        l1.setBackground(Color.WHITE);
        l2.setBackground(Color.green);
        
        
    }
    
    
    public static void main(String[] args) {
        JLabelDemo jf=new JLabelDemo();
        jf.setVisible(true);
    }
    
}
