package cat.dam2.visites.repository;

import cat.dam2.visites.model.VisitaMedica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitaMedicaRepository extends JpaRepository<VisitaMedica, Long> {
}
