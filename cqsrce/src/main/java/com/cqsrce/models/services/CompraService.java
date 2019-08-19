package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.ICompraDao;
import com.cqsrce.models.entities.Compra;

@Service
public class CompraService implements ICompraService {
	
	@Autowired
	private ICompraDao compraDao;

	@Override
	public List<Compra> findAll() {
		// TODO Auto-generated method stub
		return compraDao.findAll();
	}

	@Override
	public Compra save(Compra compra) {
		// TODO Auto-generated method stub
		return compraDao.save(compra);
	}

	@Override
	public Optional<Compra> findById(Long id) {
		// TODO Auto-generated method stub
		return compraDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		compraDao.deleteById(id);
	}
	

}