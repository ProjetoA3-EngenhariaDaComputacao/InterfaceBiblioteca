
package Cadastros;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Pessoa {

    private String cpf;
    private String nome;
    private String email;
    private String sexo;
    
    //constructor

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, String email, String sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
    }

    public Pessoa(String nome, String email, String sexo) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
    }
     
    //getters //setters

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void inserir() throws SQLException
    {
        
        String sql = "INSERT INTO pessoa(cpf, nome, email, sexo)"
                + "VALUES (?, ?, ?, ?)";
        
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, cpf);
            ps.setString(2, nome);
            ps.setString(3, email);
            ps.setString(4, sexo);
            ps.execute();

            System.out.println("Cadastrado com sucesso!!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("ERRO no cadastro!!! CPF: " + cpf);
        }
    
    } 
    
    public void atualizar (){
        //1: Definir o comando SQL
        String sql = "UPDATE pessoa SET nome = ?, email = ?, "
                + "sexo = ? WHERE cpf = ?";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
        //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, sexo);
            //5: Executa o comando
            ps.execute();
            System.out.println("Atualizado com sucesso!!");
        }
        catch (Exception e){
            System.out.println("Não ATUALIZADO!!");
        }
        }
    
    public void apagar (){
    //1: Definir o comando SQL
    String sql = "DELETE FROM pessoa WHERE cpf = ?";
    //2: Abrir uma conexão
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao()){
        //3: Pré compila o comando
        PreparedStatement ps = c.prepareStatement(sql);
        //4: Preenche os dados faltantes
        ps.setString(1, cpf);
        //5: Executa o comando
        ps.execute();
    }
    catch (Exception e){
    }
    }
    
    public void listar (){
    //1: Definir o comando SQL
    String sql = "SELECT * FROM pessoa";
    //2: Abrir uma conexão
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao()){
        //3: Pré compila o comando
        PreparedStatement ps = c.prepareStatement(sql);
        //4: Executa o comando e guarda
        //o resultado em um ResultSet
        ResultSet rs = ps.executeQuery();
        //5: itera sobre o resultado
        while (rs.next()){
        String cpf = rs.getString("cpf");
        String nome = rs.getString("nome");
        String email = rs.getString("email");
        String sexo = rs.getString("sexo");
        String aux = String.format(
        "CPF: %s, Nome: %s, Email: %s, Sexo: %s",
        cpf,
        nome,
        email,
        sexo
        );
        JOptionPane.showMessageDialog (null, aux);
        }
    }
    catch (Exception e){
    }
    }
    
}
