
package clases;

public class Tecnologia {	
	private int id;
	private String nombre;
	private String tipo;
	
	public Tecnologia(int id) {
		this.id = id;
	}
	public Tecnologia(int id, String nombre, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
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
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	
	@Override
	public String toString() {
		return id + ", " + nombre + ", " + tipo;
	}
}
