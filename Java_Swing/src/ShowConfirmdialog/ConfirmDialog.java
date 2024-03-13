/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShowConfirmdialog;

import javax.swing.JOptionPane;

/**
 *
 * @author Niloy Sarker
 */
public class ConfirmDialog {
    public static void main(String[] args) {
        int ch = JOptionPane.showConfirmDialog(null, "DO you want to Quit this programme", "Quit",JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(ch == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "you have cliked no option");
        }
    }
}
