package TelasOperadoras;

import Beans.AlunosBeans;
import Connection.Conexao;
import TelasInciais.TelaInicial;
import dao.AlunosDAO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author GSantiago
 */
public class TelaRelatorioAlunos extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public TelaRelatorioAlunos() {
        initComponents();
        //tableTransparente();
        conn = Conexao.conectar();
        DefaultTableModel modelo = (DefaultTableModel) tableAlunos.getModel();
        tableAlunos.setRowSorter(new TableRowSorter(modelo));
        mostraTable();
    }

    public void mostraTable() {
        DefaultTableModel modelo = (DefaultTableModel) tableAlunos.getModel();

        AlunosDAO DAO = new AlunosDAO();
        modelo.setNumRows(0);
        for (AlunosBeans mb : DAO.JTableAlunos()) {
            modelo.addRow(new Object[]{
                mb.getCod_Aluno(),
                mb.getNomeAluno(),
                mb.getInstrumento(),
                mb.getHorario(),
                mb.getDiasSemanais(),
                mb.getTelefone(),
                mb.getDataPag(),
                mb.getAtivo()
            });

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        boxDia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cxFiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boxHora = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlunos = new javax.swing.JTable();
        iconAddCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Alunos");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btVoltar.png"))); // NOI18N
        btVoltar.setBorder(null);
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(40, 30, 50, 40);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Lista de Alunos");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 30, 380, 60);

        boxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábados" }));
        boxDia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxDiaItemStateChanged(evt);
            }
        });
        boxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDiaActionPerformed(evt);
            }
        });
        getContentPane().add(boxDia);
        boxDia.setBounds(270, 170, 110, 26);

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Dia da Semana:               Horário:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 150, 190, 16);

        cxFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxFiltroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cxFiltroKeyReleased(evt);
            }
        });
        getContentPane().add(cxFiltro);
        cxFiltro.setBounds(30, 170, 220, 24);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Filtrar:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 150, 60, 18);

        boxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De 8h às 9h", "De 9h às 10h", "De 10h às 11h", "De 11h às 12h", "De 12h às 13h", "De 13h às 14h", "De 14h às 15h", "De 15h às 16h", "De 16h às 17h", "De 17h às 18h", "De 18h às 19h" }));
        boxHora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxHoraItemStateChanged(evt);
            }
        });
        getContentPane().add(boxHora);
        boxHora.setBounds(400, 170, 110, 26);

        tableAlunos.setAutoCreateRowSorter(true);
        tableAlunos.setBackground(new java.awt.Color(255, 255, 255));
        tableAlunos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        tableAlunos.setForeground(new java.awt.Color(51, 51, 51));
        tableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Aluno", "Instrumento", "Horário", "Dias de Aula", "Telefone", "Pagamento", "Faltas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAlunos.setToolTipText("");
        tableAlunos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tableAlunos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableAlunos.setDragEnabled(true);
        tableAlunos.setOpaque(false);
        tableAlunos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableAlunos);
        if (tableAlunos.getColumnModel().getColumnCount() > 0) {
            tableAlunos.getColumnModel().getColumn(0).setResizable(false);
            tableAlunos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableAlunos.getColumnModel().getColumn(1).setResizable(false);
            tableAlunos.getColumnModel().getColumn(1).setPreferredWidth(250);
            tableAlunos.getColumnModel().getColumn(2).setResizable(false);
            tableAlunos.getColumnModel().getColumn(2).setPreferredWidth(80);
            tableAlunos.getColumnModel().getColumn(3).setResizable(false);
            tableAlunos.getColumnModel().getColumn(3).setPreferredWidth(120);
            tableAlunos.getColumnModel().getColumn(4).setResizable(false);
            tableAlunos.getColumnModel().getColumn(4).setPreferredWidth(220);
            tableAlunos.getColumnModel().getColumn(5).setResizable(false);
            tableAlunos.getColumnModel().getColumn(5).setPreferredWidth(140);
            tableAlunos.getColumnModel().getColumn(6).setResizable(false);
            tableAlunos.getColumnModel().getColumn(6).setPreferredWidth(80);
            tableAlunos.getColumnModel().getColumn(7).setResizable(false);
            tableAlunos.getColumnModel().getColumn(7).setPreferredWidth(50);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 210, 940, 460);

        iconAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundos/back5.png"))); // NOI18N
        getContentPane().add(iconAddCliente);
        iconAddCliente.setBounds(0, -10, 1030, 780);

        setSize(new java.awt.Dimension(999, 772));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaInicial chamaTela = new TelaInicial();
        chamaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void boxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDiaActionPerformed
    }//GEN-LAST:event_boxDiaActionPerformed

    private void boxDiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxDiaItemStateChanged
        String box = this.boxDia.getSelectedItem().toString();

        String sql = "SELECT COD_ALUNO AS ID, NOMEALUNO AS NOME , INSTRUMENTOS AS INSTRUMENTO, HORARIO AS HORÁRIO, DIASSEMANAIS AS DIAS_DE_AULA, TELEFONE, DATAPAGAMENTO AS PAGAMENTO, ATIVO AS FALTAS FROM TBALUNOS WHERE DIASSEMANAIS like ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + box + "%");
            rs = pstm.executeQuery();
            tableAlunos.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_boxDiaItemStateChanged

    private void cxFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxFiltroKeyPressed

    }//GEN-LAST:event_cxFiltroKeyPressed

    private void cxFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxFiltroKeyReleased
        if (cxFiltro.getText().equals("") || cxFiltro.getText().isEmpty()){
            TelaRelatorioAlunos r = new TelaRelatorioAlunos();
            r.setVisible(true);
            dispose();
        }else{
        pesquisa_alunos();
        }
    }//GEN-LAST:event_cxFiltroKeyReleased

    private void boxHoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxHoraItemStateChanged
        String box = this.boxHora.getSelectedItem().toString();

        String sql = "SELECT COD_ALUNO AS ID, NOMEALUNO AS NOME , INSTRUMENTOS AS INSTRUMENTO, HORARIO AS HORÁRIO, DIASSEMANAIS AS DIAS_DE_AULA, TELEFONE, DATAPAGAMENTO AS PAGAMENTO, ATIVO AS FALTAS FROM TBALUNOS WHERE HORARIO like ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%"+ box + "%");
            rs = pstm.executeQuery();
            tableAlunos.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_boxHoraItemStateChanged

    public final void tableTransparente() {
        this.tableAlunos.setBackground(new Color(0, 0, 0, 0));

        ((DefaultTableCellRenderer) tableAlunos.getDefaultRenderer(Object.class
        )).setBackground(new Color(0, 0, 0, 0));
        tableAlunos.setGridColor(Color.darkGray);
        jScrollPane1.setBackground(new Color(0, 0, 0, 0));
        jScrollPane1.setOpaque(false);
        tableAlunos.setOpaque(false);

        ((DefaultTableCellRenderer) tableAlunos.getDefaultRenderer(Object.class
        )).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        tableAlunos.setShowGrid(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDia;
    private javax.swing.JComboBox<String> boxHora;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxFiltro;
    private javax.swing.JLabel iconAddCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAlunos;
    // End of variables declaration//GEN-END:variables

    public void pesquisa_alunos() {
        String sql = "SELECT COD_ALUNO AS ID, NOMEALUNO AS NOME , INSTRUMENTOS AS INSTRUMENTO, HORARIO AS HORÁRIO, DIASSEMANAIS AS DIAS_DE_AULA, TELEFONE, DATAPAGAMENTO AS PAGAMENTO, ATIVO AS FALTAS FROM TBALUNOS WHERE NOMEALUNO like ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,"%" + cxFiltro.getText() + "%");
            rs = pstm.executeQuery();
            tableAlunos.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
