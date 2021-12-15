/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.ClienteDAO;

/**
 *
 * @author Josiene
 */
public class TelaCliente extends javax.swing.JInternalFrame {

    String id;
    public TelaCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_endereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_telefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();
        jButton_adicionar = new javax.swing.JButton();
        jButton_alterar = new javax.swing.JButton();
        jButton_deletar = new javax.swing.JButton();
        jTextField_nomePesquisado = new javax.swing.JTextField();
        jLabel_pesquisar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel1.setText("Nome:");

        jTextField_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Email:");

        jTable_clientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nome", "endereco", "fone", "email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_clientes.setFocusable(false);
        jTable_clientes.getTableHeader().setReorderingAllowed(false);
        jTable_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_clientesMouseClicked(evt);
            }
        });
        jTable_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_clientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_clientes);

        jButton_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/create.png"))); // NOI18N
        jButton_adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_adicionar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_adicionarActionPerformed(evt);
            }
        });

        jButton_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/update.png"))); // NOI18N
        jButton_alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_alterar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alterarActionPerformed(evt);
            }
        });

        jButton_deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        jButton_deletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_deletar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletarActionPerformed(evt);
            }
        });

        jTextField_nomePesquisado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_nomePesquisadoKeyReleased(evt);
            }
        });

        jLabel_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField_nomePesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_pesquisar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jButton_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButton_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_nomePesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nomeActionPerformed

    private void jButton_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_adicionarActionPerformed

        if(jTextField_nome.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Preencha o campo Nome","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(jTextField_telefone.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Preencha o campo Telefone","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            ClienteDAO clienteDAO = new ClienteDAO();
            
            Cliente cliente = new Cliente();
            
            cliente.setNome(jTextField_nome.getText());
            cliente.setEndereco(jTextField_endereco.getText());
            cliente.setFone(jTextField_telefone.getText());
            cliente.setEmail(jTextField_email.getText());
            
            clienteDAO.insert(cliente);
            
            limparEntradas();
        }
    }//GEN-LAST:event_jButton_adicionarActionPerformed

    private void jTextField_nomePesquisadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nomePesquisadoKeyReleased
        ClienteDAO clienteDAO = new ClienteDAO();
        
        clienteDAO.pesquisarCliente(jTextField_nomePesquisado.getText());
        
    }//GEN-LAST:event_jTextField_nomePesquisadoKeyReleased

    private void jTable_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clientesMouseClicked

         if(jTable_clientes.getSelectedRow() != -1){
            id = jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 0).toString();
            jTextField_nome.setText(jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 1).toString());
            jTextField_endereco.setText(jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 2).toString());
            jTextField_telefone.setText(jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 3).toString());
            jTextField_email.setText(jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 4).toString());
            
            jButton_adicionar.setEnabled(false);
        }

    }//GEN-LAST:event_jTable_clientesMouseClicked

    private void jTable_clientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_clientesKeyReleased

        if(jTable_clientes.getSelectedRow() != -1){
            id = jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 0).toString();
            jTextField_nome.setText(jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 1).toString());
            jTextField_endereco.setText(jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 2).toString());
            jTextField_telefone.setText(jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 3).toString());
            jTextField_email.setText(jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 4).toString());
            
            jButton_adicionar.setEnabled(false);
        }
        
    }//GEN-LAST:event_jTable_clientesKeyReleased

    private void jButton_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alterarActionPerformed

        if(id != null){
            int perguntaConfirmar = JOptionPane.showConfirmDialog(this, "Realmente deseja alterar o cliente com \n id: "+id+"\n Nome: "+jTextField_nome.getText(),"Pergunta",JOptionPane.YES_NO_OPTION);
            
            if(perguntaConfirmar == 0){
                if(jTextField_nome.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this,"Preencha o campo Nome","Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(jTextField_telefone.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this,"Preencha o campo Telefone","Aviso", JOptionPane.INFORMATION_MESSAGE);
                }else{
                                    
                    Cliente cliente = new Cliente();

                    cliente.setId(Integer.parseInt(id));
                    cliente.setNome(jTextField_nome.getText());
                    cliente.setEndereco(jTextField_endereco.getText());
                    cliente.setFone(jTextField_telefone.getText());
                    cliente.setEmail(jTextField_email.getText());

                    ClienteDAO clienteDAO = new ClienteDAO();

                    clienteDAO.update(cliente);
                    
                    limparEntradas();
                    
                    jButton_adicionar.setEnabled(true);    
                }
            }
        }
    }//GEN-LAST:event_jButton_alterarActionPerformed

    private void jButton_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletarActionPerformed
        if(id != null){
            int perguntaConfirmar = JOptionPane.showConfirmDialog(this, "Realmente deseja deletar o cliente com \n id: "+id+"\n Nome: "+jTextField_nome.getText(),"Pergunta",JOptionPane.YES_NO_OPTION);

            Cliente cliente = new Cliente();

            cliente.setId(Integer.parseInt(id));
            cliente.setNome(jTextField_nome.getText());
            cliente.setEndereco(jTextField_endereco.getText());
            cliente.setFone(jTextField_telefone.getText());
            cliente.setEmail(jTextField_email.getText());

            ClienteDAO clienteDAO = new ClienteDAO();

            clienteDAO.delete(cliente);

            limparEntradas();

            jButton_adicionar.setEnabled(true);    
          }     
    }//GEN-LAST:event_jButton_deletarActionPerformed

    public void limparEntradas(){
        id = null;
        jTextField_nome.setText("");
        jTextField_endereco.setText("");
        jTextField_telefone.setText("");
        jTextField_email.setText("");
        jTextField_nomePesquisado.setText("");
        ((DefaultTableModel) jTable_clientes.getModel()).setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_adicionar;
    private javax.swing.JButton jButton_alterar;
    private javax.swing.JButton jButton_deletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_pesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_clientes;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_endereco;
    private javax.swing.JTextField jTextField_nome;
    private javax.swing.JTextField jTextField_nomePesquisado;
    private javax.swing.JTextField jTextField_telefone;
    // End of variables declaration//GEN-END:variables
}
