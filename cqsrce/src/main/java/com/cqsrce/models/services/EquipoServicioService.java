package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.IEquipoServicioDao;
import com.cqsrce.models.entities.Equiposervicio;

@Service
public class EquipoServicioService implements IEquipoServicioService {
	
	@Autowired
	private IEquipoServicioDao EquiposervicioDao;

	@Override
	public List<Equiposervicio> findAll() {
		// TODO Auto-generated method stub
		return EquiposervicioDao.findAll();
	}

	@Override
	public Equiposervicio save(Equiposervicio equiposervicio) {
		// TODO Auto-generated method stub
		return EquiposervicioDao.save(equiposervicio);
	}

	@Override
	public Optional<Equiposervicio> findById(Long id) {
		// TODO Auto-generated method stub
		return EquiposervicioDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		EquiposervicioDao.deleteById(id);
	}

	
	

}