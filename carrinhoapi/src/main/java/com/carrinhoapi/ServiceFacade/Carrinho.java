package com.carrinhoapi.ServiceFacade;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

public class Carrinho {
	
	@Autowired
	public ProdutosCarrinhoRepository produtosCarrinhoRepository;
	
	
	
	//Adiciona um produto ao carrinho
	public Produto adicionarProdutoAoCarrinho(Produto produto) {
		return produtosCarrinhoRepository.save(produto);
	}
	
	//Mostra os produtos do carrinho
	public List<Produto> listarProdutosDoCarrinho() {
		return produtosCarrinhoRepository.findAll();
	}
}
