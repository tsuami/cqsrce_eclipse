package com.cqsrce.models.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class PedidoCompra {
	@Id
	private Long pedId;
	private Long provId;
	private Long prodId;
	private String producto;
	private Long cantidad;
	private Long precioUnitario;
	private Long precioTotal;
	private Date fIngreso;
	private String estado;
	private String usuario;

}
