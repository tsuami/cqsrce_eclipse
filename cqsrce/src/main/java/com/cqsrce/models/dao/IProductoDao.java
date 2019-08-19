package com.cqsrce.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.Producto;

public interface IProductoDao extends JpaRepository<Producto, Long>{}