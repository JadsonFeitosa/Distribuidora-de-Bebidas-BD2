package visão;
import controle.ControleCliente;
import controle.ControlePedido;
import controle.ControleProduto;
import dto.ClienteDTO;
import dto.PedidoDTO;
import dto.ProdutoDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela_abrirPedido extends javax.swing.JInternalFrame {
    
    private double valorTotal = 0;
    private ControleProduto controlP;
    private ControlePedido controlPedido;
    private PedidoDTO pedido;
    private ArrayList<PedidoDTO> todosPedidos;
    public Tela_abrirPedido() {
        initComponents();
        controlPedido = new ControlePedido();
        controlP = new ControleProduto();
        pedido = new PedidoDTO();
        todosPedidos = new ArrayList<PedidoDTO>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbpesquisaProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        painelProdutosInseridos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutosInseridos = new javax.swing.JTable();
        btInserirProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbIDprod = new javax.swing.JTextField();
        lbvalorProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbquantProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbnomeProduto = new javax.swing.JTextField();
        painelValorTotal = new javax.swing.JPanel();
        lbvalorTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        lbBuscaNomeHospede = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbIDCliente = new javax.swing.JTextField();
        lbnomeHospede = new javax.swing.JTextField();
        cpfHospede = new javax.swing.JTextField();
        btFinalizarPedido = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tela de pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lbpesquisaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbpesquisaProdutoKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pesquisar produto");

        painelProdutosInseridos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaProdutosInseridos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor unit.", "Quantidade", "ID registro"
            }
        ));
        jScrollPane1.setViewportView(tabelaProdutosInseridos);

        javax.swing.GroupLayout painelProdutosInseridosLayout = new javax.swing.GroupLayout(painelProdutosInseridos);
        painelProdutosInseridos.setLayout(painelProdutosInseridosLayout);
        painelProdutosInseridosLayout.setHorizontalGroup(
            painelProdutosInseridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutosInseridosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelProdutosInseridosLayout.setVerticalGroup(
            painelProdutosInseridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btInserirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/entregue.png"))); // NOI18N
        btInserirProduto.setText("Inserir produto");
        btInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirProdutoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID produto");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Valor unit");

        lbIDprod.setEditable(false);

        lbvalorProduto.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Quantidade");

        lbquantProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbquantProdutoKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nome");

        lbnomeProduto.setEditable(false);

        painelValorTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbvalorTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("VALOR TOTAL R$");

        javax.swing.GroupLayout painelValorTotalLayout = new javax.swing.GroupLayout(painelValorTotal);
        painelValorTotal.setLayout(painelValorTotalLayout);
        painelValorTotalLayout.setHorizontalGroup(
            painelValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorTotalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelValorTotalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        painelValorTotalLayout.setVerticalGroup(
            painelValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelValorTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Buscar hóspede por nome");

        lbBuscaNomeHospede.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbBuscaNomeHospedeKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("CPF");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("ID");

        lbIDCliente.setEditable(false);

        lbnomeHospede.setEditable(false);

        cpfHospede.setEditable(false);

        btFinalizarPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btFinalizarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/caixa.png"))); // NOI18N
        btFinalizarPedido.setText("Finalizar pedido");
        btFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbpesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btInserirProduto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbquantProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lbnomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lbIDprod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbvalorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(painelProdutosInseridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btFinalizarPedido))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbnomeHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbBuscaNomeHospede)
                                    .addComponent(cpfHospede, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(painelValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbBuscaNomeHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(lbIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbnomeHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cpfHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbIDprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbpesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(btInserirProduto)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbvalorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lbquantProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(lbnomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(painelProdutosInseridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btFinalizarPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbpesquisaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbpesquisaProdutoKeyReleased
        // TODO add your handling code here:
        if (!this.lbpesquisaProduto.equals("")) {
            String nomePesquisar = this.lbpesquisaProduto.getText();
            try {
                ProdutoDTO produtoPesquisado = (ProdutoDTO) controlP.search(nomePesquisar);
                if(produtoPesquisado != null){
                    this.setaDadosProduto(produtoPesquisado);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Tela_abrirPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lbpesquisaProdutoKeyReleased
    private void setaDadosProduto(ProdutoDTO  produtoPesquisado) {
        this.lbIDprod.setText(produtoPesquisado.getIdRegistro() + "");
        this.lbnomeProduto.setText(produtoPesquisado.getNome());
        this.lbvalorProduto.setText(produtoPesquisado.getValor() + "");
    }
    private void btInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirProdutoActionPerformed
        // TODO add your handling code here:
        try {
            String nomeProd = this.lbnomeProduto.getText();
            String valorUnit = this.lbvalorProduto.getText();
            String idProd = this.lbIDprod.getText();
            String quantProd = this.lbquantProduto.getText();
            if (!quantProd.equals("") && !valorUnit.equals("")) {
                this.inserirProdTabela(nomeProd, valorUnit, quantProd, idProd);
                // limpa os campos de texto
                this.lbIDprod.setText("");
                this.lbnomeProduto.setText("");
                this.lbquantProduto.setText("");
                this.lbvalorProduto.setText("");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btInserirProdutoActionPerformed
    private void atualizaValorTotal(){
        double valorTotal = 0;
        for(int i = 0; i < this.tabelaProdutosInseridos.getModel().getRowCount(); i++){
            double valorUnit = Double.parseDouble((String) this.tabelaProdutosInseridos.getValueAt(i, 1));
            int quantProd =  Integer.parseInt((String) this.tabelaProdutosInseridos.getValueAt(i, 2));
            valorTotal += quantProd * valorUnit;
        }
        this.lbvalorTotal.setText(String.valueOf(valorTotal));
    }
    private void lbquantProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbquantProdutoKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lbquantProdutoKeyReleased

    private void lbBuscaNomeHospedeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbBuscaNomeHospedeKeyReleased
        if (!this.lbBuscaNomeHospede.equals("")) {
            String nome = this.lbBuscaNomeHospede.getText();
            ControleCliente controlCli = new ControleCliente();
            try {
                ClienteDTO clienteAchado = controlCli.search(nome);
                if (clienteAchado != null) {
                    this.cpfHospede.setText(clienteAchado.getCpf());
                    this.lbnomeHospede.setText(clienteAchado.getNome());
                    this.lbIDCliente.setText(clienteAchado.getIdRegistro() + "");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_lbBuscaNomeHospedeKeyReleased

    private void btFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarPedidoActionPerformed
        this.atualizaValorTotal();
        try {
            
            
            PedidoDTO p = null;
            for(int i = 0; i < this.tabelaProdutosInseridos.getModel().getRowCount(); i++){
                p = new PedidoDTO();
                double valorTotal = 0;
                int idCliente = Integer.parseInt((String)this.lbIDCliente.getText());
                int idProd = Integer.parseInt((String) this.tabelaProdutosInseridos.getValueAt(i, 3));
                int quantProd = Integer.parseInt((String) this.tabelaProdutosInseridos.getValueAt(i, 2));
                double linhaValorUnit = Double.parseDouble((String) this.tabelaProdutosInseridos.getValueAt(i, 1));
                double valorLinhaProd = quantProd * linhaValorUnit;
                
                valorTotal += quantProd * linhaValorUnit;
                p.setIdCliente(idCliente);
                p.setIdProduto(idProd);
                p.setQuantProduto(quantProd);
                p.setValorTotal(valorTotal);
                todosPedidos.add(p);
                
            }
            pedido.setPedidosRegistrados(todosPedidos);
            if(controlPedido.create(pedido)){
                JOptionPane.showMessageDialog(null,"Pedido feito.");
                dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }


    }//GEN-LAST:event_btFinalizarPedidoActionPerformed
    private void inserirProdTabela(String nome, String valorUnit, String quant, String idProd){
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaProdutosInseridos.getModel();
        String[] dadosProd = new String[4];
        dadosProd[0] = nome;
        dadosProd[1] = valorUnit;
        dadosProd[2] = quant;
        dadosProd[3] = idProd;
        modelo.addRow(dadosProd);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFinalizarPedido;
    private javax.swing.JButton btInserirProduto;
    private javax.swing.JTextField cpfHospede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lbBuscaNomeHospede;
    private javax.swing.JTextField lbIDCliente;
    private javax.swing.JTextField lbIDprod;
    private javax.swing.JTextField lbnomeHospede;
    private javax.swing.JTextField lbnomeProduto;
    private javax.swing.JTextField lbpesquisaProduto;
    private javax.swing.JTextField lbquantProduto;
    private javax.swing.JTextField lbvalorProduto;
    private javax.swing.JLabel lbvalorTotal;
    private javax.swing.JPanel painelProdutosInseridos;
    private javax.swing.JPanel painelValorTotal;
    private javax.swing.JTable tabelaProdutosInseridos;
    // End of variables declaration//GEN-END:variables

}
