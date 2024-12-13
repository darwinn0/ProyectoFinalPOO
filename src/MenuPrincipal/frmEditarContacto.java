/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuPrincipal;

import DAO.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darwi
 */
public class frmEditarContacto extends javax.swing.JFrame {

    public void UpdateContacto() {
    Conexion conn = new Conexion("proyectofinalpoo");
    Connection con = null;
    PreparedStatement ps = null;
    String query = "UPDATE mainmanager SET Name = ?, Phone = ?, Email = ?, Direction = ? WHERE ID = ?";

    
    try {
        con = conn.getConexion();
        ps = con.prepareStatement(query);

        ps.setString(1, txtEditarNombre.getText().trim());
        ps.setString(2, txtEditarTelefono.getText().trim());
        ps.setString(3, txtEditarCorreo.getText().trim());
        ps.setString(4, txtEditarDireccion.getText().trim());
        ps.setString(5, txtEditarID.getText().trim());

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "!Contacto Actualizado Exitosamente!.");

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    
    // para mostrar
    private void toList(){
        Conexion conn = new Conexion("proyectofinalpoo");
       
        DefaultTableModel modelo;
        Object dataMainManager[] = new Object[5];
        modelo = (DefaultTableModel)dtMainManager.getModel(); 
       
        Connection con = null;
        Statement st = null;   
        ResultSet rs= null;
        
        modelo.setRowCount(0);
        
        try{
            con = conn.getConexion();
            st = con.createStatement();
            rs= st.executeQuery("select * from mainmanager where Name like '%"+ txtBuscar.getText().trim().toLowerCase() +"%'");
            while(rs.next())
            {
                dataMainManager[0] =rs.getString("Id");
                dataMainManager[1] =rs.getString("Name");
                dataMainManager[2] =rs.getString("Phone");
                dataMainManager[3] =rs.getString("Email");
                dataMainManager[4] =rs.getString("Direction");
                modelo.addRow(dataMainManager);
            }            
           dtMainManager.setModel(modelo);           
           
           con.close();
        }
        catch(Exception e){
            e.printStackTrace();                   
             JOptionPane.showMessageDialog(null,"Error en las consultas");
          }
    }
    /**
     * Creates new form frmEditarContacto
     */
    public frmEditarContacto() {
        initComponents();
        
        toList();
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dtMainManager = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEditarNombre = new javax.swing.JTextField();
        txtEditarTelefono = new javax.swing.JTextField();
        txtEditarCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEditarDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtEditarID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Cuadro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 54)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDITAR CONTACTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 700, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/atrasAC.png"))); // NOI18N
        jButton1.setText(" ");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Atrás");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        txtBuscar.setText(" ");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 600, -1));

        dtMainManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Telefono", "Correo", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(dtMainManager);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 700, 80));

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 100, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        txtEditarNombre.setText(" ");
        jPanel1.add(txtEditarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 390, 30));

        txtEditarTelefono.setText(" ");
        jPanel1.add(txtEditarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 390, 30));

        txtEditarCorreo.setText(" ");
        jPanel1.add(txtEditarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 390, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Editar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 710, -1, -1));

        btnEditar.setBackground(new java.awt.Color(0, 0, 51));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/editar-informacion.png"))); // NOI18N
        btnEditar.setText(" ");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 740, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/correoAC.png"))); // NOI18N
        jLabel9.setText(" ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/TelefonoAC.png"))); // NOI18N
        jLabel10.setText(" ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/usuarioAC.png"))); // NOI18N
        jLabel12.setText(" ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 643, -1, 30));

        txtEditarDireccion.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        txtEditarDireccion.setText(" ");
        jPanel1.add(txtEditarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, 390, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/Direccion.png"))); // NOI18N
        jLabel11.setText(" ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        txtEditarID.setText(" ");
        jPanel1.add(txtEditarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 390, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipal/ID.png"))); // NOI18N
        jLabel14.setText("  ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        Cuadro.setBackground(new java.awt.Color(255, 255, 255));
        Cuadro.setText(" ");
        Cuadro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel1.add(Cuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 710, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmMenuPrincipal frame = new frmMenuPrincipal();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    UpdateContacto();
// TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        toList();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyPressed

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
            java.util.logging.Logger.getLogger(frmEditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEditarContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cuadro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JTable dtMainManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtEditarCorreo;
    private javax.swing.JTextField txtEditarDireccion;
    private javax.swing.JTextField txtEditarID;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtEditarTelefono;
    // End of variables declaration//GEN-END:variables
}
