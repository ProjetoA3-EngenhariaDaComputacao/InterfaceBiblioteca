
package Cadastros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Pessoa {

    private String cpf;
    private String nome;
    private String idade;
    private String sexo;
    private String email;
    private String senha;
    private String tipoUsu;
    
    //constructor

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, String idade, String sexo, String email, String senha, String tipoUsu) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.tipoUsu = tipoUsu;
    }

    
     
    //getters //setters

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

    public String getTipoUsu() {
        return tipoUsu;
    }

    public void setTipoUsu(String tipoUsu) {
        this.tipoUsu = tipoUsu;
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
            ps.setString(7, tipoUsu);
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
        String sql = "UPDATE pessoa SET nome = ?, idade = ?, sexo = ?, email = ?, "
                + "senha = ?, tipoUsu = ? WHERE cpf = ?";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
        //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, idade);
            ps.setString(3, sexo);
            ps.setString(4, email);
            ps.setString(5, senha);
            ps.setString(6, tipoUsu);
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
        String sexo = rs.getString("sexo");
        String tipoUsu = rs.getString("tipoUsu");
        String email = rs.getString("email");
        String aux = String.format(
        "CPF: %s, Nome: %s, Idade: %s, Sexo: %s, Email: %s, Tipo Usuário: %s",
        cpf,
        nome,
        idade,
        sexo,
        email,
        tipoUsu
        
        );
        JOptionPane.showMessageDialog (null, aux);
        }
    }
    catch (Exception e){
    e.printStackTrace();
    }
    }
    
    

    /*
    public static boolean validate(String cpf, String senha) {
        boolean status = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "usuario", "senha");

            PreparedStatement ps = con.prepareStatement("select * from usuarios where cpf=? and senha=?");
            ps.setString(1, cpf);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
*/
    
    
    public String ValidarSenha(String cpf, String senha){

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
                setTipoUsu(rs.getString("tipoUsu"));
                            
                JOptionPane.showMessageDialog(null, "Olá " + nome);
                return tipoUsu;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ERRO!! Usuário e/ou Senha Inválido!");
                return "1";
            }   
            

        }
        catch (Exception e){
        e.printStackTrace();
        return "99";
        
        }
    
    }

    public void Apagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    

