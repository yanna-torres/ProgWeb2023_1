package model.user;

import config.Config;
import java.sql.*;

/**
 *
 * @author Yanna
 */
public class UserDAO {

    /**
     * Método utilizado para verificar se o login e senha do usuário são válidos
     *
     * @param login
     * @param senha
     * @return
     */
    public boolean validateAccess(String login, String password) {
        boolean success = false;
        try {
            Class.forName(Config.JDBC_DRIVER);
            Connection c = DriverManager.getConnection(Config.JDBC_URL);
            PreparedStatement ps = c.prepareStatement("SELECT * FROM usuario WHERE  login = ? AND password = ?");
            ps.setString(1, login);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                success = true;
            }
            rs.close();
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
            return false;
        }
        return success;
    }

    public boolean insertClient(String name, String address, String email, String login, String password) {
        boolean success = false;
        try {
            Class.forName(Config.JDBC_DRIVER);
            Connection c = DriverManager.getConnection(Config.JDBC_URL);
            PreparedStatement ps = c.prepareStatement("INSERT INTO usuario (name, address, email, login, password, admin) VALUES (?, ?, ?, ?, ?, 0)");
            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, email);
            ps.setString(4, login);
            ps.setString(5, password);
            success = (ps.executeUpdate() == 1);
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
            return false;
        }
        return success;
    }
}
