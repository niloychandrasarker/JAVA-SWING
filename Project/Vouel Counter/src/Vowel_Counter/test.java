/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vowel_Counter;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Niloy Sarker
 */
public class test extends JFrame {
    private Container c;
    private Font f;
    private JLabel promtLAbel ,vowelLabel, aLabel, eLabel, iLabel, oLabel, uLabel;
    private JTextArea  inputTextarea;
    private JScrollPane scroll;
    
    int totalVowel = 0;
    int letter_a = 0;
    int letter_e = 0;
    int letter_i = 0;
    int letter_o = 0;
    int letter_u = 0;
    
    test(){
        init_Compunenents();
    }
    
    public void init_Compunenents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);
        f = new Font("Arial",Font.BOLD,18);
        
        promtLAbel = new JLabel("Enter The Text :");
        promtLAbel.setBounds(20, 30, 150, 30);
        promtLAbel.setForeground(Color.white);
        promtLAbel.setFont(f);
        c.add(promtLAbel);
        
        inputTextarea = new JTextArea();
        inputTextarea.setLineWrap(true);
        inputTextarea.setWrapStyleWord(true);
        inputTextarea.setFont(f);
        
        scroll = new JScrollPane(inputTextarea);
        scroll.setBounds(180, 30, 650, 180);
        c.add(scroll);
        
        vowelLabel = new JLabel("");
        vowelLabel.setBounds(180, 230, 250, 30);
        vowelLabel.setFont(f);
        vowelLabel.setForeground(Color.white);
        c.add(vowelLabel);
        
        aLabel = new JLabel("");
        aLabel.setBounds(180, 270, 150, 30);
        aLabel.setFont(f);
        aLabel.setForeground(Color.white);
        c.add(aLabel);
        
        eLabel = new JLabel("");
        eLabel.setBounds(180, 310, 150, 30);
        eLabel.setForeground(Color.white);
        eLabel.setFont(f);
        c.add(eLabel);
        
        iLabel = new JLabel("");
        iLabel.setBounds(180, 350, 150, 30);
        iLabel.setForeground(Color.white);
        iLabel.setFont(f);
        c.add(iLabel);
        
        oLabel = new JLabel("");
        oLabel.setBounds(180, 390, 150, 30);
        oLabel.setForeground(Color.white);
        oLabel.setFont(f);
        c.add(oLabel);
        
        uLabel = new JLabel("");
        uLabel.setBounds(180, 440, 150, 30);
        uLabel.setForeground(Color.white);
        uLabel.setFont(f);
        c.add(uLabel);
        
        inputTextarea.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
              
            }

            @Override
            public void keyPressed(KeyEvent e) {
               if(e.getSource() == inputTextarea){
                   if(e.VK_A == e.getKeyCode()){
                       letter_a++;
                       totalVowel++;      
                   }
                   if(e.VK_E == e.getKeyCode()){
                       letter_e++;
                       totalVowel++;      
                   }
                   if(e.VK_I == e.getKeyCode()){
                       letter_i++;
                       totalVowel++;      
                   }
                   if(e.VK_O == e.getKeyCode()){
                       letter_o++;
                       totalVowel++;      
                   }
                   if(e.VK_U == e.getKeyCode()){
                       letter_u++;
                       totalVowel++;      
                   }
               }
               vowelLabel.setText("Total Number of Vowel = "+ totalVowel );
               aLabel.setText("A = "+ letter_a );
               eLabel.setText("E = "+ letter_e );
               iLabel.setText("I  = "+ letter_i );
               oLabel.setText("O = "+ letter_o );
               uLabel.setText("U = "+ letter_u );
               
            }

            @Override
            public void keyReleased(KeyEvent e) {
               
            }
        
        });
    }
    public static void main(String[] args) {
         test frame = new test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBounds(100, 50, 500, 400);
        frame.setSize(900, 700);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Vowel Counter");
    }
}
