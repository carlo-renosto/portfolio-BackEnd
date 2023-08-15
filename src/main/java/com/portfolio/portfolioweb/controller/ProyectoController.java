
package com.portfolio.portfolioweb.controller;

import com.portfolio.portfolioweb.model.Proyecto;
import com.portfolio.portfolioweb.service.ProyectoService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class ProyectoController {
    @Autowired
    private ProyectoService interProyecto;
    
    @GetMapping("/proyectos/traer")
    public List<Proyecto>getProyectos() {
        return interProyecto.getProyectos();
    } 
}