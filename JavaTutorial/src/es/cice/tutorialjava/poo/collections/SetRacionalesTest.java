package es.cice.tutorialjava.poo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import es.cice.tutorialjava.poo.interfaces.Persona;

public class SetRacionalesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Persona> myRacionalSet = new HashSet<>();
		
		myRacionalSet.add(new Persona(2,3));
		myRacionalSet.add(new Persona(1,3));
		myRacionalSet.add(new Persona(2,7));
		myRacionalSet.add(new Persona(9,3));
		myRacionalSet.add(new Persona(2,3));
		myRacionalSet.add(new Persona(4,6));

		System.out.println("Recorriendo el set con for each...");
		for (Persona str : myRacionalSet) {
			System.out.println(str);
		}
		
		System.out.println("Recorriendo el set con un iterador...");
		Iterator<Persona> it = myRacionalSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
