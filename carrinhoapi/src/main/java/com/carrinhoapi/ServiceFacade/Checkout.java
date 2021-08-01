package com.carrinhoapi.ServiceFacade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Checkout {

	private double precoAtual;
	private double precoTotal;
	
	@Autowired//possivel erro
	private CarrinhoController comandos;
	
	private List<Produto> produtosNoCarrinho;
	
	private double precoFrete;

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public double getPrecoFrete() {
		return precoFrete;
	}

	public void setPrecoFrete(double precoFrete) {

		this.precoFrete = precoFrete;
	}
	
	public double calculaPrecoTotal() {
		//Segundo o erro, aqui está dando Null Pointer
		produtosNoCarrinho = comandos.mostrarCarrinho();
		
		for (Produto produto : produtosNoCarrinho) {
			precoAtual += produto.getQuantidade() * produto.getPrecoProduto();
		}
		
		setPrecoTotal(precoAtual);
		
		return this.precoTotal;
	}
	
	
	
	
}
