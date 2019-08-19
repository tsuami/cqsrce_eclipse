package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.Compra;

public interface ICompraService {
	public List<Compra> findAll();
	public Compra save (Compra compra);
	public Optional<Compra> findById (Long id);
	public void delete (Long id);

}
