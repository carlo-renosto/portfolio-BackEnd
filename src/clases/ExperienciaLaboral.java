
package clases;

public class ExperienciaLaboral extends Institucion {
	private int idPersona;
	private String puesto;
	private int añoInicio;
	private int añoFin;
	
	public ExperienciaLaboral(int idInstitucion) {
		super(idInstitucion);
	}
	public ExperienciaLaboral(int idInstitucion, int idPersona, String puesto, int añoInicio, int añoFin) {
		super(idInstitucion);
		this.idPersona = idPersona;
		this.puesto = puesto;
		this.añoInicio = añoInicio;
		this.añoFin = añoFin;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getIdPersona() {
		return idPersona;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getPuesto() {
		return puesto;
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
		return idPersona + ", " + puesto + ", " + añoInicio + ", " + añoFin;
	}
}
