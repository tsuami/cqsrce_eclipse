package com.cqsrce.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.Telefono;

public interface ITelefonoDao extends JpaRepository<Telefono, Long>{}