
package clases;

public class ExperienciaLaboral extends Institucion {
	private int idPersona;
	private String puesto;
	private int a�oInicio;
	private int a�oFin;
	
	public ExperienciaLaboral(int idInstitucion) {
		super(idInstitucion);
	}
	public ExperienciaLaboral(int idInstitucion, int idPersona, String puesto, int a�oInicio, int a�oFin) {
		super(idInstitucion);
		this.idPersona = idPersona;
		this.puesto = puesto;
		this.a�oInicio = a�oInicio;
		this.a�oFin = a�oFin;
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
		return idPersona + ", " + puesto + ", " + a�oInicio + ", " + a�oFin;
	}
}
