package com.carrinhoapi.ServiceFacade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {
	
	@Autowired
	private ProdutosCarrinhoRepository carrinhoDeCompra;
	
	@GetMapping
	public List<Produto> mostrarCarrinho(){
		return carrinhoDeCompra.findAll();
	}
	
	@PostMapping
	public Produto salvarProdutoNoCarrinho(@RequestBody Produto produto) {
		return carrinhoDeCompra.save(produto);
	}
	
	
	
}
