/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Pass.java
 *
 * Created on 12-may-2009, 7:05:41
 */
package otro;

import caafe.autorizacion.Autoriza;
import caafes.def.Usuarios;
import javax.swing.JOptionPane;
import usuarios.servicio.ServicioUsuario;

/**
 *
 * @author Edgar
 */
public class Pass extends javax.swing.JFrame {

    private MiFrame frmCliente;
    private int permiso;


    /** Creates new form Pass */
    public Pass(MiFrame frmCliente, int permiso) {
        this.frmCliente = frmCliente;
        this.permiso = permiso;
        initComponents();
        this.setResizable(false);
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Es requerido el pasword");
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Para Editar es necesario Incertar un Pasword");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(" Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String strPassBD = "hola";
        String strPassControl = "";
        ServicioUsuario srvUsuario = new ServicioUsuario();
        Usuarios root = srvUsuario.ObtieneUsuarios(Long.valueOf("0"));
        Usuarios Usuarios = srvUsuario.ObtieneUsuarios(Long.valueOf("1"));

        if (permiso == 0) {

            strPassControl = String.valueOf(jPasswordField1.getPassword());

            if (strPassControl.equals(root.getPassword()) || strPassControl.equals(Usuarios.getPassword())) {
                this.frmCliente.cbPasswprd();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Password invalido", "Verifica Pass", JOptionPane.ERROR_MESSAGE);
                jPasswordField1.setText("");
                jPasswordField1.requestFocus();
            }
        } else {
            strPassControl = String.valueOf(jPasswordField1.getPassword());

            if (strPassControl.equals(root.getPassword())) {
                this.frmCliente.cbPasswprd();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Password invalido \n Puede que no tengas los permisos\n para realizar la consulta", "Verifica Pass", JOptionPane.ERROR_MESSAGE);
                jPasswordField1.setText("");
                jPasswordField1.requestFocus();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void limpiaFrame() {
        jPasswordField1.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
