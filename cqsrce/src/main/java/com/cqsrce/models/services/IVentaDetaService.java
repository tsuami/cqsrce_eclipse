package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.VentaDeta;

public interface IVentaDetaService {
	public List<VentaDeta> findAll();
	public VentaDeta save (VentaDeta ventadeta);
	public Optional<VentaDeta> findById (Long id);
	public void delete (Long id);

}
