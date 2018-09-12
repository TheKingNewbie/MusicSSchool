package TelasCadastros;

import Beans.AlunosBeans;
import Beans.InstrumentosBeans;
import TelasInciais.TelaInicial;
import dao.AlunosDAO;
import dao.InstrumentosDAO;
import java.awt.Color;

import javax.swing.JOptionPane;

public class CadastroAlunos extends javax.swing.JFrame {

    AlunosDAO dao = new AlunosDAO();
    TelaInicial chamaTela = new TelaInicial();

    public CadastroAlunos() {
        initComponents();
        this.cxDias2Dias.setVisible(false);
        this.cxDias3Dias.setVisible(false);
        this.bt1dia3.setVisible(false);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cxNome = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        cxEndereco = new javax.swing.JTextField();
        lbEndereco = new javax.swing.JLabel();
        cxEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        lbTel = new javax.swing.JLabel();
        btProsseguir = new javax.swing.JButton();
        btLimpaCampos = new javax.swing.JButton();
        lbCPF1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbNascimento3 = new javax.swing.JLabel();
        lbTel1 = new javax.swing.JLabel();
        lbInstrumento = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbMunicipio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cxInstrumento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cxDiasSemanais = new javax.swing.JComboBox<>();
        lbInstrumento1 = new javax.swing.JLabel();
        btMaisInstrumentos = new javax.swing.JButton();
        cxDias2Dias = new javax.swing.JComboBox<>();
        cxDias3Dias = new javax.swing.JComboBox<>();
        bt2Dias = new javax.swing.JButton();
        bt3Dias = new javax.swing.JButton();
        bt1dia2 = new javax.swing.JButton();
        bt1dia3 = new javax.swing.JButton();
        cxHorario = new javax.swing.JComboBox<>();
        lbInstrumento2 = new javax.swing.JLabel();
        cxCPF = new javax.swing.JFormattedTextField();
        cxDataCadastro = new javax.swing.JFormattedTextField();
        cxDataPag = new javax.swing.JFormattedTextField();
        cxTelefone = new javax.swing.JFormattedTextField();
        cxCEP = new javax.swing.JFormattedTextField();
        cxNascimento = new javax.swing.JFormattedTextField();
        iconAddCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MusicSSchool");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        setName("Cadastro de Alunos"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        cxNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(cxNome);
        cxNome.setBounds(250, 170, 350, 27);

        lbNome.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
        lbNome.setText("Nome Completo:");
        getContentPane().add(lbNome);
        lbNome.setBounds(250, 150, 140, 20);

        cxEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(cxEndereco);
        cxEndereco.setBounds(50, 280, 350, 24);

        lbEndereco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(204, 204, 204));
        lbEndereco.setText("Endereço:");
        getContentPane().add(lbEndereco);
        lbEndereco.setBounds(50, 260, 90, 18);
        getContentPane().add(cxEmail);
        cxEmail.setBounds(50, 380, 350, 24);

        lbEmail.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(204, 204, 204));
        lbEmail.setText("Email:");
        getContentPane().add(lbEmail);
        lbEmail.setBounds(50, 360, 60, 20);

        lbTel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbTel.setForeground(new java.awt.Color(204, 204, 204));
        lbTel.setText("Telefone:");
        getContentPane().add(lbTel);
        lbTel.setBounds(200, 310, 80, 18);

        btProsseguir.setText("Prosseguir");
        btProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProsseguirActionPerformed(evt);
            }
        });
        getContentPane().add(btProsseguir);
        btProsseguir.setBounds(420, 470, 140, 30);

        btLimpaCampos.setText("Limpar Campos");
        btLimpaCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpaCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpaCampos);
        btLimpaCampos.setBounds(40, 550, 160, 30);

        lbCPF1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbCPF1.setForeground(new java.awt.Color(204, 204, 204));
        lbCPF1.setText("CPF:");
        getContentPane().add(lbCPF1);
        lbCPF1.setBounds(250, 200, 50, 18);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensProject/cameraSemFoto.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 100, 150, 150);

        lbNascimento3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbNascimento3.setForeground(new java.awt.Color(204, 204, 204));
        lbNascimento3.setText("Nascimento:");
        getContentPane().add(lbNascimento3);
        lbNascimento3.setBounds(50, 310, 100, 18);

        lbTel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbTel1.setForeground(new java.awt.Color(204, 204, 204));
        lbTel1.setText("CEP:");
        getContentPane().add(lbTel1);
        lbTel1.setBounds(420, 200, 80, 18);

        lbInstrumento.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbInstrumento.setForeground(new java.awt.Color(204, 204, 204));
        lbInstrumento.setText("Instrumento:");
        getContentPane().add(lbInstrumento);
        lbInstrumento.setBounds(440, 360, 110, 18);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Cadastro de Alunos");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 20, 440, 60);

        lbMunicipio.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbMunicipio.setForeground(new java.awt.Color(204, 204, 204));
        lbMunicipio.setText("Dia Pagamento: ");
        getContentPane().add(lbMunicipio);
        lbMunicipio.setBounds(340, 310, 140, 18);

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
        jButton1.setBounds(60, 20, 40, 40);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("By Jean Gabriel  - Developer -");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 600, 270, 20);

        cxInstrumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Violão", "Baixo", "Violino", "Piano", "Sopro"}));
        getContentPane().add(cxInstrumento);
        cxInstrumento.setBounds(440, 380, 160, 26);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Data Cadastro:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 310, 110, 18);

        cxDiasSemanais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Segunda", "Terça", "Quarta", "Quinta", "Sexta" }));
        getContentPane().add(cxDiasSemanais);
        cxDiasSemanais.setBounds(50, 470, 160, 26);

        lbInstrumento1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbInstrumento1.setForeground(new java.awt.Color(204, 204, 204));
        lbInstrumento1.setText("Dias Semanais:");
        getContentPane().add(lbInstrumento1);
        lbInstrumento1.setBounds(50, 450, 120, 18);

        btMaisInstrumentos.setText("Add Instrumentos");
        btMaisInstrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaisInstrumentosActionPerformed(evt);
            }
        });
        getContentPane().add(btMaisInstrumentos);
        btMaisInstrumentos.setBounds(440, 410, 160, 20);

        cxDias2Dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Segunda - Terça", "Segunda - Quarta", "Segunda - Quinta", "Segunda - Sexta", "Segunda - Sábado", "Terça - Quarta", "Terça - Quinta", "Terça - Sexta", "Terça - Sábado", "Quarta - Quinta", "Quarta - Quinta", "Quarta - Sexta", "Quarta - Sábado", "Quinta - Sexta", "Quinta - Sábado", "Sexta - Sábado" }));
        getContentPane().add(cxDias2Dias);
        cxDias2Dias.setBounds(50, 470, 160, 26);

        cxDias3Dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Segunda -  Quarta - Sexta", "Terça - Quinta - Sábado" }));
        getContentPane().add(cxDias3Dias);
        cxDias3Dias.setBounds(50, 470, 190, 26);

        bt2Dias.setText("2 dias");
        bt2Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2DiasActionPerformed(evt);
            }
        });
        getContentPane().add(bt2Dias);
        bt2Dias.setBounds(50, 500, 70, 20);

        bt3Dias.setText("3 dias");
        bt3Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3DiasActionPerformed(evt);
            }
        });
        getContentPane().add(bt3Dias);
        bt3Dias.setBounds(130, 500, 70, 20);

        bt1dia2.setText("1 dia");
        bt1dia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1dia2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1dia2);
        bt1dia2.setBounds(50, 500, 70, 20);

        bt1dia3.setText("1 dia");
        bt1dia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1dia3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1dia3);
        bt1dia3.setBounds(130, 500, 70, 20);

        cxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De 8h às 9h", "De 9h às 10h", "De 10h às 11h", "De 11h às 12h", "De 12h às 13h", "De 13h às 14h", "De 14h às 15h", "De 15h às 16h", "De 16h às 17h", "De 17h às 18h", "De 18h às 19h" }));
        getContentPane().add(cxHorario);
        cxHorario.setBounds(260, 470, 120, 26);

        lbInstrumento2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbInstrumento2.setForeground(new java.awt.Color(204, 204, 204));
        lbInstrumento2.setText("Horário:");
        getContentPane().add(lbInstrumento2);
        lbInstrumento2.setBounds(260, 450, 110, 18);

        try {
            cxCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cxCPF.setText(" / / ");
        cxCPF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cxCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCPFActionPerformed(evt);
            }
        });
        getContentPane().add(cxCPF);
        cxCPF.setBounds(250, 220, 120, 20);

        try {
            cxDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cxDataCadastro.setText(" / / ");
        cxDataCadastro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cxDataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDataCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(cxDataCadastro);
        cxDataCadastro.setBounds(490, 330, 110, 20);

        try {
            cxDataPag.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cxDataPag.setText(" / / ");
        cxDataPag.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cxDataPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDataPagActionPerformed(evt);
            }
        });
        getContentPane().add(cxDataPag);
        cxDataPag.setBounds(350, 330, 120, 20);

        try {
            cxTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cxTelefone.setText(" / / ");
        cxTelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cxTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(cxTelefone);
        cxTelefone.setBounds(190, 330, 120, 20);

        try {
            cxCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cxCEP.setText(" / / ");
        cxCEP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cxCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCEPActionPerformed(evt);
            }
        });
        getContentPane().add(cxCEP);
        cxCEP.setBounds(420, 220, 120, 20);

        try {
            cxNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cxNascimento.setText(" / / ");
        cxNascimento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cxNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(cxNascimento);
        cxNascimento.setBounds(50, 330, 120, 20);

        iconAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundos/Listalunos.png"))); // NOI18N
        iconAddCliente.setToolTipText("");
        getContentPane().add(iconAddCliente);
        iconAddCliente.setBounds(-20, -20, 790, 680);

        setSize(new java.awt.Dimension(757, 681));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cxEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEnderecoActionPerformed
    }//GEN-LAST:event_cxEnderecoActionPerformed
    private void btProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProsseguirActionPerformed

        AlunosBeans beans = new AlunosBeans();

        String inst = this.cxInstrumento.getSelectedItem().toString();
        String horario = cxHorario.getSelectedItem().toString();
        String dias = this.cxDiasSemanais.getSelectedItem().toString();
        String dias2 = this.cxDias2Dias.getSelectedItem().toString();
        String dias3 = this.cxDias3Dias.getSelectedItem().toString();

        if (cxNome.getText().isEmpty()) {
            cxNome.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Campo nome sem preenchimento.");
            cxNome.setBackground(new Color(255, 255, 255));
        } else if (cxEndereco.getText().isEmpty()) {
            cxEndereco.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Campo Endereço sem preenchimento.");
            cxEndereco.setBackground(new Color(255, 255, 255));
        } else if (cxTelefone.getText().isEmpty()) {
            cxTelefone.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Campo Telefone sem preenchimento.");
            cxTelefone.setBackground(new Color(255, 255, 255));
        } else if (cxEmail.getText().isEmpty()) {
            cxEmail.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Campo Email sem preenchimento.");
            cxEmail.setBackground(new Color(255, 255, 255));
        } else if (cxDataCadastro.getText().isEmpty()) {
            cxDataCadastro.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "A data de cadastro não está preenchida.");
            cxDataCadastro.setBackground(new Color(255, 255, 255));
        } else {

            if (dias.equals("") && dias2.equals("")) {

                beans.setNomeAluno(cxNome.getText());
                beans.setCpf(cxCPF.getText());
                beans.setEndereco(cxEndereco.getText());
                beans.setDataNascimento(this.cxNascimento.getText());
                beans.setEmail(cxEmail.getText());
                beans.setDataPag(cxDataPag.getText());
                beans.setTelefone(cxTelefone.getText());
                beans.setCep(cxCEP.getText());
                beans.setDataCadastro(cxDataCadastro.getText());
                beans.setInstrumento(inst);
                beans.setDiasSemanais(dias3);
                beans.setHorario(horario);
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");

            } else if (dias.equals("") && dias3.equals("")) {

                beans.setNomeAluno(cxNome.getText());
                beans.setCpf(cxCPF.getText());
                beans.setEndereco(cxEndereco.getText());
                beans.setDataNascimento(this.cxNascimento.getText());
                beans.setEmail(cxEmail.getText());
                beans.setDataPag(cxDataPag.getText());
                beans.setTelefone(cxTelefone.getText());
                beans.setCep(cxCEP.getText());
                beans.setDataCadastro(cxDataCadastro.getText());
                beans.setInstrumento(inst);
                beans.setDiasSemanais(dias2);
                beans.setHorario(horario);
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");

            } else if (dias2.equals("") && dias3.equals("")) {
                beans.setNomeAluno(cxNome.getText());
                beans.setCpf(cxCPF.getText());
                beans.setEndereco(cxEndereco.getText());
                beans.setDataNascimento(this.cxNascimento.getText());
                beans.setEmail(cxEmail.getText());
                beans.setDataPag(cxDataPag.getText());
                beans.setTelefone(cxTelefone.getText());
                beans.setCep(cxCEP.getText());
                beans.setDataCadastro(cxDataCadastro.getText());
                beans.setInstrumento(inst);
                beans.setDiasSemanais(dias);
                beans.setHorario(horario);
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");

            }

            if (beans == null) {

                JOptionPane.showMessageDialog(null, "Os campos não estão corretamente preenchido, tente novamente.");
                chamaTela.setVisible(true);
                dispose();
            } else {

                dao.create(beans);
                chamaTela.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_btProsseguirActionPerformed
    private void btLimpaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaCamposActionPerformed

        // apaga os dados preenchidos nos campos de texto
        cxNome.setText("");
        cxEmail.setText("");
        cxCPF.setText("");
        cxEndereco.setText("");
        cxTelefone.setText("");
        this.cxNascimento.setText("");
        this.cxDataPag.setText("");
        this.cxDataCadastro.setText("");

    }//GEN-LAST:event_btLimpaCamposActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void bt1dia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1dia3ActionPerformed
        this.cxDiasSemanais.setVisible(true);
        this.bt3Dias.setVisible(true);
        this.bt1dia3.setVisible(false);
        this.cxDias3Dias.setVisible(false);
        this.cxDias2Dias.setVisible(false);

    }//GEN-LAST:event_bt1dia3ActionPerformed
    private void bt3DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3DiasActionPerformed
        this.cxDias2Dias.setVisible(false);
        this.cxDiasSemanais.setVisible(false);
        this.cxDias3Dias.setVisible(true);
        this.bt3Dias.setVisible(false);
        this.bt1dia3.setVisible(true);
    }//GEN-LAST:event_bt3DiasActionPerformed
    private void bt2DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2DiasActionPerformed
        this.cxDiasSemanais.setVisible(false);
        this.cxDias3Dias.setVisible(false);
        this.cxDias2Dias.setVisible(true);
        this.bt2Dias.setVisible(false);
        this.bt1dia2.setVisible(true);
    }//GEN-LAST:event_bt2DiasActionPerformed
    private void bt1dia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1dia2ActionPerformed
        this.cxDiasSemanais.setVisible(true);
        this.cxDias3Dias.setVisible(false);
        this.cxDias2Dias.setVisible(false);
        this.bt2Dias.setVisible(true);
        this.bt1dia2.setVisible(false);
    }//GEN-LAST:event_bt1dia2ActionPerformed

    private void cxCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCPFActionPerformed

    private void btMaisInstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisInstrumentosActionPerformed
        addInstru();
    }//GEN-LAST:event_btMaisInstrumentosActionPerformed

    private void cxDataCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDataCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxDataCadastroActionPerformed

    private void cxDataPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDataPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxDataPagActionPerformed

    private void cxTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTelefoneActionPerformed

    private void cxCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCEPActionPerformed

    private void cxNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNascimentoActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1dia2;
    private javax.swing.JButton bt1dia3;
    private javax.swing.JButton bt2Dias;
    private javax.swing.JButton bt3Dias;
    private javax.swing.JButton btLimpaCampos;
    private javax.swing.JButton btMaisInstrumentos;
    private javax.swing.JButton btProsseguir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField cxCEP;
    private javax.swing.JFormattedTextField cxCPF;
    private javax.swing.JFormattedTextField cxDataCadastro;
    private javax.swing.JFormattedTextField cxDataPag;
    private javax.swing.JComboBox<String> cxDias2Dias;
    private javax.swing.JComboBox<String> cxDias3Dias;
    private javax.swing.JComboBox<String> cxDiasSemanais;
    private javax.swing.JTextField cxEmail;
    private javax.swing.JTextField cxEndereco;
    private javax.swing.JComboBox<String> cxHorario;
    private javax.swing.JComboBox<String> cxInstrumento;
    private javax.swing.JFormattedTextField cxNascimento;
    private javax.swing.JTextField cxNome;
    private javax.swing.JFormattedTextField cxTelefone;
    private javax.swing.JLabel iconAddCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbCPF1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbInstrumento;
    private javax.swing.JLabel lbInstrumento1;
    private javax.swing.JLabel lbInstrumento2;
    private javax.swing.JLabel lbMunicipio;
    private javax.swing.JLabel lbNascimento3;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTel;
    private javax.swing.JLabel lbTel1;
    // End of variables declaration//GEN-END:variables

    public void addInstru() {
        int i = 0;
        while (i == 0) {
            String addInstrumento = JOptionPane.showInputDialog(null, "Digite o nome do Instrumento: ");
            if (addInstrumento == null) {
                i = 1;
            } else {
                if (addInstrumento.equals("") || addInstrumento.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campos está vazio, tente novamente.");
                    i = 0;
                } else {
                    InstrumentosBeans b = new InstrumentosBeans();
                    b.setNomeCurso(addInstrumento);
                    InstrumentosDAO dao = new InstrumentosDAO();
                    dao.create(b);
                    break;
                }
            }
        }
    }
}
