//Nome: Marjory Mel Ferreira Ferro Lemos - RA: 2564238

package com.mycompany.projperfumaria;

import javax.swing.JOptionPane;

/**
 *
 * @author marjory
 */
public class CupomException extends Exception{
        
    public void impCupom() {
        JOptionPane.showMessageDialog(null, "O valor do cupom não pode ser negativo!");
    }

    public Hidratante corCupomHidra(Hidratante ht) {
        try {
            ht.setCupom(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cupom novamente: ")));
        } catch (CupomException cup) {
            cup.impCupom();
            ht = cup.corCupomHidra(ht);
        }

        return ht;
    }

    public Perfume corCupomPer(Perfume pt) {
        try {
            pt.setCupom(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cupom novamente: ")));
        } catch (CupomException cup) {
            cup.impCupom();
            pt = cup.corCupomPer(pt);
        }

        return pt;
    }

    public Splash corCupomSplash(Splash st) {
        try {
            st.setCupom(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cupom novamente: ")));
        } catch (CupomException cup) {
            cup.impCupom();
            st = cup.corCupomSplash(st);
        }

        return st;
    }        
}
