package com.carrinhoapi.ServiceFacade;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Classe que está com o BUG
@RestController
@RequestMapping("/carrinho/checkout")
public class CheckoutController {
	
	@Autowired
	private ProdutosCarrinhoRepository produtosCarrinhoRepository;
	private Checkout checkout;
	
	@GetMapping
	public List<Produto> ListaCarrinho(){
		return produtosCarrinhoRepository.findAll();
	}
	
	public double CalculaPrecoTotal(Checkout checkout) {
		
		return checkout.calculaPrecoTotal();
	}
	
//	public double CalculaFrete() {
//		if(CalculaPrecoTotal() > )
//		
//	}

}
