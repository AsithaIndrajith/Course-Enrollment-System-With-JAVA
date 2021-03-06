/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Asitha
 */
public class EnrollementSystemHome extends javax.swing.JFrame {
    
    /**
     * Creates new form EnrollementSystemHome
     */
    public static EnrollementSystemHome hm; //create main page form object
    public static UndergraduateLogin unLogin; //create undergraduate login form object
    public static PostgraduateLogin postLogin; //create postgraduate login form object
    public static InstructorLogin insLogin;//create instructor login form object
    public static AdministratorLogin adminLogin;//create administrator login form object
    public static LecturerLogin lecLogin; //create lecturer login form object
    public static CalendarAdjustDateAndTime cal; //create calendar login form object
    public static ChooseStudentType chooseStudentType; //create choose student type form login object
    
    public static String depid; //create department id string to hold department id of the particular user
    
    
    public EnrollementSystemHome() throws InterruptedException {
        initComponents();
        this.loadCalendar();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        sidePanelLbl = new javax.swing.JLabel();
        lecturerLbl = new javax.swing.JLabel();
        instructorLbl = new javax.swing.JLabel();
        administratotLbl = new javax.swing.JLabel();
        undergraduateLbl = new javax.swing.JLabel();
        postgraduateLbl = new javax.swing.JLabel();
        registerLbl = new javax.swing.JLabel();
        calendarLbl = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Enrollement System");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        sidePanelLbl.setBackground(new java.awt.Color(0, 102, 0));
        sidePanelLbl.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        sidePanelLbl.setForeground(new java.awt.Color(255, 255, 255));
        sidePanelLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sidePanelLbl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sidePanelLbl.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sidePanelLbl.setOpaque(true);
        sidePanelLbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lecturerLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lecBtns.png"))); // NOI18N
        lecturerLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lecturerLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerLblMouseClicked(evt);
            }
        });

        instructorLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/insBtns.png"))); // NOI18N
        instructorLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instructorLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instructorLblMouseClicked(evt);
            }
        });

        administratotLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminBtn.png"))); // NOI18N
        administratotLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        administratotLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                administratotLblMouseClicked(evt);
            }
        });

        undergraduateLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/underBtn.png"))); // NOI18N
        undergraduateLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        undergraduateLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                undergraduateLblMouseClicked(evt);
            }
        });

        postgraduateLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/postBtns.png"))); // NOI18N
        postgraduateLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        postgraduateLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postgraduateLblMouseClicked(evt);
            }
        });

        registerLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/register.png"))); // NOI18N
        registerLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLblMouseClicked(evt);
            }
        });

        calendarLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar.png"))); // NOI18N
        calendarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calendarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarLblMouseClicked(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close5.png"))); // NOI18N
        closeBtn.setText("Close");
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        closeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings.png"))); // NOI18N
        jLabel1.setText("Enrollement System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(sidePanelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeBtn))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(231, 231, 231)
                                        .addComponent(lecturerLbl)
                                        .addGap(32, 32, 32)
                                        .addComponent(instructorLbl))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(undergraduateLbl)
                                                .addGap(26, 26, 26)
                                                .addComponent(administratotLbl)
                                                .addGap(130, 130, 130))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(postgraduateLbl)
                                                .addGap(45, 45, 45)
                                                .addComponent(calendarLbl)
                                                .addGap(46, 46, 46)
                                                .addComponent(registerLbl)))))
                                .addGap(0, 81, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(undergraduateLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(administratotLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(postgraduateLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instructorLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecturerLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(closeBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void loadCalendar(){
        CalendarAdjustDateAndTime.setDate(new CalendarAdjustDateAndTime().getCalendar().getDate());
    }
    
    private void lecturerLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerLblMouseClicked
        // TODO add your handling code here:
       
        this.setVisible(false);
        lecLogin=new LecturerLogin();
        lecLogin.setVisible(true);
        lecLogin.setLocationRelativeTo(null);
           
    }//GEN-LAST:event_lecturerLblMouseClicked

    private void instructorLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instructorLblMouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        insLogin=new InstructorLogin();
        insLogin.setVisible(true);
        insLogin.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_instructorLblMouseClicked

    private void postgraduateLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postgraduateLblMouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        postLogin=new PostgraduateLogin();
        postLogin.setVisible(true);
        postLogin.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_postgraduateLblMouseClicked

    private void undergraduateLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_undergraduateLblMouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        unLogin=new UndergraduateLogin();
        unLogin.setVisible(true);
        unLogin.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_undergraduateLblMouseClicked

    private void administratotLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administratotLblMouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        adminLogin=new AdministratorLogin();
        adminLogin.setVisible(true);
        adminLogin.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_administratotLblMouseClicked

    private void registerLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLblMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        chooseStudentType=new ChooseStudentType();
        chooseStudentType.setVisible(true);
        chooseStudentType.setLocationRelativeTo(null);
    }//GEN-LAST:event_registerLblMouseClicked

    private void calendarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarLblMouseClicked
        // Gain administrator access before change the date and time
        
        
        AdministratorTemporaryLogin administratorLogin=new AdministratorTemporaryLogin();
        administratorLogin.setVisible(true);
        administratorLogin.setLocationRelativeTo(null);
    }//GEN-LAST:event_calendarLblMouseClicked

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnrollementSystemHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnrollementSystemHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnrollementSystemHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnrollementSystemHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    hm=new EnrollementSystemHome();
                    hm.setVisible(true);
                    hm.setLocationRelativeTo(null);
                } catch (InterruptedException ex) {
                    Logger.getLogger(EnrollementSystemHome.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel administratotLbl;
    private javax.swing.JLabel calendarLbl;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel instructorLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lecturerLbl;
    private javax.swing.JLabel postgraduateLbl;
    private javax.swing.JLabel registerLbl;
    private javax.swing.JLabel sidePanelLbl;
    private javax.swing.JLabel undergraduateLbl;
    // End of variables declaration//GEN-END:variables

    

    
}
