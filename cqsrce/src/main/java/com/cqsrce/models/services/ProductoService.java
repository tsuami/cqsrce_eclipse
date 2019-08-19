package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.IProductoDao;
import com.cqsrce.models.entities.Producto;

@Service
public class ProductoService implements IProductoService {
	
	@Autowired
	private IProductoDao ProductoDao;

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return ProductoDao.findAll();
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return ProductoDao.save(producto);
	}

	@Override
	public Optional<Producto> findById(Long id) {
		// TODO Auto-generated method stub
		return ProductoDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ProductoDao.deleteById(id);
	}


}
