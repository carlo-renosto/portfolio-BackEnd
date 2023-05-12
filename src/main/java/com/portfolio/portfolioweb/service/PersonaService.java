
package com.portfolio.portfolioweb.service;

import com.portfolio.portfolioweb.model.Persona;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.portfolio.portfolioweb.dao.IPersonaRepo;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private IPersonaRepo oRepository;
    
    @Override
    public List<Persona>getPersonas() {
        List<Persona> listaPersonas = oRepository.findAll();
        return listaPersonas;
    }
    
    @Override
    public void savePersona(Persona p) {
        oRepository.save(p);
    }
    
    @Override
    public void deletePersona(Long id) {
        oRepository.deleteById(id);
    }
    
    @Override
    public Persona findPersona(Long id) {
        Persona p = oRepository.findById(id).orElse(null);
        return p;
    }
}