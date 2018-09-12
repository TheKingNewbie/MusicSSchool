package dao;

import Connection.Conexao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GSantiago
 */
public class FiltroDAO {

    Connection conexao = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    

    public void filtrarAlunosInicial(String nomeAluno) {
        conexao = Conexao.conectar();
        try {
            String sql = "SELECT nomeAluno, endereco, dataNascimento, telefone, instrumentos,horario, diasSemanais FROM TBALUNOS WHERE nomeAluno LIKE ?";
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, nomeAluno + "%");
            pstm.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro SELECT * FROM TBALUNOS." + ex);
        }
    }

}
