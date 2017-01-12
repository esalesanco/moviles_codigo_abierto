package es.cice.ejercicios;

public class ejercicio1 {

	public static void main(String[] args) {
		
		String[] nombres = {
			"Jean Carlos",
			"Angel",
			"Javier",
			"Rosa",
			"Jose Antonio",
			"Almendra",
			"Flor",
			"Antonio",
			"Rafael",
			"Diana Carolina"
		};
		
		String nombre = "";
		int mayor = 0;
		for (String s : nombres) {
			if (  s.length() > mayor) {
				mayor = s.length();
				nombre = s;
			}
		}
		
		System.out.println("El mayor es: " + nombre );

	}

}
