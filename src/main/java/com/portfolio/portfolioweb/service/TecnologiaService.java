
package com.portfolio.portfolioweb.service;

import com.portfolio.portfolioweb.dao.ITecnologiaRepo;
import com.portfolio.portfolioweb.model.Tecnologia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService {
    @Autowired
    private ITecnologiaRepo oRepository;
    
    @Override
    public List<Tecnologia>getTecnologias() {
        List<Tecnologia> listaTecnologias = oRepository.findAll();
        return listaTecnologias;
    }
    
    @Override
    public void saveTecnologia(Tecnologia t) {
        oRepository.save(t);
    }
    
    @Override
    public void deleteTecnologia(Long id) {
        oRepository.deleteById(id);
    }
    
    @Override
    public Tecnologia findTecnologia(Long id) {
        Tecnologia t = oRepository.findById(id).orElse(null);
        return t;
    }
}
