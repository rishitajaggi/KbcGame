/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mykbcgame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class AllScores extends javax.swing.JFrame {

    /**
     * Creates new form AllScores
     */
    String email1;
    public AllScores(String email) {
        initComponents();
        email1=email;
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Welcome :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 11, 80, 14);

        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 10, 239, 14);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Score", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 35, 527, 361);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 420, 55, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kbccf.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 570, 470);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-581)/2, (screenSize.height-492)/2, 581, 492);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        UserPanel up=new UserPanel(email1);
        up.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        String name1=null;
        
        try
        {
            Connection con=DBConnection.connect();
            PreparedStatement ps=con.prepareStatement("select * from KBC_REGISTRATION where EMAIL_ID='"+email1+"'");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                    name1=rs.getString("NAME");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        jLabel2.setText(name1);
        
        
        
        int win_amount=0;
        String date=null;
        String time=null;
        String email_id=null;
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        try
        {
            Connection con=DBConnection.connect();
            PreparedStatement ps=con.prepareStatement("select * from KBC_SCORES ORDER BY WIN_AMOUNT DESC");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                email_id=rs.getString("EMAIL");
                win_amount=rs.getInt("WIN_AMOUNT");
                date=rs.getString("DATE1");
                time=rs.getString("TIME1");
                
                dtm.addRow(new Object[]{name1, win_amount, date, time});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(AllScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllScores(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
