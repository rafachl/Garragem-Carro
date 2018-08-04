package br.edu.unoescsmo.carro.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.carro.model.Versao;
import br.edu.unoescsmo.carro.repository.VersaoRepository;

@Service
public class VersaoPadrao implements VersaoRegra {

	@Autowired
	private VersaoRepository versaoRepository;

	@Override
	public void salvar(Versao versao) {
		versaoRepository.save(versao);
	}

	public List<Versao> listar() {
		return versaoRepository.findAll();
	}

	@Override
	public List<Versao> dadosGrid() {
		return versaoRepository.findAll();
	}
}
