/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class newFrame extends JFrame {
    private Container c;
    private Font f;
    private JLabel userLabel;
    newFrame(){
        
        this.setBounds(100, 100, 450, 500);
        init_compunents();
    }
    
    public void init_compunents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        f = new Font("Arial",Font.BOLD,18);
        
         userLabel = new JLabel("Welcome to the new Frame");
         userLabel.setBounds(120,100, 200, 200);
         userLabel.setFont(f);
         c.add(userLabel);
    }
    
    public static void main(String[] args) {
        newFrame frame = new newFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBounds(100, 50, 500, 400);
        //frame.setSize(450, 500);
        //frame.setLocationRelativeTo(null);

        frame.setTitle("New Frame");
    }
}
