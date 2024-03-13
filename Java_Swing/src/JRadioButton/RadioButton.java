/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JRadioButton;

import JFrame.JFrameDemo1;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author Niloy Sarker
 */
public class RadioButton extends JFrame {
    private Container c;
    private JRadioButton btn1,btn2;
    private ButtonGroup grp;
    private Font f;
    private JTextArea ta;
    RadioButton(){
        init_Compunenets();
    }
    
    public void init_Compunenets(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        f = new Font("Arial",Font.BOLD,18);
        grp = new ButtonGroup();
        
        btn1 = new JRadioButton("Male");
        btn1.setBounds(50, 50, 100, 50);
        btn1.setBackground(Color.orange);
        btn1.setFont(f);
        c.add(btn1);
        
        btn2 = new JRadioButton("FeMale");
        btn2.setBounds(160, 50, 100, 50);
        btn2.setBackground(Color.orange);
        btn2.setFont(f);
        c.add(btn2);
        
        grp.add(btn1);
        grp.add(btn2);
        
        ta = new JTextArea();
        ta.setBounds(50, 110, 300, 400);
        ta.setFont(f);
        c.add(ta);
        
        Handler handler = new Handler();
        btn1.addActionListener(handler);
        btn2.addActionListener(handler);
    }
    class Handler implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             if(e.getSource()== btn1)
             {
                 ta.setText("You have selected Male");
             }
             else
             {
                 ta.setText("You have selected FeMale");
             }
        }
        
    }
    
    public static void main(String[] args) {
        RadioButton frame = new RadioButton();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 650);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Frame Demo");
    }
}
