
package clases;

public class Proyecto {
	private int id;
	private int idPersona;
	private String nombre;
	private String desc;
	private String fechaRealizacion;
	
	public Proyecto(int id) {
		this.id = id;
	}
	public Proyecto(int id, int idPersona, String nombre, String desc, String fechaRealizacion) {
		this.id = id;
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.desc = desc;
		this.fechaRealizacion = fechaRealizacion;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getIdPersona() {
		return idPersona;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return desc;
	}
	
	public void setFechaRealizacion(String fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}
	
	public String getFechaRealizacion() {
		return fechaRealizacion;
	}
	
	@Override
	public String toString() {
		return id + ", " + idPersona + ", " + nombre + ", " + desc + ", " + fechaRealizacion;
	}	
}
