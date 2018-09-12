package dao;

import Beans.ProfessoresBeans;
import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeels
 */
public class ProfessoresDAO {

     Connection conexao = null;

    public void create(ProfessoresBeans beans) {
       conexao = Conexao.conectar();
        try {
            String sql = "INSERT INTO TBPROFESSOR(NOMEPROFESSOR, CPF, DATANASCIMENTO, ENDERECO,BAIRRO, TELEFONE,EMAIL,INSTRUMENTO) values (?,?,?,?,?,?,?,?)";
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, beans.getNomeProfessor());
            stm.setString(2, beans.getCpf());
            stm.setString(3, beans.getDataNascimento());
            stm.setString(4, beans.getEndereco());
            stm.setString(5, beans.getBairro());
            stm.setString(6, beans.getTelefone());
            stm.setString(7, beans.getEmail());
            stm.setString(8, beans.getIntrumentos());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar professor no banco de dados." + ex);
        }

    }

}