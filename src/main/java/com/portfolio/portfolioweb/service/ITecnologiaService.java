
package com.portfolio.portfolioweb.service;

import com.portfolio.portfolioweb.model.Tecnologia;
import java.util.List;

public interface ITecnologiaService {
    public List<Tecnologia>getTecnologias();
    
    public void saveTecnologia(Tecnologia t);
    
    public void deleteTecnologia(Long id);
    
    public Tecnologia findTecnologia(Long id);
}
