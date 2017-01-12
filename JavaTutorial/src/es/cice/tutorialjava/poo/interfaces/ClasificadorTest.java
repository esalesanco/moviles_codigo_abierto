package es.cice.tutorialjava.poo.interfaces;

public class ClasificadorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable[] list = {new Persona(3, 4), new Persona(5, 2),
				             new Persona(7, 5), new Persona(5, 8),
				             new Persona(7, 8)};
		
		try {
			Persona r = (Persona) Clasificador.getMinimum(list);
			System.out.println("El minimo Racional es: " + r.toString() );
		} catch (ComparationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}