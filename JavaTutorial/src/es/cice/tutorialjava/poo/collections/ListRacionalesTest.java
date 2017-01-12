package es.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.cice.tutorialjava.poo.interfaces.Persona;

public class ListRacionalesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> myRacionalList = new ArrayList<>();
		
		myRacionalList.add(new Persona(2,3));
		myRacionalList.add(new Persona(1,3));
		myRacionalList.add(new Persona(2,7));
		myRacionalList.add(new Persona(9,3));
		myRacionalList.add(new Persona(2,3));
		myRacionalList.add(new Persona(4,6));
		
		System.out.println("Recorriendo la lista con for indexado...");
		for (int i = 0; i < myRacionalList.size(); i++) {
			System.out.println(myRacionalList.get(i).toString());
		}

		System.out.println("Recorriendo la lista con for each...");
		for (Persona rac : myRacionalList) {
			System.out.println(rac);
		}
		
		System.out.println("Recorriendo la lista con un iterador...");
		Iterator<Persona> it = myRacionalList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
