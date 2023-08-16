
package com.portfolio.portfolioweb.service;

import com.portfolio.portfolioweb.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia>getExperiencias();
    
    public void saveExperiencia(Experiencia e);
    
    public void deleteExperiencia(Long id);
    
    public Experiencia findExperiencia(Long id);
}
