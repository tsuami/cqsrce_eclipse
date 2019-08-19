package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.IVentaDetaDao;
import com.cqsrce.models.entities.VentaDeta;

@Service
public class VentaDetaService implements IVentaDetaService {
	
	@Autowired
	private IVentaDetaDao VentaDetaDao;

	@Override
	public List<VentaDeta> findAll() {
		// TODO Auto-generated method stub
		return VentaDetaDao.findAll();
	}

	@Override
	public VentaDeta save(VentaDeta ventadeta) {
		// TODO Auto-generated method stub
		return VentaDetaDao.save(ventadeta);
	}

	@Override
	public Optional<VentaDeta> findById(Long id) {
		// TODO Auto-generated method stub
		return VentaDetaDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		VentaDetaDao.deleteById(id);
	}
}