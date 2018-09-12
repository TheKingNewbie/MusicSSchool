package dao;

import Beans.OrcamentoBeans;
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
public class OrcamentoDAO {

    Connection conexao = null;

    public void create(OrcamentoBeans beans) {
        conexao = Conexao.conectar();
        try {
            String sql = "INSERT INTO TBORCAMENTO(VALORTOTAL, TIPOFESTA, OBS, INST1,INST2,INST3,INST4,INST5,INST6,INST7,INST8,INST9,INST10,QTD1,QTD2,QTD3,QTD4,QTD5,QTD6,QTD7,QTD8,QTD9,QTD10,OBS1,OBS2,OBS3,OBS4,OBS5,OBS6,OBS7,OBS8,OBS9,OBS10) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, beans.getValorTotal());
            stm.setString(2, beans.getTipoFesta());
            stm.setString(3, beans.getObs());
            stm.setString(4, beans.getInst1());
            stm.setString(5, beans.getInst2());
            stm.setString(6, beans.getInst3());
            stm.setString(7, beans.getInst4());
            stm.setString(8, beans.getInst5());
            stm.setString(9, beans.getInst6());
            stm.setString(10, beans.getInst7());
            stm.setString(11, beans.getInst8());
            stm.setString(12, beans.getInst9());
            stm.setString(13, beans.getInst10());
            stm.setInt(14, beans.getQtd1());
            stm.setInt(15, beans.getQtd2());
            stm.setInt(16, beans.getQtd3());
            stm.setInt(17, beans.getQtd4());
            stm.setInt(18, beans.getQtd5());
            stm.setInt(19, beans.getQtd6());
            stm.setInt(20, beans.getQtd7());
            stm.setInt(21, beans.getQtd8());
            stm.setInt(22, beans.getQtd9());
            stm.setInt(23, beans.getQtd10());
            stm.setString(24, beans.getObs1());
            stm.setString(25, beans.getObs2());
            stm.setString(26, beans.getObs3());
            stm.setString(27, beans.getObs4());
            stm.setString(28, beans.getObs5());
            stm.setString(29, beans.getObs6());
            stm.setString(30, beans.getObs7());
            stm.setString(31, beans.getObs8());
            stm.setString(32, beans.getObs9());
            stm.setString(33, beans.getObs10());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar orçamento no banco de dados. BD pode estar desativado." + ex);
        }

    }

}
