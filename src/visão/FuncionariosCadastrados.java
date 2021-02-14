package visão;
import controle.ControleFuncionario;
import dto.FuncionarioDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FuncionariosCadastrados extends javax.swing.JInternalFrame {

    private ControleFuncionario controleF;

    public FuncionariosCadastrados() {
        initComponents();
        controleF = new ControleFuncionario();
        if (controleF.getLogado() != null) {
            this.btEditar.setVisible(false);
            this.btExcluir.setVisible(false);
            this.btSalvar.setVisible(false);
        }
        this.prencheTabela();
    }

    private void prencheTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
        try {
            FuncionarioDTO fDto = controleF.read();
            String[] dados = new String[4];
            for (FuncionarioDTO f : fDto.getFuncionariosRegistrados()) {
                dados[0] = f.getNome();
                dados[1] = f.getLogin();
                dados[2] = f.getSenha();
                dados[3] = f.getIdRegistro() + "";
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
            FuncionarioDTO fDto = controleF.read();
            String[] dados = new String[4];
            for (FuncionarioDTO f : fDto.getFuncionariosRegistrados()) {
                dados[0] = f.getNome();
                dados[1] = f.getLogin();
                dados[2] = f.getSenha();
                dados[3] = f.getIdRegistro() + "";
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
        lbid = new javax.swing.JTextField();
        lbNome = new javax.swing.JTextField();
        lbLogin = new javax.swing.JTextField();
        lbSenha = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setClosable(true);

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
                "Nome", "Login", "Senha", "ID registro"
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
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Senha");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ID");

        lbid.setEditable(false);

        lbNome.setEditable(false);

        lbLogin.setEditable(false);

        lbSenha.setEditable(false);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-salvar-26.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-editar-26.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-lixo-26.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(btSalvar)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(btEditar)
                                        .addGap(46, 46, 46)
                                        .addComponent(btExcluir)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btEditar)
                    .addComponent(btSalvar))
                .addGap(26, 26, 26))
        );

        setBounds(0, 0, 470, 458);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        if(tabela.getSelectedRow() != -1){
            String nome = (String) tabela.getValueAt(tabela.getSelectedRow(), 0);
            String login = (String) tabela.getValueAt(tabela.getSelectedRow(), 1);
            String senha = (String) tabela.getValueAt(tabela.getSelectedRow(), 2);
            String id = (String) tabela.getValueAt(tabela.getSelectedRow(), 3);
            this.lbNome.setText(nome);
            this.lbLogin.setText(login);
            this.lbSenha.setText(senha);
            this.lbid.setText(id);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        this.lbLogin.setEditable(true);
        this.lbNome.setEditable(true);
        this.lbSenha.setEditable(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        try{
            String nome = this.lbNome.getText();
            String login = this.lbLogin.getText();
            String senha = this.lbSenha.getText();
            int id = Integer.parseInt((String) this.lbid.getText());
            
            FuncionarioDTO novoF = new FuncionarioDTO();
            novoF.setNome(nome);
            novoF.setLogin(login);
            novoF.setSenha(senha);
            novoF.setIdRegistro(id);
            
            if(controleF.update(novoF)){
                JOptionPane.showMessageDialog(null,"Dados atualizados.");
                this.atualizarTabela();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt((String) this.lbid.getText());
            if(controleF.delete(id)){
                JOptionPane.showMessageDialog(null,"Funcionário removido.");
                this.atualizarTabela();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbLogin;
    private javax.swing.JTextField lbNome;
    private javax.swing.JTextField lbSenha;
    private javax.swing.JTextField lbid;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

}
