package TelasCadastros;

import Beans.ProfessoresBeans;
import TelasInciais.TelaInicial;
import dao.ProfessoresDAO;
import java.awt.Color;
import javax.swing.JOptionPane;

;

/**
 *
 * @author GSantiago
 */
public class CadastroProfessor extends javax.swing.JFrame {

    ProfessoresDAO dao = new ProfessoresDAO();

    public CadastroProfessor() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        cxNome = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        cxCPF = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbNascimento1 = new javax.swing.JLabel();
        lbNascimento = new javax.swing.JLabel();
        lbTel = new javax.swing.JLabel();
        cxTelefone = new javax.swing.JTextField();
        lbNascimento3 = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btLimpaCampos = new javax.swing.JButton();
        cxNumCasa = new javax.swing.JTextField();
        cxBairro = new javax.swing.JTextField();
        cxNascimento = new javax.swing.JTextField();
        cxEmail = new javax.swing.JTextField();
        cxEndereco = new javax.swing.JTextField();
        lbCPF2 = new javax.swing.JLabel();
        cxInstrumento = new javax.swing.JComboBox<>();
        idInst = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        iconAddCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Professores");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensProject/cameraSemFoto.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 110, 150, 150);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("By Jean Gabriel  - Developer -");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 590, 270, 20);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Cadastro de Professores");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 20, 550, 60);

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
        btVoltar.setBounds(20, 30, 40, 40);

        cxNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cxNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cxNomeFocusGained(evt);
            }
        });
        getContentPane().add(cxNome);
        cxNome.setBounds(240, 190, 350, 27);

        lbNome.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
        lbNome.setText("Nome Completo:");
        getContentPane().add(lbNome);
        lbNome.setBounds(240, 170, 140, 20);
        getContentPane().add(cxCPF);
        cxCPF.setBounds(240, 240, 160, 24);

        lbCPF.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbCPF.setForeground(new java.awt.Color(204, 204, 204));
        lbCPF.setText("Instrumento:");
        getContentPane().add(lbCPF);
        lbCPF.setBounds(430, 220, 140, 18);

        lbEndereco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(204, 204, 204));
        lbEndereco.setText("Endereço:");
        getContentPane().add(lbEndereco);
        lbEndereco.setBounds(60, 280, 90, 18);

        lbNascimento1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbNascimento1.setForeground(new java.awt.Color(204, 204, 204));
        lbNascimento1.setText("Bairro:");
        getContentPane().add(lbNascimento1);
        lbNascimento1.setBounds(540, 280, 90, 20);

        lbNascimento.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbNascimento.setForeground(new java.awt.Color(204, 204, 204));
        lbNascimento.setText("Número:");
        getContentPane().add(lbNascimento);
        lbNascimento.setBounds(430, 280, 110, 20);

        lbTel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbTel.setForeground(new java.awt.Color(204, 204, 204));
        lbTel.setText("Telefone:");
        getContentPane().add(lbTel);
        lbTel.setBounds(430, 330, 80, 18);

        cxTelefone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(cxTelefone);
        cxTelefone.setBounds(430, 350, 140, 27);

        lbNascimento3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbNascimento3.setForeground(new java.awt.Color(204, 204, 204));
        lbNascimento3.setText("Data de Nascimento:");
        getContentPane().add(lbNascimento3);
        lbNascimento3.setBounds(60, 330, 160, 20);

        lbEmail.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(204, 204, 204));
        lbEmail.setText("Email:");
        getContentPane().add(lbEmail);
        lbEmail.setBounds(60, 380, 60, 20);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar);
        btCadastrar.setBounds(480, 450, 110, 30);

        btLimpaCampos.setText("Limpar Campos");
        btLimpaCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpaCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpaCampos);
        btLimpaCampos.setBounds(220, 450, 160, 30);
        getContentPane().add(cxNumCasa);
        cxNumCasa.setBounds(430, 300, 80, 24);
        getContentPane().add(cxBairro);
        cxBairro.setBounds(540, 300, 140, 24);
        getContentPane().add(cxNascimento);
        cxNascimento.setBounds(60, 350, 160, 24);
        getContentPane().add(cxEmail);
        cxEmail.setBounds(60, 400, 350, 24);
        getContentPane().add(cxEndereco);
        cxEndereco.setBounds(60, 300, 350, 24);

        lbCPF2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbCPF2.setForeground(new java.awt.Color(204, 204, 204));
        lbCPF2.setText("CPF:");
        getContentPane().add(lbCPF2);
        lbCPF2.setBounds(240, 220, 50, 18);

        cxInstrumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Violão", "Baixo", "Violino", "Teclado", "Bateria"}));
        cxInstrumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cxInstrumentoItemStateChanged(evt);
            }
        });
        getContentPane().add(cxInstrumento);
        cxInstrumento.setBounds(420, 240, 160, 26);
        getContentPane().add(idInst);
        idInst.setBounds(590, 240, 30, 24);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 220, 40, 20);

        iconAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundos/Listalunos.png"))); // NOI18N
        getContentPane().add(iconAddCliente);
        iconAddCliente.setBounds(0, 0, 760, 660);

        setSize(new java.awt.Dimension(766, 664));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaInicial chamaTela = new TelaInicial();
        chamaTela.setVisible(true);
        dispose();
        //chama a tela inicial
    }//GEN-LAST:event_btVoltarActionPerformed
    private void btLimpaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaCamposActionPerformed
        // apaga os dados preenchidos nos campos de texto
        cxNome.setText("");
        cxEmail.setText("");
        cxTelefone.setText("");
        cxEndereco.setText("");
        cxNumCasa.setText("");
        this.cxBairro.setText("");
        this.cxCPF.setText("");
        this.cxNascimento.setText("");
    }//GEN-LAST:event_btLimpaCamposActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        ProfessoresBeans beans = new ProfessoresBeans();

        if (cxNome.getText().isEmpty()) {
            cxNome.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Campo nome sem preenchimento.");
            cxNome.setBackground(new Color(255, 255, 255));
        } else if (cxEndereco.getText().isEmpty()) {
            cxEndereco.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Campo Endereço sem preenchimento.");
            cxEndereco.setBackground(new Color(255, 255, 255));
        } else if (cxEmail.getText().isEmpty()) {
            cxEmail.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Campo Email sem preenchimento.");
            cxEmail.setBackground(new Color(255, 255, 255));
        } else if (cxTelefone.getText().isEmpty()) {
            cxTelefone.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Campo Telefone sem preenchimento.");
            cxTelefone.setBackground(new Color(255, 255, 255));
        } else if (cxCPF.getText().isEmpty()) {
            cxCPF.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Campo CPF sem preenchimento.");
            cxCPF.setBackground(new Color(255, 255, 255));
        } else {
            // instanciando a classe Professor do pacote Beans e criando seu objeto beans
            beans.setNomeProfessor(cxNome.getText());
            beans.setCpf(cxCPF.getText());
            beans.setDataNascimento(this.cxNascimento.getText());
            beans.setEndereco(cxEndereco.getText());
            beans.setBairro(cxBairro.getText());
            beans.setTelefone(cxTelefone.getText());
            beans.setEmail(cxEmail.getText());
            beans.setIntrumentos(cxInstrumento.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
            dao.create(beans);
        }


    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cxNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cxNomeFocusGained
    }//GEN-LAST:event_cxNomeFocusGained

    private void cxInstrumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cxInstrumentoItemStateChanged
        int id = 0;

        if (cxInstrumento.getSelectedItem().toString().equals("Violão")) {
            id++;
            idInst.setText(String.valueOf(id));

        } else if (cxInstrumento.getSelectedItem().toString().equals("Baixo")) {

            id = 1 + 1;
            idInst.setText(String.valueOf(id));

        } else if (cxInstrumento.getSelectedItem().toString().equals("Violino")) {

            id = 2 + 1;
            idInst.setText(String.valueOf(id));

        } else if (cxInstrumento.getSelectedItem().toString().equals("Teclado")) {

            id = 3 + 1;
            idInst.setText(String.valueOf(id));

        } else if (cxInstrumento.getSelectedItem().toString().equals("Bateria")) {

            id = 4 + 1;
            idInst.setText(String.valueOf(id));

        }

    }//GEN-LAST:event_cxInstrumentoItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpaCampos;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxBairro;
    private javax.swing.JTextField cxCPF;
    private javax.swing.JTextField cxEmail;
    private javax.swing.JTextField cxEndereco;
    private javax.swing.JComboBox<String> cxInstrumento;
    private javax.swing.JTextField cxNascimento;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumCasa;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JLabel iconAddCliente;
    private javax.swing.JTextField idInst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCPF2;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNascimento;
    private javax.swing.JLabel lbNascimento1;
    private javax.swing.JLabel lbNascimento3;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTel;
    // End of variables declaration//GEN-END:variables
}
