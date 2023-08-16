
package com.portfolio.portfolioweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.portfolioweb.model.Tecnologia;

public interface ITecnologiaRepo extends JpaRepository<Tecnologia, Long> {
    
}
