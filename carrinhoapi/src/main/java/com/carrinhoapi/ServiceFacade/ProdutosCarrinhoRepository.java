package com.carrinhoapi.ServiceFacade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosCarrinhoRepository extends JpaRepository<Produto, Long>{

}
