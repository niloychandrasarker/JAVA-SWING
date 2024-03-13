/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActionLisener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Niloy Sarker
 */
public class ActionLisenerDemo extends JFrame {

    private Container c;
    private JTextField tf1, tf2;

    ActionLisenerDemo() {
        initContainer();
    }

    public void initContainer() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 250, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 110, 250, 50);
        c.add(tf2);

        tf1.addActionListener((ActionEvent e) -> {
            String s = tf1.getText();

            if (s.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter anything");
            } else {
                JOptionPane.showMessageDialog(null, s);
            }
        });

        tf2.addActionListener((ActionEvent e) -> {
            String s = tf2.getText();

            if (s.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter anything");
            } else {
                JOptionPane.showMessageDialog(null, s);
            }
        });
    }

    public static void main(String[] args) {
        ActionLisenerDemo frame = new ActionLisenerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 450);
        frame.setLocationRelativeTo(null);
    }
}
