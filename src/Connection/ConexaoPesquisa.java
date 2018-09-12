package Connection;

/**
 *
 * @author GSantiago
 */
import java.sql.*;
import javax.swing.*;

public class ConexaoPesquisa {
    final private String driver = "org.hsqldb.jdbc.JDBCDriver";
    final private String user = "root";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
     public ConexaoPesquisa(){ 
         
        try {
    Class.forName(driver);
    String url = "jdbc:hsqldb:file:ifpa/musicSSchool"; 
            
          conexao = DriverManager.getConnection(url, user, "");
          System.out.println("Conexão ok");
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,
          "Ocorreu um erro no banco de dados. Verifique a Base de Dados indicada !"+"\n" +  erro.getMessage(),"Conexão",3);
            erro.printStackTrace();
        }
    }
     public Connection conectar()
    {
        return conexao;
       
    }


    public void desconecta() {
        try {
            conexao.close();
        } catch (SQLException fech) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com o banco de dados" + fech);
        }
    }

    public void executaSQL(String sql) {
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Nao foi possível executar o comando sql"
                    + "" + sqlex + "O comando passado foi" + sql);
        }
    }
}
