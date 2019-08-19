package com.cqsrce.models.entities;

import java.lang.Long;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class VentaDeta {
	@Id
	private Long ventdId;
	private Long ventId;
	private Long prodId;
	private Long numOs;
	private Long precioProd;
	private Long cantidad;
	private Long totalImporte;
}
