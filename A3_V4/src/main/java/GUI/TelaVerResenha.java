/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Lucas
 */
public class TelaVerResenha extends javax.swing.JFrame {

    /**
     * Creates new form TelaVerResenha
     */
    public TelaVerResenha() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtresenhaJaCadastrada = new javax.swing.JTextArea();
        txtnomeLivro = new javax.swing.JTextField();
        btnvoltar = new javax.swing.JButton();
        btnavancar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtresenhaJaCadastrada.setColumns(20);
        txtresenhaJaCadastrada.setRows(5);
        jScrollPane1.setViewportView(txtresenhaJaCadastrada);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 510, 320);

        txtnomeLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeLivroActionPerformed(evt);
            }
        });
        getContentPane().add(txtnomeLivro);
        txtnomeLivro.setBounds(490, 20, 240, 22);

        btnvoltar.setText("jButton1");
        getContentPane().add(btnvoltar);
        btnvoltar.setBounds(590, 430, 75, 23);

        btnavancar.setText("jButton2");
        getContentPane().add(btnavancar);
        btnavancar.setBounds(730, 430, 75, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lucas\\Downloads\\InterfaceBiblioteca-main\\Imagens\\TelaVerResenha.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 1, 840, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeLivroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVerResenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVerResenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVerResenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVerResenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVerResenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnavancar;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtnomeLivro;
    private javax.swing.JTextArea txtresenhaJaCadastrada;
    // End of variables declaration//GEN-END:variables
}