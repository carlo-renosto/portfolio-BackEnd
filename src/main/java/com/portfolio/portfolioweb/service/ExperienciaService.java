
package com.portfolio.portfolioweb.service;

import com.portfolio.portfolioweb.dao.IExperienciaRepo;
import com.portfolio.portfolioweb.model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    private IExperienciaRepo oRepository;
    
    @Override
    public List<Experiencia>getExperiencias() {
        List<Experiencia> listaExperiencias = oRepository.findAll();
        return listaExperiencias;
    }
    
    @Override
    public void saveExperiencia(Experiencia e) {
        oRepository.save(e);
    }
    
    @Override
    public void deleteExperiencia(Long id) {
        oRepository.deleteById(id);
    }
    
    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia e = oRepository.findById(id).orElse(null);
        return e;
    }
}
