package com.cqsrce.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.OrdenDetalle;

public interface IOrdenDetalleDao extends JpaRepository<OrdenDetalle, Long>{}