
package quizapplication;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class CQuiz extends javax.swing.JFrame {

    String q[][]= new String [10][4];
    String ans[][]= new String [10][1]; //user can select 1 opt for each ques
    String cans[][]= new String [10][2];  //correct answers
    public static int count=0, timer=30, score=0, ans_given=1;
    public CQuiz() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        ImageIcon icon1=new ImageIcon("C:\\Users\\Lenovo\\Desktop\\quiz.png");
        this.setIconImage(icon1.getImage());
        //qno.setBounds(100, 120, 30, 29);
        
        submitbtn.setEnabled(false);
        
        q[0][0]="who is known as founder of C?";
        q[0][1]="James Gosling";
        q[0][2]="Dennis Ritchie";
        q[0][3]="Martin Richard";
        
        q[1][0]="<html>What is the correct value to return to the operating system upon the successful<br> completion of a program?</html>";
        q[1][1]="0";
        q[1][2]="1";
        q[1][3]="-1";
        
        q[2][0]="What is the only function all C program must contain?";
        q[2][1]="system()";
        q[2][2]="program()";
        q[2][3]="main()";
        
        q[3][0]="What punctuation ends most lines of C code?";
        q[3][1]=";";
        q[3][2]=":";
        q[3][3]=",";
        
        q[4][0]="What punctuation is used to signal the beginning and end of code blocks?";
        q[4][1]="( and )";
        q[4][2]="< and >";
        q[4][3]="{ and }";
        
        q[5][0]="C language is";
        q[5][1]="Hign level language";
        q[5][2]="Low level language";
        q[5][3]="Middle level language";
        
        q[6][0]="Which of the following is correct comment?";
        q[6][1]="**comment**";
        q[6][2]="/*comment*/";
        q[6][3]="*/comment/*";
        
        q[7][0]="Which of the following is not a correct variable type?";
        q[7][1]="int";
        q[7][2]="char";
        q[7][3]="real";
        
        q[8][0]="Which function is used to print something on console?";
        q[8][1]="scanf()";
        q[8][2]="clrscr()";
        q[8][3]="printf()";
        
        q[9][0]="Which function is used to read input from console?";
        q[9][1]="scanf()";
        q[9][2]="clrscr()";
        q[9][3]="printf()";
        
        cans[0][1]="Dennis Ritchie";
        cans[1][1]="1";
        cans[2][1]="main()";
        cans[3][1]=";";
        cans[4][1]="{ and }";
        cans[5][1]="Hign level language";
        cans[6][1]="/*comment*/";
        cans[7][1]="real";
        cans[8][1]="printf()";
        cans[9][1]="scanf()";
        
        start(count);
    }

    public void start(int count){
        qno.setText(""+(count+1)+".");  //conversion from string to int
        ques.setText(q[count][0]);
        opt1.setText(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setText(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setText(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        buttonGroup1.clearSelection();   //clear selection after each question
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ques = new javax.swing.JLabel();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        qno = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nextbtn1 = new javax.swing.JButton();
        submitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz\n");
        setBackground(new java.awt.Color(255, 255, 255));

        ques.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        buttonGroup1.add(opt1);
        opt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(opt2);
        opt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(opt3);
        opt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        qno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        nextbtn1.setBackground(new java.awt.Color(102, 102, 255));
        nextbtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nextbtn1.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn1.setText("Next");
        nextbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn1ActionPerformed(evt);
            }
        });

        submitbtn.setBackground(new java.awt.Color(102, 102, 255));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Submit");
        submitbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(690, Short.MAX_VALUE)
                .addComponent(nextbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opt2)
                    .addComponent(opt1)
                    .addComponent(opt3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(qno)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ques, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(qno)
                .addGap(11, 11, 11)
                .addComponent(ques, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opt1)
                        .addGap(28, 28, 28)
                        .addComponent(opt2)
                        .addGap(27, 27, 27)
                        .addComponent(opt3)
                        .addGap(150, 150, 150))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn1ActionPerformed
        repaint();  //repaint function internally calls paint() function
        ans_given=1;
        if(buttonGroup1.getSelection()==null)  //if user didnt answered
            ans[count][0]="";
        else{
            ans[count][0]=buttonGroup1.getSelection().getActionCommand(); //getActionCommand() returns the value of option which is selected
        }
        if(count==8){         //9th question
                nextbtn1.setEnabled(false);
                submitbtn.setEnabled(true);
            }
        count++;
        timer=30;
        start(count);
    }//GEN-LAST:event_nextbtn1ActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        ans_given=1;
        if(buttonGroup1.getSelection()==null)
            ans[count][0]="";
        else{
            ans[count][0]=buttonGroup1.getSelection().getActionCommand();
        }
        for(int i=0; i<ans.length; i++){
            if(ans[i][0].equals(cans[i][1]))
                score+=10;
        }
        this.setVisible(false);
        new ScorePage(score).setVisible(true);
    }//GEN-LAST:event_submitbtnActionPerformed

    public void paint(Graphics g){
        super.paint(g);
        String time= "00:"+timer;
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,20));
        if(timer>0)
            g.drawString(time,850,90);
        else
            g.drawString("Times up!!", 800, 90);
        timer--;
        try{
            Thread.sleep(1000);  //throws uninterruptedexception
            repaint();
        }catch(Exception e){ e.printStackTrace(); }
        
        if(ans_given==1){   //if user selected an answer
            ans_given=0;
            timer=30;
        }
        else if(timer<0){         //if user didnt selected an answer
            timer=15;
            
            /*if(count==8){         //9th question
                nextbtn1.setEnabled(false);
                submitbtn.setEnabled(true);
            }*/
            if(count==9){         //last question
                if(buttonGroup1.getSelection()==null)
                    ans[count][0]="";
                else{
                    ans[count][0]=buttonGroup1.getSelection().getActionCommand();
                }
                for(int i=0; i<ans.length; i++){
                    if(ans[i][0].equals(cans[i][1]))
                        score+=10;
                }
                this.setVisible(false);
            }
            else{     //if count is not 9 (for 0 to 8)
                if(buttonGroup1.getSelection()==null)
                    ans[count][0]="";
                else{
                    ans[count][0]=buttonGroup1.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(CQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextbtn1;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JLabel qno;
    private javax.swing.JLabel ques;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}
