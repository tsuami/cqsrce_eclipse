package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.IProveedorDao;
import com.cqsrce.models.entities.Proveedor;

@Service
public class ProveedorService implements IProveedorService {
	
	@Autowired
	private IProveedorDao ProveedorDao;

	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return ProveedorDao.findAll();
	}

	@Override
	public Proveedor save(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return ProveedorDao.save(proveedor);
	}

	@Override
	public Optional<Proveedor> findById(Long id) {
		// TODO Auto-generated method stub
		return ProveedorDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ProveedorDao.deleteById(id);
	}

}
