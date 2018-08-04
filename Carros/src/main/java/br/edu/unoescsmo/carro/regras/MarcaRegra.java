package br.edu.unoescsmo.carro.regras;

import java.util.List;

import br.edu.unoescsmo.carro.model.Marca;

public interface MarcaRegra {

	void salvar(Marca modelo);


	List<Marca> listar();
	
	List<Marca> dadosGrid();
	
}
