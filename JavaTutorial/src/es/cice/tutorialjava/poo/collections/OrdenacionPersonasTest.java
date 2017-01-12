package es.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import es.cice.tutorialjava.poo.Persona;

public class OrdenacionPersonasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> myPersonaList = new ArrayList<>();
		
		myPersonaList.add(new Persona("Luis", 24));
		myPersonaList.add(new Persona("Manuel", 25));
		myPersonaList.add(new Persona("Jose", 34));
		myPersonaList.add(new Persona("Juan", 28));
		myPersonaList.add(new Persona("Lucia", 29));
		myPersonaList.add(new Persona("Lucas", 44));
		
		// Se implementa el interfaz Comparator de manera anonima.
		// De esta manera se evita tener que implementar una clase
		// (que a su vez implemente dicho interfaz).
		Collections.sort(myPersonaList, new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				// TODO Auto-generated method stub
				return o1.getEdad() - o2.getEdad();
			}
			
		});

		for (Persona p : myPersonaList) {
			p.print();
		}
	}

}
