package es.cice.tutorialjava.poo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import es.cice.tutorialjava.poo.Persona;

public class MapPersonasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Persona> myPersonaMap = new HashMap<>();
		
		myPersonaMap.put("p-80001", new Persona("Luis", 20));
		myPersonaMap.put("p-80001", new Persona("Manuel", 21));
		myPersonaMap.put("p-80002", new Persona("Juan", 22));
		myPersonaMap.put("p-80003", new Persona("Antonio", 23));
		myPersonaMap.put("p-80004", new Persona("Pedro", 24));

		Set<String> keys = myPersonaMap.keySet();

		System.out.println("Recorriendo el set con for each...");
		for (String key : keys) {
			myPersonaMap.get(key).print();
		}
	}

}
