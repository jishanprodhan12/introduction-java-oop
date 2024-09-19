	import javax.swing.*;
        import java.awt.event.*;
	public class Addition extends JFrame{
		public JLabel l1,l2,l3,l4;
		public JTextField t1,t2;
		public JButton b1;
                Addition(){}
		Addition(String s){
			super(s);
		}
		public void setComponent(){
			l1=new JLabel("Addition of two number ");
			l2=new JLabel("Enter first number ");
			t1=new JTextField();
			l3=new JLabel("Enter Second number ");
			t2=new JTextField();
			b1=new JButton("add");
			l4=new JLabel();
			setLayout(null);
			
                        l1.setBounds(130,30,200,60);
			l2.setBounds(50,90,200,20);
			t1.setBounds(200,90,100,20);
			l3.setBounds(50,120,200,20);
			t2.setBounds(200,120,100,20);
			b1.setBounds(125,160,80,30);
                        l4.setBounds(100,200,250,50);
                        b1.addActionListener(new Handler());
			add(l1);
			add(l2);
			add(t1);
			add(l3);
			add(t2);
			add(b1);
			add(l4);
		}
        class Handler implements ActionListener{
                @Override
                public void actionPerformed(ActionEvent e){
                float a=Float.parseFloat(t1.getText());
                float b=Float.parseFloat(t2.getText());
                float c = a+b;
                     l4.setText("result is : "+c);
                }
        }
		        
		public static void main(String[] args){
			Addition jf=new Addition("My first JFrame");
			jf.setVisible(true);
			jf.setSize(400,350);
			jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jf.setComponent();
			
		}
	}