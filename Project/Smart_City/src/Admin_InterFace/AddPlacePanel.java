/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Admin_InterFace;

import Jdbc_Connection.Dbconection;
import User_Login_and_Registration.RegistrationForm;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Niloy Sarker
 */
public class AddPlacePanel extends javax.swing.JPanel {

    String Path;
    File f;

    public AddPlacePanel() {
        initComponents();
        AddPlaceDetailsTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    e.consume(); // Prevents the default behavior of the Enter key in JTextArea

                    AddPlaceDetailsTextArea.append("\n");
                }
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DistricktComboBox = new javax.swing.JComboBox<>();
        UpazilaComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CategoryCombobox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        AddPlaxeTextFiels = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ImageUpBtn = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddPlaceDetailsTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        AddMapLinkField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(202, 229, 232));
        setPreferredSize(new java.awt.Dimension(960, 740));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Add Place");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("District : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Upazila : ");

        DistricktComboBox.setBackground(new java.awt.Color(255, 255, 255));
        DistricktComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DistricktComboBox.setForeground(new java.awt.Color(0, 0, 0));
        DistricktComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Netrokona ", " " }));

        UpazilaComboBox.setBackground(new java.awt.Color(255, 255, 255));
        UpazilaComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UpazilaComboBox.setForeground(new java.awt.Color(0, 0, 0));
        UpazilaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Netrokona Sadar", "Kendua", "Madan", "Atpara", "Khaliajuri", "Purbadhala", "Barhatta", "Durgapur", "Kalmakanda", "Mohonganj", " ", " ", " " }));
        UpazilaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpazilaComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Category : ");

        CategoryCombobox.setBackground(new java.awt.Color(255, 255, 255));
        CategoryCombobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CategoryCombobox.setForeground(new java.awt.Color(0, 0, 0));
        CategoryCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Education", "Healcare", "Buisness", "Tourist Spot", "Masque", "Tample", "ATM", " ", " ", " " }));
        CategoryCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryComboboxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Add Place :");

        AddPlaxeTextFiels.setBackground(new java.awt.Color(255, 255, 255));
        AddPlaxeTextFiels.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddPlaxeTextFiels.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Add PlaceDetails  :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Add Image  :");

        ImageUpBtn.setBackground(new java.awt.Color(51, 51, 255));
        ImageUpBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ImageUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        ImageUpBtn.setText("Upload");
        ImageUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageUpBtnActionPerformed(evt);
            }
        });

        imageLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SubmitBtn.setBackground(new java.awt.Color(51, 51, 255));
        SubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        AddPlaceDetailsTextArea.setBackground(new java.awt.Color(255, 255, 255));
        AddPlaceDetailsTextArea.setColumns(20);
        AddPlaceDetailsTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddPlaceDetailsTextArea.setForeground(new java.awt.Color(0, 0, 0));
        AddPlaceDetailsTextArea.setRows(5);
        jScrollPane1.setViewportView(AddPlaceDetailsTextArea);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Add Map :");

        AddMapLinkField.setBackground(new java.awt.Color(255, 255, 255));
        AddMapLinkField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddMapLinkField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ImageUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DistricktComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpazilaComboBox, 0, 509, Short.MAX_VALUE)
                            .addComponent(CategoryCombobox, 0, 509, Short.MAX_VALUE)
                            .addComponent(AddPlaxeTextFiels)
                            .addComponent(jScrollPane1)
                            .addComponent(AddMapLinkField))))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(426, 426, 426))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DistricktComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpazilaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoryCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddPlaxeTextFiels, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddMapLinkField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImageUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UpazilaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpazilaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpazilaComboBoxActionPerformed

    private void CategoryComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryComboboxActionPerformed

    private void ImageUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageUpBtnActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(null);
         f = jf.getSelectedFile();
        Path = f.getAbsolutePath();
        try {
            BufferedImage bi = ImageIO.read(new File(Path));
            Image img = bi.getScaledInstance(220, 170, Image.SCALE_SMOOTH);
            ImageIcon ii = new ImageIcon(img);
            imageLabel.setText("");
            imageLabel.setIcon(ii);
        } catch (IOException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImageUpBtnActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        String District, Upazila, Category, AddPlace, AddPlaceDetails, AddMapLink;
    try {
        Connection con = Dbconection.getConnection();
        Statement st = con.createStatement();

        District = (String) DistricktComboBox.getSelectedItem();
        Upazila = (String) UpazilaComboBox.getSelectedItem();
        Category = (String) CategoryCombobox.getSelectedItem();
        AddPlace = AddPlaxeTextFiels.getText();
        AddPlaceDetails = AddPlaceDetailsTextArea.getText();
        AddMapLink = AddMapLinkField.getText();

        // Assuming Path is already defined as the path of the selected image file
        InputStream imgSelected = new FileInputStream(new File(Path));
         byte[] fileData = new byte[(int) f.length()];
            imgSelected.read(fileData);

        String query = "INSERT INTO place_info(District, Upazila, Category, AddPlace, AddPlaceDetails, AddMapLink, Image) "
                     + "VALUES('" + District + "', '" + Upazila + "', '" + Category + "', '" + AddPlace + "', '" + AddPlaceDetails + "', '" + AddMapLink + "', '" + imgSelected + "')";

        st.execute(query);

        AddPlaxeTextFiels.setText("");
        AddPlaceDetailsTextArea.setText("");
        AddMapLinkField.setText("");

        JOptionPane.showMessageDialog(null, "Place has been added successfully!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_SubmitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddMapLinkField;
    private javax.swing.JTextArea AddPlaceDetailsTextArea;
    private javax.swing.JTextField AddPlaxeTextFiels;
    private javax.swing.JComboBox<String> CategoryCombobox;
    private javax.swing.JComboBox<String> DistricktComboBox;
    private javax.swing.JButton ImageUpBtn;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JComboBox<String> UpazilaComboBox;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
