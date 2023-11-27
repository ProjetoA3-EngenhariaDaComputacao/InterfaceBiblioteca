/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author paulo
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        btnPerfil = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        lblUltimoCadastro1 = new javax.swing.JLabel();
        lblUltimoCadastro2 = new javax.swing.JLabel();
        lblUltimoCadastro3 = new javax.swing.JLabel();
        lblFundoInicial = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCadastrarLivro = new javax.swing.JMenuItem();
        menuFazerResenha = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnPerfil.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnPerfil.setText("Perfil");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerfil);
        btnPerfil.setBounds(20, 10, 100, 20);

        btnCadastro.setText("Cadastrar");
        getContentPane().add(btnCadastro);
        btnCadastro.setBounds(620, 30, 90, 23);

        lblUltimoCadastro1.setText("Livro recente 1");
        getContentPane().add(lblUltimoCadastro1);
        lblUltimoCadastro1.setBounds(410, 330, 130, 90);

        lblUltimoCadastro2.setText("Livro recente 2");
        getContentPane().add(lblUltimoCadastro2);
        lblUltimoCadastro2.setBounds(607, 346, 140, 70);

        lblUltimoCadastro3.setText("Livro recente 3");
        getContentPane().add(lblUltimoCadastro3);
        lblUltimoCadastro3.setBounds(787, 346, 140, 70);

        lblFundoInicial.setIcon(new javax.swing.ImageIcon("C:\\Users\\paulo\\Downloads\\A3 - PSC - Modelagem\\Imagens\\fundoInicial.png")); // NOI18N
        lblFundoInicial.setText("jLabel1");
        getContentPane().add(lblFundoInicial);
        lblFundoInicial.setBounds(0, 0, 1000, 500);

        jMenu1.setText("Menu");

        menuCadastrarLivro.setText("Cadastrar livro.");
        jMenu1.add(menuCadastrarLivro);

        menuFazerResenha.setText("Fazer resenha.");
        jMenu1.add(menuFazerResenha);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerfilActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblFundoInicial;
    private javax.swing.JLabel lblUltimoCadastro1;
    private javax.swing.JLabel lblUltimoCadastro2;
    private javax.swing.JLabel lblUltimoCadastro3;
    private javax.swing.JMenuItem menuCadastrarLivro;
    private javax.swing.JMenuItem menuFazerResenha;
    // End of variables declaration//GEN-END:variables
}
