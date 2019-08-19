package com.cqsrce.models.entities;

import java.lang.Long;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Proveedor {
	@Id
	private long provId;
	private String nombre;
	private String direccion;
	private Long telefono;
	private String pais;
	private String ciudad;
	private String depto;
	private String correo;
	private String razonSocial;
	private String nit;
	private String tipProv;
	private String estado;
	private String datosExtras;

}
