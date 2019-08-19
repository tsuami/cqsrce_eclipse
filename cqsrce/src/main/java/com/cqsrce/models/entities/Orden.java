package com.cqsrce.models.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Orden {
	
	@Id
	private Long numOs;
	private Date fGen;
	private Date fCierre;
	private String estadoOs;
	private String tipTrabajo;
	private String comentarioOs;
	private String codSucursal;
	private String duiCli;
	private String usuario;
	
	
}
