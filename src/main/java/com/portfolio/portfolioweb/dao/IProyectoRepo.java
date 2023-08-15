
package com.portfolio.portfolioweb.dao;

import com.portfolio.portfolioweb.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProyectoRepo extends JpaRepository<Proyecto, Long> {
    
}
