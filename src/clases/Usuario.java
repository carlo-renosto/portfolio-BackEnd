
package clases;

public class Usuario {
	private int id;
	private String nombre;
	private String contra;
	private boolean admin;
	
	public Usuario(int id, String nombre, String contra, boolean esAdmin) {
		this.id = id;
		this.nombre = nombre;
		this.contra = contra;
		this.admin = esAdmin;
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

	public void setContra(String contra) {
		this.contra = contra;
	}
	public String getContra() {
		return contra;
	}

	public void setAdmin(boolean esAdmin) {
		this.admin = esAdmin;
	}
	
	public boolean registrar() {
		return true;
	}
	
	public boolean esAdmin() {
		return admin;
	}	
}
