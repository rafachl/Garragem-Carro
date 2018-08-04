package br.edu.unoescsmo.carro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoescsmo.carro.model.Versao;
import br.edu.unoescsmo.carro.regras.VersaoRegra;
import br.edu.unoescsmo.carro.repository.VersaoRepository;

@Controller
@RequestMapping("/versao")
public class VersaoController {

	@Autowired
	private VersaoRegra versaoRegra;

	@Autowired
	private VersaoRepository versaoRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Versao versao, BindingResult erros) {
		if (erros.hasErrors()) {
			return "versao/novo";

		}
		versaoRegra.salvar(versao);
		return "redirect:/versao/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Versao versao, BindingResult erros) {
		if (erros.hasErrors()) {
			return "versao/visualizar";

		}
		versaoRegra.salvar(versao);
		return "redirect:/versao/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		// Torna a lista de pessoa acessível no JSP
		model.addAttribute("versaos", versaoRegra.dadosGrid());
		// caminho + nome do JSP que será renderizado para a tela
		return "versao/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("versaos", versaoRepository.findAll());
		return "versao/novo";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("versao", versaoRepository.findById(codigo).get());
		return "versao/visualizar";
	}
}
