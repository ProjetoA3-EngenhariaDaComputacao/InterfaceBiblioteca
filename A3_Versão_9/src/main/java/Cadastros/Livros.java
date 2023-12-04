/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pietr
 */
public class Livros {
        
    public String titulo;
    public String autor;
    public String genero;
    public int nota;

    public Livros() {
        
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }
    
    public int getNota() {
        return nota;
    }


    public Livros(String titulo, String autor, String genero, int nota) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.nota = nota;
    }
    public void inserir() throws SQLException
    {
        String sql = "INSERT INTO livros(titulo, autor, genero, nota) "
                + "VALUES (?, ?, ?, ?)";
        
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, titulo);
            ps.setString(2, autor);
            ps.setString(3, genero);
            ps.setInt(4, nota);
            
            
            JOptionPane.showMessageDialog(null,"Livro cadastrado com sucesso!!");
            
        }   
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERRO no cadastro do livro!!!");
        }
        
    }
}
