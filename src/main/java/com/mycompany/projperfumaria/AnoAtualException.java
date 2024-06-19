//Nome: Marjory Mel Ferreira Ferro Lemos - RA 2564238

package com.mycompany.projperfumaria;
import javax.swing.JOptionPane;

/**
 *
 * @author marjory
 */
public class AnoAtualException extends Exception{
   
    public void impAnoAtual() {
        JOptionPane.showMessageDialog(null, "O ano está errado!");
    }

    public Hidratante corAnoHidra(Hidratante ht) {
        try {
            ht.setAnoAtual(Float.parseFloat(JOptionPane.showInputDialog("Digite novamente o ano: ")));
        } catch (AnoAtualException ano) {
            ano.impAnoAtual();
            ht = ano.corAnoHidra(ht);
        }

        return ht;
    }

    public Perfume corAnoPer(Perfume pt) {
        try {
            pt.setAnoAtual(Float.parseFloat(JOptionPane.showInputDialog("Digite novamente o ano: ")));
        } catch (AnoAtualException ano) {
            ano.impAnoAtual();
            pt = ano.corAnoPer(pt);
        }

        return pt;
    }

    public Splash corAnoSplash(Splash st) {
        try {
            st.setAnoAtual(Float.parseFloat(JOptionPane.showInputDialog("Digite novamente o ano: ")));
        } catch (AnoAtualException ano) {
            ano.impAnoAtual();
            st = ano.corAnoSplash(st);
        }

        return st;
    }
}


