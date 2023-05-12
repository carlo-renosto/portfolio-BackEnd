
package com.portfolio.portfolioweb.controller;

import com.portfolio.portfolioweb.service.PersonaService;
import com.portfolio.portfolioweb.model.Persona;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private PersonaService interPersona;
    
    @GetMapping("/personas/traer")
    public List<Persona>getPersonas() {
        return interPersona.getPersonas();
    }
    
    @PostMapping("/personas/crear")
    public void crearPersona(@RequestBody Persona p) {
        interPersona.savePersona(p);
    }
    
    @DeleteMapping("/personas/borrar/{id}") 
    public void borrarPersona(@PathVariable Long id) {
        interPersona.deletePersona(id);
    }
    
    @GetMapping("/personas/buscar/{id}")
    public Persona buscarPersona(@PathVariable Long id) {
        return interPersona.findPersona(id);
    }
}
