/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mykbcgame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EditQuestions extends javax.swing.JFrame {

    /**
     * Creates new form EditQuestions
     */
    
    String clicked_question=null;
    
    public EditQuestions() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No.", "Questions"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 23, 510, 343));

        jLabel1.setText("Question");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 14, -1, -1));

        jLabel2.setText("Option A");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 55, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 11, 372, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 42, 372, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 85, 372, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 116, 372, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 154, 372, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 189, 372, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 220, 372, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 258, 372, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 296, 372, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 334, 372, -1));

        jButton1.setText("Update Question");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 392, -1, -1));

        jButton2.setText("Delete Question");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 392, -1, -1));

        jLabel3.setText("Option B");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 88, -1, -1));

        jLabel4.setText("Option C");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 119, -1, -1));

        jLabel5.setText("Option D");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 157, -1, -1));

        jLabel6.setText("Audience Poll 1");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 223, -1, -1));

        jLabel7.setText("Audience Poll 2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 264, -1, -1));

        jLabel8.setText("Audience Poll 3");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 299, -1, -1));

        jLabel9.setText("Audience Poll 4");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 337, -1, -1));

        jLabel10.setText("Correct Answer");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 192, -1, -1));

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 392, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aaa.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 550));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1121)/2, (screenSize.height-487)/2, 1121, 487);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        String questions=null;
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        int sno=0;
        try
        {
            Connection con=DBConnection.connect();
            PreparedStatement ps=con.prepareStatement("select * from KBC_QUESTION");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                sno=sno+1;
                questions=rs.getString("QUESTION");
                dtm.addRow(new Object[]{sno, questions});
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        try
        {
            int row=jTable1.getSelectedRow();
            clicked_question=(jTable1.getModel().getValueAt(row, 1).toString());
            
            
            String option_a=null;
            String option_b=null;
            String option_c=null;
            String option_d=null;
            String correct_answer=null;
            String audience_poll_1=null;
            String audience_poll_2=null;
            String audience_poll_3=null;
            String audience_poll_4=null;
            
            Connection con=DBConnection.connect();
            PreparedStatement ps=con.prepareStatement("select * from KBC_QUESTION where QUESTION='"+clicked_question+"'");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                    option_a=rs.getString("OPTION_A");
                    option_b=rs.getString("OPTION_B");
                    option_c=rs.getString("OPTION_C");
                    option_d=rs.getString("OPTION_D");
                    correct_answer=rs.getString("CORRECT_ANSWER");
                    audience_poll_1=rs.getString("AUDIENCE_POLL_1");
                    audience_poll_2=rs.getString("AUDIENCE_POLL_2");
                    audience_poll_3=rs.getString("AUDIENCE_POLL_3");
                    audience_poll_4=rs.getString("AUDIENCE_POLL_4");
            }
            
            jTextField1.setText(clicked_question);
            jTextField2.setText(option_a);
            jTextField3.setText(option_b);
            jTextField4.setText(option_c);
            jTextField5.setText(option_d);
            jTextField6.setText(correct_answer);
            jTextField7.setText(audience_poll_1);
            jTextField8.setText(audience_poll_2);
            jTextField9.setText(audience_poll_3);
            jTextField10.setText(audience_poll_4);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String question=jTextField1.getText();
        String oa=jTextField2.getText();
        String ob=jTextField3.getText();
        String oc=jTextField4.getText();
        String od=jTextField5.getText();
        String ca=jTextField6.getText();
        String ap1=jTextField7.getText();
        String ap2=jTextField8.getText();
        String ap3=jTextField9.getText();
        String ap4=jTextField10.getText();
        
        try
        {
            Connection con=DBConnection.connect();
            PreparedStatement ps=con.prepareStatement("update KBC_QUESTION set QUESTION='"+question+"', OPTION_A='"+oa+"', OPTION_B='"+ob+"', OPTION_C='"+oc+"', OPTION_D='"+od+"', AUDIENCE_POLL_1='"+ap1+"', AUDIENCE_POLL_2='"+ap2+"', AUDIENCE_POLL_3='"+ap3+"', AUDIENCE_POLL_4='"+ap4+"', CORRECT_ANSWER='"+ca+"' where QUESTION='"+clicked_question+"'");
            int i=ps.executeUpdate();
            
            if(i>0)
            {
                JOptionPane.showMessageDialog(this, "Questions updated successfully");
                
                EditQuestions eq=new EditQuestions();
                eq.setVisible(true);
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Question not updated due to some error");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try
        {
            Connection con=DBConnection.connect();
            PreparedStatement ps=con.prepareStatement("delete from KBC_QUESTION where QUESTION='"+clicked_question+"'");
            int i=ps.executeUpdate();
            
            if(i>0)
            {
                JOptionPane.showMessageDialog(this, "Questions deleted successfully");
                
                EditQuestions eq=new EditQuestions();
                eq.setVisible(true);
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Question not deleted due to some error");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        AdminPanel ap=new AdminPanel();
        ap.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(EditQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQuestions().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
