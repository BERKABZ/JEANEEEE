/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author WS
 *
 */
import java.awt.Color;
public class PasswordUpdate extends javax.swing.JFrame {

    /**
     * Creates new form PasswordUpdate
     */
    public PasswordUpdate() {
        initComponents();
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
        pass1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newpass = new javax.swing.JPasswordField();
        conpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        Save = new javax.swing.JLabel();
        Cancel = new javax.swing.JLabel();
        chkshow = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Change Password");

        pass1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        pass1.setForeground(new java.awt.Color(153, 153, 153));
        pass1.setText(" OldPassword");
        pass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass1FocusLost(evt);
            }
        });
        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Old Password");

        jLabel3.setText("New Password");

        newpass.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        newpass.setForeground(new java.awt.Color(153, 153, 153));
        newpass.setText("NewPassword");
        newpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        newpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newpassFocusLost(evt);
            }
        });
        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });

        conpass.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        conpass.setForeground(new java.awt.Color(153, 153, 153));
        conpass.setText("confirmpassword");
        conpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        conpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                conpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                conpassFocusLost(evt);
            }
        });
        conpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpassActionPerformed(evt);
            }
        });

        jLabel4.setText("Confirm Password");

        Save.setBackground(new java.awt.Color(0, 102, 255));
        Save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Save.setText("Save");
        Save.setOpaque(true);
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(0, 102, 255));
        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel.setText("Cancel");
        Cancel.setOpaque(true);
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });

        chkshow.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        chkshow.setForeground(new java.awt.Color(51, 51, 51));
        chkshow.setText("show");
        chkshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkshowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conpass, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(chkshow)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkshow, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(conpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Cancel))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass1FocusGained
        pass1.setBackground(Color.WHITE);
        pass1.setText("");
        pass1.setForeground(Color.BLACK);        
    }//GEN-LAST:event_pass1FocusGained

    private void pass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass1FocusLost
        String pss =  pass1.getText();
        if(pss.isEmpty()){
            pass1.setText(" OldPassword");
            pass1.setForeground(Color.LIGHT_GRAY);
    }                                        
    }//GEN-LAST:event_pass1FocusLost

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void newpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newpassFocusGained
        newpass.setBackground(Color.WHITE);
        newpass.setText("");
        newpass.setForeground(Color.BLACK);
    }//GEN-LAST:event_newpassFocusGained

    private void newpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newpassFocusLost
       String pss =  newpass.getText();
        if(pss.isEmpty()){
            newpass.setText("NewPassword");
            newpass.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_newpassFocusLost
    }
    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void conpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conpassFocusGained
       conpass.setBackground(Color.WHITE);
       conpass.setText("");
       conpass.setForeground(Color.BLACK);      
    }//GEN-LAST:event_conpassFocusGained

    private void conpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conpassFocusLost
      String pss =  conpass.getText();
        if(pss.isEmpty()){
            conpass.setText("confirmpassword");
            conpass.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_conpassFocusLost

    private void conpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpassActionPerformed

    private void chkshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkshowActionPerformed
        // TODO add your handling code here:
        if(chkshow.isSelected()){
            pass1.setEchoChar((char)0);
            newpass.setEchoChar((char)0);
            conpass.setEchoChar((char)0);

        }else{
            pass1.setEchoChar('*');
            newpass.setEchoChar('*');
            conpass.setEchoChar('*');

        }
    }//GEN-LAST:event_chkshowActionPerformed

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
       HomePage home = new HomePage();
       home.show();
       this.hide();
    }//GEN-LAST:event_CancelMouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
         
        
    }//GEN-LAST:event_SaveMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PasswordUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancel;
    private javax.swing.JLabel Save;
    private javax.swing.JCheckBox chkshow;
    private javax.swing.JPasswordField conpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField pass1;
    // End of variables declaration//GEN-END:variables
}
