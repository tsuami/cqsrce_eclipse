package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.Usuario;

public interface IUsuarioService {
	public List<Usuario> findAll();
	public Usuario save (Usuario usuario);
	public Optional<Usuario> findById (Long id);
	public void delete (Long id);

}
