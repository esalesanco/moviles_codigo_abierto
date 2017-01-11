package es.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.cice.tutorialjava.poo.interfaces.Racional;

public class ListRacionalesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Racional> myRacionalList = new ArrayList<>();
		
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(1,3));
		myRacionalList.add(new Racional(2,7));
		myRacionalList.add(new Racional(9,3));
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(4,6));
		
		System.out.println("Recorriendo la lista con for indexado...");
		for (int i = 0; i < myRacionalList.size(); i++) {
			System.out.println(myRacionalList.get(i).toString());
		}

		System.out.println("Recorriendo la lista con for each...");
		for (Racional rac : myRacionalList) {
			System.out.println(rac);
		}
		
		System.out.println("Recorriendo la lista con un iterador...");
		Iterator<Racional> it = myRacionalList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
