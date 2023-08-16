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
		 List<Institucion> listaInstituciones = oRepository.findAll();
		 return listaInstituciones;
	 }

	 @Override
	 public void saveInstitucion(Institucion i) {
		 oRepository.save(i);
	 }

	 @Override
	 public void deleteInstitucion(Long id) {
		 oRepository.deleteById(id);
	 }

	 @Override
	 public Institucion findInstitucion(Long id) {
		 Institucion i = oRepository.findById(id).orElse(null);
		 return i;
	 }
}
