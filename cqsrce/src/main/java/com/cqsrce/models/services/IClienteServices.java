package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.Cliente;

public interface IClienteServices {
	public List<Cliente> findAll();
	public Cliente save (Cliente cliente);
	public Optional<Cliente> findById (Long id);
	public void delete (Long id);

}
