
package TextFieldDemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class TextField extends JFrame {
    private Container c;
    private  JTextField tf1,tf2;
    TextField(){
        initCompunenets();
    }
    
    public void initCompunenets(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        c.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(50, 110, 200, 50);
        c.add(tf2);
    }
    public static void main(String[] args) {
        
        TextField frame = new TextField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBounds(100, 50, 500, 400);
        frame.setSize(600, 450);
        frame.setLocationRelativeTo(null);
        frame.setTitle("TextField");
    }
}
