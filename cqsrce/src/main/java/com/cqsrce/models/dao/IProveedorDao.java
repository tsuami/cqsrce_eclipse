package com.cqsrce.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.Proveedor;

public interface IProveedorDao extends JpaRepository<Proveedor, Long>{}