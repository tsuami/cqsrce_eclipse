package com.cqsrce.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cqsrce.models.entities.Cliente;
import com.cqsrce.models.services.IClienteServices;

@RestController
@RequestMapping("/cqsrce/Cliente")
public class ClienteControllers {

	
	@Autowired
	private IClienteServices cliente;
	
	@GetMapping("")
	private List<Cliente> findAll(){
		return cliente.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> findById(@PathVariable(value = "id")Long id){
        return cliente.findById(id);
	}
	
	@PostMapping("")
    public int add(@RequestBody(required = true)Cliente dia){
		cliente.save(dia);
    
       return (int) dia.getDuiCli();
    }
	
	@PutMapping("/{id}")
    public int update(@RequestBody (required = true)Cliente dia){
		cliente.save(dia);
       
        return (int) dia.getDuiCli();
    }
	
	@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
		cliente.delete(id); 
    }
	
}
	

	
	



