package Exercice1;

import java.util.ArrayList;

public class Departamento {

	String nombreDepartamento;
	int identificador;
	String localizacion;
	Empresa empresa;
	ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public Departamento(String nombreDepartamento, int identificador, String localizacion, Empresa empresa,
			ArrayList<Empleado> empleados) {
		super();
		this.nombreDepartamento = nombreDepartamento;
		this.identificador = identificador;
		this.localizacion = localizacion;
		this.empresa = empresa;
		this.empleados = empleados;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Departamento [nombreDepartamento=" + nombreDepartamento + ", identificador=" + identificador
				+ ", localizacion=" + localizacion + ", empresa=" + empresa + ", empleados=" + empleados + "]";
	}

}
