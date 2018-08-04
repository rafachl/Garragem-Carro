package br.edu.unoescsmo.carro.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.carro.model.Modelo;
import br.edu.unoescsmo.carro.repository.ModeloRepository;

@Service
public class ModeloPadrao implements ModeloRegra {

	@Autowired
	private ModeloRepository modeloRepository;

	@Override
	public void salvar(Modelo modelo) {
		modeloRepository.save(modelo);
	}

	
	public List<Modelo> listar() {
		return modeloRepository.findAll();
	}

	
	@Override
	public List<Modelo> dadosGrid() {
		return modeloRepository.findAll();
	}
	
}
