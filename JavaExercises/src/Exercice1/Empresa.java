package Exercice1;

import java.util.ArrayList;

public class Empresa {

	String nombreEmpresa;
	String cif;
	Direccion direccionEmpresa;
	ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public Empresa(String nombreEmpresa, String cif, ArrayList<Departamento> departamentos, Direccion direccion) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.cif = cif;
		this.departamentos = departamentos;
		this.direccionEmpresa = direccion;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public Direccion getDireccionEmpresa() {
		return direccionEmpresa;
	}

	public void setDireccionEmpresa(Direccion direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public String toString() {
		return "Empresa [nombreEmpresa=" + nombreEmpresa + ", cif=" + cif + ", direccionEmpresa=" + direccionEmpresa
				+ ", departamentos=" + departamentos + "]";
	}

}
