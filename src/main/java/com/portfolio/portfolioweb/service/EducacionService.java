
package com.portfolio.portfolioweb.service;

import com.portfolio.portfolioweb.dao.IEducacionRepo;
import com.portfolio.portfolioweb.model.Educacion;;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    private IEducacionRepo oRepository;
    
    @Override
    public List<Educacion>getEducaciones() {
        List<Educacion> listaEducaciones = oRepository.findAll();
        return listaEducaciones;
    }
}
