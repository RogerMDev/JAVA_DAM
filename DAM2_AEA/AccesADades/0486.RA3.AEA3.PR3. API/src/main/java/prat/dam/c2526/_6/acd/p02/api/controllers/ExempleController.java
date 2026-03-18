package prat.dam.c2526._6.acd.p02.api.controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/escola")
public class ExempleController {

	private ArrayList<String> paraules = new ArrayList<String>();

	// http://localhost:8080/escola/saluda
	@GetMapping("/saluda")
	public String getSalutacio() {
		return "Hola";

	}

	// http://localhost:8080/escola/saluda2
	@GetMapping("/saluda2")
	public String getSalutacio2() {
		return "Hola 2";

	}

	@GetMapping("/veureLlista")
	public ArrayList<String> veureLlista() {
		return paraules;
	}

	@PostMapping("/afegir")
	public String afegeixParaula() {
		paraules.add(LocalDate.now().toString());
		return "Data afegida correctament";
	}

	@PutMapping("/modificar")
	public String modificarParaula() {
		paraules.set(0, "Modificat");
		return "Data modificada correctament";
	}

	@DeleteMapping("/borrar")
	public String borrarParaula() {
		paraules.remove(0);
		return "Data eliminada correctament";
	}

}
