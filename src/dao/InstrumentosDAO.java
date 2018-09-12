package dao;

import Beans.InstrumentosBeans;
import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GSantiago
 */
public class InstrumentosDAO {

     Connection conexao = null;

    public void create(InstrumentosBeans beans) {
       conexao = Conexao.conectar();
        try {
            String sql = "INSERT INTO TBINSTRUMENTOS(nomeInstrumento) values (?)";
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, beans.getNomeCurso());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar instrumento no banco de dados." + ex);
        }

    }

}
