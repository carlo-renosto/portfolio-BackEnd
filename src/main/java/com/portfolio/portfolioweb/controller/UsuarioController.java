
package com.portfolio.portfolioweb.controller;

import com.portfolio.portfolioweb.service.UsuarioService;
import com.portfolio.portfolioweb.model.Usuario;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService interPersona;
    
    @GetMapping("/usuarios/traer")
    public List<Usuario>getUsuarios() {
        return interPersona.getUsuarios();
    }
    
    @PostMapping("/usuarios/crear")
    public void crearUsuario(@RequestBody Usuario u) {
        interPersona.saveUsuario(u);
    }
    
    @DeleteMapping("/usuarios/borrar/{id}") 
    public void borrarUsuario(@PathVariable Long id) {
        interPersona.deleteUsuario(id);
    }
    
    @GetMapping("/usuarios/buscar/{id}")
    public Usuario buscarUsuario(@PathVariable Long id) {
        return interPersona.findUsuario(id);
    }
}
