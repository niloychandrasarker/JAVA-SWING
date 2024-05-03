/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin_InterFace;


import java.awt.Color;

/**
 *
 * @author Niloy Sarker
 */
public class Admin_Interface extends javax.swing.JFrame {

    private AddPlacePanel addPlacePanel;
    private AddNewsPanel addNewsPanel;

    public Admin_Interface() {
        initComponents();
        
        addPlacePanel = new AddPlacePanel();
        addPlacePanel.setVisible(false);
        
        addNewsPanel = new AddNewsPanel();
        addNewsPanel.setVisible(false);
        
    
        
        getContentPane().add(addPlacePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 960, 740));
        getContentPane().add(addNewsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 960, 740));
        //getContentPane().add(findYourPlacePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 960, 740));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        homepanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        adnewspanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        addplacepanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        HomePagePanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1180, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(59, 70, 96));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/smart-city (2).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("I");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SMART CITY");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DASHBOARD");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8-search-26.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("I");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("I");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8-message-32.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8-notification-30.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel10.setText("Hello,Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 592, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(50, 50, 50)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 60));

        jPanel2.setBackground(new java.awt.Color(34, 38, 55));
        jPanel2.setLayout(null);

        homepanel.setBackground(new java.awt.Color(137, 44, 161));
        homepanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homepanelMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel11.setText("  Home Page");

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(homepanel);
        homepanel.setBounds(0, 20, 230, 50);

        jPanel5.setBackground(new java.awt.Color(137, 44, 161));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel13.setText("  Home Page");

        jPanel6.setBackground(new java.awt.Color(137, 44, 161));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel14.setText("  Home Page");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 20, 230, 50);

        adnewspanel.setBackground(new java.awt.Color(34, 38, 55));
        adnewspanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adnewspanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adnewspanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adnewspanelMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8-news-26.png"))); // NOI18N
        jLabel12.setText("  Add News");

        javax.swing.GroupLayout adnewspanelLayout = new javax.swing.GroupLayout(adnewspanel);
        adnewspanel.setLayout(adnewspanelLayout);
        adnewspanelLayout.setHorizontalGroup(
            adnewspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adnewspanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        adnewspanelLayout.setVerticalGroup(
            adnewspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adnewspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(adnewspanel);
        adnewspanel.setBounds(0, 70, 230, 50);

        addplacepanel.setBackground(new java.awt.Color(34, 38, 55));
        addplacepanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addplacepanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addplacepanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addplacepanelMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8-news-26.png"))); // NOI18N
        jLabel15.setText("  Add  Place");

        javax.swing.GroupLayout addplacepanelLayout = new javax.swing.GroupLayout(addplacepanel);
        addplacepanel.setLayout(addplacepanelLayout);
        addplacepanelLayout.setHorizontalGroup(
            addplacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addplacepanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        addplacepanelLayout.setVerticalGroup(
            addplacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addplacepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(addplacepanel);
        addplacepanel.setBounds(0, 120, 230, 50);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 740));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/City Travel Vedio Intro Youtube (1).png"))); // NOI18N

        javax.swing.GroupLayout HomePagePanelLayout = new javax.swing.GroupLayout(HomePagePanel);
        HomePagePanel.setLayout(HomePagePanelLayout);
        HomePagePanelLayout.setHorizontalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomePagePanelLayout.setVerticalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(HomePagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 960, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adnewspanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adnewspanelMouseEntered
        adnewspanel.setBackground(new Color(0, 0, 0)); 
    }//GEN-LAST:event_adnewspanelMouseEntered

    private void adnewspanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adnewspanelMouseExited
        adnewspanel.setBackground(new Color(34,38,55));
    }//GEN-LAST:event_adnewspanelMouseExited

    private void addplacepanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addplacepanelMouseClicked
         HomePagePanel.setVisible(false);
         addNewsPanel.setVisible(false);
         addPlacePanel.setVisible(true);
    }//GEN-LAST:event_addplacepanelMouseClicked

    private void addplacepanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addplacepanelMouseEntered
        addplacepanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_addplacepanelMouseEntered

    private void addplacepanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addplacepanelMouseExited
        addplacepanel.setBackground(new Color(34,38,55));
    }//GEN-LAST:event_addplacepanelMouseExited

    private void homepanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepanelMouseClicked
         HomePagePanel.setVisible(true);
         addNewsPanel.setVisible(false);
         addPlacePanel.setVisible(false);
    }//GEN-LAST:event_homepanelMouseClicked

    private void adnewspanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adnewspanelMouseClicked
             HomePagePanel.setVisible(false);
             addPlacePanel.setVisible(false);
             addNewsPanel.setVisible(true);
             
    }//GEN-LAST:event_adnewspanelMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePagePanel;
    private javax.swing.JPanel addplacepanel;
    private javax.swing.JPanel adnewspanel;
    private javax.swing.JPanel homepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}