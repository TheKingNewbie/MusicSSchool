package dao;

/**
 *
 * @author GSantiago
 */
import Beans.MusicasBeans;
import Connection.Conexao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MusicasDAO {

    Connection conexao = null;

    public void create(MusicasBeans beans) {
        conexao = Conexao.conectar();
        try {
            String sql = "INSERT INTO TBMUSICACASAMENTO(NOMEMUSICA, ESTILO, CANTOR,HIPERLINK,GENERO) values (?,?,?,?,?)";
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, beans.getNomeMusica());
            stm.setString(2, beans.getEstilo());
            stm.setString(3, beans.getCantor());
            stm.setString(4, beans.getHiperlink());
            stm.setString(5, beans.getGenero());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar as músicas no banco de dados." + ex);
        }
    }

    public List<MusicasBeans> JTableMusic() {
        conexao = Conexao.conectar();
        PreparedStatement pstm;
        
        List<MusicasBeans> musicas = new ArrayList<>();
                
        try {
            String sql = "SELECT * FROM tbmusicacasamento";
            pstm = conexao.prepareStatement(sql);
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
               MusicasBeans mb = new MusicasBeans();
                mb.setIdMusicas(resultSet.getLong("idMusica"));
                mb.setNomeMusica(resultSet.getString("nomeMusica"));
                mb.setEstilo(resultSet.getString("estilo"));
                mb.setCantor(resultSet.getString("cantor"));
                mb.setHiperlink(resultSet.getString("hiperlink"));
                mb.setGenero(resultSet.getString("genero"));
                musicas.add(mb);
            }
            return musicas;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
