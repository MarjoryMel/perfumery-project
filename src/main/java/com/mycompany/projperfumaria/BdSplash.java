//Nome: Marjory Mel Ferreira Ferro Lemos - RA: 2564238

package com.mycompany.projperfumaria;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 *
 * @author marjory
 */
public class BdSplash {

	private Splash spl;
	private List<Splash> bdSplash;
        private static BdSplash gsUnic;
        
         private BdSplash(){
            bdSplash = new ArrayList<Splash>();
        }
      
        // Método Singleton
        public static BdSplash geraGerSplash(){
            if(gsUnic == null){
                gsUnic = new BdSplash();
            }
            return gsUnic;
        }
        
        public List<Splash> getBdSplash(){
            return bdSplash;
        }
        
	public Splash insSplash(Splash spl){
		if(consSplashID(spl)== null){
			bdSplash.add(spl);
			return spl;
		}
		else{
			return null;
		}
	}

	public Splash consSplashID(Splash spl){
		for(int i = 0; i < bdSplash.size(); i++){
                            if(spl.getCodProduto() == bdSplash.get(i).getCodProduto()){
				return bdSplash.get(i);
			}
		}
		return null;
	}
        
	public Splash delSplashID(Splash spl){
                Splash spl1 = consSplashID(spl);
            	if(spl1 != null){
                    bdSplash.remove(spl1);
                    return null;
		}
		else{
                    return spl;
		}
		
	}

	public Splash atualizaSplashID(Splash spl){
		for(int i = 0; i < bdSplash.size(); i++){
			if(spl.getCodProduto() == bdSplash.get(i).getCodProduto()){
                                spl = bdSplash.get(i);
                                String precoStrS = JOptionPane.showInputDialog(
                                        null,
                                        "Informe o novo preço:",
                                        "Atulizar dados",
                                        JOptionPane.INFORMATION_MESSAGE
                                );
                                float precoSplash = Float.parseFloat(precoStrS);
                                spl.setPreco(precoSplash);
				bdSplash.set(i, spl);  
                                return bdSplash.get(i);
			}
		}
                return null;
	}  
}
