
package clases;

public class Educacion extends Institucion {
	private int idPersona;
	private String nombreCarrera;
	private int a�oInicio;
	private int a�oFin;
	
	public Educacion(int idInstitucion, int idPersona) {
		super(idInstitucion);
		this.idPersona = idPersona;
	}
	public Educacion(int idInstitucion, int idPersona, String nombreCarrera, int a�oInicio, int a�oFin) {
		super(idInstitucion);
		this.idPersona = idPersona;
		this.nombreCarrera = nombreCarrera;
		this.a�oInicio = a�oInicio;
		this.a�oFin = a�oFin;
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
	
	public void setA�oInicio(int a�oInicio) {
		this.a�oInicio = a�oInicio;
	}
	public int getA�oInicio() {
		return a�oInicio;
	}
	
	public void setA�oFin(int a�oFin) {
		this.a�oFin = a�oFin;
	}
	public int getA�oFin() {
		return a�oFin;
	}
	
	@Override
	public String toString() {
		return idPersona + ", " + nombreCarrera + ", " + a�oInicio + ", " + a�oFin;
	}
}
