package TelasInciais;

import Connection.Conexao;
import dao.LoginDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author GSantiago
 */
public class TelaLogin extends javax.swing.JFrame {

    LoginDAO dao = new LoginDAO();
    Timer timer;
    ActionListener ac;
    int x = 0;
    Conexao conect = new Conexao();
    int i = 0;

    public TelaLogin() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        this.barProgress.setVisible(false);
        lblNmTentativas.setVisible(false);
        aparecerTentativas.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        cxUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        lblTentativas = new javax.swing.JLabel();
        lblNmTentativas = new javax.swing.JLabel();
        btConfig = new javax.swing.JButton();
        barProgress = new javax.swing.JProgressBar();
        cxSenha = new javax.swing.JPasswordField();
        aparecerTentativas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        iconAddCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MusicSSchool");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        setName("TelaInicial"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("                                JPSistemas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 850, 490, 21);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("®  2018 - Todos os Direitos Reservados ®");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 820, 370, 21);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensProject/Caixa.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 800, 795, 80);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/04.png"))); // NOI18N
        btSair.setBorder(null);
        btSair.setContentAreaFilled(false);
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(1350, 40, 70, 50);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Acesso Restrito");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 20, 470, 140);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("* INFORME SEU USUÁRIO ADMINISTRATIVO:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 250, 400, 21);

        lblSenha.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(102, 102, 102));
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(270, 400, 60, 21);
        getContentPane().add(cxUsuario);
        cxUsuario.setBounds(330, 350, 130, 24);

        lblUsuario.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(250, 350, 100, 21);

        btLogin.setText("CONFIRMAR");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btLogin);
        btLogin.setBounds(470, 480, 110, 32);

        lblTentativas.setForeground(new java.awt.Color(204, 0, 51));
        lblTentativas.setText(" ");
        getContentPane().add(lblTentativas);
        lblTentativas.setBounds(630, 470, 30, 30);

        lblNmTentativas.setForeground(new java.awt.Color(204, 51, 0));
        lblNmTentativas.setText("Suas tentativas:");
        getContentPane().add(lblNmTentativas);
        lblNmTentativas.setBounds(180, 480, 100, 16);

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
        btConfig.setBounds(1480, 40, 80, 70);
        getContentPane().add(barProgress);
        barProgress.setBounds(310, 570, 160, 20);
        getContentPane().add(cxSenha);
        cxSenha.setBounds(330, 400, 130, 22);

        aparecerTentativas.setForeground(new java.awt.Color(255, 255, 255));
        aparecerTentativas.setText("NumTentativas");
        getContentPane().add(aparecerTentativas);
        aparecerTentativas.setBounds(280, 480, 85, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensProject/caixaLogin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 280, 600, 290);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconeConf.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1480, 30, 80, 80);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Bola branca.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1340, 30, 90, 80);

        iconAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fundo00.jpg"))); // NOI18N
        getContentPane().add(iconAddCliente);
        iconAddCliente.setBounds(0, 0, 1600, 900);

        setSize(new java.awt.Dimension(1600, 900));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed
    public void acessarSistema() {
        try {
            while (i != 3) {
                if ((cxUsuario.getText().equals("admin") && cxSenha.getText().equals("jean130599")) || dao.verificaLogin(cxUsuario.getText(), cxSenha.getText())) {
                    this.barProgress.setVisible(true);
                    this.setLocationRelativeTo(null);

                    ac = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            x = x + 15;
                            barProgress.setValue(x);
                            while (x == 90) {
                                TelaInicial chamaTela = new TelaInicial();
                                chamaTela.setVisible(true);
                                dispose();
                                break;
                            }
                        }
                    };
                    timer = new Timer(200, ac);
                    timer.start();

                } else {
                    i++;
                    JOptionPane.showMessageDialog(null, "Acesso negado, usuario ou senha incorretos. Quando errar 3x irá travar.");
                    lblNmTentativas.setVisible(true);
                    aparecerTentativas.setText(String.valueOf(i));
                    aparecerTentativas.setVisible(true);
                }
                break;
            }
            if(i>=3){
            JOptionPane.showMessageDialog(null, "Sistema travado, reinicie para tentar novamente.");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        this.acessarSistema();
    }//GEN-LAST:event_btLoginActionPerformed

    private void btConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfigActionPerformed
        TelaConfInicial chamaTela = new TelaConfInicial();
        chamaTela.setVisible(true);
    }//GEN-LAST:event_btConfigActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aparecerTentativas;
    private javax.swing.JProgressBar barProgress;
    private javax.swing.JButton btConfig;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btSair;
    private javax.swing.JPasswordField cxSenha;
    private javax.swing.JTextField cxUsuario;
    private javax.swing.JLabel iconAddCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNmTentativas;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTentativas;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
