package br.edu.unoescsmo.carro.regras;

import java.util.List;

import br.edu.unoescsmo.carro.model.Modelo;

public interface ModeloRegra {

	void salvar(Modelo modelo);


	List<Modelo> listar();
	
	List<Modelo> dadosGrid();

}
