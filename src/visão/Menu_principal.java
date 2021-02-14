package visão;

import controle.ControleFuncionario;
import controle.ControleRelatorio;
import dto.FuncionarioDTO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Menu_principal extends javax.swing.JFrame {
    private FuncionarioDTO funcionarioLogado;
    private controle.ControleFuncionario controleF;
    private ControleRelatorio controleRelatorios;
            
    public Menu_principal(String login, String senha) {
        initComponents();
        controleF = new ControleFuncionario();
        controleRelatorios = new ControleRelatorio();
        this.setaData();
        this.verificaLogado(login, senha);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icones/garrafa.png")).getImage());
        
        if(controleF.getLogado() != null){
           this.opCadastrarFuncionario.setVisible(false);
           this.opFuncionariosCadastrados.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton3 = new javax.swing.JButton();
        jMenuItem9 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        areaTrabalho = new javax.swing.JDesktopPane();
        lbdata = new javax.swing.JLabel();
        lblogado = new javax.swing.JLabel();
        btCadastrarCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbCor = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        opCadastrarFuncionario = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        opFuncionariosCadastrados = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jButton3.setText("jButton3");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(areaTrabalho);
        areaTrabalho.setBounds(3, 44, 721, 470);

        lbdata.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(lbdata);
        lbdata.setBounds(30, 520, 118, 13);

        lblogado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(lblogado);
        lblogado.setBounds(500, 520, 190, 13);

        btCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastro.png"))); // NOI18N
        btCadastrarCliente.setText("Cadastrar cliente");
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btCadastrarCliente);
        btCadastrarCliente.setBounds(10, 0, 165, 41);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-garrafa-de-vinho-24.png"))); // NOI18N
        jButton1.setText("Iniciar venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 0, 146, 41);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-veículos-pesados-24.png"))); // NOI18N
        jButton2.setText("Cadastrar fornecedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(370, 0, 180, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-desligar-26.png"))); // NOI18N
        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(580, 0, 130, 40);

        lbCor.setBackground(new java.awt.Color(153, 153, 153));
        lbCor.setOpaque(true);
        jPanel1.add(lbCor);
        lbCor.setBounds(-10, -6, 740, 560);

        jMenu3.setText("Cadastro");

        opCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user.png"))); // NOI18N
        opCadastrarFuncionario.setText("Funcionário");
        opCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu3.add(opCadastrarFuncionario);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user.png"))); // NOI18N
        jMenuItem2.setText("Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-garrafa-de-vinho-24.png"))); // NOI18N
        jMenuItem3.setText("Produto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-veículos-pesados-24.png"))); // NOI18N
        jMenuItem4.setText("Fornecedor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar2.add(jMenu3);

        jMenu5.setText("Registros");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-usuário-masculino-24.png"))); // NOI18N
        jMenuItem6.setText("Clientes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-garrafa-de-vinho-24.png"))); // NOI18N
        jMenuItem7.setText("Produtos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-veículos-pesados-24.png"))); // NOI18N
        jMenuItem8.setText("Fornecedores");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        opFuncionariosCadastrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-usuário-masculino-24.png"))); // NOI18N
        opFuncionariosCadastrados.setText("Funcionários");
        opFuncionariosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFuncionariosCadastradosActionPerformed(evt);
            }
        });
        jMenu5.add(opFuncionariosCadastrados);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Relatório");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-pdf-26.png"))); // NOI18N
        jMenuItem10.setText("PDF de vendas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuBar2.add(jMenu6);

        jMenu4.setText("Sobre");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-sobre-26.png"))); // NOI18N
        jMenuItem5.setText("FAQ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(735, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Sistema desenvolvido pelos alunos : José Ítalo e Gabriel Oliveira");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(null,"Deseja sair?");
        if(resposta == JOptionPane.YES_OPTION){
            new Login().setVisible(true);
            controleF.setLogado(null);
            dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void opCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
        Cadastro_funcionario telaF = new Cadastro_funcionario();
        this.areaTrabalho.add(telaF);
        telaF.setVisible(true);
    }//GEN-LAST:event_opCadastrarFuncionarioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastraCliente telaC = new CadastraCliente();
        this.areaTrabalho.add(telaC);
        telaC.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarClienteActionPerformed
        // TODO add your handling code here:
        CadastraCliente telaC = new CadastraCliente();
        this.areaTrabalho.add(telaC);
        telaC.setVisible(true);
    }//GEN-LAST:event_btCadastrarClienteActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Cadastro_bebidas telaP = new Cadastro_bebidas();
        this.areaTrabalho.add(telaP);
        telaP.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Tela_abrirPedido telaPedido = new Tela_abrirPedido();
        this.areaTrabalho.add(telaPedido);
        telaPedido.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        CadastroFornecedor telaF = new CadastroFornecedor();
        this.areaTrabalho.add(telaF);
        telaF.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CadastroFornecedor telaF = new CadastroFornecedor();
        this.areaTrabalho.add(telaF);
        telaF.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        ClientesCadastrados clientesC = new ClientesCadastrados();
        this.areaTrabalho.add(clientesC);
        clientesC.setVisible(true);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new Tela_prodsCadastrados().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null,"Deseja gerar o pdf das vendas?");
        if(resp == JOptionPane.YES_OPTION){
            try {
                this.controleRelatorios.gerarRelatorio();
            } catch (Exception ex) {
                Logger.getLogger(Menu_principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Tela_fornecedoresCadastrados telaFornecedor = new Tela_fornecedoresCadastrados();
        this.areaTrabalho.add(telaFornecedor);
        telaFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void opFuncionariosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFuncionariosCadastradosActionPerformed
        // TODO add your handling code here:
        FuncionariosCadastrados telaF = new FuncionariosCadastrados();
        this.areaTrabalho.add(telaF);
        telaF.setVisible(true);
    }//GEN-LAST:event_opFuncionariosCadastradosActionPerformed

    private void setaData() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        this.lbdata.setText("Data: " + formatador.format(new Date()));
    }

    private void verificaLogado(String login, String senha) {
        try {
            funcionarioLogado = controleF.search(login, senha);
            if (login == null && senha == null) {
                this.lblogado.setText("Logado: Administrador");
            } else {
                this.lblogado.setText("Logado: " + funcionarioLogado.getLogin());
            }
        } catch (SQLException ex) {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JButton btCadastrarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCor;
    private javax.swing.JLabel lbdata;
    private javax.swing.JLabel lblogado;
    private javax.swing.JMenuItem opCadastrarFuncionario;
    private javax.swing.JMenuItem opFuncionariosCadastrados;
    // End of variables declaration//GEN-END:variables

}
