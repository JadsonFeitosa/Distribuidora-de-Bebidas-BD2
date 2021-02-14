/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import controle.ControleFornecedor;
import controle.ControleFuncionario;
import dto.FornecedorDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela_fornecedoresCadastrados extends javax.swing.JInternalFrame {
     private ControleFuncionario controleF;
     private ControleFornecedor ControleFornecedor;
     
    public Tela_fornecedoresCadastrados() {
        initComponents();
          controleF = new ControleFuncionario();
          ControleFornecedor = new ControleFornecedor();
        if(controleF.getLogado() != null){
            this.btSalvar.setVisible(false);
            this.btEditar.setVisible(false);
        }
        this.preencheTabela();
    }

    private void preencheTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
        try {
            FornecedorDTO fornecedor = ControleFornecedor.read();
            String[] dados = new String[4];
            for (FornecedorDTO f : fornecedor.getFornecedoresRegistrados()) {
                dados[0] = f.getNome();
                dados[1] = f.getCnpj();
                dados[2] = f.getTelefone();
                dados[3] = f.getIdRegistro()+"";
                modelo.addRow(dados);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
     private void atualizarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
        modelo.setNumRows(0);
        try {
            FornecedorDTO fornecedor = ControleFornecedor.read();
            String[] dados = new String[4];
            for (FornecedorDTO f : fornecedor.getFornecedoresRegistrados()) {
                dados[0] = f.getNome();
                dados[1] = f.getCnpj();
                dados[2] = f.getTelefone();
                dados[3] = f.getIdRegistro()+"";
                modelo.addRow(dados);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbnome = new javax.swing.JTextField();
        lbid = new javax.swing.JTextField();
        lbcnpj = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbtelefone = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CNPJ", "Telefone", "ID registro"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CNPJ");

        lbnome.setEditable(false);

        lbid.setEditable(false);

        lbcnpj.setEditable(false);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-salvar-26.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-editar-26.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Telefone");

        lbtelefone.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(lbnome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(33, 33, 33)
                                        .addComponent(lbcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btSalvar)
                                        .addGap(84, 84, 84)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))))))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lbnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(lbtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btEditar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setBounds(0, 0, 493, 467);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
          if(this.tabela.getSelectedRow() != -1){
              String nome = (String) this.tabela.getValueAt(tabela.getSelectedRow(), 0);
              String cnpj = (String) this.tabela.getValueAt(tabela.getSelectedRow(), 1); 
              String telefone = (String) this.tabela.getValueAt(tabela.getSelectedRow(), 2);
              String idRegistro = (String) this.tabela.getValueAt(tabela.getSelectedRow(), 3);
              
              this.lbnome.setText(nome);
              this.lbcnpj.setText(cnpj);
              this.lbid.setText(idRegistro);
              this.lbtelefone.setText(telefone);
          }
    }//GEN-LAST:event_tabelaMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        this.lbcnpj.setEditable(true);
        this.lbnome.setEditable(true);
        this.lbtelefone.setEditable(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        if(tabela.getSelectedRow() != -1){
            String nome = this.lbnome.getText();
            String telefone = this.lbtelefone.getText();
            String cnpj = this.lbcnpj.getText();
            int id = Integer.parseInt((String)this.lbid.getText());
            
            FornecedorDTO novoFornecedor = new FornecedorDTO();
            novoFornecedor.setNome(nome);
            novoFornecedor.setCnpj(cnpj);
            novoFornecedor.setTelefone(telefone);
            novoFornecedor.setIdRegistro(id);
            try {
                if(ControleFornecedor.update(novoFornecedor)){
                    JOptionPane.showMessageDialog(null,"Dados atualizados.");
                    this.atualizarTabela();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbcnpj;
    private javax.swing.JTextField lbid;
    private javax.swing.JTextField lbnome;
    private javax.swing.JTextField lbtelefone;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

}
