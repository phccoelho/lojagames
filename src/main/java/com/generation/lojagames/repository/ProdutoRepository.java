package com.generation.lojagames.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	Optional<Produto> findTopByOrderByPrecoDesc(); // Maior Preço
	
	Optional<Produto> findTopByOrderByPrecoAsc(); // Menor Preco
	
}
