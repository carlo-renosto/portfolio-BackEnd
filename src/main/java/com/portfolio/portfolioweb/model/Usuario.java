
package com.portfolio.portfolioweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    private Long id;
    private String nombre;
    private String contra;
    private boolean esAdmin;
    
    public boolean esAdmin() {
        return esAdmin;
    }
    
    public boolean registrar() {
        return true;
    }
}
