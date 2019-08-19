package com.cqsrce.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.PerfilUsuario;

public interface IPerfilUsuarioDao extends JpaRepository<PerfilUsuario, Long>{}