package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.IOrdenDao;
import com.cqsrce.models.entities.Orden;

@Service
public class OrdenService implements IOrdenService {
	
	@Autowired
	private IOrdenDao OrdenDao;

	@Override
	public List<Orden> findAll() {
		// TODO Auto-generated method stub
		return OrdenDao.findAll();
	}

	@Override
	public Orden save(Orden orden) {
		// TODO Auto-generated method stub
		return OrdenDao.save(orden);
	}

	@Override
	public Optional<Orden> findById(Long id) {
		// TODO Auto-generated method stub
		return OrdenDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		OrdenDao.deleteById(id);
	}

}
