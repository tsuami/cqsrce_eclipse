package com.cqsrce.models.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Usuario {
	
	@Id
	private String duiUser;
	private String usuario;
	private String perfUser;
	private String nombre;
	private String pais;
	private String tipDoc;
	private Date fAlta;
	private Date fExpiracion;
	private Date fBaja;
	private String estado;
}
