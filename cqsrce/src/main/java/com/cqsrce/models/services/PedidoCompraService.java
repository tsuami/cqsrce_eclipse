package com.cqsrce.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqsrce.models.dao.IPedidoCompraDao;
import com.cqsrce.models.entities.PedidoCompra;

@Service
public class PedidoCompraService implements IPedidoCompraService {
	
	@Autowired
	private IPedidoCompraDao PedidoCompraDao;

	@Override
	public List<PedidoCompra> findAll() {
		// TODO Auto-generated method stub
		return PedidoCompraDao.findAll();
	}

	@Override
	public PedidoCompra save(PedidoCompra pedidocompra) {
		// TODO Auto-generated method stub
		return PedidoCompraDao.save(pedidocompra);
	}

	@Override
	public Optional<PedidoCompra> findById(Long id) {
		// TODO Auto-generated method stub
		return PedidoCompraDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		PedidoCompraDao.deleteById(id);
	}


}
