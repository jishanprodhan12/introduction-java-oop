
package com.mycompany.swing;
import java.awt.*;
import javax.swing.*;
public class IconChangeJFrame extends JFrame {
    private ImageIcon icon;
    private Container c;
    IconChangeJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setBounds(200,50,400,350);
        setTitle("change Icon demo");
      //  userDefindMethod();
        
    }
    public void  userDefindMethod(){
        c=this.getContentPane();
        c.setBackground(Color.yellow);
        icon=new ImageIcon(getClass().getResource("logo.jpg"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {
        IconChangeJFrame obj=new IconChangeJFrame();
        obj.setVisible(true);
        obj.userDefindMethod();
    }
}
