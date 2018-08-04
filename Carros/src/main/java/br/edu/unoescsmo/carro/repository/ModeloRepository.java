package br.edu.unoescsmo.carro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoescsmo.carro.model.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {


}
