package dao;

import Beans.AlunosBeans;
import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeels
 */
public class AlunosDAO {
    
    Connection conexao = null;
    
    public void create(AlunosBeans alunosBeans) {
        conexao = Conexao.conectar();
        try {
            String sql = "INSERT INTO TBALUNOS (NOMEALUNO, CPF, DATANASCIMENTO, ENDERECO,CEP, EMAIL,DATAPAGAMENTO, TELEFONE, DATACADASTRO,HORARIO,DIASSEMANAIS, INSTRUMENTOS) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setString(1, alunosBeans.getNomeAluno());
            stm.setString(2, alunosBeans.getCpf());
            stm.setString(3, alunosBeans.getDataNascimento());
            stm.setString(4, alunosBeans.getEndereco());
            stm.setString(5, alunosBeans.getCep());
            stm.setString(6, alunosBeans.getEmail());
            stm.setString(7, alunosBeans.getDataPag());
            stm.setString(8, alunosBeans.getTelefone());
            stm.setString(9, alunosBeans.getDataCadastro());
            stm.setString(10, alunosBeans.getHorario());
            stm.setString(11, alunosBeans.getDiasSemanais());
            stm.setString(12,alunosBeans.getInstrumento());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno no banco de dados. BD pode estar desativado." + ex);
        }

    }

    public List<AlunosBeans> JTableAlunos() {
        conexao = Conexao.conectar();
        PreparedStatement pstm;
        List<AlunosBeans> musicas = new ArrayList<>();

        try {
            String sql = "SELECT cod_Aluno, nomeAluno, telefone, horario, diassemanais,dataPagamento, ativo, Instrumentos from tbAlunos";
            pstm = conexao.prepareStatement(sql);
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                AlunosBeans mb = new AlunosBeans();
                mb.setCod_Aluno(resultSet.getLong("cod_aluno"));
                mb.setNomeAluno(resultSet.getString("nomeAluno"));
                mb.setTelefone(resultSet.getString("telefone"));
                mb.setHorario(resultSet.getString("horario"));
                mb.setDiasSemanais(resultSet.getString("diassemanais"));
                mb.setDataPag(resultSet.getString("dataPagamento"));
                mb.setAtivo(resultSet.getString("ativo"));
                mb.setInstrumento(resultSet.getString("instrumentos"));
                musicas.add(mb);
            }
            return musicas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
