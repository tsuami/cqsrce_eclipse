package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.Proveedor;

public interface IProveedorService {
	public List<Proveedor> findAll();
	public Proveedor save (Proveedor proveedor);
	public Optional<Proveedor> findById (Long id);
	public void delete (Long id);

}
