
package com.mycompany.swing;
import javax.swing.*;
import java.awt.*;
public class JTextFieldDemo extends JFrame{
        private JTextField t1,t2;
        private Container c;
        private Font f;
    public JTextFieldDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,60,300,350);
        this.setLayout(null);
        c=this.getContentPane();
        c.setBackground(Color.ORANGE);
        f=new Font("Arial",Font.BOLD,12);
        this.setTitle("JTextField");
        
        setComponent();
    }
    public void setComponent(){
        t1=new JTextField();
        t1.setBackground(Color.GREEN);
        t1.setForeground(Color.red);
        t1.setFont(f);
        t1.setBounds(50,50,200,50);
        t1.setHorizontalAlignment(JTextField.CENTER);
        c.add(t1);
        t2=new JTextField();
        t2.setBackground(Color.MAGENTA);
        t2.setForeground(Color.blue);
        t2.setFont(f);
        t2.setBounds(50,110,200,50);
        t2.setHorizontalAlignment(JTextField.RIGHT);
        c.add(t2);
        
    }
    public static void main(String[] args) {
        JTextFieldDemo jf=new JTextFieldDemo();
        jf.setVisible(true);
    }
}
    