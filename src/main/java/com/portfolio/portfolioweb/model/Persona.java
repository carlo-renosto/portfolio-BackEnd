
package com.portfolio.portfolioweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="Persona")
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private String ocupacion;
}