package com.cqsrce.models.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class OrdenDetalle {

	@Id
	private Long numOs;
	private Long eqId;
	private Long prodId;
	private Date fCierre;
	private String observaciones;
	private String usuario;
}
