package br.edu.unoescsmo.carro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoescsmo.carro.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{

	
}
