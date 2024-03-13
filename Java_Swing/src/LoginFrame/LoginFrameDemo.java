
package LoginFrame;

import TextFieldDemo.TextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrameDemo extends JFrame {
    private Container c;
    private JLabel userLabel,passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton,clearButton;
    private Font f;
    private ImageIcon img1,img2;
    LoginFrameDemo(){
        init_compunents();
    }
    
    public void init_compunents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        f = new Font("Arial",Font.BOLD,18);
        
        img1 = new ImageIcon(getClass().getResource("login.jpeg"));
        img2 = new ImageIcon(getClass().getResource("clear.jpeg"));
        
        userLabel = new JLabel("Username : ");
        userLabel.setBounds(50, 80, 150, 50);
        userLabel.setFont(f);
        c.add(userLabel);
        
        tf = new JTextField();
        tf.setBounds(170, 80, 200, 50);
        tf.setFont(f);
        c.add(tf);
        
        passLabel = new JLabel("Password : ");
        passLabel.setBounds(50, 150, 150, 50);
        passLabel.setFont(f);
        c.add(passLabel);
        
        pf = new JPasswordField();
        pf.setBounds(170, 150, 200, 50);
        pf.setFont(f);
        c.add(pf);
        
        loginButton = new JButton(img1);
        loginButton.setBounds(170, 210, 90, 44);
        loginButton.setFont(f);
        c.add(loginButton);
        
        clearButton = new JButton(img2);
        clearButton.setBounds(280, 210, 90, 40);
        clearButton.setFont(f);
        c.add(clearButton);
        
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                pf.setText("");
            }
        });
        
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String userName = tf.getText();
                String password = pf.getText();
                
                if(userName.equals("Niloy Sarker") && password.equals("123456"))
                {
                    JOptionPane.showMessageDialog(null, "You  are Succesfully  Login");
                    newFrame frame = new newFrame();
                    //frame.setSize(450, 500);
                    frame.setVisible(true);
                    //frame.setLocationRelativeTo(null);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            }
        });
    }
    public static void main(String[] args) {
        LoginFrameDemo frame = new LoginFrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBounds(100, 50, 500, 400);
        frame.setSize(450, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Login Frame");
    }
}
