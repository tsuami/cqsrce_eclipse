package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.IPerfilUsuarioDao;
import com.cqsrce.models.entities.PerfilUsuario;

@Service
public class PerfilUsuarioService implements IPerfilUsuarioService {
	
	@Autowired
	private IPerfilUsuarioDao PerfilUsuarioDao;

	@Override
	public List<PerfilUsuario> findAll() {
		// TODO Auto-generated method stub
		return PerfilUsuarioDao.findAll();
	}

	@Override
	public PerfilUsuario save(PerfilUsuario perfilusuario) {
		// TODO Auto-generated method stub
		return PerfilUsuarioDao.save(perfilusuario);
	}

	@Override
	public Optional<PerfilUsuario> findById(Long id) {
		// TODO Auto-generated method stub
		return PerfilUsuarioDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		PerfilUsuarioDao.deleteById(id);
	}
}
