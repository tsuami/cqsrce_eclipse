package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	public Producto save (Producto producto);
	public Optional<Producto> findById (Long id);
	public void delete (Long id);

}
