package TelasInciais;

import TelasCadastros.telaUser;

/**
 *
 * @author GSantiago
 */
public class TelaConfInicial extends javax.swing.JFrame {

    String space = " ";

    public TelaConfInicial() {
        initComponents();
        lblCreditos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCreditos = new javax.swing.JLabel();
        btAddUser = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btReparBD2 = new javax.swing.JButton();
        btReparBD3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        lblAddUser.setForeground(new java.awt.Color(255, 255, 255));
        lblAddUser.setText("Adicionar Usuário");
        getContentPane().add(lblAddUser);
        lblAddUser.setBounds(440, 110, 120, 16);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Configurações");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 0, 350, 90);

        lblCreditos.setForeground(new java.awt.Color(255, 255, 255));
        lblCreditos.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        getContentPane().add(lblCreditos);
        lblCreditos.setBounds(40, 80, 320, 340);

        btAddUser.setText("Novo Usuário");
        btAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddUserActionPerformed(evt);
            }
        });
        getContentPane().add(btAddUser);
        btAddUser.setBounds(430, 130, 130, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reparar Banco de Dados");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 180, 150, 16);

        btReparBD2.setText("Reparar BD");
        btReparBD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReparBD2ActionPerformed(evt);
            }
        });
        getContentPane().add(btReparBD2);
        btReparBD2.setBounds(430, 200, 130, 30);

        btReparBD3.setText("Reparar BD");
        btReparBD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReparBD3ActionPerformed(evt);
            }
        });
        getContentPane().add(btReparBD3);
        btReparBD3.setBounds(430, 200, 130, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reparar Banco de Dados");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 180, 150, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundos/backOk.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 640, 480);

        setSize(new java.awt.Dimension(607, 486));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddUserActionPerformed
        telaUser chamaTela = new telaUser();
        chamaTela.setVisible(true);
    }//GEN-LAST:event_btAddUserActionPerformed

    private void btReparBD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReparBD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btReparBD2ActionPerformed

    private void btReparBD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReparBD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btReparBD3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddUser;
    private javax.swing.JButton btReparBD2;
    private javax.swing.JButton btReparBD3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAddUser;
    private javax.swing.JLabel lblCreditos;
    // End of variables declaration//GEN-END:variables

    public void lblCreditos() {
        lblCreditos.setText("<html>CRÉDITOS:\n"
                + "<br/>"
                + space
                + "<br/>"
                + "SOFTWARE DESENVOLVIDO PELOS ALUNOS:\n"
                + "<br/>"
                + space
                + "<br/>"
                + "JEAN GABRIEL SANTIAGO DA SILVA E WENBLAS MAGALHÃES\n"
                + "DEVELOPER: JEAN GABRIEL\n"
                + "<br/>"
                + "DESIGNER: WENBLAS MAGALHÃES\n"
                + "<br/>"
                + space
                + "<br/>"
                + "ESSE SISTEMA SERÁ UTILIZADO PARA CADASTRAR\n"
                + "ALUNOS PARA UMA ESCOLA DE MÚSICA.\n"
                + "<br/>"
                + "ADICIONAR UM REPERTÓRIO DE MÚSICAS\n"
                + "TAMBÉM ERA NECESSÁRIO.\n"
                + "<br/>"
                + "ALÉM DE CONTER CONTROLE DE PRESENÇA.\n"
                + "<br/>"
                + "ESCOLA CHAMADA CORDAS & ACORDES.</html>");

    }
}
