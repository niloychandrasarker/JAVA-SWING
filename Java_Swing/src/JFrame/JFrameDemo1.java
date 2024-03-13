/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Niloy Sarker
 */
public class JFrameDemo1 extends JFrame {
    
    private ImageIcon icon;
    private Container  c;
    private JLabel userLabel,userPass;
    private Font f;
    private JLabel imgLabel;
    private ImageIcon img;
    JFrameDemo1(){
        initCompunent();
    }
    
    public void initCompunent(){
        icon = new ImageIcon(getClass().getResource("tik.jpg"));
        this.setIconImage(icon.getImage());
        f = new Font("Arial",Font.BOLD,15);
        
        img = new ImageIcon(getClass().getResource("img.jpg"));
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        userLabel = new JLabel();
        userLabel.setText("Enter your Username  : ");
        userLabel.setBounds(50, 50, 200, 20);
        userLabel.setFont(f);
        userLabel.setForeground(Color.red);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.white);
        c.add(userLabel);
        
        userPass = new JLabel("Enter your Password : ");
        userPass.setBounds(50, 100, 200, 20);
        userPass.setFont(f);
        userPass.setOpaque(true);
        userPass.setBackground(Color.white);
        c.add(userPass);
        
        imgLabel = new JLabel(img);
        imgLabel.setBounds(50, 130, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);
    }
    public static void main(String[] args) {
        JFrameDemo1 frame = new JFrameDemo1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 450);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Frame Demo");
    }
}
