import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Division extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1;
    public Division(){}
    public Division(String s) {
        super(s);
    }
    public void setComponent(){
        l1=new JLabel("division two number");
        l2=new JLabel("enter first number ");
        t1=new JTextField();
        l3=new JLabel("enter second number ");
        t2=new JTextField();
        b1=new JButton("division");
        l4=new JLabel();
        t3=new JTextField();
        
        l1.setBounds(130,30,200,60);
        l2.setBounds(50,90,200,20);
        t1.setBounds(200,90,100,20);
        l3.setBounds(50,120,200,20);
        t2.setBounds(200,120,100,20);
        b1.setBounds(125,160,80,30);
        l4.setBounds(100,200,300,50);
        setLayout(null);
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);
        add(t3);
        b1.addActionListener(new Handler());
        
    }
    class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            float a=Float.parseFloat(t1.getText());
            float b=Float.parseFloat(t2.getText());
            float c = a/b;
            
            l4.setText("Division is :  "+c);
           
            
        }
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Division number's ","division",01);
        Division jf=new Division("welcome to java swing");
        jf.setVisible(true);
        jf.setSize(350,300);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setComponent();
        
    }
    
}
