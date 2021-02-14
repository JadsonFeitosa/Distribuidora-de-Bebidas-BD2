package visão;

import controle.ControleCliente;
import controle.ControleFuncionario;
import dao.FuncionarioDAO;
import dto.ClienteDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClientesCadastrados extends javax.swing.JInternalFrame {
    private  ControleCliente controleC;
    private ControleFuncionario controleF;
    
    
    public ClientesCadastrados (){
        initComponents();
        controleC = new controle.ControleCliente();
        controleF = new ControleFuncionario();
        this.prencheTabela();
        if(controleF.getLogado() == null){
            this.bteditar.setVisible(true);
            this.btsalvar.setVisible(true);
        } else {
            this.bteditar.setVisible(false);
            this.btsalvar.setVisible(false);
        }
    }
    private void prencheTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
        try {
            ClienteDTO cliDTO = controleC.read();
            String[] dados = new String[4];
            for (ClienteDTO c : cliDTO.getClientesRegistrados()) {
                dados[0] = c.getNome();
                dados[1] = c.getTelefone();
                dados[2] = c.getCpf();
                dados[3] = c.getIdRegistro() + "";
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
            ClienteDTO cliDTO = controleC.read();
            String[] dados = new String[4];
            for (ClienteDTO c : cliDTO.getClientesRegistrados()) {
                dados[0] = c.getNome();
                dados[1] = c.getTelefone();
                dados[2] = c.getCpf();
                dados[3] = c.getIdRegistro() + "";
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
        jLabel4 = new javax.swing.JLabel();
        lbnome = new javax.swing.JTextField();
        lbcpf = new javax.swing.JTextField();
        lbtelefone = new javax.swing.JTextField();
        lbId = new javax.swing.JTextField();
        bteditar = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "CPF", "ID registro"
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
        jLabel2.setText("Telefone");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CPF");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ID");

        lbnome.setEditable(false);

        lbcpf.setEditable(false);

        lbtelefone.setEditable(false);

        lbId.setEditable(false);

        bteditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-editar-26.png"))); // NOI18N
        bteditar.setText("Editar");
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });

        btsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-salvar-26.png"))); // NOI18N
        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbnome)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btsalvar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bteditar)
                        .addGap(48, 48, 48)))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lbtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lbnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(lbcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bteditar)
                    .addComponent(btsalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        if(this.tabela.getSelectedRow() != -1){
            String nome = (String) this.tabela.getValueAt(tabela.getSelectedRow(), 0);
            String telefone = (String) this.tabela.getValueAt(tabela.getSelectedRow(), 1);
            String cpf = (String) this.tabela.getValueAt(tabela.getSelectedRow(), 2);
            String id = (String) this.tabela.getValueAt(tabela.getSelectedRow(), 3);
            
            this.lbnome.setText(nome);
            this.lbtelefone.setText(telefone);
            this.lbId.setText(id);
            this.lbcpf.setText(cpf);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
        // TODO add your handling code here:
        this.lbcpf.setEditable(true);
        this.lbnome.setEditable(true);
        this.lbtelefone.setEditable(true);
    }//GEN-LAST:event_bteditarActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        try{
            String nomeCli = this.lbnome.getText();
            String cpf = this.lbcpf.getText();
            String telefone = this.lbtelefone.getText();
            int id = Integer.parseInt((String) this.lbId.getText());
            ClienteDTO novoCli = new ClienteDTO();
            novoCli.setNome(nomeCli);
            novoCli.setCpf(cpf);
            novoCli.setTelefone(telefone);
            novoCli.setIdRegistro(id);
            if(controleC.update(novoCli)){
                JOptionPane.showMessageDialog(null,"Daddos atualizados.");
                this.atualizarTabela();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btsalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbId;
    private javax.swing.JTextField lbcpf;
    private javax.swing.JTextField lbnome;
    private javax.swing.JTextField lbtelefone;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

}
