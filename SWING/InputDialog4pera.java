
package swing;
import javax.swing.*;
public class InputDialog4pera {
    public static void main(String[] args) {
        String f_name=JOptionPane.showInputDialog("Enter your first name ");
        String l_name=JOptionPane.showInputDialog("Enter your last name ");
        String name =f_name+" "+l_name;
        JOptionPane.showMessageDialog(null,"your full name is : "+name);
    }
}
