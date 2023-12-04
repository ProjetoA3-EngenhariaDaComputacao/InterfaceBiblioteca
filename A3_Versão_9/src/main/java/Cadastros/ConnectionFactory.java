/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {  
    private final String usuario = "root";
    private final String senha = "Digimais@2023";
    private final String host = "localhost";
    private final String porta = "3306";
    private final String bd = "projeto_a3";
    
    public Connection obtemConexao() throws SQLException
    {
        try{
        Connection c = DriverManager.getConnection(
        "jdbc:mysql://"+ host + ":" + porta + "/" + bd + 
                "?useTimezone=true&serverTimezone=UTC",
                usuario, senha);
            System.out.println("Conexão efetuada com sucesso!!");
        return c;
        }
        catch(SQLException e)
        {
            System.out.println("Erro na conexão com o banco de dados!");
            return null;
        }
        
    }

    public boolean next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getString(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
