package com.cqsrce.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long>{}