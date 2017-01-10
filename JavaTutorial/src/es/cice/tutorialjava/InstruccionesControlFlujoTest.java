package es.cice.tutorialjava;

/**
 * 
 * @author Jean Carlos
 * 
 */

public class InstruccionesControlFlujoTest {

	/**
	 * 
	 * @param args
	 * @return no retorna nada
	 */
	public static void main(String[] args) {
		// Alternativa simple
		
		//Condición
		int puntuacion = 9;
		
		if ( puntuacion >= 5 ) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Suspenso");
		}
		
		//Condicionales multiples
		switch ( puntuacion ) {
		case 0: case 1: case 2: case 3: case 4 :
			System.out.println("Suspenso");
			break;
		
		case 5 : case 6 : case 7 : case 8 : case 9 : case 10 :
			System.out.println("Aprobado");
			break;
		
		default:
			System.out.println("Puntualción "+puntuacion + " no es valida. ");
			break;
		}
		
		//Bucle while
		
		int contador = 0;
		
		while ( contador < 10 ) {
			System.out.println("El contador es: " + contador );
			contador++;
		}
		
		
		//Bucle for
		
		for (contador = 0; contador < 10; contador++) {
			System.out.println("El contador es: " + contador );
		}
		
		
		contador = 0;
		
		do {
			System.out.println("El contador es ;");
			contador ++;
		} while (contador < 10);
		
	}

}
