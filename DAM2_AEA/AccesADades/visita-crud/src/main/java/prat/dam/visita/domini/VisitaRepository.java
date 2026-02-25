package prat.dam.visita.domini;

import java.util.List;
import java.util.Optional;

public interface VisitaRepository {
    void crear(Visita visita);

    List<Visita> listarTodas();

    Optional<Visita> buscarPorId(int id);

    boolean actualizar(Visita visita);

    boolean eliminar(int id);
}
