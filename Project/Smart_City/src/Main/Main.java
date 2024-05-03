/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import User_Login_and_Registration.Login_and_Registration;

public class Main {
public static void main(String[] args) {
        // Create an instance of Admin_User_Login
        Login_and_Registration login_and_Registration = new Login_and_Registration();

        // Set properties for the JFrame
        login_and_Registration.setVisible(true);
        login_and_Registration.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        login_and_Registration.setTitle("Smart City");
        login_and_Registration.pack();
        login_and_Registration.setLocationRelativeTo(null);
        
    }
            
}
