package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.Telefono;

public interface ITelefonoService {
	public List<Telefono> findAll();
	public Telefono save (Telefono telefono);
	public Optional<Telefono> findById (Long id);
	public void delete (Long id);

}
