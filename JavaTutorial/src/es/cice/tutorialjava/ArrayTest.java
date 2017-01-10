package es.cice.tutorialjava;

public class ArrayTest {

	public static void main(String[] args) {
		int [] miArray = new int [10];
		
		miArray[0] = 12;
		miArray[9] = 11;
		
		for (int i = 0; i < miArray.length; i++) {
			System.out.println("Array: "+ miArray[i]);
		}
		
		for (int i : miArray) {
			System.out.println("Valor de mi array: " + i);
		}
		
		String[] arrayNombres = {
			"Jean Carlos",
			"Angel"
		};
		
		for (String s : arrayNombres) {
			System.out.println("nombre: " + s);
		}
		

	}

}
