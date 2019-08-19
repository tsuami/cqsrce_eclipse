package com.cqsrce.controllers;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cqsrce.models.entities.Cliente;
import com.cqsrce.models.entities.Venta2;
import com.cqsrce.models.services.IClienteServices;
import com.cqsrce.models.services.IVenta2Service;
import com.cqsrce.models.services.IVentaDetaService;
import com.cqsrce.models.services.Venta2Service;
import com.cqsrce.models.services.VentaDetaService;
import com.cqsrce.models.utils.NotFoudException;

@RestController
@RequestMapping("/cqsrce/Venta")

public class VentasControllers {
	
public static final Logger logger = LoggerFactory.getLogger(VentasControllers.class);
	
	@Autowired
	private IVenta2Service VentasService;
	
	@RequestMapping("")
	private List<Venta2> findAll(){
		return VentasService.findAll();

}
	
	@GetMapping("/{id}")
	public Venta2 getOne( @PathVariable ("id") long id) {
		logger.debug("Fetching TipoExamen with id {}", id);
		
		Optional<Venta2> tipoexamen = Venta2Service.findById(id);
		if (!tipoexamen.isPresent())
			throw new NotFoundException("id-" + id);
		return tipoexamen.get();
	}
}
