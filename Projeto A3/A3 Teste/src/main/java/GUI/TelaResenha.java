/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author paulo
 */
public class TelaResenha extends javax.swing.JFrame {

    /**
     * Creates new form TelaResenha
     */
    public TelaResenha() {
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

        btnResenhaUp = new javax.swing.JButton();
        btnResenhaDown = new javax.swing.JButton();
        txtAreaResenha = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        chkFav = new javax.swing.JCheckBox();
        lblAddLivroResenha = new javax.swing.JLabel();
        lblFundoResenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnResenhaUp.setIcon(new javax.swing.ImageIcon("C:\\Users\\paulo\\Downloads\\A3 - PSC - Modelagem\\Imagens\\botaoLike.png")); // NOI18N
        btnResenhaUp.setText("jButton1");
        getContentPane().add(btnResenhaUp);
        btnResenhaUp.setBounds(460, 340, 80, 40);

        btnResenhaDown.setIcon(new javax.swing.ImageIcon("C:\\Users\\paulo\\Downloads\\A3 - PSC - Modelagem\\Imagens\\botaoDislike.png")); // NOI18N
        btnResenhaDown.setText("jButton1");
        getContentPane().add(btnResenhaDown);
        btnResenhaDown.setBounds(680, 340, 80, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        txtAreaResenha.setViewportView(jTextArea1);

        getContentPane().add(txtAreaResenha);
        txtAreaResenha.setBounds(10, 120, 410, 360);

        chkFav.setText("Sim");
        getContentPane().add(chkFav);
        chkFav.setBounds(200, 70, 43, 20);

        lblAddLivroResenha.setText("Livro");
        getContentPane().add(lblAddLivroResenha);
        lblAddLivroResenha.setBounds(700, 10, 280, 210);

        lblFundoResenha.setIcon(new javax.swing.ImageIcon("C:\\Users\\paulo\\Downloads\\A3 - PSC - Modelagem\\Imagens\\fundoResenha.png")); // NOI18N
        lblFundoResenha.setText("jLabel1");
        getContentPane().add(lblFundoResenha);
        lblFundoResenha.setBounds(0, 0, 1000, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaResenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaResenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaResenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaResenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaResenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResenhaDown;
    private javax.swing.JButton btnResenhaUp;
    private javax.swing.JCheckBox chkFav;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAddLivroResenha;
    private javax.swing.JLabel lblFundoResenha;
    private javax.swing.JScrollPane txtAreaResenha;
    // End of variables declaration//GEN-END:variables
}