package prat.dam.c2526._6.acd.p02.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/visites")
public class VisitaMedicaController {

    @Autowired
    private IVisitaMedicaService visitaMedicaService;

    @PostMapping("/add")
    public VisitaMedica afegir(@RequestBody VisitaMedica visitaMedica) {
        return visitaMedicaService.afegir(visitaMedica);
    }

    @PutMapping("/upd")
    public VisitaMedica modificar(@RequestBody VisitaMedica visitaMedica) {
        return visitaMedicaService.modificar(visitaMedica);
    }

    @DeleteMapping("/del/{id}")
    public void eliminar(@PathVariable int id) {
        visitaMedicaService.eliminarPerId(id);
    }

    @GetMapping("/get/{id}")
    public VisitaMedica getById(@PathVariable int id) {
        return visitaMedicaService.buscarPerId(id);
    }

    @GetMapping("/get")
    public List<VisitaMedica> getAll() {
        return visitaMedicaService.totes();
    }
}

