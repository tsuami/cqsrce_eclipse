package com.cqsrce.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.VentaDeta;

public interface IVentaDetaDao extends JpaRepository<VentaDeta, Long>{}