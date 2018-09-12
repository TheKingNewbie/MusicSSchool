package Connection;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    private static final String DRIVER = "org.hsqldb.jdbcDriver";
    private static final String URL = "jdbc:hsqldb:file:musicSSchool"; 
    private static final String usuario = "root";
    private static Connection conexao;
 public Conexao(){ 
        try {

          
    Class.forName(DRIVER);
    String url = "jdbc:hsqldb:file:musicSSchool";  
    String usuario = "root";
          conexao = DriverManager.getConnection(url, usuario, "");
          System.out.println("Conexão ok");
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,
          "Ocorreu um erro no banco de dados. Verifique a Base de Dados indicada !"+"\n" +  erro.getMessage(),"Conexão",3);
            erro.printStackTrace();
        }
    }
 public static Connection conectar()
    {
        return conexao;
       
    }

    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no fechamento do BD");
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no fechamento da conexao BD");
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no fechamento do BD");
        }
    }

}
