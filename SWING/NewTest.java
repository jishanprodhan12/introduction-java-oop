
package com.mycompany.swing;
import javax.swing.*;
import java.awt.*;
public class NewTest extends JFrame{
    private Container c;
    private Font f;
    NewTest(){
        inItComponent();
       
        this.c=this.getContentPane();
        c.setBackground(Color.red);
        c.setBounds(50,30,600,500);
        this.setTitle("fuck you");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(45,36,550,369);
        
    }
    public void inItComponent(){
        
    }
    public static void main(String[] args) {
        NewTest jf=new NewTest();
        JOptionPane.showMessageDialog(null,"it is make for example");

        jf.setVisible(true);
    }
}
