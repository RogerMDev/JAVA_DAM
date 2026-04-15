package cat.dam2.visites.controller;

import cat.dam2.visites.model.VisitaMedica;
import cat.dam2.visites.service.VisitaMedicaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/visites")
public class VisitaMedicaRestController {

    private final VisitaMedicaService service;

    public VisitaMedicaRestController(VisitaMedicaService service) {
        this.service = service;
    }

    @GetMapping
    public List<VisitaMedica> getAll() {
        return service.findAll();
    }

    @GetMapping("/{idVisita}")
    public VisitaMedica getById(@PathVariable Long idVisita) {
        return service.findById(idVisita);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitaMedica create(@Valid @RequestBody VisitaMedica visitaMedica) {
        return service.save(visitaMedica);
    }

    @PutMapping("/{idVisita}")
    public VisitaMedica update(@PathVariable Long idVisita, @Valid @RequestBody VisitaMedica visitaMedica) {
        service.findById(idVisita);
        visitaMedica.setIdVisita(idVisita);
        return service.save(visitaMedica);
    }

    @DeleteMapping("/{idVisita}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long idVisita) {
        service.deleteById(idVisita);
    }
}
