package com.perfulandia.springboot.app.crud.perfulandia_crud.services.impl;

import com.perfulandia.springboot.app.crud.perfulandia_crud.entities.Venta;
import com.perfulandia.springboot.app.crud.perfulandia_crud.repository.VentaRepository;
import com.perfulandia.springboot.app.crud.perfulandia_crud.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> findAll() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta findById(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    @Override
    public Venta save(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public void delete(Long id) {
        ventaRepository.deleteById(id);
    }
}