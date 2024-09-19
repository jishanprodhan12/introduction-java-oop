
package com.mycompany.swing;
import javax.swing.*;
import java.awt.*;

public class containerColor extends JFrame {
            Container c;
            containerColor(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,50,400,350);
        setTitle("dome of change background");
        changeColor();
            }
            public void changeColor(){
                c=this.getContentPane();
                c.setBackground(Color.blue);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setTitle("Hello world");
            }
    public static void main(String[] args) {
        containerColor jf=new containerColor();
        jf.setVisible(true);
        
        
        
        
    }
}
