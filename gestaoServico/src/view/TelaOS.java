
package view;

import controller.OrdemServico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.ClienteDAO;
import model.dao.OrdemServicoDAO;


public class TelaOS extends javax.swing.JInternalFrame {
    int id;
    String tipo;
    public TelaOS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_numeroOS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField_data = new javax.swing.JTextField();
        jRadioButton_orcamento = new javax.swing.JRadioButton();
        jRadioButton_ordemServico = new javax.swing.JRadioButton();
        jComboBox_situacao = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField_nomePesquisado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField_equipamento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_defeito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_servico = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_tecnico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_valorTotal = new javax.swing.JTextField();
        jButton_adicionar = new javax.swing.JButton();
        jButton_consultar = new javax.swing.JButton();
        jButton_editar = new javax.swing.JButton();
        jButton_deletar = new javax.swing.JButton();
        jButton_print = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ordem Serviço");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel3.setText("Nº OS ");

        jTextField_numeroOS.setEditable(false);

        jLabel1.setText("Data");

        jTextField_data.setEditable(false);
        jTextField_data.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        buttonGroup1.add(jRadioButton_orcamento);
        jRadioButton_orcamento.setText("Orçamento");
        jRadioButton_orcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_orcamentoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_ordemServico);
        jRadioButton_ordemServico.setText("Ordem de Serviço");
        jRadioButton_ordemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ordemServicoActionPerformed(evt);
            }
        });

        jComboBox_situacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Na bancada", "Entrega OK", "Orçamento REPROVADO", "Aguardando Aprovação", "Aguardando Peça", "Abandonado pelo Cliente", "Retornou" }));

        jLabel2.setText("Situação :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton_orcamento)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_ordemServico))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField_numeroOS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_data, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_numeroOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_orcamento)
                    .addComponent(jRadioButton_ordemServico))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_situacao)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jTextField_nomePesquisado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_nomePesquisadoKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar.png"))); // NOI18N

        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Fone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_clientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_nomePesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_nomePesquisado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setText("Equipamento:");

        jLabel6.setText("Defeito:");

        jLabel7.setText("Serviço:");

        jLabel8.setText("Técnico:");

        jLabel9.setText("Valor Total:");

        jButton_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/create.png"))); // NOI18N
        jButton_adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_adicionar.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton_adicionar.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton_adicionar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_adicionarActionPerformed(evt);
            }
        });

        jButton_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/read.png"))); // NOI18N
        jButton_consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_consultar.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton_consultar.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton_consultar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultarActionPerformed(evt);
            }
        });

        jButton_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/update.png"))); // NOI18N
        jButton_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_editar.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton_editar.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton_editar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editarActionPerformed(evt);
            }
        });

        jButton_deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        jButton_deletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_deletar.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton_deletar.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton_deletar.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletarActionPerformed(evt);
            }
        });

        jButton_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/print.png"))); // NOI18N
        jButton_print.setToolTipText("Imprimir OS");
        jButton_print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_print.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton_print.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(356, 356, 356))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton_print, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_equipamento)
                            .addComponent(jTextField_defeito)
                            .addComponent(jTextField_servico)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_defeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_deletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        setBounds(0, 0, 639, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_printActionPerformed

    private void jTextField_nomePesquisadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nomePesquisadoKeyReleased
        ClienteDAO clienteDAO = new ClienteDAO();
        
        clienteDAO.pesquisa_TelaOS(jTextField_nomePesquisado.getText());
        
    }//GEN-LAST:event_jTextField_nomePesquisadoKeyReleased

    private void jRadioButton_orcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_orcamentoActionPerformed
        tipo = "Orçamento";
        
    }//GEN-LAST:event_jRadioButton_orcamentoActionPerformed

    private void jRadioButton_ordemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ordemServicoActionPerformed
        tipo = "Ordem de Serviço";

    }//GEN-LAST:event_jRadioButton_ordemServicoActionPerformed

    private void jButton_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_adicionarActionPerformed
        int idCliente = Integer.parseInt(jTable_clientes.getValueAt(jTable_clientes.getSelectedRow(), 0).toString());
        
        if(tipo == null){
            JOptionPane.showMessageDialog(this, "Selecione o Tipo","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else if(jComboBox_situacao.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this, "Selecione a Situação","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(jTextField_equipamento.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe o Equipamento","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(jTextField_defeito.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe o Defeito","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(idCliente == 0){
            JOptionPane.showMessageDialog(this, "Selecione algum Cliente na tabela","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            OrdemServicoDAO ordemServicoDAO = new OrdemServicoDAO();
        
            OrdemServico ordemServico = new OrdemServico();
            
            ordemServico.setTipo(tipo);
            ordemServico.setSituacao(jComboBox_situacao.getSelectedItem().toString());
            ordemServico.setEquipamento(jTextField_equipamento.getText());
            ordemServico.setDefeito(jTextField_defeito.getText());
            ordemServico.setServico(jTextField_servico.getText());
            ordemServico.setTecnico(jTextField_tecnico.getText());
            ordemServico.setValor(Double.parseDouble(jTextField_valorTotal.getText()));
            ordemServico.setIdCliente(idCliente);
            
            ordemServicoDAO.emitirOs(ordemServico);
            
            limparEntradas();
        }
    }//GEN-LAST:event_jButton_adicionarActionPerformed

    private void jButton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultarActionPerformed
        String id_Pesquisado = JOptionPane.showInputDialog(this,"Informe o Id da Ordem de Serviço que deseja procurar:","Pergunta", JOptionPane.QUESTION_MESSAGE);
        
        if(id_Pesquisado != null){ // se for null quer dizer que ele cancelo.
            OrdemServicoDAO ordemServicoDAO = new OrdemServicoDAO();
        
            OrdemServico ordemServicoPesquisado = ordemServicoDAO.pesquisarOs(id_Pesquisado);

            if(ordemServicoPesquisado == null){
                JOptionPane.showMessageDialog(null, "Ordem de Serviço não existe!","Aviso",JOptionPane.INFORMATION_MESSAGE);
                limparEntradas();
            }else{
                id = ordemServicoPesquisado.getCodigo();
                
                jTextField_numeroOS.setText(String.valueOf(ordemServicoPesquisado.getCodigo()));
                jTextField_data.setText(ordemServicoPesquisado.getData_hora());
                
                if(ordemServicoPesquisado.getTipo().equals("Orçamento")){
                    jRadioButton_orcamento.setSelected(true);
                    tipo = "Orçamento";
                }else{
                    jRadioButton_ordemServico.setSelected(true);
                    tipo = "Ordem de Serviço";
                }
                
                jComboBox_situacao.setSelectedItem(ordemServicoPesquisado.getSituacao());
                jTextField_equipamento.setText(ordemServicoPesquisado.getEquipamento());
                jTextField_defeito.setText(ordemServicoPesquisado.getDefeito());
                jTextField_servico.setText(ordemServicoPesquisado.getServico());
                jTextField_tecnico.setText(ordemServicoPesquisado.getTecnico());
                jTextField_valorTotal.setText(String.valueOf(ordemServicoPesquisado.getValor()));
           
                jButton_adicionar.setEnabled(false);
                jTextField_nomePesquisado.setEnabled(false);
                jTable_clientes.setVisible(false);
            }
        }
        
    }//GEN-LAST:event_jButton_consultarActionPerformed

    private void jButton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editarActionPerformed

        if(id != 0){
            int perguntaConfirmar = JOptionPane.showConfirmDialog(this,"Realmente deseja alterar a Ordem de Serviço com \n id: "+id,"Pergunta",JOptionPane.YES_NO_OPTION);
             
            if(perguntaConfirmar == 0){
                if(tipo == null){
                    JOptionPane.showMessageDialog(this, "Selecione o Tipo","Aviso", JOptionPane.INFORMATION_MESSAGE);
                }else if(jComboBox_situacao.getSelectedItem() == null){
                    JOptionPane.showMessageDialog(this, "Selecione a Situação","Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(jTextField_equipamento.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Informe o Equipamento","Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(jTextField_defeito.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Informe o Defeito","Aviso", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    OrdemServicoDAO ordemServicoDAO = new OrdemServicoDAO();
                    
                    OrdemServico ordemServico = new OrdemServico();
                    
                    ordemServico.setCodigo(id);
                    ordemServico.setTipo(tipo);
                    ordemServico.setSituacao(jComboBox_situacao.getSelectedItem().toString());
                    ordemServico.setEquipamento(jTextField_equipamento.getText());
                    ordemServico.setDefeito(jTextField_defeito.getText());
                    ordemServico.setServico(jTextField_servico.getText());
                    ordemServico.setTecnico(jTextField_tecnico.getText());
                    ordemServico.setValor(Double.parseDouble(jTextField_valorTotal.getText()));
                    
                    ordemServicoDAO.updateOs(ordemServico);
                    
                    limparEntradas();
                    
                    jButton_adicionar.setEnabled(true);
                    jTextField_nomePesquisado.setEnabled(true);
                    jTable_clientes.setVisible(true);
                    
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Consulte a Ordem de Serviço antes de alterar!","Aviso",JOptionPane.INFORMATION_MESSAGE);
            
       }

    }//GEN-LAST:event_jButton_editarActionPerformed

    private void jButton_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletarActionPerformed
        if(id != 0){
            int perguntaConfirmar = JOptionPane.showConfirmDialog(this, "Realmente deseja deletar "+tipo+" com \n id: "+id,"Pergunta",JOptionPane.YES_NO_OPTION);
            
            if(perguntaConfirmar == 0){
                OrdemServicoDAO ordemServicoDAO = new OrdemServicoDAO();
                
                OrdemServico ordemServico = new OrdemServico();
                
                ordemServico.setCodigo(id);
                ordemServico.setTipo(tipo);
                
                ordemServicoDAO.deletar(ordemServico);
                
                id = 0;
                
                limparEntradas();         
                
                jButton_adicionar.setEnabled(true);
                jTextField_nomePesquisado.setEnabled(true);
                jTable_clientes.setVisible(true);   
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Consulte antes de deletar!","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton_deletarActionPerformed
    
    public void limparEntradas(){
        id = 0;
        jTextField_numeroOS.setText("");
        jTextField_data.setText("");
        jComboBox_situacao.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        jTextField_equipamento.setText("");
        jTextField_defeito.setText("");
        jTextField_servico.setText("");
        jTextField_tecnico.setText("");
        jTextField_valorTotal.setText("");
        jTextField_nomePesquisado.setText("");
        ((DefaultTableModel) jTable_clientes.getModel()).setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_adicionar;
    private javax.swing.JButton jButton_consultar;
    private javax.swing.JButton jButton_deletar;
    private javax.swing.JButton jButton_editar;
    private javax.swing.JButton jButton_print;
    private javax.swing.JComboBox jComboBox_situacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_orcamento;
    private javax.swing.JRadioButton jRadioButton_ordemServico;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_clientes;
    private javax.swing.JTextField jTextField_data;
    private javax.swing.JTextField jTextField_defeito;
    private javax.swing.JTextField jTextField_equipamento;
    private javax.swing.JTextField jTextField_nomePesquisado;
    private javax.swing.JTextField jTextField_numeroOS;
    private javax.swing.JTextField jTextField_servico;
    private javax.swing.JTextField jTextField_tecnico;
    private javax.swing.JTextField jTextField_valorTotal;
    // End of variables declaration//GEN-END:variables
}
