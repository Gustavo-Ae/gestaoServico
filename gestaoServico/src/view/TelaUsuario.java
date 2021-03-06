/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Usuario;
import javax.swing.JOptionPane;
import model.dao.UsuarioDAO;

/**
 *
 * @author Josiene
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    String id;
    
    public TelaUsuario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_nome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_perfil = new javax.swing.JComboBox();
        jTextField_telefone = new javax.swing.JTextField();
        jTextField_usuario = new javax.swing.JTextField();
        jButton_adicionar = new javax.swing.JButton();
        jButton_consultar = new javax.swing.JButton();
        jButton_alterar = new javax.swing.JButton();
        jButton_deletar = new javax.swing.JButton();
        jTextField_senha = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel2.setText("Nome");

        jLabel3.setText("Telefone");

        jLabel4.setText("Usuário");

        jLabel5.setText("Senha ");

        jLabel6.setText("Perfil");

        jComboBox_perfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Usuário", "Administrador" }));

        jButton_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/create.png"))); // NOI18N
        jButton_adicionar.setToolTipText("Adicionar");
        jButton_adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_adicionar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_adicionarActionPerformed(evt);
            }
        });

        jButton_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/read.png"))); // NOI18N
        jButton_consultar.setToolTipText("Consultar");
        jButton_consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_consultar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultarActionPerformed(evt);
            }
        });

        jButton_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/update.png"))); // NOI18N
        jButton_alterar.setToolTipText("Alterar");
        jButton_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_alterar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alterarActionPerformed(evt);
            }
        });

        jButton_deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        jButton_deletar.setToolTipText("deletar");
        jButton_deletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_deletar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jButton_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_senha)
                            .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_telefone)
                            .addComponent(jComboBox_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField_nome)
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultarActionPerformed

        id = JOptionPane.showInputDialog(this, "Informe o Id do usuário que deseja procurar: ","Pergunta",JOptionPane.QUESTION_MESSAGE);
        
        if(id != null){ // se for null quer dizer que ele cancelo.
            UsuarioDAO usuarioDAO = new UsuarioDAO();
        
            Usuario usuarioConsulta = usuarioDAO.consulta(id);

            if(usuarioConsulta == null){
                JOptionPane.showMessageDialog(null, "Usuário com id igual a "+id+" não existe!","Aviso",JOptionPane.INFORMATION_MESSAGE);
                limparEntradas();
            }else{
                jTextField_nome.setText(usuarioConsulta.getNome());
                jTextField_telefone.setText(usuarioConsulta.getFone());
                jTextField_usuario.setText(usuarioConsulta.getUsuario());
                jTextField_senha.setText(usuarioConsulta.getSenha());
                jComboBox_perfil.setSelectedItem(usuarioConsulta.getPerfil());
            }
        }
    }//GEN-LAST:event_jButton_consultarActionPerformed

    private void jButton_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_adicionarActionPerformed

        if(jTextField_nome.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Preencha o campo Nome","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(jTextField_usuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Preencha o campo Usuário","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(jTextField_senha.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Preencha o campo Senha","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(jComboBox_perfil.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Selecione algum valor do campo Perfil","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else{

            UsuarioDAO usuarioDAO = new UsuarioDAO();

            Usuario usuario = new Usuario();

            usuario.setNome(jTextField_nome.getText());
            usuario.setFone(jTextField_telefone.getText());
            usuario.setUsuario(jTextField_usuario.getText());
            usuario.setSenha(jTextField_senha.getText());
            usuario.setPerfil(jComboBox_perfil.getSelectedItem().toString());

            usuarioDAO.insert(usuario);

            limparEntradas();
        }
    }//GEN-LAST:event_jButton_adicionarActionPerformed

    private void jButton_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alterarActionPerformed

        if(id != null){
            int perguntaConfirmar = JOptionPane.showConfirmDialog(this, "Realmente deseja alterar o usuário com \n id: "+id+"\n Nome: "+jTextField_nome.getText(),"Pergunta",JOptionPane.YES_NO_OPTION);
            
            if(perguntaConfirmar == 0){
                if(jTextField_nome.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Preencha o campo Nome","Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(jTextField_usuario.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this,"Preencha o campo Usuário","Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(jTextField_senha.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this,"Preencha o campo Senha","Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(jComboBox_perfil.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(this,"Selecione algum valor do campo Perfil","Aviso", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    UsuarioDAO usuarioDAO = new UsuarioDAO();
                    
                    Usuario usuario = new Usuario();
                    
                    usuario.setId(Integer.parseInt(id));
                    usuario.setNome(jTextField_nome.getText());
                    usuario.setFone(jTextField_telefone.getText());
                    usuario.setUsuario(jTextField_usuario.getText());
                    usuario.setSenha(jTextField_senha.getText());
                    usuario.setPerfil(jComboBox_perfil.getSelectedItem().toString());
                    
                    usuarioDAO.update(usuario);
                    
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Consulte o usuário antes de alterar!","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_alterarActionPerformed

    private void jButton_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletarActionPerformed

        if(id != null){
            int perguntaConfirmar = JOptionPane.showConfirmDialog(this, "Realmente deseja deletar o usuário com \n id: "+id+"\n Nome: "+jTextField_nome.getText(),"Pergunta",JOptionPane.YES_NO_OPTION);
            
            if(perguntaConfirmar == 0){
                UsuarioDAO usuarioDAO = new UsuarioDAO();
                
                Usuario usuario = new Usuario();
                
                usuario.setId(Integer.parseInt(id));
                
                usuarioDAO.delete(usuario);
                
                id = null;
                
                limparEntradas();
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Consulte o usuário antes de deletar!","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton_deletarActionPerformed

    public void limparEntradas(){
        jTextField_nome.setText("");
        jTextField_telefone.setText("");
        jTextField_usuario.setText("");
        jTextField_senha.setText("");
        jComboBox_perfil.setSelectedItem(null);    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_adicionar;
    private javax.swing.JButton jButton_alterar;
    private javax.swing.JButton jButton_consultar;
    private javax.swing.JButton jButton_deletar;
    private javax.swing.JComboBox jComboBox_perfil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField_nome;
    private javax.swing.JTextField jTextField_senha;
    private javax.swing.JTextField jTextField_telefone;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
