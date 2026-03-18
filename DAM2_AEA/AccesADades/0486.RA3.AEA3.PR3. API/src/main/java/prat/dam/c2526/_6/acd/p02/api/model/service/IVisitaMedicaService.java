package prat.dam.c2526._6.acd.p02.api.model.service;

import java.util.List;

import prat.dam.c2526._6.acd.p02.api.model.domain.VisitaMedica;

public interface IVisitaMedicaService {

    VisitaMedica afegir(VisitaMedica visitaMedica);

    VisitaMedica modificar(VisitaMedica visitaMedica);

    void eliminarPerId(Integer id);

    VisitaMedica buscarPerId(Integer id);

    List<VisitaMedica> totes();
}
