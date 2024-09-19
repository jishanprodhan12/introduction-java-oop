//dialog
//showMessageDialog(4pera);
package com.mycompany.swing;
import javax.swing.*;
public class MessageDialog4pera {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"body of no icon","title of no icon",-1);
        JOptionPane.showMessageDialog(null,"body of error icon","Error",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"body of Information icon","information",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Body of Warning ","Warning ",2);
        JOptionPane.showMessageDialog(null,"body of Question icon","question",JOptionPane.QUESTION_MESSAGE);
   //ImageIcon img=new ImageIcon("source and extention");
   // JOptionPane.showMessageDialog(null,"body of no icon","title of no icon",-1,img);
    
    }
}
