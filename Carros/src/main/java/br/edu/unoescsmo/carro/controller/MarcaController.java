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

import br.edu.unoescsmo.carro.model.Marca;
import br.edu.unoescsmo.carro.regras.MarcaRegra;
import br.edu.unoescsmo.carro.repository.MarcaRepository;

@Controller
@RequestMapping("/marca")
public class MarcaController {

	@Autowired
	private MarcaRegra marcaRegra;
	
	@Autowired
	private MarcaRepository marcaRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Marca marca, BindingResult erros) {
		if (erros.hasErrors()) {
			return "marca/novo";

		}
		marcaRegra.salvar(marca);
		return "redirect:/marca/listar";
	}
	
	@PostMapping("/alterar")
	public String alterar(@Valid Marca marca, BindingResult erros) {
		if (erros.hasErrors()) {
			return "marca/visualizar";

		}
		marcaRegra.salvar(marca);
		return "redirect:/marca/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		// Torna a lista de pessoa acessível no JSP
		model.addAttribute("marcas", marcaRegra.dadosGrid());
		// caminho + nome do JSP que será renderizado para a tela
		return "marca/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("marcas", marcaRepository.findAll());
		return "marca/novo";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("marca", marcaRepository.findById(codigo).get());
		return "marca/visualizar";
	}


}
