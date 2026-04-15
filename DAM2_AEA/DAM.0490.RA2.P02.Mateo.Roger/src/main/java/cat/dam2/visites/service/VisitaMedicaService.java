package cat.dam2.visites.service;

import cat.dam2.visites.model.VisitaMedica;

import java.util.List;

public interface VisitaMedicaService {

    List<VisitaMedica> findAll();

    VisitaMedica findById(Long idVisita);

    VisitaMedica save(VisitaMedica visitaMedica);

    void deleteById(Long idVisita);
}
