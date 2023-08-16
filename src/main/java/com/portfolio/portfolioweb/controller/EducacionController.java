
package com.portfolio.portfolioweb.controller;

import com.portfolio.portfolioweb.model.Educacion;
import com.portfolio.portfolioweb.model.Institucion;
import com.portfolio.portfolioweb.dto.EducacionDTO;
import com.portfolio.portfolioweb.service.EducacionService;
import com.portfolio.portfolioweb.service.InstitucionService;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ListIterator;


@RestController
public class EducacionController {
    @Autowired
    private EducacionService interEducacion;
    @Autowired
    private InstitucionService interInstitucion;
    
    @GetMapping("/educaciones/traer")
    public List<EducacionDTO>getEducaciones() {
        List<EducacionDTO> educacionesDTO = new ArrayList<>();
        List<Educacion> educaciones = interEducacion.getEducaciones();
        List<Institucion> instituciones = interInstitucion.getInstituciones();
        
        ListIterator<Educacion> eduIt = educaciones.listIterator();
        while(eduIt.hasNext()) {
            Educacion edu = eduIt.next();
            
            ListIterator<Institucion> instIt = instituciones.listIterator();
            while(instIt.hasNext()) {
                Institucion inst = instIt.next();
                if(edu.getIdInstitucion() == inst.getId()) {
                    educacionesDTO.add(new EducacionDTO(edu.getId(), edu.getIdInstitucion(), edu.getIdPersona(), inst.getNombre(), edu.getNombreCarrera(), edu.getAñoInicio(), edu.getAñoFin()));
                }
            }
        }
        return educacionesDTO;
    } 
}