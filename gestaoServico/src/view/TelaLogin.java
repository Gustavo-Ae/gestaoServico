/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.ConnectionFactory;
import controller.Usuario;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.dao.UsuarioDAO;


public class TelaLogin extends javax.swing.JFrame {

    
    public TelaLogin() {
        initComponents();
        status();
    }

    public void status(){
        Connection conexao = ConnectionFactory.getConexao();
        
        if(conexao == null){
            jLabel_status.setIcon(new ImageIcon(getClass().getResource("/icones/serverOFF.png")));
        }else{
            jLabel_status.setIcon(new ImageIcon(getClass().getResource("/icones/serverON.png")));
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel_status = new javax.swing.JLabel();
        jButton_entrar = new javax.swing.JButton();
        jLabel_novoUsuario = new javax.swing.JLabel();
        jPasswordField_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Login");
        setResizable(false);

        jLabel1.setText("Usuário: ");

        jLabel2.setText("Senha:");

        jLabel_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/serverON.png"))); // NOI18N

        jButton_entrar.setText("Entrar");
        jButton_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_entrarActionPerformed(evt);
            }
        });

        jLabel_novoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_novoUsuario.setForeground(new java.awt.Color(0, 102, 225));
        jLabel_novoUsuario.setText("Novo Usuário ");
        jLabel_novoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_novoUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_novoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_novoUsuarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel_status)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_entrar)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel_novoUsuario)
                        .addContainerGap(176, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jTextField_usuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_status)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPasswordField_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jButton_entrar)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel_novoUsuario)))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_novoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_novoUsuarioMouseEntered

        jLabel_novoUsuario.setForeground(Color.WHITE);

    }//GEN-LAST:event_jLabel_novoUsuarioMouseEntered

    private void jLabel_novoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_novoUsuarioMouseExited

        jLabel_novoUsuario.setForeground(new Color(0,102,255));

    }//GEN-LAST:event_jLabel_novoUsuarioMouseExited

    private void jLabel_novoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_novoUsuarioMouseClicked

        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        
        cadastroUsuario.setVisible(true);
        
        this.dispose();

    }//GEN-LAST:event_jLabel_novoUsuarioMouseClicked

    private void jButton_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_entrarActionPerformed

        String usuario = jTextField_usuario.getText();
        
        String senha = new String(jPasswordField_senha.getPassword());
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        Usuario usuarioEntrou = usuarioDAO.login(usuario, senha);
        
        if(usuarioEntrou != null){
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
            
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(this,"Usuário e/ou senha inválido(s)","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton_entrarActionPerformed


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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_novoUsuario;
    private javax.swing.JLabel jLabel_status;
    private javax.swing.JPasswordField jPasswordField_senha;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
