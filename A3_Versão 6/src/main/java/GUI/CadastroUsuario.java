/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Cadastros.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author erica
 */
public class CadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
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

        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmbTipoUsu = new javax.swing.JComboBox<>();
        txtSenha = new javax.swing.JPasswordField();
        chkshowpassword = new javax.swing.JCheckBox();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblTipoUsu = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btIncluir = new javax.swing.JMenuItem();
        btConsultar = new javax.swing.JMenuItem();
        btAlteraSenha = new javax.swing.JMenuItem();
        btExcluir = new javax.swing.JMenuItem();
        btFechar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(txtNome);
        txtNome.setBounds(50, 40, 352, 22);

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        getContentPane().add(txtCPF);
        txtCPF.setBounds(50, 110, 352, 22);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(50, 180, 350, 22);

        cmbTipoUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Administrador" }));
        getContentPane().add(cmbTipoUsu);
        cmbTipoUsu.setBounds(150, 330, 161, 22);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(50, 250, 352, 22);

        chkshowpassword.setText("Mostrar senha");
        chkshowpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkshowpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(chkshowpassword);
        chkshowpassword.setBounds(50, 270, 190, 20);

        lblNome.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblNome.setForeground(java.awt.Color.white);
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(190, 10, 140, 30);

        lblEmail.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblEmail.setForeground(java.awt.Color.white);
        lblEmail.setText("CPF");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(190, 80, 110, 24);

        lblUsuario.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblUsuario.setForeground(java.awt.Color.white);
        lblUsuario.setText("E-mail");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(180, 140, 110, 40);

        lblSenha.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblSenha.setForeground(java.awt.Color.white);
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(180, 220, 110, 30);

        lblTipoUsu.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lblTipoUsu.setForeground(java.awt.Color.white);
        lblTipoUsu.setText("Tipo de usuário");
        getContentPane().add(lblTipoUsu);
        lblTipoUsu.setBounds(170, 300, 130, 30);

        lblFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lucas\\Downloads\\InterfaceBiblioteca-main\\Imagens\\Fundocadastro.png")); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(-30, -20, 490, 440);

        jMenu3.setText("Usuário");

        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });
        jMenu3.add(btIncluir);

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        jMenu3.add(btConsultar);

        btAlteraSenha.setText("Alterar Senha"); 
        jMenu3.add(btAlteraSenha);

        btExcluir.setText("Excluir");
        jMenu3.add(btExcluir);

        jMenuBar2.add(jMenu3);

        btFechar.setText("Fechar");
        jMenuBar2.add(btFechar);

        setJMenuBar(jMenuBar2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkshowpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkshowpasswordActionPerformed
        // TODO add your handling code here:
                if (chkshowpassword.isSelected())
        {
            txtSenha.setEchoChar((char)0);
        }
        else
        {
            txtSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_chkshowpasswordActionPerformed

    private void Limpar()
    {
        txtNome.setText("");
        txtCPF.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        cmbTipoUsu.setSelectedIndex(0);   
    }
    
    
    
    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        // TODO add your handling code here:
        
        if (!"".equals(txtNome.getText()))
        {
            Usuario usu = new Usuario();
           
            usu.setNome(txtNome.getText());
            usu.setEmail(txtCPF.getText());
            usu.setUsuario(txtEmail.getText());
            usu.setSenha(txtSenha.getText());
            usu.setTipoUsu(cmbTipoUsu.getSelectedIndex());
            
        try {
          usu.inserir();          
          Limpar();    
        } catch (SQLException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }  
        }
        else
        {
            JOptionPane.showMessageDialog
                    (null,"Campos em branco, complete-os para poder incluir!!",
                            "Cadastro de Usuário", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btIncluirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed

        // TODO add your handling code here:
        Usuario usu = new Usuario();
        
        usu.setUsuario(txtEmail.getText());
        
        usu.Consultar();  
        
        txtNome.setText(usu.getNome());
        txtCPF.setText(usu.getEmail());
        //txtUsuario.setText("");
        txtSenha.setText(usu.getSenha());
        cmbTipoUsu.setSelectedIndex(usu.getTipoUsu());   
        
    }//GEN-LAST:event_btConsultarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btAlteraSenha;
    private javax.swing.JMenuItem btConsultar;
    private javax.swing.JMenuItem btExcluir;
    private javax.swing.JMenu btFechar;
    private javax.swing.JMenuItem btIncluir;
    private javax.swing.JCheckBox chkshowpassword;
    private javax.swing.JComboBox<String> cmbTipoUsu;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTipoUsu;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
