package br.adsis.zero.carro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carros")
public class CarroController {
	@Autowired
	private CarroService service;
	
	@GetMapping
	public List<Carro> obterTodos() {
		return service.obterTodos();
	}
	
}
