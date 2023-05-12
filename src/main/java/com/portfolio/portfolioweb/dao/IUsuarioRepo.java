
package com.portfolio.portfolioweb.dao;

import com.portfolio.portfolioweb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Long> {
    
}
