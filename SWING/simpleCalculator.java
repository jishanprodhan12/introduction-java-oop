
package com.mycompany.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simpleCalculator implements ActionListener {
    private Container c;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdec,badd,bsub,bmul,bdiv,bcal,beq,bdel;
    private JTextField t;
    private Font f,f2;
    simpleCalculator(){
        JFrame jf=new JFrame();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(450,50,300,360);
        jf.setLayout(null);
        jf.setTitle("Calculator");
        c=new Container();
        c=jf.getContentPane();
        c.setBackground(Color.black);
        f=new Font("Arial",Font.TYPE1_FONT,16);
        f2=new Font("Times new Roman",Font.BOLD,20);
        
        // set text field
        t=new JTextField();
        t.setBackground(Color.LIGHT_GRAY);
        t.setForeground(Color.black);
        t.setFont(f);
        t.setBorder(null);
        t.setEditable(false);
        t.setBounds(10,20,270,40);
        c.add(t);
        
        
        //set number buttons
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdec=new JButton(".");
        badd=new JButton("+");
        bsub=new JButton("-");
        bmul=new JButton("*");
        bdiv=new JButton("÷");
        bdel=new JButton("<-");
        bcal=new JButton("C");
        beq=new JButton("=");

        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
     public static void main(String[] args) {
        simpleCalculator calculator=new simpleCalculator();
    }


    
}
