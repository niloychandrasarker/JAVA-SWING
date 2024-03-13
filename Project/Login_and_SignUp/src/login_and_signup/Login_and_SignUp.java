
package login_and_signup;

import javax.swing.JFrame;

public class Login_and_SignUp {

 
    public static void main(String[] args) {
       Login LoginFrame = new Login();
       LoginFrame.setVisible(true);
       LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       LoginFrame.setTitle("Login");
       LoginFrame.pack();
       LoginFrame.setLocationRelativeTo(null);
    }
    
}
