
package com.portfolio.portfolioweb.service;

import com.portfolio.portfolioweb.model.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.portfolio.portfolioweb.dao.IUsuarioRepo;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private IUsuarioRepo oRepository;
    
    @Override
    public List<Usuario>getUsuarios() {
        List<Usuario> listaUsuarios = oRepository.findAll();
        return listaUsuarios;
    }
    
    @Override
    public void saveUsuario(Usuario u) {
        oRepository.save(u);
    }
    
    @Override
    public void deleteUsuario(Long id) {
        oRepository.deleteById(id);
    }
    
    @Override
    public Usuario findUsuario(Long id) {
        Usuario u = oRepository.findById(id).orElse(null);
        return u;
    }
}
