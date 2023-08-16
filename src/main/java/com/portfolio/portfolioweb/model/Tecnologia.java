
package com.portfolio.portfolioweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="TecnologiaPersona")
public class Tecnologia {
    @Id
    private Long idTecnologia;
    private long idPersona;
    private String nombreTecnologia;
    private String nivel;
}
