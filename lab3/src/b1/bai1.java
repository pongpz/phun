/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b1;

import java.awt.Color;

/**
 *
 * @author j
 */
public class bai1 extends javax.swing.JFrame {

    /** Creates new form bai1 */
    public bai1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bthyelow = new javax.swing.JButton();
        btngreen = new javax.swing.JButton();
        btnred = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btncenter = new javax.swing.JButton();
        btnnoth = new javax.swing.JButton();
        btneath = new javax.swing.JButton();
        btnsouth = new javax.swing.JButton();
        btnwest = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        txtcomment = new javax.swing.JTextField();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        bthyelow.setText("yelow");
        bthyelow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthyelowActionPerformed(evt);
            }
        });
        jPanel1.add(bthyelow);

        btngreen.setText("grenn");
        btngreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngreenActionPerformed(evt);
            }
        });
        jPanel1.add(btngreen);

        btnred.setText("red");
        btnred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnredActionPerformed(evt);
            }
        });
        jPanel1.add(btnred);

        jPanel2.setLayout(new java.awt.BorderLayout());

        btncenter.setText("center");
        btncenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncenterActionPerformed(evt);
            }
        });
        jPanel2.add(btncenter, java.awt.BorderLayout.CENTER);

        btnnoth.setText("north");
        btnnoth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnothActionPerformed(evt);
            }
        });
        jPanel2.add(btnnoth, java.awt.BorderLayout.PAGE_START);

        btneath.setText("east");
        btneath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneathActionPerformed(evt);
            }
        });
        jPanel2.add(btneath, java.awt.BorderLayout.LINE_END);

        btnsouth.setText("south");
        btnsouth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsouthActionPerformed(evt);
            }
        });
        jPanel2.add(btnsouth, java.awt.BorderLayout.PAGE_END);

        btnwest.setText("west");
        btnwest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwestActionPerformed(evt);
            }
        });
        jPanel2.add(btnwest, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setLayout(new java.awt.GridLayout(2, 5, 5, 5));
        jPanel3.add(jButton10);
        jPanel3.add(jButton14);
        jPanel3.add(jButton16);
        jPanel3.add(jButton18);
        jPanel3.add(jButton19);
        jPanel3.add(jButton17);
        jPanel3.add(jButton15);
        jPanel3.add(jButton12);
        jPanel3.add(jButton13);
        jPanel3.add(jButton11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(txtcomment, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtcomment, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnredActionPerformed
        // TODO add your handling code here:
         jPanel1.setBackground(Color.red);
    }//GEN-LAST:event_btnredActionPerformed

    private void bthyelowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthyelowActionPerformed
        // TODO add your handling code here:
        jPanel1.setBackground(Color.yellow);
    }//GEN-LAST:event_bthyelowActionPerformed

    private void btngreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngreenActionPerformed
        // TODO add your handling code here:
         jPanel1.setBackground(Color.GREEN);
    }//GEN-LAST:event_btngreenActionPerformed

    private void btnnothActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnothActionPerformed
        // TODO add your handling code here:
        txtcomment.setText("noth");
    }//GEN-LAST:event_btnnothActionPerformed

    private void btnwestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwestActionPerformed
        // TODO add your handling code here:
        txtcomment.setText("west");
    }//GEN-LAST:event_btnwestActionPerformed

    private void btncenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncenterActionPerformed
        // TODO add your handling code here:
        txtcomment.setText("center");
    }//GEN-LAST:event_btncenterActionPerformed

    private void btnsouthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsouthActionPerformed
        // TODO add your handling code here:
        txtcomment.setText("south");
    }//GEN-LAST:event_btnsouthActionPerformed

    private void btneathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneathActionPerformed
        // TODO add your handling code here:
        txtcomment.setText("east");
    }//GEN-LAST:event_btneathActionPerformed

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
            java.util.logging.Logger.getLogger(bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthyelow;
    private javax.swing.JButton btncenter;
    private javax.swing.JButton btneath;
    private javax.swing.JButton btngreen;
    private javax.swing.JButton btnnoth;
    private javax.swing.JButton btnred;
    private javax.swing.JButton btnsouth;
    private javax.swing.JButton btnwest;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtcomment;
    // End of variables declaration//GEN-END:variables

}
