/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_and_signup;

import javax.swing.JFrame;

/**
 *
 * @author Niloy Sarker
 */
public class Main {
         public static void main(String[] args) {
       Login LoginFrame = new Login();
       LoginFrame.setVisible(true);
       LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       LoginFrame.setTitle("Login");
       LoginFrame.pack();
       LoginFrame.setLocationRelativeTo(null);
    }
}
