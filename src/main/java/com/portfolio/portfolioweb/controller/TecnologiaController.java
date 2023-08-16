
package com.portfolio.portfolioweb.controller;

import com.portfolio.portfolioweb.dto.TecnologiaDTO;
import com.portfolio.portfolioweb.model.Persona;
import com.portfolio.portfolioweb.model.Tecnologia;
import com.portfolio.portfolioweb.service.PersonaService;
import com.portfolio.portfolioweb.service.TecnologiaService;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TecnologiaController {
    @Autowired
    private TecnologiaService interTecnologia;
    @Autowired
    private PersonaService interPersona;
    
    @GetMapping("/tecnologias/traer")
    public List<TecnologiaDTO>getTecnologias() {
        List<TecnologiaDTO> tecnologiasDTO = new ArrayList<>();
        List<Tecnologia> tecnologias = interTecnologia.getTecnologias();
        List<Persona> personas = interPersona.getPersonas();
        
        ListIterator<Tecnologia> tecnoIt = tecnologias.listIterator();
        while(tecnoIt.hasNext()) {
            Tecnologia tec = tecnoIt.next();
            
            ListIterator<Persona> persoIt = personas.listIterator();
            while(persoIt.hasNext()) {
                Persona per = persoIt.next();
                if(tec.getIdPersona() == per.getId()) {
                    tecnologiasDTO.add(new TecnologiaDTO(tec.getIdTecnologia(), tec.getIdPersona(), tec.getNombreTecnologia(), per.getNombre() + " " + per.getApellido(), tec.getNivel()));
                }
            }
        }
        return tecnologiasDTO;
    }
}
