package es.cice.tutorialjava.poo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import es.cice.tutorialjava.poo.interfaces.Racional;

public class SetRacionalesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Racional> myRacionalSet = new HashSet<>();
		
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(1,3));
		myRacionalSet.add(new Racional(2,7));
		myRacionalSet.add(new Racional(9,3));
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(4,6));

		System.out.println("Recorriendo el set con for each...");
		for (Racional str : myRacionalSet) {
			System.out.println(str);
		}
		
		System.out.println("Recorriendo el set con un iterador...");
		Iterator<Racional> it = myRacionalSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
