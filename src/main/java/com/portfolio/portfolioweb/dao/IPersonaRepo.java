
package com.portfolio.portfolioweb.dao;

import com.portfolio.portfolioweb.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Long> {

}