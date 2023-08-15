package com.portfolio.portfolioweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolioweb.dao.IInstitucionRepo;
import com.portfolio.portfolioweb.model.Institucion;

@Service
public class InstitucionService implements IInstitucionService {
	 @Autowired
	 private IInstitucionRepo oRepository;
	    
	 @Override
	 public List<Institucion>getInstituciones() {
		 List<Institucion> listaPersonas = oRepository.findAll();
		 return listaPersonas;
	 }

	 @Override
	 public void saveInstitucion(Institucion p) {
		 oRepository.save(p);
	 }

	 @Override
	 public void deleteInstitucion(Long id) {
		 oRepository.deleteById(id);
	 }

	 @Override
	 public Institucion findInstitucion(Long id) {
		 Institucion p = oRepository.findById(id).orElse(null);
		 return p;
	 }
}
