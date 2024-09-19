
package com.mycompany.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame{
    private Container c;
    private Cursor cursor;
    private JLabel l1,l2,l3;
    private JTextField t1;
    private JPasswordField pf1;
    private JButton blogin,bclear;
    private Font f,l1f;
    Project(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(50,50,400,350);
        this.setTitle("This is a login frame ");
        c=this.getContentPane();
        c.setBackground(Color.BLACK);
        f=new Font("Arial",Font.BOLD,14);
        l1f=new Font("Arial",Font.BOLD,18);
        cursor=new Cursor(Cursor.HAND_CURSOR);

        setComponent();
        
    }
    public void setComponent(){
        //set head Label
        
        l1=new JLabel();
        l1.setText("Hello World !");
        l1.setFont(l1f);
        l1.setForeground(Color.white);
        l1.setBounds(135,20,200,40);
        c.add(l1);
        //set userName label
        
                l2=new JLabel();
        l2.setText("username :");
        l2.setFont(f);
        l2.setForeground(Color.WHITE);
        l2.setBounds(20,70,100,40);
        c.add(l2);
        
        //set user textField
        
        t1=new JTextField();
        t1.setBackground(Color.WHITE);
        t1.setForeground(Color.BLACK);
        t1.setFont(f);
        t1.setHorizontalAlignment(JTextField.LEADING);
        t1.setBounds(130,70,200,40);
        c.add(t1);
        
        //set Password label
        
            l3=new JLabel();
        l3.setText("password :");
        l3.setFont(f);
        l3.setForeground(Color.WHITE);
        l3.setBounds(20,120,100,40);
        c.add(l3);
        //set passwordfield
        
        pf1=new JPasswordField();
        pf1.setBackground(Color.WHITE);
        pf1.setForeground(Color.BLACK);
        pf1.setFont(l1f);
        pf1.setHorizontalAlignment(JTextField.CENTER);
        pf1.setEchoChar('*');
        pf1.setBounds(130,120,200,40);
        c.add(pf1);
        //set Login button
       this.blogin=new JButton();
       this.blogin.setText("Login");
       blogin.setBackground(Color.darkGray);
        blogin.setForeground(Color.white);
        blogin.setFont(f);
        blogin.setHorizontalAlignment(JButton.CENTER);
        blogin.setBounds(230,180,90,50);
        c.add(blogin); 
        //set clear button
        this.bclear=new JButton();
        this.bclear.setText("Clear");
        bclear.setBackground(Color.darkGray);
        bclear.setForeground(Color.white);
        bclear.setFont(f);
        bclear.setCursor(cursor);
        bclear.setHorizontalAlignment(JButton.CENTER);
        bclear.setBounds(130,180,90,50);
        c.add(bclear);
        blogin.addActionListener(new LHandler());
        bclear.addActionListener(new CHandler());
    }

    class LHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String user= t1.getText();
            String pass=pf1.getText();
            if(user.equals("jishan")&&pass.equals("1141")){
                JOptionPane.showMessageDialog(null,"login successful","Hello World",-1);
      int choice =JOptionPane.showConfirmDialog(null,"do you want to open calculator","warning",JOptionPane.YES_OPTION);
        if(choice==JOptionPane.YES_OPTION) {
           Calculator cal=new Calculator();
                 cal.setVisible(true);
       }
       else{
           
           System.out.println("you choice no option");
       }
            }
            else{
                JOptionPane.showMessageDialog(null,"password did not match","Warning",JOptionPane.WARNING_MESSAGE);
                        }
        }
    }
    class CHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent c){
            t1.setText("");
            pf1.setText("");
        }
    }
    public static void main(String[] args) {
        //username jishan
        //password 1141
        JOptionPane.showMessageDialog(null,"username : jishan ");
        JOptionPane.showMessageDialog(null,"password : 1141");
        Project jf=new Project();
       
        jf.setVisible(true);
    }
}
