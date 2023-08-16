package com.portfolio.portfolioweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="Institucion")
public class Institucion {
    @Id
    private long id;
    private String nombre;
    private String ubicacion;
}
