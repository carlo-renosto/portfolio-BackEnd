
package clases;

public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private String ocupacion;
	
	public Persona(int id, String nombre, String apellido, int edad, String ocupacion) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ocupacion = ocupacion;
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
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return apellido;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	
	@Override
	public String toString() {
		return id + ", " + nombre + " " + apellido + ", " + edad + ", " + ocupacion;
	}
}
