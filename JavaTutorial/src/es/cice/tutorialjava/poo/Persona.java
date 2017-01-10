package es.cice.tutorialjava.poo;

public class Persona {
	// Un miembro de la clase es un atributo o un metodo (por defecto son "protected")

	// Los atributos definen el estado de un objeto
	private String nombre;
	private int edad;
	private String domicilio;
	
	// Un constructor es un metodo que solo se puede invocar en la construccion de un objeto
	// definiendo la forma en la que se inicializa un objeto.
	// El constructor por defecto no tiene parametros.
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		setEdad(edad);
	}
	
	public Persona(String nombre, int edad, String domicilio) {
		this.nombre = nombre;
		setEdad(edad);
		this.domicilio = domicilio;
	}
	
	// Los metodos definen la funcionalidad de un objeto
	public void print() {
		System.out.println("Persona[nombre: " + nombre + ", domicilio: " + domicilio + ", edad: " + edad + "]");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
}
