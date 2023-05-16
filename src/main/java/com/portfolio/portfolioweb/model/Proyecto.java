
package com.portfolio.portfolioweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="Proyecto")
public class Proyecto {
    @Id
    private Long id;
    private int idPersona;
    private String nombre;
    private String descripcion;
    private String fechaRealizacion;
}