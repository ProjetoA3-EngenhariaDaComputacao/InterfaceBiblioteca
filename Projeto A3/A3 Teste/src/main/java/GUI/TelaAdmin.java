/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author paulo
 */
public class TelaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmin
     */
    public TelaAdmin() {
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

        btnVerCadastros = new javax.swing.JButton();
        lblVerCadastros = new javax.swing.JLabel();
        lblLivroCadastrado = new javax.swing.JLabel();
        btnLivrosCadastrados = new javax.swing.JButton();
        lblPaginaInicial = new javax.swing.JLabel();
        btnVoltarPaginaInicial = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnVerCadastros.setText("Cadastros");
        getContentPane().add(btnVerCadastros);
        btnVerCadastros.setBounds(70, 90, 100, 40);

        lblVerCadastros.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lblVerCadastros.setForeground(java.awt.Color.white);
        lblVerCadastros.setText("Ver cadastros");
        getContentPane().add(lblVerCadastros);
        lblVerCadastros.setBounds(50, 40, 170, 40);

        lblLivroCadastrado.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lblLivroCadastrado.setForeground(java.awt.Color.white);
        lblLivroCadastrado.setText("Livros cadastrados");
        getContentPane().add(lblLivroCadastrado);
        lblLivroCadastrado.setBounds(20, 150, 230, 40);

        btnLivrosCadastrados.setText("Livros");
        getContentPane().add(btnLivrosCadastrados);
        btnLivrosCadastrados.setBounds(70, 190, 110, 40);

        lblPaginaInicial.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lblPaginaInicial.setForeground(java.awt.Color.white);
        lblPaginaInicial.setText("Voltar para página inicial");
        getContentPane().add(lblPaginaInicial);
        lblPaginaInicial.setBounds(250, 50, 330, 30);

        btnVoltarPaginaInicial.setText("Voltar");
        getContentPane().add(btnVoltarPaginaInicial);
        btnVoltarPaginaInicial.setBounds(360, 80, 100, 40);

        lblFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\paulo\\Downloads\\A3 - PSC - Modelagem\\Imagens\\background.jpg")); // NOI18N
        lblFundo.setText("jLabel1");
        getContentPane().add(lblFundo);
        lblFundo.setBounds(-27, -82, 610, 420);

        jMenu1.setText("MENU");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLivrosCadastrados;
    private javax.swing.JButton btnVerCadastros;
    private javax.swing.JButton btnVoltarPaginaInicial;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLivroCadastrado;
    private javax.swing.JLabel lblPaginaInicial;
    private javax.swing.JLabel lblVerCadastros;
    // End of variables declaration//GEN-END:variables
}
