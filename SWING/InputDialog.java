
package swing ; 
import javax.swing.*;
public class InputDialog {
    public static void main(String[] args) {
      String name = JOptionPane.showInputDialog(null,"Enter your name ");
      JOptionPane.showMessageDialog(null, name+" Welcome to Dialog Class ");
    }
}
