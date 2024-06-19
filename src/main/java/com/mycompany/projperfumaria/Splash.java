//Nome: Marjory Mel Ferreira Ferro Lemos - RA: 2564238

package com.mycompany.projperfumaria;

import javax.swing.JOptionPane;

/**
 *
 * @author marjory
 */
public class Splash extends ProdutoPerfumaria implements CalcValidade{

	private int aplicacaoMl;
	private int percentualFragrancia;

	public Splash(){
		aplicacaoMl = 0;
		percentualFragrancia = 0;
	}

	public final void setAplicacaoMl(int aplicacaoMl){
		this.aplicacaoMl = aplicacaoMl;
	}

	public final void setPercentualFragrancia(int percentualFragrancia){
		this.percentualFragrancia = percentualFragrancia;
	}


	public int getAplicacaoMl(){
		return aplicacaoMl;
	}

	public int getPercentualFragrancia(){
		return percentualFragrancia;
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
                     "Volume de Aplicação: Indica a quantidade de produto que é aplicada de uma vez."
                    +"\nPor exemplo, um splash de 100ml significa que 100ml do produto podem ser aplicados de uma só vez."
                    +"\n"
                    +"\nPercentual da Fragrância: Refere-se à concentração da fragrância no produto."
                    +"\nPor exemplo, um percentual de 5% indica que 5% do produto é composto pela fragrância.",
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