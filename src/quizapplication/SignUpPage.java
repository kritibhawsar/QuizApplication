
package quizapplication;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;
public class SignUpPage extends javax.swing.JFrame {
    Connection con=null;
    public SignUpPage() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        ImageIcon icon1=new ImageIcon("C:\\Users\\Lenovo\\Desktop\\quiz.png");
        this.setIconImage(icon1.getImage());
        scaleImage();
        con=DBConnection.getConnect();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        tfeid = new javax.swing.JTextField();
        cnclbtn = new javax.swing.JButton();
        signupbtn = new javax.swing.JButton();
        tfpwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz Application");
        setPreferredSize(new java.awt.Dimension(906, 442));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email ID: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password: ");

        tfname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfeid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cnclbtn.setBackground(new java.awt.Color(102, 102, 255));
        cnclbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cnclbtn.setForeground(new java.awt.Color(255, 255, 255));
        cnclbtn.setText("Cancel");
        cnclbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnclbtnActionPerformed(evt);
            }
        });

        signupbtn.setBackground(new java.awt.Color(102, 102, 255));
        signupbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        signupbtn.setText("SignUp");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        tfpwd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(signupbtn)
                            .addGap(50, 50, 50)
                            .addComponent(cnclbtn))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(tfname, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(tfeid)))
                    .addComponent(tfpwd))
                .addGap(0, 121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(tfpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupbtn)
                    .addComponent(cnclbtn))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        try{
            String name= tfname.getText();
            String eid= tfeid.getText();
            String password= tfpwd.getText();
            if(name.isEmpty() | eid.isEmpty() | password.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter complete information.");                
            }
            else{
                String query="insert into LoginDetails(name,emailid,password) values(?,?,?)";
                PreparedStatement pst=con.prepareStatement(query);
                pst.setString(1,name);
                pst.setString(2,eid);
                pst.setString(3,password);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Account created successfully.");
            }
            this.setVisible(false);
        }
        catch(SQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null,"Account with this email already exists.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_signupbtnActionPerformed

    private void cnclbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnclbtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cnclbtnActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cnclbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton signupbtn;
    private javax.swing.JTextField tfeid;
    private javax.swing.JTextField tfname;
    private javax.swing.JPasswordField tfpwd;
    // End of variables declaration//GEN-END:variables
}
