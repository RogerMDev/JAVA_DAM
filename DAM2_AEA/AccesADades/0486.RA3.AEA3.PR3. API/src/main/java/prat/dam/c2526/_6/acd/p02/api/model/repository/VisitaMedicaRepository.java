package prat.dam.c2526._6.acd.p02.api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prat.dam.c2526._6.acd.p02.api.model.domain.VisitaMedica;

@Repository
public interface VisitaMedicaRepository extends JpaRepository<VisitaMedica, Integer> {
}
