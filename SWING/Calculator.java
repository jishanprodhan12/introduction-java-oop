
/// finishing  yet need work

package com.mycompany.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends JFrame {
         Container c;
         JLabel l1;
         JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,beq,ba,bs,bdiv,bm,bc;
         JTextField t1;
         private Font f;
         static double result=0,a=0,b=0;
         static int operator =0;
            Calculator(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(450,50,340,350);
        setTitle("Calculator");
        setResizable(false);
        f=new Font("Arial",Font.BOLD,18);
        changeColor();
        setComponent();
            }
            public void changeColor(){
                c=this.getContentPane();
                c.setBackground(Color.WHITE);
               
            }
            public void setComponent(){
                b0=new JButton("0");
                b1=new JButton("1");
                b2=new JButton("2");
                b3=new JButton("3");
                b4=new JButton("4");
                b5=new JButton("5");
                b6=new JButton("6");
                b7=new JButton("7");
                b8=new JButton("8");
                b9=new JButton("9");
                beq=new JButton("=");
                beq.setFont(f);
                ba=new JButton("+");
                  ba.setFont(f);
                bs=new JButton("-");
                  bs.setFont(f);
                bdiv=new JButton("÷");
                  bdiv.setFont(f);
                bm=new JButton("*");
                  bm.setFont(f);
                bc=new JButton("<-");
                  bc.setFont(f);
                l1=new JLabel();
                t1=new JTextField();
                t1.setEditable(false);
                t1.setFont(f);
                 add(t1);
                 add(l1);
                add(b0);
                add(b1);
                add(b2);
                add(b3);  
                add(b4);
                add(b5);
                add(b6);
                b8.setBounds(90,90,60,40);
                b7.setBounds(160,90,60,40);
                bc.setBounds(240,90,60,40);
                b6.setBounds(20,140,60,40);
                b5.setBounds(90,140,60,40);
                b4.setBounds(160,140,60,40);
                bm.setBounds(240,140,60,40);
                 b3.setBounds(20,190,60,40);
                b2.setBounds(90,190,60,40);
                add(b7);
                add(b8);
                add(b9);
                add(beq);
                add(ba);  
                add(bs);
                add(bdiv);
                add(bm);
                add(bc);
                setLayout(null);
                t1.setBounds(15,20,300,60);
                b9.setBounds(20,90,60,40);
                b1.setBounds(160,190,60,40);
                ba.setBounds(240,190,60,40);
                b0.setBounds(20,240,60,40);
                beq.setBounds(90,240,60,40);
                bs.setBounds(160,240,60,40);
                bdiv.setBounds(240,240,60,40);
                b0.addActionListener(new Handler());
                b1.addActionListener(new Handler());
                b2.addActionListener(new Handler());
                b3.addActionListener(new Handler());
                b4.addActionListener(new Handler());
                b5.addActionListener(new Handler());
                b6.addActionListener(new Handler());
                b7.addActionListener(new Handler());
                b8.addActionListener(new Handler());
                b9.addActionListener(new Handler());
                ba.addActionListener(new Handler());
                beq.addActionListener(new Handler());
                bs.addActionListener(new Handler());
                bm.addActionListener(new Handler());
                bc.addActionListener(new Handler());
                bdiv.addActionListener(new Handler());
                
               


                
                
            }
            class Handler implements ActionListener{
                @Override
                public void actionPerformed(ActionEvent e){
                    
                    if(e.getSource()==b1){
                        t1.setText(t1.getText().concat("1"));
                    }
                    if(e.getSource()==b2){
                        t1.setText(t1.getText().concat("2"));
                    }
                    if(e.getSource()==b3){
                        t1.setText(t1.getText().concat("3"));
                    }
                    if(e.getSource()==b4){
                        t1.setText(t1.getText().concat("4"));
                    }
                                        if(e.getSource()==b5){
                        t1.setText(t1.getText().concat("5"));
                    }
                    if(e.getSource()==b5){
                        t1.setText(t1.getText().concat("5"));
                    }
                    if(e.getSource()==b6){
                        t1.setText(t1.getText().concat("6"));
                    }
                    if(e.getSource()==b7){
                        t1.setText(t1.getText().concat("7"));
                    }
                                        if(e.getSource()==b8){
                        t1.setText(t1.getText().concat("8"));
                    }
                    if(e.getSource()==b9){
                        t1.setText(t1.getText().concat("9"));
                    }
                    if(e.getSource()==b0){
                        t1.setText(t1.getText().concat("0"));
                    }
                      if(e.getSource()==bc){
                        
                        t1.setText("");
                    }     
                           if(e.getSource()==ba){
                               a=Double.parseDouble(t1.getText());
                               operator=1;
                               
                        t1.setText("");
                    }
                    if(e.getSource()==bs){
                    a=Double.parseDouble(t1.getText());

                        operator=2;
                        t1.setText("");                    }
                    if(e.getSource()==bm){
                        a=Double.parseDouble(t1.getText());
                        operator=3;
                         t1.setText("");
                    }
                    if(e.getSource()==bdiv){
                        a=Double.parseDouble(t1.getText());
                        operator=4;
                         t1.setText("");
                    }  
                  
                    
                    if(e.getSource()==beq){
                        b=Double.parseDouble(t1.getText());
                        switch (operator) {
                            case 1:
                                         result =a+b;
                                         
                                         System.out.println(a+" + "+b+" = "+result);
                                         break;
                            case 2:
                                    result =a-b;
                                     System.out.println(a+" - "+b+" = "+result);
                                     break;
                            case 3:
                                    result =a*b;
                                         
                                    System.out.println(a+" * "+b+" = "+result);
                                    break;
                            case 4:
                                    result =a/b;
                                         
                                    System.out.println(a+" ÷ "+b+" = "+result);
                                    break;
                            default:
                                JOptionPane.showMessageDialog(null,"i am still learning");
                                System.out.println("i am to still learning for make this better ");
                        }
                        t1.setText(""+result);
                        
                    }
                    
                }
            }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Install calculator");
       int choice =JOptionPane.showConfirmDialog(null,"do you want to open calculator","warning",JOptionPane.YES_OPTION);
       if(choice==JOptionPane.YES_OPTION) {
           Calculator jf=new Calculator();
        
        jf.setVisible(true);
       }
       else{
           System.out.println("you choice no option");
       }
             
    }
    
}
