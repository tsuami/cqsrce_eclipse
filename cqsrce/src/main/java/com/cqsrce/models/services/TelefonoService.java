package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.ITelefonoDao;
import com.cqsrce.models.entities.Telefono;

@Service
public class TelefonoService implements ITelefonoService {
	
	@Autowired
	private ITelefonoDao TelefonoDao;

	@Override
	public List<Telefono> findAll() {
		// TODO Auto-generated method stub
		return TelefonoDao.findAll();
	}

	@Override
	public Telefono save(Telefono telefono) {
		// TODO Auto-generated method stub
		return TelefonoDao.save(telefono);
	}

	@Override
	public Optional<Telefono> findById(Long id) {
		// TODO Auto-generated method stub
		return TelefonoDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		TelefonoDao.deleteById(id);
	}

}
