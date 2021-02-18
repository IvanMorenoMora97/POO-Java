package Exercice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		boolean salida = false;
		int opcion = 0;
		Direccion direccion = null;
		Empleado empleado = null;
		ArrayList<Direccion> direcciones = new ArrayList<Direccion>();
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();
		ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();

		do {

			System.out.println("1) Creación de un empleado.");
			System.out.println("2) Creación de un departamento.");
			System.out.println("3) Creación de una empresa.");
			System.out.println("4) Creación de una dirección.");
			System.out.println("5) Creación de un contrato.");
			System.out.println("7) Mostrar todos los datos de un empleado.");
			System.out.println("8) Mostrar todos los datos de una empresa.");
			System.out.println("9) Mostrar todos los datos de un departamento.");
			System.out.println("10) Mostrar todos los datos de un contrato.");
			System.out.println("11) Salir del programa.");
			opcion = reader.nextInt();
			
			switch (opcion) {

			case 1:
				// CREACIÓN DE UN EMPLEADO MEDIANTE LOS DATOS PROPORCIONADOS POR EL USUARIO
				System.out.println("Introduce el nombre del empleado: ");
				String nombreEmpleado = reader.next();
				nombreEmpleado = reader.nextLine();
				System.out.println("Introduce su edad: ");
				int edad = reader.nextInt();
				System.out.println("Introduce el DNI: ");
				String DNI = reader.next();
				System.out.println("Introduce su sueldo: ");
				double sueldo = reader.nextDouble();
				System.out.println("Especifica en que estado vive: ");
				String estado = reader.next();
				estado = reader.nextLine();
				System.out.println(
						"Especifica a que categoria pertenece: ('Encargado', 'Administrativo', 'Jardinera', etc)");
				String categoria = reader.nextLine();

				// CREAMOS EL EMPLEADO A PARTIR DE LOS DATOS INTRODUCIDOS POR EL USUARIO.
				empleado = new Empleado(DNI, nombreEmpleado, edad, estado, sueldo, categoria);

				System.out.println("¿El empleado pertenece a una empresa? ('S' para sí, 'N' para no)");
				char respuesta = reader.next().charAt(0);

				// ASIGNAMOS EL EMPLEADO A UNA EMPRESA SELECCIONADA DE LA SIGUIENTE LISTA DE
				// EMPRESAS.
				if (respuesta == 'S' || respuesta == 's') {

					for (int i = 0; i < empresas.size(); i++) {

						System.out.println(i + " - " + empresas.get(i).toString());

					}

					System.out.println("Selecciona una empresa de la lista.");
					
					
					
					
				}

				else if (respuesta == 'N' || respuesta == 'n') {

					System.out.println("¿Deseas crear una empresa ahora mismo? ('S' para sí, 'N' para no)");
					char respuesta2 = reader.next().charAt(0);

					// CREACIÓN DE UNA EMPRESA
					if (respuesta2 == 'S' || respuesta2 == 's') {

					}

					// GUARDAMOS EL EMPLEADO CREADO PARA ASIGNARLO A UNA EMPRESA MÁS ADELANTE.
					else if (respuesta2 == 'N' || respuesta2 == 'n') {

						System.out.println(
								"Se guardara el empleado creado para poder añadirlo a una empresa más adelante.");
						empleados.add(empleado);

					}

					// GUARDAMOS EL EMPLEADO CREADO PARA ASIGNARLO A UNA EMPRESA MÁS ADELANTE.
					else {

						System.out.println(
								"Se han guardado los datos del empleado, seleccione la opción de crear una empresa para añadir dicho empleado a la empresa.");
						empleados.add(empleado);

					}

				}

				else {

					System.out.println(
							"Se han guardado los datos del empleado para añadirlo a una empresa más adelante.");
					empleados.add(empleado);

				}

				break;

			case 2:
				break;

			case 3:
				break;

			case 4:
				// PEDIREMOS LOS DATOS DE LA DIRECCIÓN AL USUARIO.
				System.out.println("Indica una calle: ");
				String calle = reader.nextLine();
				System.out.println("Especifica el número de la calle: ");
				int numero = reader.nextInt();
				System.out.println("Especifica el codigo postal: ");
				int CP = reader.nextInt();
				System.out.println("Especifica la localidad: ");
				String localidad = reader.nextLine();
				System.out.println("Especifica la proivincia: ");
				String provincia = reader.nextLine();

				// CREAMOS UNA DIRECCIÓN MEDIANTE LOS DATOS QUE HA ESPECIFICADO EL USUARIO.
				direccion = new Direccion(calle, numero, CP, localidad, provincia);

				// AÑADIMOS LA DIRECCIÓN A UNA LISTA DE DIRECCIONES QUE EL USUARIO PODRA
				// SELECCIONAR MÁS ADELANTE.
				direcciones.add(direccion);
				break;

			case 5:
				break;

			case 6:
				break;

			case 7:
				
					for(Empleado emp : empleados) {
						
						System.out.println(emp.toString());
						
					}
				
				break;

			case 8:
				break;

			case 9:
				break;

			case 10:
				break;

			case 11: salida = true;
				break;

			default:
				break;

			}

		} while (!salida);

		System.out.println("Has salido del programa.");

	}

}
