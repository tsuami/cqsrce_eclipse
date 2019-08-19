package com.cqsrce.models.entities;

import java.lang.String;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class PerfilUsuario {
	@Id
	private String perfUser;
	private String descripcion;
	private String estado;

}
