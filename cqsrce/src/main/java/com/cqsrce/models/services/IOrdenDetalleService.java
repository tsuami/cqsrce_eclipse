package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.OrdenDetalle;

public interface IOrdenDetalleService {
	public List<OrdenDetalle> findAll();
	public OrdenDetalle save (OrdenDetalle ordendetalle);
	public Optional<OrdenDetalle> findById (Long id);
	public void delete (Long id);

}
