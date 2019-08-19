package com.cqsrce.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.Compra;

public interface ICompraDao extends JpaRepository<Compra, Long>{}