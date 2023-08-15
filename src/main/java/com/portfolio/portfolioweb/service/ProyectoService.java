
package com.portfolio.portfolioweb.service;

import com.portfolio.portfolioweb.model.Proyecto;
import com.portfolio.portfolioweb.dao.IProyectoRepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ProyectoService implements IProyectoService {
    @Autowired
    private IProyectoRepo oRepository;
    
    @Override
    public List<Proyecto>getProyectos() {
        List<Proyecto> listaProyectos = oRepository.findAll();
        return listaProyectos;
    }
}
