
package clases;

public class Educacion extends Institucion {
	private int idPersona;
	private String nombreCarrera;
	private int añoInicio;
	private int añoFin;
	
	public Educacion(int idInstitucion, int idPersona) {
		super(idInstitucion);
		this.idPersona = idPersona;
	}
	public Educacion(int idInstitucion, int idPersona, String nombreCarrera, int añoInicio, int añoFin) {
		super(idInstitucion);
		this.idPersona = idPersona;
		this.nombreCarrera = nombreCarrera;
		this.añoInicio = añoInicio;
		this.añoFin = añoFin;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getIdPersona() {
		return idPersona;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	
	public void setAñoInicio(int añoInicio) {
		this.añoInicio = añoInicio;
	}
	public int getAñoInicio() {
		return añoInicio;
	}
	
	public void setAñoFin(int añoFin) {
		this.añoFin = añoFin;
	}
	public int getAñoFin() {
		return añoFin;
	}
	
	@Override
	public String toString() {
		return idPersona + ", " + nombreCarrera + ", " + añoInicio + ", " + añoFin;
	}
}
