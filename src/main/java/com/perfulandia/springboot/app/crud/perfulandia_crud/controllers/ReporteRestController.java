package com.perfulandia.springboot.app.crud.perfulandia_crud.controllers;

import com.perfulandia.springboot.app.crud.perfulandia_crud.entities.Reporte;
import com.perfulandia.springboot.app.crud.perfulandia_crud.services.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reportes")
public class ReporteRestController {

    @Autowired
    private ReporteService reporteService;

    @GetMapping
    public List<Reporte> findAll() {
        return reporteService.findAll();
    }

    @GetMapping("/{id}")
    public Reporte findById(@PathVariable Long id) {
        return reporteService.findById(id);
    }

    @PostMapping
    public Reporte save(@RequestBody Reporte reporte) {
        return reporteService.save(reporte);
    }

    @PutMapping("/{id}")
    public Reporte update(@PathVariable Long id, @RequestBody Reporte reporte) {
        reporte.setId(id);
        return reporteService.save(reporte);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reporteService.delete(id);
    }
}