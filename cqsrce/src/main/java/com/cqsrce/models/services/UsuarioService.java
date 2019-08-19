package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.IUsuarioDao;
import com.cqsrce.models.entities.Usuario;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private IUsuarioDao UsuarioDao;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return UsuarioDao.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return UsuarioDao.save(usuario);
	}

	@Override
	public Optional<Usuario> findById(Long id) {
		// TODO Auto-generated method stub
		return UsuarioDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		UsuarioDao.deleteById(id);
	}

}
