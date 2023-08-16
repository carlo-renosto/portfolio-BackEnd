
package com.portfolio.portfolioweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="ExperienciaLaboral")
public class Experiencia {
    @Id
    private Long idInstitucion;
    private int idPersona;
    private String puesto;
    private int añoInicio;
    private int añoFin;
}
