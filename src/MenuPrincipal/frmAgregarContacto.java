/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuPrincipal;
import DAO.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author darwi
 */
public class frmAgregarContacto extends javax.swing.JFrame {

    public void InsertContacto(){
        Conexion conn = new Conexion ("proyectofinalpoo");
        Connection con = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO mainmanager (Name, Phone, Email, Direction) VALUES (?, ?, ?, ?)";
        
        try {
            con = conn.getConexion();
            ps = con.prepareStatement(query);
            
            ps.setString(1,txtIngresoNombre.getText().trim());
            ps.setString(2,txtIngresoTelefono.getText().trim());
            ps.setString(3,txtIngresoCorreo.getText().trim());
            ps.setString(4,txtIngresoDireccion.getText().trim());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"!Contacto Agregado Exitosamente!.");
            
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close(); 
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        
        
    }
    /**
     * Creates new form frmAgregarContacto
     */
    public frmAgregarContacto() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIngresoNombre = new javax.swing.JTextField();
        txtIngresoTelefono = new javax.swing.JTextField();
        txtIngresoCorreo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cuadro = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIngresoDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 54)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR CONTACTO ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teléfono:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 110, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 100, -1));

        txtIngresoNombre.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        txtIngresoNombre.setText(" ");
        jPanel1.add(txtIngresoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 440, 30));

        txtIngresoTelefono.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        txtIngresoTelefono.setText(" ");
        jPanel1.add(txtIngresoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 440, 30));

        txtIngresoCorreo.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        txtIngresoCorreo.setText(" ");
        jPanel1.add(txtIngresoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 440, 30));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 51));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/agregarMP.png"))); // NOI18N
        btnAgregar.setText(" ");
        btnAgregar.setBorder(null);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, -1, -1));

        btnAtras.setBackground(new java.awt.Color(0, 0, 51));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/atrasMP.png"))); // NOI18N
        btnAtras.setText(" ");
        btnAtras.setBorder(null);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agregar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Atrás");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        Cuadro.setBackground(new java.awt.Color(255, 255, 255));
        Cuadro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel1.add(Cuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 710, 410));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/TelefonoMP.png"))); // NOI18N
        jLabel8.setText(" ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/correoMP.png"))); // NOI18N
        jLabel9.setText(" ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/usuarioMP.png"))); // NOI18N
        jLabel10.setText("  ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dirección:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        txtIngresoDireccion.setText(" ");
        jPanel1.add(txtIngresoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 440, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/Direccion.png"))); // NOI18N
        jLabel7.setText(" ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmMenuPrincipal frame = new frmMenuPrincipal();
        frame.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        InsertContacto();
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAgregarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAgregarContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cuadro;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIngresoCorreo;
    private javax.swing.JTextField txtIngresoDireccion;
    private javax.swing.JTextField txtIngresoNombre;
    private javax.swing.JTextField txtIngresoTelefono;
    // End of variables declaration//GEN-END:variables
}
