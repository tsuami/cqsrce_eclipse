package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.Compradetalle;

public interface ICompraDetalleService {
	public List<Compradetalle> findAll();
	public Compradetalle save (Compradetalle compradetalle);
	public Optional<Compradetalle> findById (Long id);
	public void delete (Long id);

}
