package Exercice1;

public class Empleado {

	String dni;
	String nombreEmpleado;
	int edad;
	String estado;
	double sueldo;
	String categoria;
	Departamento departamento;
	Direccion direccionEmpleado;

	public Empleado(String dni, String nombre, int edad, String estado, double sueldo, String categoria) {
		super();
		this.dni = dni;
		this.nombreEmpleado = nombre;
		this.edad = edad;
		this.estado = estado;
		this.sueldo = sueldo;
		this.categoria = categoria;
	}
	
	public Empleado(String dni, String nombre, int edad, String estado, double sueldo, String categoria,
			Departamento departamento, Direccion direccion) {
		super();
		this.dni = dni;
		this.nombreEmpleado = nombre;
		this.edad = edad;
		this.estado = estado;
		this.sueldo = sueldo;
		this.categoria = categoria;
		this.departamento = departamento;
		this.direccionEmpleado = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Direccion getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(Direccion direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombreEmpleado=" + nombreEmpleado + ", edad=" + edad + ", estado=" + estado
				+ ", sueldo=" + sueldo + ", categoria=" + categoria + ", departamento=" + departamento
				+ ", direccionEmpleado=" + direccionEmpleado + "]";
	}
	
	
	
	
	

}
