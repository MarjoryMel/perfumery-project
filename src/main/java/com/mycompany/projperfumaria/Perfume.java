//Nome: Marjory Mel Ferreira Ferro Lemos - RA: 2564238

package com.mycompany.projperfumaria;

import javax.swing.JOptionPane;

/**
 *
 * @author marjory
 */
public class Perfume extends ProdutoPerfumaria implements CalcValidade{
    
    	private String concentracao;
	private String familiaOlfativa;

	public Perfume(){
		concentracao = "";
		familiaOlfativa = "";
	}

	public final void setConcentracao(String concentracao){
		this.concentracao = concentracao;
	}
	
	public final void setFamiliaOlfativa(String familiaOlfativa){
    		this.familiaOlfativa = familiaOlfativa;
	}

	public String getConcentracao(){
		return concentracao;
	}


	public String getFamiliaOlfativa(){
		return familiaOlfativa;
	}

	//Método de sobrecarga
	public float calc(){
		return 0.0f;
	}

    	public float calc(float cupom, float preco) {
        	float desconto = (cupom / 100.0f) * preco;
       		return desconto;
    	}

	public float calc(float preco, float validade, float anoAtual) {
		float validadePreco = preco / (validade - anoAtual);
                validadePreco = (float) (Math.round(validadePreco * 100.0) / 100.0);
                return validadePreco;
	}

	//Método sobrescrito
            @Override
        public void explicacaoProduto(){
            JOptionPane.showMessageDialog(
                    null,
                     "Fragrância: Indica a concentração de fragrância presente no perfume."
                    +"\nTipos de fragrâncias: Eau de Parfum, Eau de Toilette, Eau de Cologne e Parfum."
                    +"\n"
                    +"\nFamília Olfativa: Descreve a categoria olfativa à qual o perfume pertence."
                    +"\nPor exemplo, pode ser floral, cítrico, amadeirado, entre outros.",
                    "INFORMAÇÕES DO PRODUTO",
                    1
            );
        }

	//Calc interface
	public float calcular(){
		float subAnos = getValidade() - getAnoAtual();
		return subAnos;
	}

}
