package com.portfolio.portfolioweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.portfolioweb.model.Institucion;

public interface IInstitucionRepo extends JpaRepository<Institucion, Long> {

}
