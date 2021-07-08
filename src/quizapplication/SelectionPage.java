
package quizapplication;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
public class SelectionPage extends javax.swing.JFrame {
    public SelectionPage() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        ImageIcon icon1=new ImageIcon("C:\\Users\\Lenovo\\Desktop\\quiz.png");
        this.setIconImage(icon1.getImage());
        scaleImage();
    }

    public void scaleImage(){
        ImageIcon icon=new ImageIcon("C:\\Users\\Lenovo\\Desktop\\quiz.png");
        Image img= icon.getImage();
        Image imgScale= img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedIcon= new ImageIcon(imgScale);
        jLabel1.setIcon(selectedIcon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clogo = new javax.swing.JButton();
        cpplogo = new javax.swing.JButton();
        javalogo = new javax.swing.JButton();
        pythonlogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz Application");

        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Select any Language:");

        clogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clogo.png"))); // NOI18N
        clogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clogoActionPerformed(evt);
            }
        });

        cpplogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cpplogo.png"))); // NOI18N
        cpplogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cpplogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpplogoActionPerformed(evt);
            }
        });

        javalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/javalogo.png"))); // NOI18N
        javalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        javalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javalogoActionPerformed(evt);
            }
        });

        pythonlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pyhtonlogo.jpg"))); // NOI18N
        pythonlogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pythonlogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pythonlogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(javalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(clogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpplogo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pythonlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clogo)
                    .addComponent(cpplogo))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(javalogo)
                    .addComponent(pythonlogo))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clogoActionPerformed
        this.setVisible(false);
        CRulesPage rp= new CRulesPage();
        rp.setVisible(true);
    }//GEN-LAST:event_clogoActionPerformed

    private void cpplogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpplogoActionPerformed
        this.setVisible(false);
        new CppRulesPage().setVisible(true);
    }//GEN-LAST:event_cpplogoActionPerformed

    private void javalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javalogoActionPerformed
        this.setVisible(false);
        new JavaRulesPage().setVisible(true);
    }//GEN-LAST:event_javalogoActionPerformed

    private void pythonlogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pythonlogoActionPerformed
        this.setVisible(false);
        new PythonRulesPage().setVisible(true);
    }//GEN-LAST:event_pythonlogoActionPerformed

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
            java.util.logging.Logger.getLogger(SelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clogo;
    private javax.swing.JButton cpplogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton javalogo;
    private javax.swing.JButton pythonlogo;
    // End of variables declaration//GEN-END:variables
}
