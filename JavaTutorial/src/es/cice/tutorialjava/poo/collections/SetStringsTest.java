package es.cice.tutorialjava.poo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetStringsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myStringsSet = new HashSet<>();
		
		myStringsSet.add("Luis");
		myStringsSet.add("Luis");
		myStringsSet.add("Manuel");
		myStringsSet.add("Jose");
		myStringsSet.add("Alberto");

		System.out.println("Recorriendo el set con for each...");
		for (String str : myStringsSet) {
			System.out.println(str);
		}
		
		System.out.println("Recorriendo el set con un iterador...");
		Iterator<String> it = myStringsSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
