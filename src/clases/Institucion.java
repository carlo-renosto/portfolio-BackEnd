
package clases;

public class Institucion {
	private int id;
	private String nombre;
	private String ubicacion;
	
	public Institucion(int id) {
		this.id = id;
	}
	public Institucion(int id, String nombre, String ubicacion) {
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	
	@Override
	public String toString() {
		return id + ", " + nombre + ", " + ubicacion;
	}
}
