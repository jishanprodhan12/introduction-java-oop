
package com.mycompany.swing;

import javax.swing.*;
public class JOptionConfirm {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null,"do want a bike ","Gift bike",JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"You win R15");
        }
        else{
            JOptionPane.showMessageDialog(null,"YOu lost the chance");
        }
    }
}
