package com.cqsrce.models.entities;

import javax.persistence.Entity;
import java.util.Date;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Producto {
	@Id
	private long prodId;
	private long provId;
	private String producto;
	private Long precio;
	private String grupoProd;
	private Long existencia;
	private String observaciones;
	private Date fAlta;
	private Date fBaja;
	private String estado;

}
