/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CambiaPass.java
 *
 * Created on 08-jun-2009, 4:53:51
 */
package otro;

import caafes.def.Usuarios;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import usuarios.servicio.ServicioUsuario;

/**
 *
 * @author Edgar
 */
public class CambiaPass extends MiFrame {

    private BigDecimal index;
    private String stConfirma;
    private String stNuevo;
    private String stViejo;

    /** Creates new form CambiaPass */
    public CambiaPass() {
        initComponents();
    }

    public void modelo() {
        index =new BigDecimal(jcbUsuarios.getSelectedIndex());
        limpiaForma();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbUsuarios = new javax.swing.JComboBox();
        jpViejo = new javax.swing.JPasswordField();
        jpNuevo = new javax.swing.JPasswordField();
        jbAceptar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpConfirma = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actualiza password");

        jcbUsuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Usuarios" }));
        jcbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUsuariosActionPerformed(evt);
            }
        });

        jbAceptar.setText("Aceptar");
        jbAceptar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jbAceptarComponentShown(evt);
            }
        });
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Selecciona usuario e inserta tu nueva contraseña");

        jpConfirma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpConfirmaFocusLost(evt);
            }
        });

        jLabel2.setText("Inserta tu password");

        jLabel3.setText("Inserta nuevo password");

        jLabel4.setText("Confirma nuevo password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jbCancelar)
                        .addGap(54, 54, 54)
                        .addComponent(jbAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpViejo, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jpNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jpConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jcbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpViejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jpNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jpConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbAceptar))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUsuariosActionPerformed
        index = new BigDecimal(jcbUsuarios.getSelectedIndex());       // TODO add your handling code here:
    }//GEN-LAST:event_jcbUsuariosActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        ServicioUsuario srvUsuario = new ServicioUsuario();
        Usuarios usuario = srvUsuario.ObtieneUsuarios(index);
        stViejo = String.valueOf(jpViejo.getPassword());
        stNuevo = String.valueOf(jpNuevo.getPassword());
        stConfirma = String.valueOf(jpConfirma.getPassword());


        if (!stNuevo.equals(stConfirma)) {
            JOptionPane.showMessageDialog(this, "Confirma Tus Password", "Error", JOptionPane.ERROR_MESSAGE);
            limpiaForma();
        } else {

            if (stViejo.equals(usuario.getPassword())) {
                usuario.setPassword(String.valueOf(stConfirma));
                srvUsuario.modificaUsuario(usuario);
                JOptionPane.showMessageDialog(this, "Password Actualizado", "OK", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el password", "Error", JOptionPane.ERROR_MESSAGE);
                limpiaForma();
            }

        }
    // TODO add your handling code here:
    }//GEN-LAST:event_jbAceptarActionPerformed
public void limpiaForma(){
    jpConfirma.setText("");
    jpNuevo.setText("");
    jpViejo.setText("");
}
    private void jpConfirmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpConfirmaFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_jpConfirmaFocusLost

    private void jbAceptarComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jbAceptarComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAceptarComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CambiaPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JComboBox jcbUsuarios;
    private javax.swing.JPasswordField jpConfirma;
    private javax.swing.JPasswordField jpNuevo;
    private javax.swing.JPasswordField jpViejo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cbPasswprd() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
