package Exercice1;

import java.util.Date;

public class Contrato {

	Date fechaContrato;
	Empleado empleado;
	Empresa empresa;

	public Contrato(Date fechaContrato, Empleado empleado, Empresa empresa) {
		super();
		this.fechaContrato = fechaContrato;
		this.empleado = empleado;
		this.empresa = empresa;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Contrato [fechaContrato=" + fechaContrato + ", empleado=" + empleado + ", empresa=" + empresa + "]";
	}

}
