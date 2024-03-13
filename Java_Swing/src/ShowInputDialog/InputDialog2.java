/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShowInputDialog;

import javax.swing.JOptionPane;

/**
 *
 * @author Niloy Sarker
 */
public class InputDialog2 {
    public static void main(String[] args) {
        String f_name = JOptionPane.showInputDialog(null,"Enter Your first Name : ", "This is title", JOptionPane.PLAIN_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null,"Enter Your Name : ", "This is title", JOptionPane.PLAIN_MESSAGE);
        String name = f_name +" " + l_name;
        JOptionPane.showMessageDialog(null, "your Full name : ", name, -1);
    }
}
