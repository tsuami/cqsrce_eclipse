package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.IOrdenDetalleDao;
import com.cqsrce.models.entities.OrdenDetalle;
 
@Service
public class OrdenDetalleService implements IOrdenDetalleService {
	
	@Autowired
	private IOrdenDetalleDao OrdenDetalleDao;

	@Override
	public List<OrdenDetalle> findAll() {
		// TODO Auto-generated method stub
		return OrdenDetalleDao.findAll();
	}

	@Override
	public OrdenDetalle save(OrdenDetalle ordendetalle) {
		// TODO Auto-generated method stub
		return OrdenDetalleDao.save(ordendetalle);
	}

	@Override
	public Optional<OrdenDetalle> findById(Long id) {
		// TODO Auto-generated method stub
		return OrdenDetalleDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		OrdenDetalleDao.deleteById(id);
	}

}
