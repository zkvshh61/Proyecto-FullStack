package com.perfulandia.springboot.app.crud.perfulandia_crud.repository;

import com.perfulandia.springboot.app.crud.perfulandia_crud.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {}