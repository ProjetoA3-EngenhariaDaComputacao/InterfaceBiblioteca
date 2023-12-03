/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Cadastros;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TestePessoa {

    public static void main(String[] args) throws SQLException {
        
        String cpf, nome, idade, sexo, email, senha, tipoUsu;
        

        String menu = "1- Cadastrar \n2-Atualizar \n3-Deletar \n4-Listar"
                + " \n0-Sair";
        int opcao;
        
        do{
            Pessoa p = new Pessoa();
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcao) {
                case 1:
                    System.out.println("cadastrar");
                    
                    cpf = JOptionPane.showInputDialog("CPF: ");
                    nome = JOptionPane.showInputDialog("Nome: ");
                    idade = JOptionPane.showInputDialog("Idade: ");
                    sexo = JOptionPane.showInputDialog("Sexo: ");
                    email = JOptionPane.showInputDialog("E-mail: ");
                    senha = JOptionPane.showInputDialog("Senha: ");
                    tipoUsu = JOptionPane.showInputDialog("Usuário: ");
                    
                    p.setCpf(cpf);
                    p.setNome(nome);
                    p.setIdade(idade);
                    p.setSexo(sexo);
                    p.setEmail(email);
                    p.setSenha(senha);
                    p.setTipoUsu(tipoUsu);
                            
                    p.inserir();
                    break;
                case 2:
                    System.out.println("Atualizar");

                    nome = JOptionPane.showInputDialog("Nome: ");
                    email = JOptionPane.showInputDialog("E-mail: ");
                    
                    cpf = JOptionPane.showInputDialog("CPF: ");
                    senha = JOptionPane.showInputDialog("Senha: ");
                    tipoUsu = JOptionPane.showInputDialog("Usuário: ");
                    p.setNome(nome);
                    
                    p.setEmail(email);
                    p.setCpf(cpf);
                    p.setSenha(senha);
                    p.setTipoUsu(tipoUsu);
                            
                    p.atualizar();
          
                    break; 
                case 3:
                    System.out.println("Deletar");

                    cpf = JOptionPane.showInputDialog("CPF: ");

                    p.setCpf(cpf);
                            
                    p.apagar();
          
                    break; 
                case 4:
                    System.out.println("Listar");
                    p.listar();
                    
                    break;
                default:
                    System.out.println("Opção Inválida!!");
            }    
            
        } while (opcao != 0);
        
        
        
 
    }
}
