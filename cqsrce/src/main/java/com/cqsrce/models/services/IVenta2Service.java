package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.Venta2;

public interface IVenta2Service {
	public List<Venta2> findAll();
	public Venta2 save (Venta2 venta2);
	public Optional<Venta2> findById (Long id);
	public void delete (Long id);

}
