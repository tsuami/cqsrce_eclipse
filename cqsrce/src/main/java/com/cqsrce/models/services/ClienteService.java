package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cqsrce.models.dao.IClienteDao;
import com.cqsrce.models.entities.Cliente;

@Service
public class ClienteService implements IClienteServices {

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
		
	}

}
