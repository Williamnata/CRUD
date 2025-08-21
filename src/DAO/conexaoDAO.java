package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexaoDAO {
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/bancobd?user=root&password=12345678";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            erro.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro na conexaoDAO: " + erro.getMessage());
        }
        return conn;
    }
}