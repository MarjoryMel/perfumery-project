//Nome: Marjory Mel Ferreira Ferro Lemos - RA: 2564238

package com.mycompany.projperfumaria;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marjory
 */
public class CadPer extends javax.swing.JFrame {
    private Perfume p1 = new Perfume();
    private BdPerfume gp = BdPerfume.geraGerPer();
    private static CadPer cpUnic;
    
    /**
     * Creates new form CadPer
     */
    public CadPer() {
        initComponents();
    }
    
    // Método Singleton
    public static CadPer geraCadPer(){
        if(cpUnic == null){
            cpUnic = new CadPer();
        }
        return cpUnic;
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxNome = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxCodProduto = new javax.swing.JTextField();
        cxCupom = new javax.swing.JTextField();
        rtNome = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        rtCodProduto = new javax.swing.JLabel();
        rtCupom = new javax.swing.JLabel();
        cxValidade = new javax.swing.JTextField();
        cxAnoAtual = new javax.swing.JTextField();
        cxFragrancia = new javax.swing.JTextField();
        cxOlfativa = new javax.swing.JTextField();
        rtValidade = new javax.swing.JLabel();
        rtAnoAtual = new javax.swing.JLabel();
        rtFragrancia = new javax.swing.JLabel();
        rtOlfativa = new javax.swing.JLabel();
        btInsPer = new javax.swing.JButton();
        btCosPer = new javax.swing.JButton();
        btAltPer = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPer = new javax.swing.JTable();
        btInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeActionPerformed(evt);
            }
        });

        cxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoActionPerformed(evt);
            }
        });

        cxCupom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCupomActionPerformed(evt);
            }
        });

        rtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtNome.setText("Nome do Produto:");

        rtPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtPreco.setText("Preço do Produto:");

        rtCodProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtCodProduto.setText("ID do Produto:");

        rtCupom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtCupom.setText("Cupom (%):");

        cxAnoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAnoAtualActionPerformed(evt);
            }
        });

        rtValidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtValidade.setText("Ano de Validade:");

        rtAnoAtual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtAnoAtual.setText("Ano Atual:");

        rtFragrancia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtFragrancia.setText("Tipo de Fragrância:");

        rtOlfativa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtOlfativa.setText("Família Olfativa:");

        btInsPer.setText("Inserir");
        btInsPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsPerActionPerformed(evt);
            }
        });

        btCosPer.setText("Consultar");
        btCosPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCosPerActionPerformed(evt);
            }
        });

        btAltPer.setText("Alterar Preço");
        btAltPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltPerActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tbPer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Preço"
            }
        ));
        tbPer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPer);

        btInfo.setText("Informação");
        btInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rtCodProduto)
                    .addComponent(rtPreco)
                    .addComponent(rtNome)
                    .addComponent(rtValidade)
                    .addComponent(rtAnoAtual)
                    .addComponent(rtFragrancia)
                    .addComponent(rtOlfativa)
                    .addComponent(rtCupom))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cxCupom)
                                .addComponent(cxValidade)
                                .addComponent(cxAnoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cxFragrancia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxOlfativa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btInfo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btSair))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btInsPer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCosPer)
                        .addGap(12, 12, 12)
                        .addComponent(btAltPer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInsPer)
                    .addComponent(btCosPer)
                    .addComponent(btAltPer)
                    .addComponent(cxCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtCodProduto)
                    .addComponent(btExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtPreco))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxCupom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtCupom))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtValidade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxAnoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtAnoAtual))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxFragrancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtFragrancia)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxOlfativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtOlfativa)
                    .addComponent(btLimpar)
                    .addComponent(btSair)
                    .addComponent(btInfo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCupomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCupomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCupomActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void cxAnoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAnoAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAnoAtualActionPerformed

    private void cxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPrecoActionPerformed

    private void btInsPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsPerActionPerformed
        insPer();
        listTab();
        limpar();
    }//GEN-LAST:event_btInsPerActionPerformed

    private void btCosPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCosPerActionPerformed
        consPerID();
    }//GEN-LAST:event_btCosPerActionPerformed

    private void btAltPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltPerActionPerformed
        altPerID();
        listTab();
    }//GEN-LAST:event_btAltPerActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excPerID();
        listTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void tbPerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPerMouseClicked
        selectTab();
    }//GEN-LAST:event_tbPerMouseClicked

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfoActionPerformed
        info();
    }//GEN-LAST:event_btInfoActionPerformed
    
    
    public void listTab(){
        DefaultTableModel modelo = (DefaultTableModel)tbPer.getModel();
        int posLin = 0;
        
        modelo.setRowCount(posLin);
        
        for(Perfume per:gp.getBdPer()){
            modelo.insertRow(posLin, new Object[]{per.getCodProduto(),per.getNome(), per.getPreco()});
            posLin++;
        }
    }
    
    public void selectTab(){
    
        String valLinTab = "";
        
        int posLin = tbPer.getSelectedRow();
        int col = 0;
        for(col = 0; col < tbPer.getColumnCount(); col++){
            valLinTab += tbPer.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tbPer.getColumnCount()){
                valLinTab += " - ";
            }
        }
        
        float desconto = p1.calc(p1.getCupom(), p1.getPreco());
        float validadePreco = p1.calc(p1.getPreco(),p1.getValidade(),p1.getAnoAtual());
        float validadeRestante = p1.calcular();
        
                JOptionPane.showMessageDialog(
                null,
                "\nID do produto: " + p1.getCodProduto()+
                "\nNome do produto: " + p1.getNome()+
                "\nPreço do produto: " + p1.getPreco()+
                "\nCupom em percentual: " + p1.getCupom()+
                "\nAno de validade: " + p1.getValidade()+
                "\nAno atual: " + p1.getAnoAtual()+
                "\nConcetração da fragrância: " +p1.getConcentracao()+
                "\nFamília Olfativa: " +p1.getFamiliaOlfativa()+
                "\nDesconto com cupom: " + desconto + 
                "\nRelação preço/validade : " + validadePreco + 
                "\nValidade restante: " + validadeRestante + " anos",
                "RESULTADOS DO PRODUTO: ",
                1
        );
    }   
    
    public void excPerID(){
        p1 = new Perfume();
        
        p1.setCodProduto(Integer.parseInt(cxCodProduto.getText()));
        
        p1 = gp.delPerID(p1);
        
        if(p1 == null){
    
                    JOptionPane.showMessageDialog(
                    null,
                    "Produto excluido com sucesso!",
                    "EXCLUSÃO DE PRODUTO",
                    1
            );
            limpar();
        }
        else{
                    JOptionPane.showMessageDialog(
                    null,
                    "NÃO EXISTE PRODUTO COM ESTE ID",
                    "EXCLUSÃO DE PRODUTO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        
    }
    
    public void altPerID(){
        p1 = new Perfume();
        
        p1.setCodProduto(Integer.parseInt(cxCodProduto.getText()));
        
        p1 = gp.atualizaPerID(p1);
        
        if(p1 != null){
            cxCodProduto.setText(Integer.toString(p1.getCodProduto()));
            cxNome.setText(p1.getNome());
            cxPreco.setText(Float.toString(p1.getPreco()));
            cxCupom.setText(Float.toString(p1.getCupom()));
            cxValidade.setText(Float.toString(p1.getValidade()));
            cxAnoAtual.setText(Float.toString(p1.getAnoAtual()));
            cxFragrancia.setText(p1.getConcentracao());
            cxOlfativa.setText(p1.getFamiliaOlfativa());
            
                    JOptionPane.showMessageDialog(
                    null,
                    "Confira do dados!",
                    "ALTERAÇÃO DE PRODUTO",
                    1
            );
            limpar();
        }
        else{
                    JOptionPane.showMessageDialog(
                    null,
                    "NÃO EXISTE PRODUTO COM ESTE NOME",
                    "ALTERAÇÃO DE PRODUTO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    public void consPerID(){
        p1 = new Perfume();
    
        p1.setCodProduto(Integer.parseInt(cxCodProduto.getText()));
        
        p1 = gp.consPerID(p1);
        
        if(p1 != null){
            cxCodProduto.setText(Integer.toString(p1.getCodProduto()));
            cxNome.setText(p1.getNome());
            cxPreco.setText(Float.toString(p1.getPreco()));
            cxCupom.setText(Float.toString(p1.getCupom()));
            cxValidade.setText(Float.toString(p1.getValidade()));
            cxAnoAtual.setText(Float.toString(p1.getAnoAtual()));
            cxFragrancia.setText(p1.getConcentracao());
            cxOlfativa.setText(p1.getFamiliaOlfativa());
            
                    JOptionPane.showMessageDialog(
                    null,
                    "Produto encontrado com sucesso! - Verifique os dados",
                    "CONSULTA DE PRODUTO",
                    1
            );
        }
        else{
                    JOptionPane.showMessageDialog(
                    null,
                    "Esse produto não existe!",
                    "CONSULTA DE PRODUTO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    
    }
    
    public void insPer(){
        try{
            p1 = new Perfume();

            p1.setCodProduto(Integer.parseInt(cxCodProduto.getText()));
            p1.setNome(cxNome.getText());
            p1.setPreco(Float.parseFloat(cxPreco.getText()));    
            
            try{
            p1.setCupom(Float.parseFloat(cxCupom.getText()));
            }
            catch(CupomException cupom){
                cupom.impCupom();
                p1 = cupom.corCupomPer(p1);
            }
            
            p1.setValidade(Float.parseFloat(cxValidade.getText()));
            
            try{
                p1.setAnoAtual(Float.parseFloat(cxAnoAtual.getText()));
            }
                catch(AnoAtualException year){
                    year.impAnoAtual();
                    p1 = year.corAnoPer(p1);
            }
            
            p1.setConcentracao(cxFragrancia.getText());
            p1.setFamiliaOlfativa(cxOlfativa.getText());

            p1 = gp.insPer(p1);

                if(p1 != null){
                            JOptionPane.showMessageDialog(
                            null,
                            "Produto cadastrado com sucesso!",
                            "CADASTRO DE PRODUTO",
                            1
                    );
                }
                else{
                            JOptionPane.showMessageDialog(
                            null,
                            "Produto duplicado",
                            "CADASTRO DE PRODUTO",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
            catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(
                        null,
                        "Verifique os valores inseridos!",
                        "ERRO ENTRADA DE DADOS",
                        JOptionPane.ERROR_MESSAGE
                ); 
                cxCodProduto.setText("");
                cxCodProduto.requestFocus();
            }
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente sair?",
                    "SAIR",
                    JOptionPane.YES_NO_OPTION
        );
        if(resp == 0){
            dispose();
        }
    }
    
    public void limpar(){
        cxCodProduto.setText("");
        cxNome.setText("");
        cxPreco.setText("");
        cxCupom.setText("");
        cxValidade.setText("");
        cxAnoAtual.setText("");
        cxFragrancia.setText("");
        cxOlfativa.setText("");
        cxCodProduto.requestFocus();
    }
    
    public void info(){
        Perfume bt = new Perfume();
        bt.explicacaoProduto();
    }
    
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
            java.util.logging.Logger.getLogger(CadPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltPer;
    private javax.swing.JButton btCosPer;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInfo;
    private javax.swing.JButton btInsPer;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAnoAtual;
    private javax.swing.JTextField cxCodProduto;
    private javax.swing.JTextField cxCupom;
    private javax.swing.JTextField cxFragrancia;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxOlfativa;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxValidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtAnoAtual;
    private javax.swing.JLabel rtCodProduto;
    private javax.swing.JLabel rtCupom;
    private javax.swing.JLabel rtFragrancia;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtOlfativa;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtValidade;
    private javax.swing.JTable tbPer;
    // End of variables declaration//GEN-END:variables
}
