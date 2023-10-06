/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.product;

import static config.Config.JDBC_DRIVER;
import static config.Config.JDBC_SENHA;
import static config.Config.JDBC_URL;
import static config.Config.JDBC_USUARIO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ProductDAO {

    /**
     * Método utilizado para inserir um novo produto
     *
     * @param descricao
     * @param preco
     * @param foto
     * @param quantidade
     * @return
     */
    public boolean inserirProduto(String descricao, double preco, String foto, int quantidade) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement ps = c.prepareStatement("INSERT INTO produtos (descricao, preco, foto, quantidade) VALUES (?, ?, ?, ?)");
            ps.setString(1, descricao);
            ps.setDouble(2, preco);
            ps.setString(3, foto);
            ps.setInt(4, quantidade);
            sucesso = (ps.executeUpdate() == 1);
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
        return sucesso;
    }
    

    /**
     * Método utilizado para listar todos os produtos em estoque
     *
     * @return
     */
    public List<Product> getAll() {
        List<Product> produtos = new ArrayList();
        try {
            Class.forName(JDBC_DRIVER);
            Connection c = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement ps = c.prepareStatement("SELECT id, descricao, preco, foto, quantidade FROM produtos");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Product p = new Product();
                p.setDescricao(rs.getString("descricao"));
                p.setFoto(rs.getString("foto"));
                p.setId(rs.getInt("id"));
                p.setPreco(rs.getDouble("preco"));
                p.setQuantidade(rs.getInt("quantidade"));
                produtos.add(p);
            }
            rs.close();
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error");
        }
        return produtos;
    }
}
