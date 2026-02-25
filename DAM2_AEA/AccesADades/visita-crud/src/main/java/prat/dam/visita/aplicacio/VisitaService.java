package prat.dam.visita.aplicacio;

import prat.dam.visita.domini.Visita;
import prat.dam.visita.domini.VisitaRepository;

import java.util.List;
import java.util.Optional;

public class VisitaService {
    private final VisitaRepository visitaRepository;

    public VisitaService(VisitaRepository visitaRepository) {
        this.visitaRepository = visitaRepository;
    }

    public void crearVisita(Visita visita) {
        visitaRepository.crear(visita);
    }

    public List<Visita> mostrarTodas() {
        return visitaRepository.listarTodas();
    }

    public Optional<Visita> buscarPorId(int id) {
        return visitaRepository.buscarPorId(id);
    }

    public boolean actualizarVisita(Visita visita) {
        return visitaRepository.actualizar(visita);
    }

    public boolean eliminarVisita(int id) {
        return visitaRepository.eliminar(id);
    }
}
