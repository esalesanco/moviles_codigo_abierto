package es.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListStringsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myStringList = new ArrayList<>();
		
		myStringList.add("Luis");
		myStringList.add("Luis");
		myStringList.add("Manuel");
		myStringList.add("Jose");
		myStringList.add("Alberto");
		
		System.out.println("Recorriendo la lista con for indexado...");
		for (int i = 0; i < myStringList.size(); i++) {
			System.out.println(myStringList.get(i));
		}

		System.out.println("Recorriendo la lista con for each...");
		for (String str : myStringList) {
			System.out.println(str);
		}
		
		System.out.println("Recorriendo la lista con un iterador...");
		Iterator<String> it = myStringList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
