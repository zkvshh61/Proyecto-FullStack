package com.perfulandia.springboot.app.crud.perfulandia_crud.services.impl;

import com.perfulandia.springboot.app.crud.perfulandia_crud.entities.Reporte;
import com.perfulandia.springboot.app.crud.perfulandia_crud.repository.ReporteRepository;
import com.perfulandia.springboot.app.crud.perfulandia_crud.services.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteServiceImpl implements ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;

    @Override
    public List<Reporte> findAll() {
        return reporteRepository.findAll();
    }

    @Override
    public Reporte findById(Long id) {
        return reporteRepository.findById(id).orElse(null);
    }

    @Override
    public Reporte save(Reporte reporte) {
        return reporteRepository.save(reporte);
    }

    @Override
    public void delete(Long id) {
        reporteRepository.deleteById(id);
    }
}