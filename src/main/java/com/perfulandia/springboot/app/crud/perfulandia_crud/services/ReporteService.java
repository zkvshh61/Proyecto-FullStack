package com.perfulandia.springboot.app.crud.perfulandia_crud.services;

import com.perfulandia.springboot.app.crud.perfulandia_crud.entities.Reporte;

import java.util.List;

public interface ReporteService {
    List<Reporte> findAll();
    Reporte findById(Long id);
    Reporte save(Reporte reporte);
    void delete(Long id);
}