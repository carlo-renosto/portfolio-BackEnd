
package com.portfolio.portfolioweb.service;

import com.portfolio.portfolioweb.model.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona>getPersonas();
    
    public void savePersona(Persona p);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}
