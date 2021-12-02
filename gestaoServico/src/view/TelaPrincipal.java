
package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {


    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane_areaTrabalho = new javax.swing.JDesktopPane();
        jLabel_imagem = new javax.swing.JLabel();
        jLabel_nome = new javax.swing.JLabel();
        jLabel_data = new javax.swing.JLabel();
        jMenuBar_menu = new javax.swing.JMenuBar();
        jMenu_cadastro = new javax.swing.JMenu();
        jMenuItem_cadastroCliente = new javax.swing.JMenuItem();
        jMenuItem_cadastroOrdemServico = new javax.swing.JMenuItem();
        jMenuItem_cadastroUsuario = new javax.swing.JMenuItem();
        jMenu_relatorio = new javax.swing.JMenu();
        jMenuItem_relatorioServicos = new javax.swing.JMenuItem();
        jMenu_opcoes = new javax.swing.JMenu();
        jMenuItem_sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ordem Serviço");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane_areaTrabalhoLayout = new javax.swing.GroupLayout(jDesktopPane_areaTrabalho);
        jDesktopPane_areaTrabalho.setLayout(jDesktopPane_areaTrabalhoLayout);
        jDesktopPane_areaTrabalhoLayout.setHorizontalGroup(
            jDesktopPane_areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        jDesktopPane_areaTrabalhoLayout.setVerticalGroup(
            jDesktopPane_areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/planner.png"))); // NOI18N

        jLabel_nome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_nome.setText("Nome");

        jLabel_data.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_data.setText("Data");

        jMenu_cadastro.setText("Cadastro");

        jMenuItem_cadastroCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_cadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar-cliente.png"))); // NOI18N
        jMenuItem_cadastroCliente.setText("Cliente");
        jMenu_cadastro.add(jMenuItem_cadastroCliente);

        jMenuItem_cadastroOrdemServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_cadastroOrdemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ordemServico.png"))); // NOI18N
        jMenuItem_cadastroOrdemServico.setText("Ordem Serviço");
        jMenu_cadastro.add(jMenuItem_cadastroOrdemServico);

        jMenuItem_cadastroUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_cadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add-user.png"))); // NOI18N
        jMenuItem_cadastroUsuario.setText("Usuário");
        jMenuItem_cadastroUsuario.setEnabled(false);
        jMenuItem_cadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cadastroUsuarioActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMenuItem_cadastroUsuario);

        jMenuBar_menu.add(jMenu_cadastro);

        jMenu_relatorio.setText("Relatório");
        jMenu_relatorio.setEnabled(false);

        jMenuItem_relatorioServicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_relatorioServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/servicos.png"))); // NOI18N
        jMenuItem_relatorioServicos.setText("Serviços");
        jMenuItem_relatorioServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_relatorioServicosActionPerformed(evt);
            }
        });
        jMenu_relatorio.add(jMenuItem_relatorioServicos);

        jMenuBar_menu.add(jMenu_relatorio);

        jMenu_opcoes.setText("Opções");

        jMenuItem_sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jMenuItem_sair.setText("Sair");
        jMenuItem_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_sairActionPerformed(evt);
            }
        });
        jMenu_opcoes.add(jMenuItem_sair);

        jMenuBar_menu.add(jMenu_opcoes);

        setJMenuBar(jMenuBar_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane_areaTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jLabel_imagem)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_data)
                            .addComponent(jLabel_nome))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_areaTrabalho)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel_nome)
                .addGap(37, 37, 37)
                .addComponent(jLabel_data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jLabel_imagem)
                .addGap(108, 108, 108))
        );

        setSize(new java.awt.Dimension(923, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_relatorioServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_relatorioServicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_relatorioServicosActionPerformed

    private void jMenuItem_cadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cadastroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_cadastroUsuarioActionPerformed

    private void jMenuItem_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_sairActionPerformed

        int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?","Aviso",JOptionPane.YES_NO_OPTION);

        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }   

    }//GEN-LAST:event_jMenuItem_sairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        LocalDate dataAtual = LocalDate.now();
        
        jLabel_data.setText(dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane_areaTrabalho;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_imagem;
    public static javax.swing.JLabel jLabel_nome;
    private javax.swing.JMenuBar jMenuBar_menu;
    private javax.swing.JMenuItem jMenuItem_cadastroCliente;
    private javax.swing.JMenuItem jMenuItem_cadastroOrdemServico;
    public static javax.swing.JMenuItem jMenuItem_cadastroUsuario;
    private javax.swing.JMenuItem jMenuItem_relatorioServicos;
    private javax.swing.JMenuItem jMenuItem_sair;
    private javax.swing.JMenu jMenu_cadastro;
    private javax.swing.JMenu jMenu_opcoes;
    public static javax.swing.JMenu jMenu_relatorio;
    // End of variables declaration//GEN-END:variables
}
