package TelasInciais;

import Connection.ConexaoPesquisa;
import TelasCadastros.CadastroAlunos;
import TelasCadastros.CadastroMusicas;
import TelasCadastros.CadastroProfessor;
import TelasOperadoras.Orcamentos;
import TelasOperadoras.TelaMusicas;
import TelasOperadoras.TelaRelatorioAlunos;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author GSantiago
 */
public class TelaInicial extends javax.swing.JFrame {

    ConexaoPesquisa CONEXAO = new ConexaoPesquisa();
    DefaultListModel MODELO;
    int Enter = 0;
    String[] Codig;

    public TelaInicial() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        CONEXAO.conectar();
        MostraPesquisa();
        cxConfirm.setVisible(false);
        cxCOD.setVisible(false);
        listaFiltro.setVisible(false);
        cxPag.setVisible(false);
        this.jScrollPane2.setVisible(false);
        MODELO = new DefaultListModel();
        listaFiltro.setModel(MODELO);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxFiltro = new javax.swing.JTextField();
        btLogout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btaddAluno = new javax.swing.JButton();
        btAddProfessor = new javax.swing.JButton();
        btMusica = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        cxTelefone = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbNascimento3 = new javax.swing.JLabel();
        lbTel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFiltro = new javax.swing.JList<>();
        cxCOD = new javax.swing.JTextField();
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        cxEndereco = new javax.swing.JTextField();
        cxDiasSemanais = new javax.swing.JTextField();
        cxHorario = new javax.swing.JTextField();
        cxNascimento = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        cxInstrumento = new javax.swing.JTextField();
        cxProfessor = new javax.swing.JTextField();
        btConfig = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cxFaltas = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cxConfirm = new javax.swing.JButton();
        cxPag = new javax.swing.JTextField();
        cxPagamento = new javax.swing.JTextField();
        btOrcamento = new javax.swing.JButton();
        iconAddCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MusicSSchool");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        setName("TelaInicial"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        cxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFiltroActionPerformed(evt);
            }
        });
        cxFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxFiltroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cxFiltroKeyReleased(evt);
            }
        });
        getContentPane().add(cxFiltro);
        cxFiltro.setBounds(70, 200, 260, 24);

        btLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/05.png"))); // NOI18N
        btLogout.setBorder(null);
        btLogout.setContentAreaFilled(false);
        btLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogout);
        btLogout.setBounds(1400, 10, 110, 80);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("®  2018 - Todos os Direitos Reservados ®");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 810, 370, 21);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/06.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1310, 10, 80, 80);

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(650, 60, 0, 0);

        btaddAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/00.png"))); // NOI18N
        btaddAluno.setBorder(null);
        btaddAluno.setContentAreaFilled(false);
        btaddAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btaddAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btaddAluno);
        btaddAluno.setBounds(90, 10, 80, 80);

        btAddProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/01.png"))); // NOI18N
        btAddProfessor.setBorder(null);
        btAddProfessor.setContentAreaFilled(false);
        btAddProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAddProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(btAddProfessor);
        btAddProfessor.setBounds(260, 10, 80, 80);

        btMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/03.png"))); // NOI18N
        btMusica.setBorder(null);
        btMusica.setContentAreaFilled(false);
        btMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMusicaActionPerformed(evt);
            }
        });
        getContentPane().add(btMusica);
        btMusica.setBounds(660, 20, 80, 70);

        btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lista de alunos.png"))); // NOI18N
        btRelatorio.setBorder(null);
        btRelatorio.setContentAreaFilled(false);
        btRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btRelatorio);
        btRelatorio.setBounds(540, 20, 70, 70);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Filtro:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 180, 50, 18);

        lb.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lb.setForeground(new java.awt.Color(153, 153, 153));
        lb.setText("Alunos:");
        getContentPane().add(lb);
        lb.setBounds(200, 330, 100, 50);

        cxTelefone.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cxTelefone.setForeground(new java.awt.Color(0, 0, 0));
        cxTelefone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cxTelefone.setEnabled(false);
        getContentPane().add(cxTelefone);
        cxTelefone.setBounds(340, 520, 140, 29);

        lbNome.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(153, 153, 153));
        lbNome.setText("Nome:");
        getContentPane().add(lbNome);
        lbNome.setBounds(200, 400, 140, 20);

        lbEndereco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(153, 153, 153));
        lbEndereco.setText("Endereço:");
        getContentPane().add(lbEndereco);
        lbEndereco.setBounds(200, 450, 90, 18);

        lbNascimento3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbNascimento3.setForeground(new java.awt.Color(153, 153, 153));
        lbNascimento3.setText("Nascimento:");
        getContentPane().add(lbNascimento3);
        lbNascimento3.setBounds(200, 500, 100, 20);

        lbTel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbTel.setForeground(new java.awt.Color(153, 153, 153));
        lbTel.setText("Telefone:");
        getContentPane().add(lbTel);
        lbTel.setBounds(340, 500, 80, 18);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Horario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 550, 100, 20);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Professor:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 650, 100, 20);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Dias semanais:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(200, 600, 120, 20);

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Instrumento:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(200, 550, 100, 20);

        listaFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaFiltroMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(listaFiltro);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 220, 260, 60);

        cxCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCODActionPerformed(evt);
            }
        });
        getContentPane().add(cxCOD);
        cxCOD.setBounds(380, 350, 70, 24);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/addMusic.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setInheritsPopupMenu(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 10, 80, 80);

        cxEndereco.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cxEndereco.setForeground(new java.awt.Color(0, 0, 0));
        cxEndereco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cxEndereco.setEnabled(false);
        getContentPane().add(cxEndereco);
        cxEndereco.setBounds(200, 470, 350, 29);

        cxDiasSemanais.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cxDiasSemanais.setForeground(new java.awt.Color(0, 0, 0));
        cxDiasSemanais.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cxDiasSemanais.setEnabled(false);
        getContentPane().add(cxDiasSemanais);
        cxDiasSemanais.setBounds(200, 620, 240, 29);

        cxHorario.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cxHorario.setForeground(new java.awt.Color(0, 0, 0));
        cxHorario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cxHorario.setEnabled(false);
        getContentPane().add(cxHorario);
        cxHorario.setBounds(340, 570, 140, 29);

        cxNascimento.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cxNascimento.setForeground(new java.awt.Color(0, 0, 0));
        cxNascimento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cxNascimento.setEnabled(false);
        getContentPane().add(cxNascimento);
        cxNascimento.setBounds(200, 520, 120, 29);

        cxNome.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cxNome.setForeground(new java.awt.Color(0, 0, 0));
        cxNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cxNome.setEnabled(false);
        getContentPane().add(cxNome);
        cxNome.setBounds(200, 420, 350, 29);

        cxInstrumento.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cxInstrumento.setForeground(new java.awt.Color(0, 0, 0));
        cxInstrumento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cxInstrumento.setEnabled(false);
        getContentPane().add(cxInstrumento);
        cxInstrumento.setBounds(200, 570, 120, 29);

        cxProfessor.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cxProfessor.setForeground(new java.awt.Color(0, 0, 0));
        cxProfessor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cxProfessor.setEnabled(false);
        getContentPane().add(cxProfessor);
        cxProfessor.setBounds(200, 670, 240, 29);

        btConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btConfig.png"))); // NOI18N
        btConfig.setBorder(null);
        btConfig.setContentAreaFilled(false);
        btConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfigActionPerformed(evt);
            }
        });
        getContentPane().add(btConfig);
        btConfig.setBounds(1520, 30, 60, 50);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Data Pagamento:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 650, 140, 20);

        cxFaltas.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cxFaltas.setForeground(new java.awt.Color(0, 0, 0));
        cxFaltas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cxFaltas.setEnabled(false);
        getContentPane().add(cxFaltas);
        cxFaltas.setBounds(460, 620, 80, 29);

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Faltas:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(460, 600, 100, 20);

        cxConfirm.setText("CONFIRMAR");
        cxConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(cxConfirm);
        cxConfirm.setBounds(460, 710, 120, 20);

        cxPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPagActionPerformed(evt);
            }
        });
        getContentPane().add(cxPag);
        cxPag.setBounds(300, 350, 70, 24);

        cxPagamento.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cxPagamento.setForeground(new java.awt.Color(0, 0, 0));
        cxPagamento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cxPagamento.setEnabled(false);
        getContentPane().add(cxPagamento);
        cxPagamento.setBounds(460, 670, 130, 29);

        btOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/04.png"))); // NOI18N
        btOrcamento.setBorder(null);
        btOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btOrcamento.setOpaque(false);
        btOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrcamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btOrcamento);
        btOrcamento.setBounds(780, 20, 70, 70);

        iconAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Fundo001.jpg"))); // NOI18N
        getContentPane().add(iconAddCliente);
        iconAddCliente.setBounds(0, 0, 1600, 900);

        setSize(new java.awt.Dimension(1600, 900));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        TelaLogin chamaTela = new TelaLogin();
        chamaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btLogoutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMusicaActionPerformed
        TelaMusicas chamaTela = new TelaMusicas();
        chamaTela.setVisible(true);

    }//GEN-LAST:event_btMusicaActionPerformed
    private void btaddAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddAlunoActionPerformed
        CadastroAlunos chamaTela = new CadastroAlunos();
        chamaTela.setVisible(true);
    }//GEN-LAST:event_btaddAlunoActionPerformed

    private void btAddProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProfessorActionPerformed
        CadastroProfessor chamaTela = new CadastroProfessor();
        chamaTela.setVisible(true);
    }//GEN-LAST:event_btAddProfessorActionPerformed

    private void cxFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxFiltroKeyReleased
        if (cxFiltro.getText().equals("") || cxFiltro.getText().isEmpty()){
           TelaInicial chamaTela = new TelaInicial();
           chamaTela.setVisible(true);
        }else        
        if (Enter == 0) {
            ListaDePesquisa();
            cxPagamento.enable();
        } else {
            Enter = 0;
        }
    }//GEN-LAST:event_cxFiltroKeyReleased

    private void cxFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxFiltroKeyPressed
    }//GEN-LAST:event_cxFiltroKeyPressed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        TelaRelatorioAlunos chamaTela = new TelaRelatorioAlunos();
        chamaTela.setVisible(true);
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void cxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFiltroActionPerformed
        listaFiltro.setVisible(false);
        this.jScrollPane2.setVisible(false);
        Enter = 1;
    }//GEN-LAST:event_cxFiltroActionPerformed

    private void listaFiltroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaFiltroMousePressed
        MostraPesquisa();
        listaFiltro.setVisible(false);
        this.jScrollPane2.setVisible(false);
    }//GEN-LAST:event_listaFiltroMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CadastroMusicas chamaTela = new CadastroMusicas();
        chamaTela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfigActionPerformed
        TelaConfInicial chamaTela = new TelaConfInicial();
        chamaTela.setVisible(true);
    }//GEN-LAST:event_btConfigActionPerformed

    private void cxCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCODActionPerformed

    private void cxConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxConfirmActionPerformed
        // this.btPagamento();
    }//GEN-LAST:event_cxConfirmActionPerformed

    private void cxPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPagActionPerformed

    private void btOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrcamentoActionPerformed
        Orcamentos chamaTela = new Orcamentos();
        chamaTela.setVisible(true);
    }//GEN-LAST:event_btOrcamentoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddProfessor;
    private javax.swing.JButton btConfig;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btMusica;
    private javax.swing.JButton btOrcamento;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btaddAluno;
    private javax.swing.JTextField cxCOD;
    private javax.swing.JButton cxConfirm;
    private javax.swing.JTextField cxDiasSemanais;
    private javax.swing.JTextField cxEndereco;
    private javax.swing.JTextField cxFaltas;
    private javax.swing.JTextField cxFiltro;
    private javax.swing.JTextField cxHorario;
    private javax.swing.JTextField cxInstrumento;
    private javax.swing.JTextField cxNascimento;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPag;
    private javax.swing.JTextField cxPagamento;
    private javax.swing.JTextField cxProfessor;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JLabel iconAddCliente;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNascimento3;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTel;
    private javax.swing.JList<String> listaFiltro;
    // End of variables declaration//GEN-END:variables

    public void ListaDePesquisa() {
        try {
            CONEXAO.executaSQL("SELECT * FROM tbAlunos where nomeAluno like '" + cxFiltro.getText() + "%' ORDER BY nomeAluno");
            MODELO.removeAllElements();
            int v = 0;
            Codig = new String[4];
            while (CONEXAO.resultset.next() & v < 4) {
                MODELO.addElement(CONEXAO.resultset.getString("nomeAluno"));

                Codig[v] = CONEXAO.resultset.getString("cod_Aluno");
                v++;
            }
            if (v >= 1) {
                listaFiltro.setVisible(true);
                this.jScrollPane2.setVisible(true);
            } else {
                listaFiltro.setVisible(false);
                this.jScrollPane2.setVisible(false);
            }

            ResultadoPesquisa();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados" + erro);
        }
    }

    public void MostraPesquisa() {
        int Linha = listaFiltro.getSelectedIndex();
        if (Linha >= 0) {
            CONEXAO.executaSQL("SELECT * FROM tbAlunos where cod_Aluno = " + Codig[Linha] + " ");
            ResultadoPesquisa();
        }

    }

    public void ResultadoPesquisa() {
        /*
         * Passo1: Criei um banco de dados no MySql chamado: escolamusica
         * Passo2: Criei uma tabela nessa banco chamado: tbAlunos
         * Passo3: Criei as colunas na tabela criada conforme abaixo:
         * Exemplo: cod_Aluno,nomeAluno,telefone...
         */

        try {
            CONEXAO.resultset.first();
            cxCOD.setText(CONEXAO.resultset.getString("cod_aluno"));
            cxNome.setText(CONEXAO.resultset.getString("nomeAluno"));
            cxTelefone.setText(CONEXAO.resultset.getString("telefone"));
            cxEndereco.setText(CONEXAO.resultset.getString("endereco"));
            cxInstrumento.setText(CONEXAO.resultset.getString("instrumentos"));
            cxDiasSemanais.setText(CONEXAO.resultset.getString("diasSemanais"));
            this.cxHorario.setText(CONEXAO.resultset.getString("horario"));
            this.cxNascimento.setText(CONEXAO.resultset.getString("dataNascimento"));
            cxFaltas.setText(CONEXAO.resultset.getString("ativo"));
            cxPagamento.setText(CONEXAO.resultset.getString("dataPagamento"));
            this.cxProfessor.setText(CONEXAO.resultset.getString(""));
        } catch (SQLException erro) {
            System.out.println("Não há cadastro com esse Nome.>>  "+erro);
        }
    }

    /* public void btPagamento() {
        Connection conexao = null;
        AlunosDAO dao = new AlunosDAO();
        String cod = cxCOD.getText();System.out.println(cod);
        String pag = cxPagamento.getSelectedItem().toString();System.out.println(pag);
        String sql = "update tbAlunos set mesPagamento = '" + pag + "' where cod_aluno = " + cod;System.out.println(sql);
        //------------------------------------------------------------------------//
        conexao = Conexao.conectar();
        try {
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao fazer Update de pagamento do aluno no banco de dados.");
        }
        //-----------------------------------------------------------------------//
    }*/


}
