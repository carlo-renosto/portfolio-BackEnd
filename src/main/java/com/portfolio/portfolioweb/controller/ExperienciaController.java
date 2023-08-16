
package com.portfolio.portfolioweb.controller;

import com.portfolio.portfolioweb.model.Experiencia;
import com.portfolio.portfolioweb.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    @Autowired
    private ExperienciaService interExperiencia;
    
    @GetMapping("/experiencias/traer")
    public List<Experiencia>getExperiencias() {
        return interExperiencia.getExperiencias();
    }
    
    @PostMapping("/experiencias/crear")
    public void crearExperiencia(@RequestBody Experiencia e) {
        interExperiencia.saveExperiencia(e);
    }
    
    @DeleteMapping("/experiencias/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        interExperiencia.deleteExperiencia(id);
    }
    
    @GetMapping("/experiencias/buscar/{id}")
    public Experiencia buscarExperiencia(@PathVariable Long id) {
        return interExperiencia.findExperiencia(id);
    }  
}
