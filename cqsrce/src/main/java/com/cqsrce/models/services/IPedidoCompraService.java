package com.cqsrce.models.services;
import java.util.List;
import java.util.Optional;

import com.cqsrce.models.entities.PedidoCompra;

public interface IPedidoCompraService {
	public List<PedidoCompra> findAll();
	public PedidoCompra save (PedidoCompra pedidocompra);
	public Optional<PedidoCompra> findById (Long id);
	public void delete (Long id);

}
