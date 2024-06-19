//Nome: Marjory Mel Ferreira Ferro Lemos - RA: 2564238

package com.mycompany.projperfumaria;

import javax.swing.JOptionPane;

public abstract class ProdutoPerfumaria{
    
        private int codProduto;
	private String nome;
	private float preco;
	private float cupom;
	private float validade;
	private float anoAtual;

	public ProdutoPerfumaria(){
                codProduto = 0;
		nome = "";
		preco = 0.0f;
		cupom = 0.0f;
		validade = 0.0f;
		anoAtual = 0.0f;
	}


	public final void setNome(String nome){
		this.nome = nome;
	}

	public final void setPreco(float preco){
		this.preco = preco;
	}
	
	public final void setCodProduto(int codProduto){
		this.codProduto = codProduto;
	}

	public final void setCupom(float cupom) throws CupomException{
                if(cupom >= 0){
                    this.cupom = cupom;
                }
                else{
                    throw new CupomException();
                }
	}

	public final void setValidade(float validade){
		this.validade = validade;
	}

	public final void setAnoAtual(float anoAtual)throws AnoAtualException{
                if(anoAtual > 2022){
                    this.anoAtual = anoAtual;
                }
                else{
                    throw new AnoAtualException();
                }
	}

	
	public String getNome(){
		return nome;
	}
	
	public float getPreco(){
		return preco;
	}
	
	public int getCodProduto(){
		return codProduto;
	}

	public float getCupom(){
		return cupom;
	}

	public float getValidade(){
		return validade;
	}

	public float getAnoAtual(){
		return anoAtual;
	}

	// Método de Sobrescrita
        public void explicacaoProduto(){
        
            JOptionPane.showMessageDialog(
                    null,
                    "Explicação",
                    "EXPLICAÇÃO DO PRODUTO",
                    1
            
            );
        }
}
        