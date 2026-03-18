package prat.dam.c2526._6.acd.p02.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prat.dam.c2526._6.acd.p02.api.model.domain.VisitaMedica;
import prat.dam.c2526._6.acd.p02.api.model.service.IVisitaMedicaService;

@RestController
@RequestMapping("/visites2")
@CrossOrigin(origins = "*")
public class VisitaMedicaV2Controller {

    @Autowired
    private IVisitaMedicaService visitaMedicaService;

    @PostMapping("/add")
    public ResponseEntity<?> afegir(@RequestBody VisitaMedica visitaMedica) {
        try {
            VisitaMedica novaVisita = visitaMedicaService.afegir(visitaMedica);
            return ResponseEntity.status(HttpStatus.CREATED).body(novaVisita);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Dades invalides: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error intern del servidor: " + e.getMessage());
        }
    }

    @PutMapping("/upd")
    public ResponseEntity<?> modificar(@RequestBody VisitaMedica visitaMedica) {
        try {
            VisitaMedica visitaModificada = visitaMedicaService.modificar(visitaMedica);
            if (visitaModificada == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Visita medica no trobada");
            }
            return ResponseEntity.ok(visitaModificada);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Dades invalides: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error intern del servidor: " + e.getMessage());
        }
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<?> eliminar(@PathVariable int id) {
        try {
            visitaMedicaService.eliminarPerId(id);
            return ResponseEntity.ok("Visita medica amb id " + id + " eliminada correctament");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Visita medica no trobada amb id: " + id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error intern del servidor: " + e.getMessage());
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        try {
            VisitaMedica visitaMedica = visitaMedicaService.buscarPerId(id);
            if (visitaMedica == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Visita medica no trobada amb id: " + id);
            }
            return ResponseEntity.ok(visitaMedica);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ID invalid: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error intern del servidor: " + e.getMessage());
        }
    }

    @GetMapping("/get")
    public ResponseEntity<?> getAll() {
        try {
            List<VisitaMedica> visitesMediques = visitaMedicaService.totes();
            if (visitesMediques == null || visitesMediques.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No hi ha visites mediques disponibles");
            }
            return ResponseEntity.ok(visitesMediques);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error intern del servidor: " + e.getMessage());
        }
    }
}

