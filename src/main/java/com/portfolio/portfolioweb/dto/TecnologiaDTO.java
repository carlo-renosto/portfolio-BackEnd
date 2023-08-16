
package com.portfolio.portfolioweb.dto;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TecnologiaDTO {
    @Id
    private long idTecnologia;
    private long idPersona;
    private String nombreTecnologia;
    private String nombrePersona;
    private String nivel;
    
    public TecnologiaDTO() {
    
    }
    
    public TecnologiaDTO(long id, long idPersona, String nombreTecnologia, String nombrePersona, String nivel) {
        this.idTecnologia = id;
        this.idPersona = idPersona;
        this.nombreTecnologia = nombreTecnologia;
        this.nombrePersona = nombrePersona;
        this.nivel = nivel;
    }
}
