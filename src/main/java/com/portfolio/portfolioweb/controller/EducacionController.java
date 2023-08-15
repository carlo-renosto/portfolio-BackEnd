
package com.portfolio.portfolioweb.controller;

import com.portfolio.portfolioweb.model.Educacion;
import com.portfolio.portfolioweb.service.EducacionService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@RestController
public class EducacionController {
    @Autowired
    private EducacionService interEducacion;
    
    @GetMapping("/educaciones/traer")
    public List<Educacion>getEducaciones() {
        return interEducacion.getEducaciones();
    } 
}