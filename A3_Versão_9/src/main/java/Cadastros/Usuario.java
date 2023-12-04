/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author erica
 */
public class Usuario {


    private String cpf;
    private String nome;
    private String idade;
    private String sexo;
    private String email;
    
    private String senha;
    private String tipoUsu;
    
    /**
     *
     * @param cpf
     * @param nome
     * @param email
     * @param senha
     * @param tipoUsu
     */
    public Usuario(String cpf, String nome, String idade, String sexo, String email, String senha, String tipoUsu) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        
        this.senha = senha;
        this.tipoUsu = tipoUsu;
    }

    

    public Usuario() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsu() {
        return tipoUsu;
    }

    public void setTipoUsu(String tipoUsu) {
        this.tipoUsu = tipoUsu;
    }
    
    public void inserir() throws SQLException
    {
        
        String sql = "INSERT INTO pessoa(cpf, nome, idade, sexo, email, senha, tipoUsu) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, cpf);
            ps.setString(2, nome);
            ps.setString(3, idade);
            ps.setString(4, sexo);
            ps.setString(5, email);
            
            ps.setString(6, senha);
            ps.setString  (7, tipoUsu);
            ps.execute();

            JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!!");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERRO no cadastro do usuário!!!");
        }
    
    }
    
    public void Consultar(){

        String sql = "SELECT * FROM pessoa where cpf = ?";
    
         ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            //5: itera sobre o resultado
            while (rs.next()){
            setNome(rs.getString("nome"));
            setIdade(rs.getString("idade"));
            setSexo(rs.getString("sexo"));
            setEmail(rs.getString("email"));
            setSenha(rs.getString("senha"));
            setTipoUsu(rs.getString("tipoUsu"));

            }
    }
    catch (Exception e){
    e.printStackTrace();
    }
    }
    
    public int ValidarSenha(String cpf, String senha){

        String sql = "SELECT * FROM pessoa where cpf = ? and senha = ?";
         ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, cpf);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                setNome(rs.getString("nome"));
                setCpf(rs.getString("cpf"));
                setTipoUsu(rs.getString("tipoUsu"));             
                JOptionPane.showMessageDialog(null, "Olá " + nome);
                return 0;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ERRO!! Usuário e/ou Senha Inválido!");
                return 1;
            }   
            

        }
        catch (Exception e){
        e.printStackTrace();
        return 99;
        
        }
    
    }

    public void setTitulo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAutor(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setGenero(int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNota(int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
