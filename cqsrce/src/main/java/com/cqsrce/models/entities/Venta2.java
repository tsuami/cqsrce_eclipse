package com.cqsrce.models.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Venta2 {
	@Id
	private String ventId;
	private String duiCli;
	private Date fVenta;
	private String descripcion;
	private Long porceDesc;
	private Long iva;
	private Long subtotal;
	private String factura;
	private String tipoFactura;
}
