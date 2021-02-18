package Exercice1;

public class Direccion {

	String calle;
	int numero;
	int CP;
	String localidad;
	String provincia;

	public Direccion(String calle, int numero, int cP, String localidad, String provincia) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.CP = cP;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", CP=" + CP + ", localidad=" + localidad
				+ ", provincia=" + provincia + "]";
	}

	
	
	
	
	
}
