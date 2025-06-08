package com.perfulandia.springboot.app.crud.perfulandia_crud.services;

import com.perfulandia.springboot.app.crud.perfulandia_crud.entities.Venta;

import java.util.List;

public interface VentaService {
    List<Venta> findAll();
    Venta findById(Long id);
    Venta save(Venta venta);
    void delete(Long id);
}