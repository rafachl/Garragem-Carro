package br.edu.unoescsmo.carro.regras;

import java.util.List;

import br.edu.unoescsmo.carro.model.Versao;

public interface VersaoRegra {

	void salvar(Versao modelo);


	List<Versao> listar();
	
	List<Versao> dadosGrid();

}
