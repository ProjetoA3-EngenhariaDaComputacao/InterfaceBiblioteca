
package Cadastros;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Pessoa {

    private int codigo;
    private String nome;
    private String fone;
    private String email;
    private String cpf;
    private String idade;
    private String sexo;
    
    //constructor

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, String fone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public Pessoa(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
     
    //getters //setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCPF() {
        String cpf = null;
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

    public String getIdade() {
        String idade = null;
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        String sexo = null;
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }    

    public void inserir() throws SQLException
    {
        
        String sql = "INSERT INTO pessoa(cpf, nome, email, idade, sexo) "
                + "VALUES (?, ?, ?, ?, ?)";
        
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, cpf);
            ps.setString(2, nome);
            ps.setString(3, email);
            ps.setString(4, idade);
            ps.setString(5, sexo);
            ps.execute();

            System.out.println("Cadastrado com sucesso!!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("ERRO no cadastro!!!");
        }
    
    } 
    
    public void atualizar (){
        //1: Definir o comando SQL
        String sql = "UPDATE pessoa SET nome = ?, idade = ?, "
                + "email = ?, cpf = ?, sexo = ? WHERE codigo = ?";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
        //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, idade);
            ps.setString(3, email);
            ps.setString(4, cpf);
            ps.setString(5, sexo);
            //5: Executa o comando
            ps.execute();
            System.out.println("Atualizado com sucesso!!");
        }
        catch (Exception e){
            e.printStackTrace();
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
    e.printStackTrace();
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
        String idade = rs.getString("idade");
        String email = rs.getString("email");
        String sexo = rs.getString("sexo");
        String aux = String.format(
        "CPF: %s, Nome: %s, Idade: %s, Email: %s, Sexo: %s",
        cpf,
        nome,
        idade,
        email,
        sexo
        );
        JOptionPane.showMessageDialog (null, aux);
        }
    }
    catch (Exception e){
    e.printStackTrace();
    }
    }

    void setCpf(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
