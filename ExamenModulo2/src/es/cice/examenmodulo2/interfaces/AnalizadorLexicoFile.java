package es.cice.examenmodulo2.interfaces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AnalizadorLexicoFile implements AnalizadorLexico {
	private int numLineas = 0;
	private int numPalabras = 0;
	
	Map<String, Integer> buffer;
	
	
	/**
	 * Constructor
	 * @param file path del fichero cuyo contenido se va a analizar lexicamente.
	 */
	public AnalizadorLexicoFile(String file) throws FileNotFoundException {
		super();
		
		buffer = new HashMap<>();
		
		FileInputStream in = new FileInputStream(file);
		Scanner sc = new Scanner(in);
		load(sc);
	}

	/**
	 * Calcula la informacion asociada a la fuente de datos y genera el mapa de palabras
	 * @param sc "Scaner" para la lectura del fichero en formato Character.
	 */
	private void load(Scanner sc) {
		while (sc.hasNext()) {
			String line = sc.nextLine();
			numLineas++;
			
			if (line.length() > 0) {
				String[] tokens = line.split("[\\s,;:\\.]+");
				
				for (String token : tokens) {
					numPalabras++;
					String minus = token.toLowerCase();

					Integer numPalabra = buffer.get(minus);
					if (numPalabra == null) {
						buffer.put(minus, new Integer(1));
					}
					else {
						buffer.put(minus, new Integer(numPalabra.intValue() + 1));
					}
				}
			}
		}
	}
	
	/**
	 * Imprime el mapa ordenandolo por palabras 
	 */
	public void printMap() {
		List<String> palabras = new ArrayList<>(buffer.keySet());
		
		Collections.sort(palabras, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareToIgnoreCase(o2);
			}
			
		});		
		
		System.out.println("Mapa de palabras:");
		for (String palabra : palabras) {
			System.out.println("["+ palabra + "] : " + buffer.get(palabra));
		}
	}

	
	/**
	 * Imprime la informacion asociada a la fuente de datos 
	 */
	public void print() {
		System.out.println("Numero Lineas: " + getNumeroLineas());
		System.out.println("Numero Palabras: " + getNumeroPalabras());
		printMap();
	}

	@Override
	public int getNumeroPalabras() {
		// TODO Auto-generated method stub
		return numPalabras;
	}

	@Override
	public int getNumeroLineas() {
		// TODO Auto-generated method stub
		return numLineas;
	}

	@Override
	public Map<String, Integer> getMapaPalabras() {
		// TODO Auto-generated method stub
		return buffer;
	}

}
