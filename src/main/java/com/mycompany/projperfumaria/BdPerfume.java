//Nome: Marjory Mel Ferreira Ferro Lemos - RA: 2564238

package com.mycompany.projperfumaria;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author marjory
 */
public class BdPerfume{

	private Perfume per;
	private List<Perfume> bdPer;
        private static BdPerfume gpUnic;
        
         private BdPerfume(){
            bdPer = new ArrayList<Perfume>();
        }
      
        // Método Singleton
        public static BdPerfume geraGerPer(){
            if(gpUnic == null){
                gpUnic = new BdPerfume();
            }
            return gpUnic;
        }
        
        public List<Perfume> getBdPer(){
            return bdPer;
        }
        
	public Perfume insPer(Perfume per){
		if(consPerID(per)== null){
			bdPer.add(per);
			return per;
		}
		else{
			return null;
		}
	}

	public Perfume consPerID(Perfume per){
		for(int i = 0; i < bdPer.size(); i++){
                            if(per.getCodProduto() == bdPer.get(i).getCodProduto()){
				return bdPer.get(i);
			}
		}
		return null;
	}
        
	public Perfume delPerID(Perfume per){
                Perfume per1 = consPerID(per);
            	if(per1 != null){
                    bdPer.remove(per1);
                    return null;
		}
		else{
                    return per;
		}
		
	}

	public Perfume atualizaPerID(Perfume per){
		for(int i = 0; i < bdPer.size(); i++){
			if(per.getCodProduto() == bdPer.get(i).getCodProduto()){
                                per = bdPer.get(i);
                                
                                String precoStr = JOptionPane.showInputDialog(
                                        null,
                                        "Informe o novo preço:",
                                        "Atulizar dados",
                                        JOptionPane.INFORMATION_MESSAGE
                                );
                                float preco = Float.parseFloat(precoStr);
                                per.setPreco(preco);
				bdPer.set(i, per);  
                                return bdPer.get(i);
			}
		}
                return null;
	}

}
