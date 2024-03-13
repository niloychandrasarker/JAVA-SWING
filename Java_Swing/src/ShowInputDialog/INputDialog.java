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
public class INputDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name : ");
        JOptionPane.showMessageDialog(null, name + " Welcome to Java Swing");
    }
}
