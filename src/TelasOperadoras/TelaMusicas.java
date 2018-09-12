package TelasOperadoras;

import Beans.MusicasBeans;
import Connection.Conexao;
import TelasInciais.TelaInicial;
import dao.MusicasDAO;
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
public class TelaMusicas extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    public TelaMusicas() {
        initComponents();
        conn = Conexao.conectar();
       //tableTransparente();
        DefaultTableModel modelo = (DefaultTableModel) tableMusicas.getModel();
        tableMusicas.setRowSorter(new TableRowSorter(modelo));
        mostraTable();
    }

    public void mostraTable() {
        DefaultTableModel modelo = (DefaultTableModel) tableMusicas.getModel();

        MusicasDAO DAO = new MusicasDAO();
        modelo.setNumRows(0);
        for (MusicasBeans mb : DAO.JTableMusic()) {
            modelo.addRow(new Object[]{
                mb.getIdMusicas(),
                mb.getNomeMusica(),
                mb.getCantor(),
                mb.getEstilo(),
                mb.getHiperlink(),
                mb.getGenero()
            });

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMusicas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cxFiltro = new javax.swing.JTextField();
        btFiltro = new javax.swing.JButton();
        iconAddCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Músicas");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        tableMusicas.setAutoCreateRowSorter(true);
        tableMusicas.setBackground(new java.awt.Color(255, 255, 255));
        tableMusicas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        tableMusicas.setForeground(new java.awt.Color(0, 0, 0));
        tableMusicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome da Música", "Nome do Cantor", "Estilo", "HiperLink", "Gênero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMusicas.setToolTipText("");
        tableMusicas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tableMusicas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableMusicas.setDragEnabled(true);
        tableMusicas.setOpaque(false);
        jScrollPane1.setViewportView(tableMusicas);
        if (tableMusicas.getColumnModel().getColumnCount() > 0) {
            tableMusicas.getColumnModel().getColumn(0).setResizable(false);
            tableMusicas.getColumnModel().getColumn(0).setPreferredWidth(40);
            tableMusicas.getColumnModel().getColumn(1).setResizable(false);
            tableMusicas.getColumnModel().getColumn(1).setPreferredWidth(180);
            tableMusicas.getColumnModel().getColumn(2).setResizable(false);
            tableMusicas.getColumnModel().getColumn(2).setPreferredWidth(180);
            tableMusicas.getColumnModel().getColumn(3).setResizable(false);
            tableMusicas.getColumnModel().getColumn(3).setPreferredWidth(150);
            tableMusicas.getColumnModel().getColumn(4).setResizable(false);
            tableMusicas.getColumnModel().getColumn(4).setPreferredWidth(250);
            tableMusicas.getColumnModel().getColumn(5).setResizable(false);
            tableMusicas.getColumnModel().getColumn(5).setPreferredWidth(90);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 160, 790, 460);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btVoltar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 30, 50, 50);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Lista de músicas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 20, 380, 60);

        cxFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxFiltroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cxFiltroKeyReleased(evt);
            }
        });
        getContentPane().add(cxFiltro);
        cxFiltro.setBounds(600, 120, 220, 24);

        btFiltro.setText("Filtrar");
        btFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltroActionPerformed(evt);
            }
        });
        getContentPane().add(btFiltro);
        btFiltro.setBounds(727, 100, 90, 20);

        iconAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Fundo001.jpg"))); // NOI18N
        getContentPane().add(iconAddCliente);
        iconAddCliente.setBounds(-370, -110, 1550, 930);

        setSize(new java.awt.Dimension(866, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaInicial chamaTela = new TelaInicial();
        chamaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cxFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxFiltroKeyReleased
          pesquisa_musicas();
    }//GEN-LAST:event_cxFiltroKeyReleased

    private void btFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltroActionPerformed
        cxFiltro.setText(null);
    }//GEN-LAST:event_btFiltroActionPerformed

    private void cxFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxFiltroKeyPressed
    }//GEN-LAST:event_cxFiltroKeyPressed
    public void pesquisa_musicas() {
        String sql = "select * from tbMusicaCasamento WHERE nomeMusica like ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cxFiltro.getText() + "%");
            rs = pstm.executeQuery();
            tableMusicas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public final void tableTransparente() {
        this.tableMusicas.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer) tableMusicas.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0, 0));
        tableMusicas.setGridColor(Color.gray);
        tableMusicas.setSelectionBackground(Color.black);
        jScrollPane1.setBackground(new Color(0, 0, 0, 0));
        jScrollPane1.setOpaque(false);
        tableMusicas.setOpaque(false);
        ((DefaultTableCellRenderer) tableMusicas.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        tableMusicas.setShowGrid(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMusicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFiltro;
    private javax.swing.JTextField cxFiltro;
    private javax.swing.JLabel iconAddCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMusicas;
    // End of variables declaration//GEN-END:variables
}
