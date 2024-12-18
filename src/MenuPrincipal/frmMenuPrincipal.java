/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuPrincipal;

import GUI.frmContactManager;

/**
 *
 * @author darwi
 */
public class frmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuPrincipal
     */
    public frmMenuPrincipal() {
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
        jLabel1 = new javax.swing.JLabel();
        btnAgregarContacto = new javax.swing.JButton();
        btnEliminarContacto = new javax.swing.JButton();
        btnBuscarContacto = new javax.swing.JButton();
        btnEditarContacto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 54)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ DE OPCIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 700, 130));

        btnAgregarContacto.setBackground(new java.awt.Color(0, 0, 51));
        btnAgregarContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/Agregar Usu MP.png"))); // NOI18N
        btnAgregarContacto.setText(" ");
        btnAgregarContacto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarContactoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 160, 180));

        btnEliminarContacto.setBackground(new java.awt.Color(0, 0, 51));
        btnEliminarContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/eliminar-amigoMPP.png"))); // NOI18N
        btnEliminarContacto.setText(" ");
        btnEliminarContacto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarContactoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 160, 180));

        btnBuscarContacto.setBackground(new java.awt.Color(0, 0, 51));
        btnBuscarContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/busquedaMP.png"))); // NOI18N
        btnBuscarContacto.setText(" ");
        btnBuscarContacto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarContactoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 160, 180));

        btnEditarContacto.setBackground(new java.awt.Color(0, 0, 51));
        btnEditarContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/EditarMP.png"))); // NOI18N
        btnEditarContacto.setText(" ");
        btnEditarContacto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarContactoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 160, 180));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 160, 180));

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eliminar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Buscar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 90, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Editar ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 70, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Info. del sistema ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Reporte  ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 100, -1));

        btnInformacion.setBackground(new java.awt.Color(0, 0, 51));
        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/informacionMP.png"))); // NOI18N
        btnInformacion.setText(" ");
        btnInformacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 160, 180));

        btnReporte.setBackground(new java.awt.Color(0, 0, 51));
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/ReporteMP.png"))); // NOI18N
        btnReporte.setText(" ");
        btnReporte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 160, 180));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 860, 510));

        jLabel10.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salir");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 680, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/cerrar-sesionMP.png"))); // NOI18N
        jButton1.setText(" ");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 710, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarContactoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmAgregarContacto frame = new frmAgregarContacto();
        frame.setVisible(true);
    }//GEN-LAST:event_btnAgregarContactoActionPerformed

    private void btnEliminarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarContactoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmEliminarContacto frame = new frmEliminarContacto();
        frame.setVisible(true);
    }//GEN-LAST:event_btnEliminarContactoActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmInformacionSistema frame = new frmInformacionSistema();
        frame.setVisible(true);
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btnBuscarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarContactoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmBuscarContacto frame = new frmBuscarContacto();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBuscarContactoActionPerformed

    private void btnEditarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarContactoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmEditarContacto frame = new frmEditarContacto();
        frame.setVisible(true);
    }//GEN-LAST:event_btnEditarContactoActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmImprimirReporte frame = new frmImprimirReporte();
        frame.setVisible(true);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmContactManager frame = new frmContactManager();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarContacto;
    private javax.swing.JButton btnBuscarContacto;
    private javax.swing.JButton btnEditarContacto;
    private javax.swing.JButton btnEliminarContacto;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
