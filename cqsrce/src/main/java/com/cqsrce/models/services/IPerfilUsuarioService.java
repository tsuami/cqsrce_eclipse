package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.PerfilUsuario;

public interface IPerfilUsuarioService {
	public List<PerfilUsuario> findAll();
	public PerfilUsuario save (PerfilUsuario perfilusuario);
	public Optional<PerfilUsuario> findById (Long id);
	public void delete (Long id);

}
