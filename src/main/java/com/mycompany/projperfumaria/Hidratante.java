//Nome: Marjory Mel Ferreira Ferro Lemos - RA: 2564238

package com.mycompany.projperfumaria;

import javax.swing.JOptionPane;

/**
 *
 * @author marjory
 */
public class Hidratante extends ProdutoPerfumaria implements CalcValidade{

	private int fatorHidratacao;
	private String protecaoSolar;

	public Hidratante(){
		fatorHidratacao = 0;
		protecaoSolar = "";
	}

	
	public final void setFatorHidratacao(int fatorHidratacao){
		this.fatorHidratacao = fatorHidratacao;
	}

	
	public final void setProtecaoSolar(String protecaoSolar){
		this.protecaoSolar = protecaoSolar;
	}


	public int getFatorHidratacao(){
		return fatorHidratacao;
	}

	public String getProtecaoSolar(){
		return protecaoSolar;
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
                     "Fator de Hidratação: Indica o grau de hidratação fornecido pelo produto."
                    +"\nPortanto, indique o valor numérico de hidratação do produto."
                    +"\n"
                    +"\nProteção Solar: Refere-se à capacidade do hidratante de oferecer proteção contra raios UV."
                    +"\nAlguns hidratantes possuem proteção solar, portanto, indique se o produto oferece proteção contra a exposição solar. (sim/não)",
                    "INFORMAÇÕES DO PRODUTO",
                    1
            );
        }
	


	//Calc interface
        @Override
	public float calcular(){
		float subAnos = getValidade() - getAnoAtual();
		return subAnos;
	}

	
}
