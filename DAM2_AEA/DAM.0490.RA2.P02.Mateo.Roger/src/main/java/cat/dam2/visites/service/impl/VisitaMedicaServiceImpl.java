package cat.dam2.visites.service.impl;

import cat.dam2.visites.model.VisitaMedica;
import cat.dam2.visites.repository.VisitaMedicaRepository;
import cat.dam2.visites.service.VisitaMedicaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class VisitaMedicaServiceImpl implements VisitaMedicaService {

    private final VisitaMedicaRepository repository;

    public VisitaMedicaServiceImpl(VisitaMedicaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<VisitaMedica> findAll() {
        return repository.findAll();
    }

    @Override
    public VisitaMedica findById(Long idVisita) {
        return repository.findById(idVisita)
                .orElseThrow(() -> new NoSuchElementException("No existeix la visita amb id " + idVisita));
    }

    @Override
    public VisitaMedica save(VisitaMedica visitaMedica) {
        return repository.save(visitaMedica);
    }

    @Override
    public void deleteById(Long idVisita) {
        if (!repository.existsById(idVisita)) {
            throw new NoSuchElementException("No existeix la visita amb id " + idVisita);
        }
        repository.deleteById(idVisita);
    }
}
