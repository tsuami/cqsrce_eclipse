package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.Orden;

public interface IOrdenService {
	public List<Orden> findAll();
	public Orden save (Orden orden);
	public Optional<Orden> findById (Long id);
	public void delete (Long id);

}
