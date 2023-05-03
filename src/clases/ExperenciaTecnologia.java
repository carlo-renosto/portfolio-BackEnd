
package clases;

public class ExperenciaTecnologia extends Tecnologia {
	private int idPersona;
	private char nivel;
	
	public ExperenciaTecnologia(int idTec, int idPersona, char nivel) {
		super(idTec);
		this.idPersona = idPersona;
		this.nivel = nivel;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getIdPersona() {
		return idPersona;
	}

	public void setNivel(char nivel) {
		this.nivel = nivel;
	}
	public char getNivel() {
		return nivel;
	}
	
	public int porcentajeNivel() {
		char niv = Character.toLowerCase(nivel);
		
		if(niv == 'b') {
			return 25;
		}
		else if(niv == 'i') {
			return 50;
		}
		else if(niv == 'a') {
			return 75;
		}
		else if(niv == 'e') {
			return 100;
		}
		else {
			return 0;
		}
	}
}
