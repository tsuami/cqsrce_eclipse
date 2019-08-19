package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.Equiposervicio;

public interface IEquipoServicioService {
	public List<Equiposervicio> findAll();
	public Equiposervicio save (Equiposervicio equiposervicio);
	public Optional<Equiposervicio> findById (Long id);
	public void delete (Long id);

}
