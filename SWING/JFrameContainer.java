package com.mycompany.swing;
import javax.swing.*;
public class JFrameContainer {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(200,40,400,300);
        //jf.setSize(400,300);
        //jf.setLocation(200,40);
        //jf.setLocationRelativeTo(null);
        jf.setTitle("container demo");
        jf.setResizable(false);
        
    }
}
