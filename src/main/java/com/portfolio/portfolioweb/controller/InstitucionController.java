package com.portfolio.portfolioweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.portfolioweb.model.Institucion;
import com.portfolio.portfolioweb.service.InstitucionService;

@RestController
public class InstitucionController {
	@Autowired
	private InstitucionService interInstitucion;
	
	@GetMapping("/instituciones/traer")
	public List<Institucion>getInstituciones() {
        return interInstitucion.getInstituciones();
    }
    
    @PostMapping("/instituciones/crear")
    public void crearInstitucion(@RequestBody Institucion p) {
    	interInstitucion.saveInstitucion(p);
    }
    
    @DeleteMapping("/instituciones/borrar/{id}") 
    public void borrarInstitucion(@PathVariable Long id) {
    	interInstitucion.deleteInstitucion(id);
    }
    
    @GetMapping("/instituciones/buscar/{id}")
    public Institucion buscarInstitucion(@PathVariable Long id) {
        return interInstitucion.findInstitucion(id);
    }
}
