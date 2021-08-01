package com.carrinhoapi.ServiceFacade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idProduto;
	
	public Long quantidade;
	
	@Column(nullable = false)
	public String nomeProduto;
	
	public double precoProduto;
	
	
	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	
}
