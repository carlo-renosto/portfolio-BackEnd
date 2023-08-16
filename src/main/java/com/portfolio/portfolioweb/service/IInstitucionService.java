package com.portfolio.portfolioweb.service;

import java.util.List;

import com.portfolio.portfolioweb.model.Institucion;

public interface IInstitucionService {
    public List<Institucion>getInstituciones();
    
    public void saveInstitucion(Institucion i);
    
    public void deleteInstitucion(Long id);
    
    public Institucion findInstitucion(Long id);
}
