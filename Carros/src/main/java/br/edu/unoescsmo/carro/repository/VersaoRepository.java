package br.edu.unoescsmo.carro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoescsmo.carro.model.Versao;

public interface VersaoRepository extends JpaRepository<Versao, Long> {

	
}
