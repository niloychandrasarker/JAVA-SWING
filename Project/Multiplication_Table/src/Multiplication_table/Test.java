/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Niloy Sarker
 */
package Multiplication_table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame {
    private Container c;
    private JLabel imgLabel,textLabel;
    private JTextField tf;
    private JTextArea ta;
    private JButton clearBtn;
    private ImageIcon img,img2;  
    private Font f;
    private Cursor cursor;
    
 
    Test(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f = new Font("Tahoma",Font.BOLD,20);
        img = new ImageIcon(getClass().getResource("mul.jpg"));
        img2 = new ImageIcon(getClass().getResource("clear.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(20, 10, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);
        
        textLabel = new JLabel("Enter Any Number : ");
        textLabel.setBounds(20, 220, 250, 50);
        textLabel.setForeground(Color.MAGENTA);
        textLabel.setFont(f);
        c.add(textLabel);
        
        tf = new JTextField();
        tf.setBounds(230, 220, 110, 50);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.GREEN);
        tf.setFont(f);
        c.add(tf);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        clearBtn = new JButton("Clear");
        clearBtn.setCursor(cursor);
        clearBtn.setBounds(230, 285, 110, 50);
        clearBtn.setBackground(Color.GREEN);
        clearBtn.setFont(f);
        c.add(clearBtn);
        
        ta = new JTextArea();
        ta.setBounds(20, 350, 320, 300);
        ta.setBackground(Color.green);
        ta.setFont(f);
        c.add(ta);
        
        tf.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String value = tf.getText();
                if(value.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please,Enter a Number");
                }
                else{
                     ta.setText("");
                    int num = Integer.parseInt(tf.getText());
                    
                    for(int i=1 ; i<=10 ; i++){
                        int result = num * i;
                        
                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String incr = String.valueOf(i);
                        
                        ta.append(n + " X " + incr + " = " + r + "\n");
                        
                    }
                }
               
            }
            
        });
        
        clearBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               ta.setText("");
            }
        });
        
    }
    public static void main(String[] args) {
        
        
         Test frame = new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 30, 380, 700);
        
        //frame.setSize(450, 500);
        //frame.setLocationRelativeTo(null);
        frame.setTitle("Multiplication Table");
    }
}
