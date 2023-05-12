
package com.portfolio.portfolioweb.service;

import com.portfolio.portfolioweb.model.Usuario;
import java.util.List;

public interface IUsuarioService {
     public List<Usuario>getUsuarios();
    
    public void saveUsuario(Usuario u);
    
    public void deleteUsuario(Long id);
    
    public Usuario findUsuario(Long id);
}
