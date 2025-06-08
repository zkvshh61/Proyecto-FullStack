package com.perfulandia.springboot.app.crud.perfulandia_crud.controllers;

import com.perfulandia.springboot.app.crud.perfulandia_crud.entities.Venta;
import com.perfulandia.springboot.app.crud.perfulandia_crud.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaRestController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> findAll() {
        return ventaService.findAll();
    }

    @GetMapping("/{id}")
    public Venta findById(@PathVariable Long id) {
        return ventaService.findById(id);
    }

    @PostMapping
    public Venta save(@RequestBody Venta venta) {
        return ventaService.save(venta);
    }

    @PutMapping("/{id}")
    public Venta update(@PathVariable Long id, @RequestBody Venta venta) {
        venta.setId(id);
        return ventaService.save(venta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ventaService.delete(id);
    }
}