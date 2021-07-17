package br.com.prmarinho.colecionando.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/livros")
public class LivrosController {

	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public String listarLivros() {

		return "Api Colecionando Módulos Livros";

	}
}
