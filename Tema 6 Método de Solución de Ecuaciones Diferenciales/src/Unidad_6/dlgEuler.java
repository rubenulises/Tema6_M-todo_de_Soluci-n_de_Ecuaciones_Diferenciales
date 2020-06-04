package Unidad_6;

import java.util.ArrayList;
import javax.swing.JOptionPane;



public class dlgEuler extends javax.swing.JFrame {

    public dlgEuler() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabely0 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txte = new javax.swing.JTextField();
        jLabele = new javax.swing.JLabel();
        txtx = new javax.swing.JTextField();
        jLabelx = new javax.swing.JLabel();
        txty = new javax.swing.JTextField();
        txti = new javax.swing.JTextField();
        jLabelIte = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metodo de Euler");
        setBackground(new java.awt.Color(102, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabely0.setText("y=");
        getContentPane().add(jLabely0, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 96, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Método de Euler");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 11, -1, 33));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Contenido 1", "Contenido 2", "Contenido 3", "Contenido 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 350, 100));

        txte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteActionPerformed(evt);
            }
        });
        getContentPane().add(txte, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 93, 82, -1));

        jLabele.setText("h=");
        getContentPane().add(jLabele, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 96, -1, -1));
        getContentPane().add(txtx, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 93, 82, -1));

        jLabelx.setText("X=");
        getContentPane().add(jLabelx, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 96, -1, -1));
        getContentPane().add(txty, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 93, 82, -1));
        getContentPane().add(txti, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 55, 82, -1));

        jLabelIte.setText("y(0)=");
        getContentPane().add(jLabelIte, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 58, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 153, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
         try{
        double ay = Double.parseDouble(this.txty.getText().trim());
        double ax = Double.parseDouble(this.txtx.getText().trim());
        double ae = Double.parseDouble(this.txte.getText().trim());
        int iteraciones = Integer.parseInt(this.txti.getText().trim());

        MetEuler met = new MetEuler();
        ArrayList<clsEuler> o = met.MetodoEuler(ay, ax, ae, iteraciones);

        ModeloDeEuler m = new ModeloDeEuler(o);
        this.jTable1.setModel(m);
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null," Error Omitido");
       }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(dlgEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dlgEuler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelIte;
    private javax.swing.JLabel jLabele;
    private javax.swing.JLabel jLabelx;
    private javax.swing.JLabel jLabely0;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txti;
    private javax.swing.JTextField txtx;
    private javax.swing.JTextField txty;
    // End of variables declaration//GEN-END:variables
}
