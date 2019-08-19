package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.entities.Compradetalle;

@Service
public class CompraDetalleService implements ICompraDetalleService {
	
	@Autowired
	private com.cqsrce.models.dao.ICompraDetalleDao compraDetalleDao;

	@Override
	public List<Compradetalle> findAll() {
		// TODO Auto-generated method stub
		return compraDetalleDao.findAll();
	}

	@Override
	public Compradetalle save(Compradetalle compradetalle) {
		// TODO Auto-generated method stub
		return compraDetalleDao.save(compradetalle);
	}

	@Override
	public Optional<Compradetalle> findById(Long id) {
		// TODO Auto-generated method stub
		return compraDetalleDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		compraDetalleDao.deleteById(id);
	}
}
