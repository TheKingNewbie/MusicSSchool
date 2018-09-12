package TelasCadastros;

import Beans.MusicasBeans;
import TelasInciais.TelaInicial;
import TelasOperadoras.TelaMusicas;
import dao.MusicasDAO;
import java.awt.Color;

import javax.swing.JOptionPane;

public class CadastroMusicas extends javax.swing.JFrame {

    TelaInicial chamaTela = new TelaInicial();
    MusicasDAO dao = new MusicasDAO();

    public CadastroMusicas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSlider1 = new javax.swing.JSlider();
        btProsseguir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cxNomeMusica = new javax.swing.JTextField();
        lblNomeMusica = new javax.swing.JLabel();
        boxEstiloMusica = new javax.swing.JComboBox<>();
        lbEstiloMusica = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cxHiperLink = new javax.swing.JTextField();
        cxNomeCantor = new javax.swing.JTextField();
        lbNomeCantor = new javax.swing.JLabel();
        lbNomeGenero = new javax.swing.JLabel();
        cxNomeGenero = new javax.swing.JTextField();
        btAddMusicas = new javax.swing.JButton();
        iconAddCliente = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MusicSSchool");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        setName("TelaInicial"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        btProsseguir.setText("Lista de Músicas");
        btProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProsseguirActionPerformed(evt);
            }
        });
        getContentPane().add(btProsseguir);
        btProsseguir.setBounds(90, 430, 140, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Cadastro de Músicas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 40, 480, 60);

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
        jButton1.setBounds(30, 30, 40, 40);
        getContentPane().add(cxNomeMusica);
        cxNomeMusica.setBounds(60, 220, 200, 20);

        lblNomeMusica.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblNomeMusica.setForeground(new java.awt.Color(204, 204, 204));
        lblNomeMusica.setText("Nome da Música:");
        getContentPane().add(lblNomeMusica);
        lblNomeMusica.setBounds(60, 200, 130, 20);

        boxEstiloMusica.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boxEstiloMusica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saida", "Festa" }));
        getContentPane().add(boxEstiloMusica);
        boxEstiloMusica.setBounds(360, 220, 170, 27);

        lbEstiloMusica.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbEstiloMusica.setForeground(new java.awt.Color(204, 204, 204));
        lbEstiloMusica.setText("Estilo:");
        getContentPane().add(lbEstiloMusica);
        lbEstiloMusica.setBounds(360, 200, 60, 20);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("HiperLink:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 270, 80, 18);
        getContentPane().add(cxHiperLink);
        cxHiperLink.setBounds(360, 290, 250, 24);
        getContentPane().add(cxNomeCantor);
        cxNomeCantor.setBounds(60, 290, 200, 20);

        lbNomeCantor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbNomeCantor.setForeground(new java.awt.Color(204, 204, 204));
        lbNomeCantor.setText("Cantor:");
        getContentPane().add(lbNomeCantor);
        lbNomeCantor.setBounds(60, 270, 130, 20);

        lbNomeGenero.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbNomeGenero.setForeground(new java.awt.Color(204, 204, 204));
        lbNomeGenero.setText("Gênero:");
        getContentPane().add(lbNomeGenero);
        lbNomeGenero.setBounds(60, 340, 130, 20);
        getContentPane().add(cxNomeGenero);
        cxNomeGenero.setBounds(60, 360, 200, 20);

        btAddMusicas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btAddMusicas.setText("Adicionar");
        btAddMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddMusicasActionPerformed(evt);
            }
        });
        getContentPane().add(btAddMusicas);
        btAddMusicas.setBounds(320, 350, 110, 34);

        iconAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundos/Listalunos.png"))); // NOI18N
        getContentPane().add(iconAddCliente);
        iconAddCliente.setBounds(-10, -10, 690, 630);

        setSize(new java.awt.Dimension(674, 625));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProsseguirActionPerformed
        TelaMusicas chamaTela = new TelaMusicas();
        chamaTela.setVisible(true);
        dispose();

    }//GEN-LAST:event_btProsseguirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        chamaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btAddMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddMusicasActionPerformed
        MusicasBeans beans = new MusicasBeans();

        if (cxNomeMusica.getText().isEmpty()) {
            cxNomeMusica.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Nome da música sem preenchimento.");
            cxNomeMusica.setBackground(new Color(255, 255, 255));
        } else if (cxNomeCantor.getText().isEmpty()) {
            cxNomeCantor.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Nome do Cantor sem preenchimento.");
            cxNomeCantor.setBackground(new Color(255, 255, 255));
        } else if (cxNomeGenero.getText().isEmpty()) {
            cxNomeGenero.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Gênero sem preenchimento.");
            cxNomeGenero.setBackground(new Color(255, 255, 255));
        } else if (cxHiperLink.getText().isEmpty()) {
            cxHiperLink.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Hiperlink sem preenchimento.");
            cxHiperLink.setBackground(new Color(255, 255, 255));
        } else {
            // instanciando a classe Usuario do pacote modelo e criando seu objeto usuarios
            beans.setNomeMusica(cxNomeMusica.getText());
            beans.setCantor(cxNomeCantor.getText());
            beans.setGenero(cxNomeGenero.getText());
            beans.setHiperlink(cxHiperLink.getText());
            beans.setEstilo(String.valueOf(this.boxEstiloMusica.getSelectedItem()));
            dao.create(beans);
            JOptionPane.showMessageDialog(null, "Música cadastrada com sucesso.");
            cxNomeMusica.setText("");
            cxNomeCantor.setText("");
            cxHiperLink.setText("");
            cxNomeGenero.setText("");
        }
    }//GEN-LAST:event_btAddMusicasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMusicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstiloMusica;
    private javax.swing.JButton btAddMusicas;
    private javax.swing.JButton btProsseguir;
    private javax.swing.JTextField cxHiperLink;
    private javax.swing.JTextField cxNomeCantor;
    private javax.swing.JTextField cxNomeGenero;
    private javax.swing.JTextField cxNomeMusica;
    private javax.swing.JLabel iconAddCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbEstiloMusica;
    private javax.swing.JLabel lbNomeCantor;
    private javax.swing.JLabel lbNomeGenero;
    private javax.swing.JLabel lblNomeMusica;
    // End of variables declaration//GEN-END:variables
}
