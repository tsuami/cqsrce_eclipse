package com.cqsrce.models.entities;

import java.lang.Long;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class Compradetalle {
	
	@Id
	private Long cpdId;
	private Long cpId;
	private Long cantidad;
	private Long totalImporte;
	private Long prodId;

	
	
}