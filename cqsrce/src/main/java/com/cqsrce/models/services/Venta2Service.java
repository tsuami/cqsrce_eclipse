package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.IVenta2Dao;
import com.cqsrce.models.entities.Venta2;

@Service
public class Venta2Service implements IVenta2Service {
	
	@Autowired
	private IVenta2Dao Venta2Dao;

	@Override
	public List<Venta2> findAll() {
		// TODO Auto-generated method stub
		return Venta2Dao.findAll();
	}

	@Override
	public Venta2 save(Venta2 venta2) {
		// TODO Auto-generated method stub
		return Venta2Dao.save(venta2);
	}

	@Override
	public   Optional<Venta2> findById(Long id) {
		// TODO Auto-generated method stub
		return Venta2Dao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Venta2Dao.deleteById(id);
	}

}
