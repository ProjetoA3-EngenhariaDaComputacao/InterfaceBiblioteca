/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Cadastros;

import DAO.ConnectionFactory;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TestePessoa {

    public static void main(String[] args) throws SQLException {
        
        String cpf, nome, email, sexo;

        String menu = "1- Cadastrar \n2-Atualizar \n3-Deletar \n4-Listar"
                + " \n0-Sair";
        int opcao;
        
        do{
            Pessoa p = new Pessoa();
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcao) {
                case 1:
                    System.out.println("Cadastrar");
                    
                    cpf = JOptionPane.showInputDialog("CPF: ");
                    nome = JOptionPane.showInputDialog("Nome: ");
                    email = JOptionPane.showInputDialog("E-mail: ");
                    sexo = JOptionPane.showInputDialog("Sexo: ");
                    
                    p.setCPF(cpf);
                    p.setNome(nome);
                    p.setEmail(email);
                    p.setSexo(sexo);
                            
                    p.inserir();
                    break;
                case 2:
                    System.out.println("Atualizar");

                    cpf = JOptionPane.showInputDialog("CPF: ");
                    nome = JOptionPane.showInputDialog("Nome: ");
                    email = JOptionPane.showInputDialog("E-mail: ");
                    sexo = JOptionPane.showInputDialog("Sexo: ");
                    
                    p.setCPF(cpf);
                    p.setNome(nome);
                    p.setEmail(email);
                    p.setSexo(sexo);
                            
                    p.atualizar();
          
                    break; 
                case 3:
                    System.out.println("Deletar");

                    cpf = JOptionPane.showInputDialog("CPF: ");

                    p.setCPF(cpf);
                            
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
