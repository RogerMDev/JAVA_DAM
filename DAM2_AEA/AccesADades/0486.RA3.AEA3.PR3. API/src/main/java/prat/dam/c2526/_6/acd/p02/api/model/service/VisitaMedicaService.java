package prat.dam.c2526._6.acd.p02.api.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prat.dam.c2526._6.acd.p02.api.model.domain.VisitaMedica;
import prat.dam.c2526._6.acd.p02.api.model.repository.VisitaMedicaRepository;

@Service
public class VisitaMedicaService implements IVisitaMedicaService {

    @Autowired
    private VisitaMedicaRepository visitaMedicaRepository;

    @Override
    public VisitaMedica afegir(VisitaMedica visitaMedica) {
        return visitaMedicaRepository.save(visitaMedica);
    }

    @Override
    public VisitaMedica modificar(VisitaMedica visitaMedica) {
        return visitaMedicaRepository.save(visitaMedica);
    }

    @Override
    public void eliminarPerId(Integer id) {
        visitaMedicaRepository.deleteById(id);
    }

    @Override
    public VisitaMedica buscarPerId(Integer id) {
        Optional<VisitaMedica> optVisita = visitaMedicaRepository.findById(id);
        return optVisita.orElse(null);
    }

    @Override
    public List<VisitaMedica> totes() {
        return visitaMedicaRepository.findAll();
    }
}
