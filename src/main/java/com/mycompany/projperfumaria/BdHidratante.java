//Nome: Marjory Mel Ferreira Ferro Lemos - RA: 2564238

package com.mycompany.projperfumaria;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 *
 * @author marjory
 */
public class BdHidratante{

	private Hidratante hidra;
	private List<Hidratante> bdHidra;
        private static BdHidratante ghUnic;
        
         private BdHidratante(){
            bdHidra = new ArrayList<Hidratante>();
        }
      
        // Método Singleton
        public static BdHidratante geraGerHidra(){
            if(ghUnic == null){
                ghUnic = new BdHidratante();
            }
            return ghUnic;
        }
        
        public List<Hidratante> getBdHidra(){
            return bdHidra;
        }
        
	public Hidratante insHidra(Hidratante hidra){
		if(consHidraID(hidra)== null){
			bdHidra.add(hidra);
			return hidra;
		}
		else{
			return null;
		}
	}

	public Hidratante consHidraID(Hidratante hidra){
		for(int i = 0; i < bdHidra.size(); i++){
                            if(hidra.getCodProduto() == bdHidra.get(i).getCodProduto()){
				return bdHidra.get(i);
			}
		}
		return null;
	}
        
	public Hidratante delHidraID(Hidratante hidra){
                Hidratante hidra1 = consHidraID(hidra);
            	if(hidra1 != null){
                    bdHidra.remove(hidra1);
                    return null;
		}
		else{
                    return hidra;
		}
		
	}

	public Hidratante atualizaHidraID(Hidratante hidra){
		for(int i = 0; i < bdHidra.size(); i++){
			if(hidra.getCodProduto() == bdHidra.get(i).getCodProduto()){
                                hidra = bdHidra.get(i);
                                
                                String precoStrH = JOptionPane.showInputDialog(
                                        null,
                                        "Informe o novo preço:",
                                        "Atulizar dados",
                                        JOptionPane.INFORMATION_MESSAGE
                                );
                                float precoHidra = Float.parseFloat(precoStrH);
                                hidra.setPreco(precoHidra);
				bdHidra.set(i, hidra);  
                                return bdHidra.get(i);
			}
		}
                return null;
	}

}