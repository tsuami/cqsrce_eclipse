package com.cqsrce.models.entities;

import java.lang.String;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Telefono {
	@Id
	private String telefono;
	private String duiCli;
	private String estado;

}
