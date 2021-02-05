package org.generation.GameStore.repository;

import java.util.List;

import org.generation.GameStore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoRepository, Long >{
	
	public List<ProdutoRepository> findAllByNomeContainingIgnoreCase(String nome);

	public Object save(Produto produto); 



}
