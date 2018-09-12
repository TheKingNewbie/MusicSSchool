package dao;
/**
 *
 * @author GSantiago
 */
import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDAO {

    Connection conexao = null;
    boolean check= false;
    
    public boolean verificaLogin(String usuario, String senha){
        conexao = Conexao.conectar();
        PreparedStatement pstm;
        
        try {
            String sql = "SELECT * FROM tbLogin WHERE usuario = ? AND senha = ?";
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, senha);
            
            ResultSet resultSet = pstm.executeQuery();

            if (resultSet.next()) {
                check = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "O servidor está desligado, ligue-o para acessar o programa."+e);
            throw new RuntimeException(e);
        }
        return check;
    }
    
    public boolean verificaSenha(String senha){
        conexao = Conexao.conectar();
        PreparedStatement pstm;
        
        try {
            String sql = "SELECT * FROM tbLogin WHERE senha = ?";
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, senha);
            ResultSet resultSet = pstm.executeQuery();

            if (resultSet.next()) {
                check = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "O servidor está desligado, ligue-o para acessar o programa."+e);
            throw new RuntimeException(e);
        }
        return check;
    }
    public void insereUsuario(String usuario, String senha){
        conexao = Conexao.conectar();
        PreparedStatement pstm;
        try {
            String sql = "INSERT INTO TBLOGIN (USUARIO, SENHA) VALUES (?,?)";
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, senha);
            pstm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "O servidor está desligado, ligue-o para acessar o programa."+e);
            throw new RuntimeException(e);
        }
    }
}
