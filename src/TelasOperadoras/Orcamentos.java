package TelasOperadoras;

import Beans.OrcamentoBeans;
import TelasInciais.TelaInicial;
import dao.OrcamentoDAO;
import dao.RelatorioService;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Orcamentos extends javax.swing.JFrame {

    TelaInicial chamaTela = new TelaInicial();
    private int qt1, qt2, qt3, qt4, qt5, qt6, qt7, qt8, qt9, qt10;
    private String o1, o2, o3, o4, o5, o6, o7, o8, o9, o10;
    public Orcamentos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbInst2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbInst3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbInst4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbInst5 = new javax.swing.JComboBox<>();
        cbInst10 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbInst6 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbInst7 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbInst8 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbInst9 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbInst1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btObs5 = new javax.swing.JButton();
        btObs4 = new javax.swing.JButton();
        btObs3 = new javax.swing.JButton();
        btObs2 = new javax.swing.JButton();
        btObs6 = new javax.swing.JButton();
        btObs7 = new javax.swing.JButton();
        btObs8 = new javax.swing.JButton();
        btObs9 = new javax.swing.JButton();
        btObs10 = new javax.swing.JButton();
        btObs1 = new javax.swing.JButton();
        btOrcamento = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cxEvento = new javax.swing.JTextField();
        cxTotal = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
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
        jButton1.setBounds(30, 20, 40, 40);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Instrumento 2:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 280, 100, 20);

        cbInst2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Saxofone", "Violino", "Contrabaixo", "Violoncelo", "Teclado", "Violão/Guitarra", "Percussão", "Trompetes", "OP. SOM" }));
        cbInst2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInst2ItemStateChanged(evt);
            }
        });
        cbInst2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInst2ActionPerformed(evt);
            }
        });
        getContentPane().add(cbInst2);
        cbInst2.setBounds(140, 280, 150, 26);

        jButton4.setText("Relatórios");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(310, 150, 100, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORÇAMENTO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 30, 270, 60);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo do Evento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 150, 100, 20);

        cbInst3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Saxofone", "Violino", "Contrabaixo", "Violoncelo", "Teclado", "Violão/Guitarra", "Percussão", "Trompetes", "OP. SOM" }));
        cbInst3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInst3ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbInst3);
        cbInst3.setBounds(140, 340, 150, 26);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Instrumento 3:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 340, 100, 20);

        cbInst4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Saxofone", "Violino", "Contrabaixo", "Violoncelo", "Teclado", "Violão/Guitarra", "Percussão", "Trompetes", "OP. SOM" }));
        cbInst4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInst4ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbInst4);
        cbInst4.setBounds(140, 400, 150, 26);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Instrumento 4:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 400, 100, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Instrumento 5:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 460, 100, 20);

        cbInst5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Saxofone", "Violino", "Contrabaixo", "Violoncelo", "Teclado", "Violão/Guitarra", "Percussão", "Trompetes", "OP. SOM" }));
        cbInst5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInst5ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbInst5);
        cbInst5.setBounds(140, 460, 150, 26);

        cbInst10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Saxofone", "Violino", "Contrabaixo", "Violoncelo", "Teclado", "Violão/Guitarra", "Percussão", "Trompetes", "OP. SOM" }));
        cbInst10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInst10ItemStateChanged(evt);
            }
        });
        cbInst10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInst10ActionPerformed(evt);
            }
        });
        getContentPane().add(cbInst10);
        cbInst10.setBounds(410, 460, 150, 26);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Instrumento 10:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 460, 100, 20);

        cbInst6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Saxofone", "Violino", "Contrabaixo", "Violoncelo", "Teclado", "Violão/Guitarra", "Percussão", "Trompetes", "OP. SOM" }));
        cbInst6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInst6ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbInst6);
        cbInst6.setBounds(410, 220, 150, 26);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Instrumento 6:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 220, 100, 20);

        cbInst7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Saxofone", "Violino", "Contrabaixo", "Violoncelo", "Teclado", "Violão/Guitarra", "Percussão", "Trompetes", "OP. SOM" }));
        cbInst7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInst7ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbInst7);
        cbInst7.setBounds(410, 280, 150, 26);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Instrumento 7:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 280, 100, 20);

        cbInst8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Saxofone", "Violino", "Contrabaixo", "Violoncelo", "Teclado", "Violão/Guitarra", "Percussão", "Trompetes", "OP. SOM" }));
        cbInst8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInst8ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbInst8);
        cbInst8.setBounds(410, 340, 150, 26);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Instrumento 8:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 340, 100, 20);

        cbInst9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Saxofone", "Violino", "Contrabaixo", "Violoncelo", "Teclado", "Violão/Guitarra", "Percussão", "Trompetes", "OP. SOM" }));
        cbInst9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInst9ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbInst9);
        cbInst9.setBounds(410, 400, 150, 26);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Instrumento 9:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 400, 100, 20);

        cbInst1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Saxofone", "Violino", "Contrabaixo", "Violoncelo", "Teclado", "Violão/Guitarra", "Percussão", "Trompetes", "OP. SOM" }));
        cbInst1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInst1ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbInst1);
        cbInst1.setBounds(140, 220, 150, 26);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Instrumento 1:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 220, 100, 20);

        btObs5.setText("OBS");
        btObs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObs5ActionPerformed(evt);
            }
        });
        getContentPane().add(btObs5);
        btObs5.setBounds(230, 440, 60, 20);

        btObs4.setText("OBS");
        btObs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObs4ActionPerformed(evt);
            }
        });
        getContentPane().add(btObs4);
        btObs4.setBounds(230, 380, 60, 20);

        btObs3.setText("OBS");
        btObs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObs3ActionPerformed(evt);
            }
        });
        getContentPane().add(btObs3);
        btObs3.setBounds(230, 320, 60, 20);

        btObs2.setText("OBS");
        btObs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObs2ActionPerformed(evt);
            }
        });
        getContentPane().add(btObs2);
        btObs2.setBounds(230, 260, 60, 20);

        btObs6.setText("OBS");
        btObs6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObs6ActionPerformed(evt);
            }
        });
        getContentPane().add(btObs6);
        btObs6.setBounds(500, 200, 60, 20);

        btObs7.setText("OBS");
        btObs7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObs7ActionPerformed(evt);
            }
        });
        getContentPane().add(btObs7);
        btObs7.setBounds(500, 260, 60, 20);

        btObs8.setText("OBS");
        btObs8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObs8ActionPerformed(evt);
            }
        });
        getContentPane().add(btObs8);
        btObs8.setBounds(500, 320, 60, 20);

        btObs9.setText("OBS");
        btObs9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObs9ActionPerformed(evt);
            }
        });
        getContentPane().add(btObs9);
        btObs9.setBounds(500, 380, 60, 20);

        btObs10.setText("OBS");
        btObs10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObs10ActionPerformed(evt);
            }
        });
        getContentPane().add(btObs10);
        btObs10.setBounds(500, 440, 60, 20);

        btObs1.setText("OBS");
        btObs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObs1ActionPerformed(evt);
            }
        });
        getContentPane().add(btObs1);
        btObs1.setBounds(230, 200, 60, 20);

        btOrcamento.setText("Gerar Orçamento");
        btOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrcamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btOrcamento);
        btOrcamento.setBounds(410, 540, 150, 30);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Pagamento:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(60, 510, 80, 20);
        getContentPane().add(cxEvento);
        cxEvento.setBounds(140, 150, 150, 24);

        try {
            cxTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ #.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cxTotal.setText("R$  .   ");
        cxTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTotalActionPerformed(evt);
            }
        });
        getContentPane().add(cxTotal);
        cxTotal.setBounds(140, 550, 90, 20);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Valor Total:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 550, 70, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "À combinar", "Cartão de Crédito" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(140, 510, 150, 26);

        iconAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundos/Listalunos.png"))); // NOI18N
        getContentPane().add(iconAddCliente);
        iconAddCliente.setBounds(-10, -10, 790, 690);

        setSize(new java.awt.Dimension(764, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        chamaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbInst10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInst10ActionPerformed
    }//GEN-LAST:event_cbInst10ActionPerformed

    private void cbInst1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInst1ItemStateChanged
        while (qt1 == 0) {
            String qt = (JOptionPane.showInputDialog("Qual a quantidade de instumentos: "));

            if (qt.equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a quantidade de instrumentos");
            } else {
                boolean validaNumero = false;
                for (int i = 0; i < qt.length(); i++) {
                    if (Character.isDigit(qt.charAt(i))) {
                        validaNumero = true;
                        qt1 = (Integer.parseInt(qt));
                        System.out.println("Certo.");
                        break;
                    } else {
                        validaNumero = false;
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cbInst1ItemStateChanged

    private void cbInst2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInst2ItemStateChanged
        while (qt2 == 0) {
            String qt = (JOptionPane.showInputDialog("Qual a quantidade de instumentos: "));

            if (qt.equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a quantidade de instrumentos");
            } else {
                boolean validaNumero = false;
                for (int i = 0; i < qt.length(); i++) {
                    if (Character.isDigit(qt.charAt(i))) {
                        validaNumero = true;
                        qt2 = (Integer.parseInt(qt));
                        System.out.println("Certo.");
                        break;
                    } else {
                        validaNumero = false;
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cbInst2ItemStateChanged

    private void cbInst3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInst3ItemStateChanged
        while (qt3 == 0) {
            String qt = (JOptionPane.showInputDialog("Qual a quantidade de instumentos: "));

            if (qt.equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a quantidade de instrumentos");
            } else {
                boolean validaNumero = false;
                for (int i = 0; i < qt.length(); i++) {
                    if (Character.isDigit(qt.charAt(i))) {
                        validaNumero = true;
                        qt3 = (Integer.parseInt(qt));
                        System.out.println("Certo.");
                        break;
                    } else {
                        validaNumero = false;
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cbInst3ItemStateChanged

    private void cbInst4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInst4ItemStateChanged
        while (qt4 == 0) {
            String qt = (JOptionPane.showInputDialog("Qual a quantidade de instumentos: "));

            if (qt.equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a quantidade de instrumentos");
            } else {
                boolean validaNumero = false;
                for (int i = 0; i < qt.length(); i++) {
                    if (Character.isDigit(qt.charAt(i))) {
                        validaNumero = true;
                        qt4 = (Integer.parseInt(qt));
                        System.out.println("Certo.");
                        break;
                    } else {
                        validaNumero = false;
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cbInst4ItemStateChanged

    private void cbInst5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInst5ItemStateChanged
        while (qt5 == 0) {
            String qt = (JOptionPane.showInputDialog("Qual a quantidade de instumentos: "));

            if (qt.equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a quantidade de instrumentos");
            } else {
                boolean validaNumero = false;
                for (int i = 0; i < qt.length(); i++) {
                    if (Character.isDigit(qt.charAt(i))) {
                        validaNumero = true;
                        qt5 = (Integer.parseInt(qt));
                        System.out.println("Certo.");
                        break;
                    } else {
                        validaNumero = false;
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cbInst5ItemStateChanged

    private void cbInst6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInst6ItemStateChanged
        while (qt6 == 0) {
            String qt = (JOptionPane.showInputDialog("Qual a quantidade de instumentos: "));

            if (qt.equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a quantidade de instrumentos");
            } else {
                boolean validaNumero = false;
                for (int i = 0; i < qt.length(); i++) {
                    if (Character.isDigit(qt.charAt(i))) {
                        validaNumero = true;
                        qt6 = (Integer.parseInt(qt));
                        System.out.println("Certo.");
                        break;
                    } else {
                        validaNumero = false;
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cbInst6ItemStateChanged

    private void cbInst7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInst7ItemStateChanged
        while (qt7 == 0) {
            String qt = (JOptionPane.showInputDialog("Qual a quantidade de instumentos: "));

            if (qt.equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a quantidade de instrumentos");
            } else {
                boolean validaNumero = false;
                for (int i = 0; i < qt.length(); i++) {
                    if (Character.isDigit(qt.charAt(i))) {
                        validaNumero = true;
                        qt7 = (Integer.parseInt(qt));
                        System.out.println("Certo.");
                        break;
                    } else {
                        validaNumero = false;
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cbInst7ItemStateChanged

    private void cbInst8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInst8ItemStateChanged
        while (qt8 == 0) {
            String qt = (JOptionPane.showInputDialog("Qual a quantidade de instumentos: "));

            if (qt.equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a quantidade de instrumentos");
            } else {
                boolean validaNumero = false;
                for (int i = 0; i < qt.length(); i++) {
                    if (Character.isDigit(qt.charAt(i))) {
                        validaNumero = true;
                        qt8 = (Integer.parseInt(qt));
                        System.out.println("Certo.");
                        break;
                    } else {
                        validaNumero = false;
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cbInst8ItemStateChanged

    private void cbInst9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInst9ItemStateChanged
        while (qt9 == 0) {
            String qt = (JOptionPane.showInputDialog("Qual a quantidade de instumentos: "));

            if (qt.equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a quantidade de instrumentos");
            } else {
                boolean validaNumero = false;
                for (int i = 0; i < qt.length(); i++) {
                    if (Character.isDigit(qt.charAt(i))) {
                        validaNumero = true;
                        qt9 = (Integer.parseInt(qt));
                        System.out.println("Certo.");
                        break;
                    } else {
                        validaNumero = false;
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cbInst9ItemStateChanged

    private void cbInst10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInst10ItemStateChanged
        while (qt10 == 0) {
            String qt = (JOptionPane.showInputDialog("Qual a quantidade de instumentos: "));

            if (qt.equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a quantidade de instrumentos");
            } else {
                boolean validaNumero = false;
                for (int i = 0; i < qt.length(); i++) {
                    if (Character.isDigit(qt.charAt(i))) {
                        validaNumero = true;
                        qt10 = (Integer.parseInt(qt));
                        System.out.println("Certo.");
                        break;
                    } else {
                        validaNumero = false;
                        JOptionPane.showMessageDialog(null, "Digite apenas números!");
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_cbInst10ItemStateChanged

    private void btObs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObs5ActionPerformed
        o5 = JOptionPane.showInputDialog("Digite a observação: ");
    }//GEN-LAST:event_btObs5ActionPerformed

    private void btObs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObs4ActionPerformed
        o4 = JOptionPane.showInputDialog("Digite a observação: ");
    }//GEN-LAST:event_btObs4ActionPerformed

    private void btObs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObs3ActionPerformed
        o3 = JOptionPane.showInputDialog("Digite a observação: ");
    }//GEN-LAST:event_btObs3ActionPerformed

    private void btObs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObs2ActionPerformed
        o2 = JOptionPane.showInputDialog("Digite a observação: ");
    }//GEN-LAST:event_btObs2ActionPerformed

    private void btObs6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObs6ActionPerformed
        o6 = JOptionPane.showInputDialog("Digite a observação: ");
    }//GEN-LAST:event_btObs6ActionPerformed

    private void btObs7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObs7ActionPerformed
        o7 = JOptionPane.showInputDialog("Digite a observação: ");
    }//GEN-LAST:event_btObs7ActionPerformed

    private void btObs8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObs8ActionPerformed
        o8 = JOptionPane.showInputDialog("Digite a observação: ");
    }//GEN-LAST:event_btObs8ActionPerformed

    private void btObs9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObs9ActionPerformed
        o9 = JOptionPane.showInputDialog("Digite a observação: ");
    }//GEN-LAST:event_btObs9ActionPerformed

    private void btObs10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObs10ActionPerformed
        o10 = JOptionPane.showInputDialog("Digite a observação: ");
    }//GEN-LAST:event_btObs10ActionPerformed

    private void btObs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObs1ActionPerformed
        o1 = JOptionPane.showInputDialog("Digite a observação: ");

    }//GEN-LAST:event_btObs1ActionPerformed

    private void btOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrcamentoActionPerformed

        if (cxEvento.getText().equals("") || cxEvento.getText().isEmpty()) {
            cxEvento.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "O Tipo do evento não está especificado. Preencha-o para prosseguir.");
            cxEvento.setBackground(new Color(255, 255, 255));
        } else if (cbInst1.getSelectedItem().toString().equals("--") || cxEvento.getText().isEmpty()) {
            cbInst1.setBackground(new Color(255, 102, 102)); // altera a cor da fonte
            JOptionPane.showMessageDialog(null, "Você precisa selecionar pelo menos 1 tipo de instrumento. Preencha-o para prosseguir.");
            cbInst1.setBackground(new Color(255, 255, 255));
        } else {
            this.cboforString();
            
            //Lista com os parametros para o relátorio
        HashMap params = new HashMap<>();

        try {
            //Passândo parâmetros e convertendo o dados pra ser compativel
            params.put("evento", cxEvento.getText());
            //Invocando a geração do relatório 
            String file = new RelatorioService().gerarRelatorio(params, "orcamento", "pdf");
            //Exibindo o relatório na tela para o usuário
            Desktop.getDesktop().open(new File(file));
            Orcamentos att = new Orcamentos();
            att.setVisible(true);

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "erro na geração do relatório. >>> "+ex);
            System.out.println("erro na geração do relatório. >>> " + ex);
        }
        }

    }//GEN-LAST:event_btOrcamentoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Lista com os parametros para o relátorio
        HashMap params = new HashMap<>();

        try {
            //Passândo parâmetros e convertendo o dados pra ser compativel
            params.put("evento", cxEvento.getText());
            //Invocando a geração do relatório 
            String file = new RelatorioService().gerarRelatorio(params, "orcamento", "pdf");
            //Exibindo o relatório na tela para o usuário
            Desktop.getDesktop().open(new File(file));

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "erro na geração do relatório. >>> "+ex);
            System.out.println("erro na geração do relatório. >>> " + ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbInst2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInst2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInst2ActionPerformed

    private void cxTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTotalActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orcamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btObs1;
    private javax.swing.JButton btObs10;
    private javax.swing.JButton btObs2;
    private javax.swing.JButton btObs3;
    private javax.swing.JButton btObs4;
    private javax.swing.JButton btObs5;
    private javax.swing.JButton btObs6;
    private javax.swing.JButton btObs7;
    private javax.swing.JButton btObs8;
    private javax.swing.JButton btObs9;
    private javax.swing.JButton btOrcamento;
    private javax.swing.JComboBox<String> cbInst1;
    private javax.swing.JComboBox<String> cbInst10;
    private javax.swing.JComboBox<String> cbInst2;
    private javax.swing.JComboBox<String> cbInst3;
    private javax.swing.JComboBox<String> cbInst4;
    private javax.swing.JComboBox<String> cbInst5;
    private javax.swing.JComboBox<String> cbInst6;
    private javax.swing.JComboBox<String> cbInst7;
    private javax.swing.JComboBox<String> cbInst8;
    private javax.swing.JComboBox<String> cbInst9;
    private javax.swing.JTextField cxEvento;
    private javax.swing.JFormattedTextField cxTotal;
    private javax.swing.JLabel iconAddCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    public void cboforString() {
        OrcamentoBeans beans = new OrcamentoBeans();
        String i1 = cbInst1.getSelectedItem().toString();
        String i2 = cbInst2.getSelectedItem().toString();
        String i3 = cbInst3.getSelectedItem().toString();
        String i4 = cbInst4.getSelectedItem().toString();
        String i5 = cbInst5.getSelectedItem().toString();
        String i6 = cbInst6.getSelectedItem().toString();
        String i7 = cbInst7.getSelectedItem().toString();
        String i8 = cbInst8.getSelectedItem().toString();
        String i9 = cbInst9.getSelectedItem().toString();
        String i10 = cbInst10.getSelectedItem().toString();
        beans.setValorTotal(cxTotal.getText());
        beans.setTipoFesta(this.cxEvento.getText());
        beans.setObs("--");
        beans.setInst1(i1);
        beans.setInst2(i2);
        beans.setInst3(i3);
        beans.setInst4(i4);
        beans.setInst5(i5);
        beans.setInst6(i6);
        beans.setInst7(i7);
        beans.setInst8(i8);
        beans.setInst9(i9);
        beans.setInst10(i10);
        beans.setQtd1(qt1);
        beans.setQtd2(qt2);
        beans.setQtd3(qt3);
        beans.setQtd4(qt4);
        beans.setQtd5(qt5);
        beans.setQtd6(qt6);
        beans.setQtd7(qt7);
        beans.setQtd8(qt8);
        beans.setQtd9(qt9);
        beans.setQtd10(qt10);
        beans.setObs1(o1);
        beans.setObs2(o2);
        beans.setObs3(o3);
        beans.setObs4(o4);
        beans.setObs5(o5);
        beans.setObs6(o6);
        beans.setObs7(o7);
        beans.setObs8(o8);
        beans.setObs9(o9);
        beans.setObs10(o10);
        OrcamentoDAO dao = new OrcamentoDAO();
        dao.create(beans);
        JOptionPane.showMessageDialog(null, "Orçamento gerado com sucesso!");
    }

}
