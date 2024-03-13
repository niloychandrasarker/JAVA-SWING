
package ShowMessageDialog;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MessageDialog1 {
     public static void main(String[] args) {
         ImageIcon img = new ImageIcon("tik.jpeg");
        JOptionPane.showMessageDialog(null,"Wrong Password","Warning",JOptionPane.PLAIN_MESSAGE,img);
    }
}
