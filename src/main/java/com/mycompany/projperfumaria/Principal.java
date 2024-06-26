//Apache NetBeans IDE 19
//Nome: Marjory Mel Ferreira Ferro Lemos - RA: 2564238

package com.mycompany.projperfumaria;

import javax.swing.JOptionPane;

/**
 *
 * @author marjory
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        setLocationRelativeTo(null);
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

        bmPrinc = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        itMnCadPer = new javax.swing.JMenuItem();
        itMnCadHidra = new javax.swing.JMenuItem();
        itMnCadSplash = new javax.swing.JMenuItem();
        mnRel = new javax.swing.JMenu();
        itMnRelGerPer = new javax.swing.JMenuItem();
        itMnRelGerHidra = new javax.swing.JMenuItem();
        itMnRelGerSplash = new javax.swing.JMenuItem();
        itMnRelGerProd = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        itMnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnCad.setText("Cadastros");

        itMnCadPer.setText("Cadastro de Perfume...");
        itMnCadPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadPerActionPerformed(evt);
            }
        });
        mnCad.add(itMnCadPer);

        itMnCadHidra.setText("Cadastro de Hidratante...");
        itMnCadHidra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadHidraActionPerformed(evt);
            }
        });
        mnCad.add(itMnCadHidra);

        itMnCadSplash.setText("Cadastro de Splash...");
        itMnCadSplash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadSplashActionPerformed(evt);
            }
        });
        mnCad.add(itMnCadSplash);

        bmPrinc.add(mnCad);

        mnRel.setText("Relatórios");

        itMnRelGerPer.setText("Relatório Geral de Perfume...");
        itMnRelGerPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelGerPerActionPerformed(evt);
            }
        });
        mnRel.add(itMnRelGerPer);

        itMnRelGerHidra.setText("Relatório Geral de Hidratante...");
        itMnRelGerHidra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelGerHidraActionPerformed(evt);
            }
        });
        mnRel.add(itMnRelGerHidra);

        itMnRelGerSplash.setText("Relatório Geral de Splash...");
        itMnRelGerSplash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelGerSplashActionPerformed(evt);
            }
        });
        mnRel.add(itMnRelGerSplash);

        itMnRelGerProd.setText("Relatório Geral dos Produtos...");
        itMnRelGerProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelGerProdActionPerformed(evt);
            }
        });
        mnRel.add(itMnRelGerProd);

        bmPrinc.add(mnRel);

        mnSair.setText("Sair");

        itMnSair.setText("Sair...");
        itMnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnSairActionPerformed(evt);
            }
        });
        mnSair.add(itMnSair);

        bmPrinc.add(mnSair);

        setJMenuBar(bmPrinc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itMnCadPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadPerActionPerformed
        CadPer.geraCadPer().setVisible(true);
    }//GEN-LAST:event_itMnCadPerActionPerformed

    private void itMnCadHidraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadHidraActionPerformed
        CadHidratante.geraCadHidra().setVisible(true);
    }//GEN-LAST:event_itMnCadHidraActionPerformed

    private void itMnCadSplashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadSplashActionPerformed
        CadSplash.geraCadSplash().setVisible(true);
    }//GEN-LAST:event_itMnCadSplashActionPerformed

    private void itMnRelGerPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelGerPerActionPerformed
        RelatGeralPer.geraRelGerPer().setVisible(true);
    }//GEN-LAST:event_itMnRelGerPerActionPerformed

    private void itMnRelGerHidraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelGerHidraActionPerformed
        RelatGeralHidra.geraRelGerHidra().setVisible(true);
    }//GEN-LAST:event_itMnRelGerHidraActionPerformed

    private void itMnRelGerSplashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelGerSplashActionPerformed
        RelatGeralSplash.geraRelGerSplash().setVisible(true);
    }//GEN-LAST:event_itMnRelGerSplashActionPerformed

    private void itMnRelGerProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelGerProdActionPerformed
        RelatGeralProdutos.geraRelGerProdutos().setVisible(true);
    }//GEN-LAST:event_itMnRelGerProdActionPerformed

    private void itMnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnSairActionPerformed
        sair();
    }//GEN-LAST:event_itMnSairActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmPrinc;
    private javax.swing.JMenuItem itMnCadHidra;
    private javax.swing.JMenuItem itMnCadPer;
    private javax.swing.JMenuItem itMnCadSplash;
    private javax.swing.JMenuItem itMnRelGerHidra;
    private javax.swing.JMenuItem itMnRelGerPer;
    private javax.swing.JMenuItem itMnRelGerProd;
    private javax.swing.JMenuItem itMnRelGerSplash;
    private javax.swing.JMenuItem itMnSair;
    private javax.swing.JMenu mnCad;
    private javax.swing.JMenu mnRel;
    private javax.swing.JMenu mnSair;
    // End of variables declaration//GEN-END:variables
}
