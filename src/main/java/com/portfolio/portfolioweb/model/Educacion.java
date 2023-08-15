
package com.portfolio.portfolioweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="Educacion")
public class Educacion {
    @Id
    private Long id;
    private int idInstitucion;
    private int idPersona;
    private String nombreCarrera;
    private int añoInicio;
    private int añoFin;
    private boolean estado;
}