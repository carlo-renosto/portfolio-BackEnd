
package com.portfolio.portfolioweb.dto;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EducacionDTO {
    @Id
    private long id;
    private int idInstitucion;
    private int idPersona;
    private String nombreInstitucion;
    private String nombreCarrera;
    private int añoInicio;
    private int añoFin;
    private boolean estado;
    
    public EducacionDTO() {
    
    }
    
    public EducacionDTO(long id, int idInstitucion, int idPersona, String nombreInstitucion, String nombreCarrera, int añoInicio, int añoFin) {
        this.id = id;
        this.idInstitucion = idInstitucion;
        this.idPersona = idPersona;
        this.nombreInstitucion = nombreInstitucion;
        this.nombreCarrera = nombreCarrera;
        this.añoInicio = añoInicio;
        this.añoFin = añoFin;
        this.estado = true;
    }
}
